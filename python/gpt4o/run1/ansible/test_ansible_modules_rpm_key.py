import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.rpm_key import RpmKey, is_pubkey, main


class TestRpmKey(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'state': 'present',
            'key': 'http://example.com/key.gpg',
            'fingerprint': None
        }
        self.module.get_bin_path = MagicMock(return_value='/usr/bin/rpm')
        self.rpm_key = RpmKey(self.module)

    def test_is_pubkey(self):
        valid_key = "-----BEGIN PGP PUBLIC KEY BLOCK-----\n...\n-----END PGP PUBLIC KEY BLOCK-----"
        invalid_key = "Not a key"
        self.assertTrue(is_pubkey(valid_key))
        self.assertFalse(is_pubkey(invalid_key))

    def test_init(self):
        self.assertEqual(self.rpm_key.module, self.module)
        self.assertEqual(self.rpm_key.rpm, '/usr/bin/rpm')

    @patch('ansible.modules.rpm_key.fetch_url')
    @patch('ansible.modules.rpm_key.tempfile.mkstemp', return_value=(1, '/tmp/tmpfile'))
    @patch('ansible.modules.rpm_key.os.fdopen')
    def test_fetch_key(self, mock_fdopen, mock_mkstemp, mock_fetch_url):
        mock_fetch_url.return_value = (MagicMock(read=MagicMock(return_value=b"-----BEGIN PGP PUBLIC KEY BLOCK-----\n...\n-----END PGP PUBLIC KEY BLOCK-----")), {'status': 200})
        mock_fdopen.return_value = MagicMock(write=MagicMock(), close=MagicMock())
        result = self.rpm_key.fetch_key('http://example.com/key.gpg')
        self.assertEqual(result, '/tmp/tmpfile')

    def test_normalize_keyid(self):
        self.assertEqual(self.rpm_key.normalize_keyid('0x1234abcd'), '1234ABCD')
        self.assertEqual(self.rpm_key.normalize_keyid('0X1234abcd'), '1234ABCD')
        self.assertEqual(self.rpm_key.normalize_keyid('1234abcd'), '1234ABCD')

    @patch('ansible.modules.rpm_key.RpmKey.execute_command', return_value=("pub:1234:5678:90AB:CDEF:1234ABCD", ""))
    def test_getkeyid(self, mock_execute_command):
        result = self.rpm_key.getkeyid('/path/to/keyfile')
        self.assertEqual(result, '1234ABCD')

    @patch('ansible.modules.rpm_key.RpmKey.execute_command', return_value=("fpr:::::::::1234567890ABCDEF1234567890ABCDEF12345678:", ""))
    def test_getfingerprint(self, mock_execute_command):
        result = self.rpm_key.getfingerprint('/path/to/keyfile')
        self.assertEqual(result, '1234567890ABCDEF1234567890ABCDEF12345678')

    def test_is_keyid(self):
        self.assertTrue(self.rpm_key.is_keyid('0x1234abcd'))
        self.assertTrue(self.rpm_key.is_keyid('1234abcd'))
        self.assertFalse(self.rpm_key.is_keyid('notakeyid'))

    @patch('ansible.modules.rpm_key.RpmKey.execute_command', return_value=("pub:1234:5678:90AB:CDEF:1234ABCD", ""))
    def test_is_key_imported(self, mock_execute_command):
        self.assertTrue(self.rpm_key.is_key_imported('1234ABCD'))
        mock_execute_command.return_value = ("", "")
        self.assertFalse(self.rpm_key.is_key_imported('1234ABCD'))

    @patch('ansible.modules.rpm_key.RpmKey.execute_command')
    def test_import_key(self, mock_execute_command):
        self.rpm_key.import_key('/path/to/keyfile')
        mock_execute_command.assert_called_with(['/usr/bin/rpm', '--import', '/path/to/keyfile'])

    @patch('ansible.modules.rpm_key.RpmKey.execute_command')
    def test_drop_key(self, mock_execute_command):
        self.rpm_key.drop_key('1234ABCD')
        mock_execute_command.assert_called_with(['/usr/bin/rpm', '--erase', '--allmatches', 'gpg-pubkey-1234abcd'])

class TestMainFunction(unittest.TestCase):
    @patch('ansible.modules.rpm_key.AnsibleModule')
    @patch('ansible.modules.rpm_key.RpmKey')
    def test_main(self, mock_rpm_key, mock_ansible_module):
        mock_module = MagicMock()
        mock_ansible_module.return_value = mock_module
        main()
        mock_rpm_key.assert_called_with(mock_module)

if __name__ == '__main__':
    unittest.main()