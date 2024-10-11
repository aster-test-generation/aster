import unittest
from ansible.plugins.filter.core import *



class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertEqual(result, {'vault': do_vault, 'unvault': do_unvault})

class TestDoVault(unittest.TestCase):
    def test_do_vault(self):
        data = 'data'
        secret = 'secret'
        salt = None
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, to_native(vault))

    def test_do_vault_with_wrap_object(self):
        data = 'data'
        secret = 'secret'
        salt = None
        vaultid = 'filter_default'
        wrap_object = True
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, to_native(vault))

    def test_do_vault_with_salt(self):
        data = 'data'
        secret = 'secret'
        salt = 'salt'
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, to_native(vault))

    def test_do_vault_with_vaultid(self):
        data = 'data'
        secret = 'secret'
        salt = None
        vaultid = 'vaultid'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, to_native(vault))

    def test_do_vault_with_wrap_object_and_salt_and_vaultid(self):
        data = 'data'
        secret = 'secret'
        salt = 'salt'
        vaultid = 'vaultid'
        wrap_object = True
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, to_native(vault))

class TestDoUnvault(unittest.TestCase):
    def test_do_unvault(self):
        vault = 'vault'
        secret = 'secret'
        vaultid = 'filter_default'
        result = do_unvault(vault, secret, vaultid)
        self.assertEqual(result, to_native(data))

    def test_do_unvault_with_vaultid(self):
        vault = 'vault'
        secret = 'secret'
        vaultid = 'vaultid'
        result = do_unvault(vault, secret, vaultid)
        self.assertEqual(result, to_native(data))

    def test_do_unvault_with_AnsibleVaultEncryptedUnicode(self):
        vault = AnsibleVaultEncryptedUnicode('vault')
        secret = 'secret'
        vaultid = 'filter_default'
        result = do_unvault(vault, secret, vaultid)
        self.assertEqual(result, to_native(data))

    def test_do_unvault_with_AnsibleVaultEncryptedUnicode_and_vaultid(self):
        vault = AnsibleVaultEncryptedUnicode('vault')
        secret = 'secret'
        vaultid = 'vaultid'
        result = do_unvault(vault, secret, vaultid)
        self.assertEqual(result, to_native(data))

if __name__ == '__main__':
    unittest.main()