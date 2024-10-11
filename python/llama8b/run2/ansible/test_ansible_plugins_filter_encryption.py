import unittest
from ansible.module_utils.basic import AnsibleModul
from ansible.module_utils._text import to_native


class TestEncryptionFilters(unittest.TestCase):
    def test_do_vault(self):
        filter_module = FilterModule()
        result = filter_module.filters()['vault']('test', 'secret', salt='salt')
        self.assertIsInstance(result, bytes)

    def test_do_vault_with_wrap_object(self):
        filter_module = FilterModule()
        result = filter_module.filters()['vault']('test', 'secret', salt='salt', wrap_object=True)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)

    def test_do_vault_with_invalid_secret(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['vault']('test', 123, salt='salt')

    def test_do_vault_with_invalid_data(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['vault'](123, 'secret', salt='salt')

    def test_do_unvault(self):
        filter_module = FilterModule()
        result = filter_module.filters()['unvault'](b'test', 'secret', vaultid='filter_default')
        self.assertEqual(result, 'test')

    def test_do_unvault_with_invalid_secret(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['unvault'](b'test', 123, vaultid='filter_default')

    def test_do_unvault_with_invalid_vault(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['unvault'](123, 'secret', vaultid='filter_default')

    def test_do_unvault_with_encrypted_vault(self):
        filter_module = FilterModule()
        result = filter_module.filters()['unvault'](b'test', 'secret', vaultid='filter_default', encrypted=True)
        self.assertEqual(result, 'test')

    def test_do_unvault_with_decrypted_vault(self):
        filter_module = FilterModule()
        result = filter_module.filters()['unvault'](b'test', 'secret', vaultid='filter_default', decrypted=True)
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()