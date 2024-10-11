import unittest
from ansible.plugins.filter.core import *


class TestFilterModule(unittest.TestCase):
    def test_filters(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertEqual(result, {'vault': do_vault, 'unvault': do_unvault})

    def test_do_vault(self):
        data = ''
        secret = ''
        salt = None
        vaultid = 'filter_default'
        wrap_object = False
        result = do_vault(data, secret, salt, vaultid, wrap_object)
        self.assertEqual(result, '')

    def test_do_unvault(self):
        vault = ''
        secret = ''
        vaultid = 'filter_default'
        result = do_unvault(vault, secret, vaultid)
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()