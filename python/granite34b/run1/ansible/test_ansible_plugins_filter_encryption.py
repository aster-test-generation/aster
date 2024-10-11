from ansible.plugins.filter.encryption import AnsibleVaultEncryptedUnicode
import unittest
from ansible.plugins.filter.encryption import do_vault, do_unvault


class TestEncryptionFilters(unittest.TestCase):
    def test_vault(self):
        data = "This is a secret message"
        secret = "my_secret_key"
        result = do_vault(data, secret)
        self.assertIsInstance(result, str)
        self.assertNotEqual(result, data)

    def test_unvault(self):
        vault = "$ANSIBLE_VAULT;1.1;AES256;filter_default"
        secret = "my_secret_key"
        result = do_unvault(vault, secret, None)
        self.assertIsInstance(result, str)

    def test_vault_with_salt(self):
        data = "This is another secret message"
        secret = "my_secret_key"
        salt = "my_salt"
        result = do_vault(data, secret, salt=salt)
        self.assertIsInstance(result, str)
        self.assertNotEqual(result, data)

    def test_vault_with_vaultid(self):
        data = "This is yet another secret message"
        secret = "my_secret_key"
        vaultid = "my_vault_id"
        result = do_vault(data, secret, vaultid=vaultid)
        self.assertIsInstance(result, str)
        self.assertNotEqual(result, data)

    def test_vault_with_wrap_object(self):
        data = "This is the final secret message"
        secret = "my_secret_key"
        result = do_vault(data, secret, wrap_object=True)
        self.assertIsInstance(result, AnsibleVaultEncryptedUnicode)
        self.assertNotEqual(result, data)

    def test_unvault_with_vaultid(self):
        vault = "$ANSIBLE_VAULT;1.1;AES256;my_vault_id"
        secret = "my_secret_key"
        vaultid = "my_vault_id"
        result = do_unvault(vault, secret, vaultid=vaultid)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()