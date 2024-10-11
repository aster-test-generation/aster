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
        self.assertTrue(is_pubkey("-----BEGIN PGP PUBLIC KEY BLOCK-----\n..."))

    def test_init(self):
        self.assertEqual(self.rpm_key.module, self.module)
        self.assertEqual(self.rpm_key.rpm, '/usr/bin/rpm')

    def test_fetch_key(self):
        with patch('ansible.modules.rpm_key.fetch_url') as mock_fetch_url, \
             patch('ansible.modules.rpm_key.tempfile.mkstemp', return_value=(1, '/tmp/tmpfile')), \
             patch('ansible.modules.rpm_key.os.fdopen', return_value=MagicMock()) as mock_fdopen:
            mock_fetch_url.return_value = (MagicMock(read=MagicMock(return_value="-----BEGIN PGP PUBLIC KEY BLOCK-----\n...")), {'status': 200})
            result = self.rpm_key.fetch_key('http://example.com/key.gpg')
            self.assertEqual(result, '/tmp/tmpfile')

    def test_normalize_keyid(self):
        self.assertEqual(self.rpm_key.normalize_keyid('0x1234abcd'), '1234ABCD')
        self.assertEqual(self.rpm_key.normalize_keyid('0X1234abcd'), '1234ABCD')
        self.assertEqual(self.rpm_key.normalize_keyid('1234abcd'), '1234ABCD')

    def test_getkeyid(self):
        with patch.object(self.rpm_key, 'execute_command', return_value=("pub:...:1234ABCD:...", "")):
            result = self.rpm_key.getkeyid('/path/to/keyfile')
            self.assertEqual(result, '1234ABCD')

    def test_getfingerprint(self):
        with patch.object(self.rpm_key, 'execute_command', return_value=("fpr:...:1234ABCD:...", "")):
            result = self.rpm_key.getfingerprint('/path/to/keyfile')
            self.assertEqual(result, '1234ABCD')

    def test_is_keyid(self):
        self.assertTrue(self.rpm_key.is_keyid('0x1234abcd'))
        self.assertTrue(self.rpm_key.is_keyid('1234abcd'))
        self.assertFalse(self.rpm_key.is_keyid('notakeyid'))

    def test_execute_command(self):
        with patch.object(self.module, 'run_command', return_value=(0, 'output', '')):
            stdout, stderr = self.rpm_key.execute_command(['command'])
            self.assertEqual(stdout, 'output')

    def test_is_key_imported(self):
        with patch.object(self.module, 'run_command', return_value=(0, 'gpg-pubkey-1234abcd', '')), \
             patch.object(self.rpm_key, 'execute_command', return_value=("pub:...:1234ABCD:...", "")):
            result = self.rpm_key.is_key_imported('1234ABCD')
            self.assertTrue(result)

    def test_import_key(self):
        with patch.object(self.rpm_key, 'execute_command') as mock_execute_command:
            self.rpm_key.import_key('/path/to/keyfile')
            mock_execute_command.assert_called_with(['/usr/bin/rpm', '--import', '/path/to/keyfile'])

    def test_drop_key(self):
        with patch.object(self.rpm_key, 'execute_command') as mock_execute_command:
            self.rpm_key.drop_key('1234ABCD')
            mock_execute_command.assert_called_with(['/usr/bin/rpm', '--erase', '--allmatches', 'gpg-pubkey-1234abcd'])

class TestMainFunction(unittest.TestCase):
    @patch('ansible.modules.rpm_key.AnsibleModule', return_value=MagicMock())
    @patch('ansible.modules.rpm_key.RpmKey')
    def test_main(self, mock_rpmkey, mock_module):
        main()
        mock_rpmkey.assert_called_with(mock_module())

if __name__ == '__main__':
    unittest.main()