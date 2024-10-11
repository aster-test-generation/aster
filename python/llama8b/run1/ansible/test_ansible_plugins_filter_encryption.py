from ansible.module_utils import basi
import unittest
from ansible.plugins.filter.encryption import FilterModule
from ansible.module_utils._text import to_native
from ansible.module_utils.six import string_types, binary_type
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from ansible.parsing.vault import is_encrypted, VaultSecret, VaultLib
from ansible.utils.display import Display

display = Display()

class TestEncryption(unittest.TestCase):
    def test_do_vault(self):
        filter_module = FilterModule()
        result = filter_module.filters()['vault']('Hello, World!', 'my_secret', wrap_object=True)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)

    def test_do_unvault(self):
        filter_module = FilterModule()
        result = filter_module.filters()['unvault'](AnsibleVaultEncryptedUnicode('Hello, World!'), 'my_secret')
        self.assertEqual(result, 'Hello, World!')

    def test_do_vault_with_salt(self):
        filter_module = FilterModule()
        result = filter_module.filters()['vault']('Hello, World!', 'my_secret', salt='my_salt', wrap_object=True)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)

    def test_do_unvault_with_vaultid(self):
        filter_module = FilterModule()
        result = filter_module.filters()['unvault'](AnsibleVaultEncryptedUnicode('Hello, World!'), 'my_secret', vaultid='my_vaultid')
        self.assertEqual(result, 'Hello, World!')

    def test_do_vault_with_invalid_secret(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['vault']('Hello, World!', 123, wrap_object=True)

    def test_do_unvault_with_invalid_vault(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['unvault'](123, 'my_secret')

    def test_do_vault_with_invalid_data(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['vault'](123, 'my_secret', wrap_object=True)

    def test_do_unvault_with_invalid_data_type(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['unvault'](AnsibleVaultEncryptedUnicode(123), 'my_secret')

    def test_do_vault_with_invalid_salt(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['vault']('Hello, World!', 'my_secret', salt=123)

    def test_do_unvault_with_invalid_vaultid(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['unvault'](AnsibleVaultEncryptedUnicode('Hello, World!'), 'my_secret', vaultid=123)

    def test_do_vault_with_invalid_wrap_object(self):
        filter_module = FilterModule()
        with self.assertRaises(AnsibleFilterTypeError):
            filter_module.filters()['vault']('Hello, World!', 'my_secret', wrap_object=123)

if __name__ == '__main__':
    unittest.main()