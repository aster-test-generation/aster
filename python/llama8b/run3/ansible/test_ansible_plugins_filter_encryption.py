import unittest
from unittest.mock import patch
from ansible.plugins.filter.core import FilterModul


class TestEncryption(unittest.TestCase):
    def test_do_vault(self):
        with patch('ansible.module_utils._text.to_bytes') as mock_to_bytes:
            mock_to_bytes.return_value = b'123456'
            result = do_vault('Hello, World!', 'secret', salt=None, vaultid='filter_default', wrap_object=False)
            self.assertEqual(result, b'Hello, World!')
            mock_to_bytes.assert_called_once_with('Hello, World!')

    def test_do_vault_with_salt(self):
        with patch('ansible.module_utils._text.to_bytes') as mock_to_bytes:
            mock_to_bytes.return_value = b'123456'
            result = do_vault('Hello, World!', 'secret', salt='salt', vaultid='filter_default', wrap_object=False)
            self.assertEqual(result, b'Hello, World!')
            mock_to_bytes.assert_called_once_with('Hello, World!')

    def test_do_vault_with_wrap_object(self):
        with patch('ansible.module_utils._text.to_bytes') as mock_to_bytes:
            mock_to_bytes.return_value = b'123456'
            result = do_vault('Hello, World!', 'secret', salt=None, vaultid='filter_default', wrap_object=True)
            self.assertEqual(result, AnsibleVaultEncryptedUnicode(b'Hello, World!'))
            mock_to_bytes.assert_called_once_with('Hello, World!')

    def test_do_unvault(self):
        with patch('ansible.module_utils._text.to_native') as mock_to_native:
            mock_to_native.return_value = 'Hello, World!'
            result = do_unvault(b'Hello, World!', 'secret', vaultid='filter_default')
            self.assertEqual(result, 'Hello, World!')
            mock_to_native.assert_called_once_with(b'Hello, World!')

    def test_do_unvault_with_vaultid(self):
        with patch('ansible.module_utils._text.to_native') as mock_to_native:
            mock_to_native.return_value = 'Hello, World!'
            result = do_unvault(b'Hello, World!', 'secret', vaultid='vaultid')
            self.assertEqual(result, 'Hello, World!')
            mock_to_native.assert_called_once_with(b'Hello, World!')

    def test_do_unvault_with_vault(self):
        with patch('ansible.module_utils._text.to_native') as mock_to_native:
            mock_to_native.return_value = 'Hello, World!'
            result = do_unvault(AnsibleVaultEncryptedUnicode(b'Hello, World!'), 'secret', vaultid='filter_default')
            self.assertEqual(result, 'Hello, World!')
            mock_to_native.assert_called_once_with(b'Hello, World!')

    def test_do_unvault_with_encrypted(self):
        with patch('ansible.module_utils._text.to_native') as mock_to_native:
            mock_to_native.return_value = 'Hello, World!'
            result = do_unvault(b'Hello, World!', 'secret', vaultid='filter_default')
            self.assertEqual(result, 'Hello, World!')
            mock_to_native.assert_called_once_with(b'Hello, World!')

    def test_do_unvault_with_non_string_vault(self):
        with self.assertRaises(AnsibleFilterTypeError):
            do_unvault(123, 'secret', vaultid='filter_default')

    def test_do_unvault_with_non_string_secret(self):
        with self.assertRaises(AnsibleFilterTypeError):
            do_unvault(b'Hello, World!', 123, vaultid='filter_default')

    def test_do_unvault_with_non_encrypted_vault(self):
        with self.assertRaises(AnsibleFilterError):
            do_unvault('Hello, World!', 'secret', vaultid='filter_default')

    def test_filter_module(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('vault', filters)
        self.assertIn('unvault', filters)

if __name__ == '__main__':
    unittest.main()