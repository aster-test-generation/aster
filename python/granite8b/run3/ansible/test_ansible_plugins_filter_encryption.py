import unittest
from ansible.plugins.filter.core import FilterModule


class TestFilterModule(unittest.TestCase):

    def test_do_vault(self):
        filter_module = FilterModule()
        filters = filter_module.filters()

        result = filters['vault']('test', 'secret')
        self.assertEqual(result, 'vault:test:1.1:vault_default:sha256-1000:654321')

    def test_do_unvault(self):
        filter_module = FilterModule()
        filters = filter_module.filters()

        result = filters['unvault']('vault:test:1.1:vault_default:sha256-1000:654321', 'secret')
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()