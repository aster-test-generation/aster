import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.rpm_key import RpmKey, is_pubkey, main
from ansible.module_utils.basic import AnsibleModule


class TestRpmKey(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.module.params = {
            'state': 'present',
            'key': 'http://example.com/key.gpg',
            'fingerprint': None
        }
        self.rpm_key = RpmKey(self.module)

    def test_is_pubkey(self):
        valid_key = "-----BEGIN PGP PUBLIC KEY BLOCK-----\n...\n-----END PGP PUBLIC KEY BLOCK-----"
        invalid_key = "Not a key"
        self.assertTrue(is_pubkey(valid_key))
        self.assertFalse(is_pubkey(invalid_key))

    def test_init(self):
        self.assertIsInstance(self.rpm_key, RpmKey)
        self.assertEqual(self.rpm_key.module, self.module)

    @patch('ansible.modules.rpm_key.fetch_url')
    @patch('ansible.modules.rpm_key.tempfile.mkstemp')
    @patch('ansible.modules.rpm_key.os.fdopen')
    def test_fetch_key(self, mock_fdopen, mock_mkstemp, mock_fetch_url):
        mock_fetch_url.return_value = (MagicMock(read=MagicMock(return_value=b"-----BEGIN PGP PUBLIC KEY BLOCK-----\n...\n-----END PGP PUBLIC KEY BLOCK-----")), {'status': 200})
        mock_mkstemp.return_value = (1, 'tempfile')
        mock_fdopen.return_value = MagicMock(write=MagicMock(), close=MagicMock())

        result = self.rpm_key.fetch_key('http://example.com/key.gpg')
        self.assertEqual(result, 'tempfile')

    def test_normalize_keyid(self):
        self.assertEqual(self.rpm_key.normalize_keyid('0x1234abcd'), '1234ABCD')
        self.assertEqual(self.rpm_key.normalize_keyid('0X1234abcd'), '1234ABCD')
        self.assertEqual(self.rpm_key.normalize_keyid('1234abcd'), '1234ABCD')

    @patch.object(RpmKey, 'execute_command')
    def test_getkeyid(self, mock_execute_command):
        mock_execute_command.return_value = ("pub:u:2048:1:1234ABCD:...", "")
        result = self.rpm_key.getkeyid('keyfile')
        self.assertEqual(result, '1234ABCD')

    @patch.object(RpmKey, 'execute_command')
    def test_getfingerprint(self, mock_execute_command):
        mock_execute_command.return_value = ("fpr:::::::::A1B2C3D4E5F6G7H8I9J0K1L2M3N4O5P6Q7R8S9T0:", "")
        result = self.rpm_key.getfingerprint('keyfile')
        self.assertEqual(result, 'A1B2C3D4E5F6G7H8I9J0K1L2M3N4O5P6Q7R8S9T0')

    def test_is_keyid(self):
        self.assertTrue(self.rpm_key.is_keyid('0x1234abcd'))
        self.assertTrue(self.rpm_key.is_keyid('1234abcd'))
        self.assertFalse(self.rpm_key.is_keyid('notakeyid'))

    @patch.object(RpmKey, 'execute_command')
    def test_is_key_imported(self, mock_execute_command):
        mock_execute_command.return_value = ("pub:u:2048:1:1234ABCD:...", "")
        self.assertTrue(self.rpm_key.is_key_imported('1234ABCD'))
        mock_execute_command.return_value = ("", "")
        self.assertFalse(self.rpm_key.is_key_imported('1234ABCD'))

    @patch.object(RpmKey, 'execute_command')
    def test_import_key(self, mock_execute_command):
        self.rpm_key.module.check_mode = False
        self.rpm_key.import_key('keyfile')
        mock_execute_command.assert_called_with([self.rpm_key.rpm, '--import', 'keyfile'])

    @patch.object(RpmKey, 'execute_command')
    def test_drop_key(self, mock_execute_command):
        self.rpm_key.module.check_mode = False
        self.rpm_key.drop_key('1234ABCD')
        mock_execute_command.assert_called_with([self.rpm_key.rpm, '--erase', '--allmatches', 'gpg-pubkey-1234abcd'])

class TestMainFunction(unittest.TestCase):
    @patch('ansible.modules.rpm_key.AnsibleModule')
    @patch('ansible.modules.rpm_key.RpmKey')
    def test_main(self, mock_RpmKey, mock_AnsibleModule):
        mock_module = MagicMock()
        mock_AnsibleModule.return_value = mock_module
        main()
        mock_RpmKey.assert_called_with(mock_module)

if __name__ == '__main__':
    unittest.main()