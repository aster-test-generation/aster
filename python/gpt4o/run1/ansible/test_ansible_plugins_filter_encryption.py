import unittest
from ansible.plugins.filter.encryption import do_vault, do_unvault, FilterModule
from ansible.errors import AnsibleFilterError, AnsibleFilterTypeError
from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
from jinja2.runtime import Undefined


class TestDoVault(unittest.TestCase):
    def test_do_vault_valid(self):
        result = do_vault("data", "secret")
        self.assertIsInstance(result, str)

    def test_do_vault_invalid_secret_type(self):
        with self.assertRaises(AnsibleFilterTypeError):
            do_vault("data", 123)

    def test_do_vault_invalid_data_type(self):
        with self.assertRaises(AnsibleFilterTypeError):
            do_vault(123, "secret")

    def test_do_vault_wrap_object(self):
        result = do_vault("data", "secret", wrap_object=True)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)

class TestDoUnvault(unittest.TestCase):
    def test_do_unvault_valid(self):
        encrypted_data = do_vault("data", "secret")
        result = do_unvault(encrypted_data, "secret")
        self.assertEqual(result, "data")

    def test_do_unvault_invalid_secret_type(self):
        with self.assertRaises(AnsibleFilterTypeError):
            do_unvault("vault", 123)

    def test_do_unvault_invalid_vault_type(self):
        with self.assertRaises(AnsibleFilterTypeError):
            do_unvault(123, "secret")

    def test_do_unvault_with_AnsibleVaultEncryptedUnicode(self):
        encrypted_data = do_vault("data", "secret", wrap_object=True)
        result = do_unvault(encrypted_data, "secret")
        self.assertEqual(result, "data")

class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        filter_module = FilterModule()
        filters = filter_module.filters()
        self.assertIn('vault', filters)
        self.assertIn('unvault', filters)
        self.assertEqual(filters['vault'], do_vault)
        self.assertEqual(filters['unvault'], do_unvault)

if __name__ == '__main__':
    unittest.main()