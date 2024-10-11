import unittest
from ansible.plugins.filter.encryption import do_vault, do_unvault


class TestEncryptionFilters(unittest.TestCase):
    def test_vault_filter(self):
        data = "This is a secret message"
        secret = "my_secret_key"
        vaulted_data = do_vault(data, secret)
        self.assertTrue(is_encrypted(vaulted_data))

    def test_unvault_filter(self):
        vaulted_data = "$ANSIBLE_VAULT;1.1;AES256;my_vault_id;...;...;..."
        secret = "my_secret_key"
        unvaulted_data = do_unvault(vaulted_data, secret)
        self.assertEqual(unvaulted_data, "This is the original message")

    def test_vault_filter_with_salt(self):
        data = "This is another secret message"
        secret = "my_other_secret_key"
        salt = "my_salt"
        vaulted_data = do_vault(data, secret, salt=salt)
        self.assertTrue(is_encrypted(vaulted_data))

    def test_unvault_filter_with_vaultid(self):
        vaulted_data = "$ANSIBLE_VAULT;1.1;AES256;my_other_vault_id;...;...;..."
        secret = "my_other_secret_key"
        vaultid = "my_other_vault_id"
        unvaulted_data = do_unvault(vaulted_data, secret, vaultid=vaultid)
        self.assertEqual(unvaulted_data, "This is the other original message")

    def test_vault_filter_with_wrap_object(self):
        data = "This is a secret message"
        secret = "my_secret_key"
        vaulted_data = do_vault(data, secret, wrap_object=True)
        self.assertTrue(isinstance(vaulted_data, six.text_type))

    def test_unvault_filter_with_undefined_secret(self):
        vaulted_data = "$ANSIBLE_VAULT;1.1;AES256;my_vault_id;...;...;..."
        secret = None
        with self.assertRaises(TypeError):
            do_unvault(vaulted_data, secret)

    def test_unvault_filter_with_undefined_vault(self):
        vaulted_data = None
        secret = "my_secret_key"
        with self.assertRaises(AnsibleVaultFormatError):
            do_unvault(vaulted_data, secret)

if __name__ == '__main__':
    unittest.main()