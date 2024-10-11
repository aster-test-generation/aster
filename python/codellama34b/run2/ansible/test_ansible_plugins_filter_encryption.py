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
        salt = 'salt'
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_2(self):
        data = 'data'
        secret = 'secret'
        salt = 'salt'
        vaultid = 'filter_default'
        wrap_object = True
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_3(self):
        data = 'data'
        secret = 'secret'
        salt = None
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_4(self):
        data = 'data'
        secret = 'secret'
        salt = None
        vaultid = 'filter_default'
        wrap_object = True
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_5(self):
        data = 'data'
        secret = 'secret'
        salt = 'salt'
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_6(self):
        data = 'data'
        secret = 'secret'
        salt = 'salt'
        vaultid = 'filter_default'
        wrap_object = True
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_7(self):
        data = 'data'
        secret = 'secret'
        salt = None
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_8(self):
        data = 'data'
        secret = 'secret'
        salt = None
        vaultid = 'filter_default'
        wrap_object = True
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_9(self):
        data = 'data'
        secret = 'secret'
        salt = 'salt'
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_vault_10(self):
        data = 'data'
        secret = 'secret'
        salt = 'salt'
        vaultid = 'filter_default'
        wrap_object = True
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()