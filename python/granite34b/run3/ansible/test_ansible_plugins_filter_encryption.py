import unittest
from ansible.plugins.filter.encryption import do_vault, do_unvault


class TestEncryptionFilters(unittest.TestCase):
    def test_vault_filter(self):
        data = "This is a secret message"
        secret = "my_secret_key"
        result = do_vault(data, secret)
        self.assertIsInstance(result, str)
        self.assertNotEqual(result, data)

    def test_unvault_filter(self):
        vaulted_data = "$ANSIBLE_VAULT;1.1;AES256;my_vault_id;...;...;...;..."
        secret = "my_secret_key"
        result = do_unvault(vaulted_data, secret)
        self.assertIsInstance(result, str)
        self.assertEqual(result, "This is the original secret message")

    def test_vault_filter_with_salt(self):
        data = "This is another secret message"
        secret = "my_secret_key"
        salt = "my_salt"
        result = do_vault(data, secret, salt=salt)
        self.assertIsInstance(result, str)
        self.assertNotEqual(result, data)

    def test_unvault_filter_with_vaultid(self):
        vaulted_data = "$ANSIBLE_VAULT;1.1;AES256;my_other_vault_id;...;...;...;..."
        secret = "my_secret_key"
        vaultid = "my_other_vault_id"
        result = do_unvault(vaulted_data, secret, vaultid=vaultid)
        self.assertIsInstance(result, str)
        self.assertEqual(result, "This is the original secret message")

    def test_vault_filter_with_wrap_object(self):
        data = "This is a secret message"
        secret = "my_secret_key"
        result = do_vault(data, secret, wrap_object=True)
        self.assertIsInstance(result, str)
        self.assertEqual(result.data, data)

    def test_unvault_filter_with_undefined_secret(self):
        vaulted_data = "$ANSIBLE_VAULT;1.1;AES256;my_vault_id;...;...;...;..."
        secret = None
        with self.assertRaises(TypeError):
            do_unvault(vaulted_data, secret)

    def test_unvault_filter_with_undefined_vault(self):
        vaulted_data = None
        secret = "my_secret_key"
        with self.assertRaises(AnsibleVaultFormatError):
            do_unvault(vaulted_data, secret)

    def test_vault_filter_with_undefined_data(self):
        data = None
        secret = "my_secret_key"
        with self.assertRaises(TypeError):
            do_vault(data, secret)

    def test_vault_filter_with_undefined_secret(self):
        data = "This is a secret message"
        secret = None
        with self.assertRaises(TypeError):
            do_vault(data, secret)

if __name__ == '__main__':
    unittest.main()