import unittest
from ansible.plugins.lookup.config import LookupModule


class TestConfigLookup(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_get_plugin_config(self):
        variables = {}
        result = self.lookup._get_plugin_config('pname', 'ptype', 'config', variables)
        self.assertEqual(result, 'value')

    def test_get_global_config(self):
        result = self.lookup.get_global_config('config')
        self.assertEqual(result, 'value')

    def test_run(self):
        terms = ['term1', 'term2']
        variables = {}
        result = self.lookup._load_name(terms, variables)
        self.assertEqual(result, ['value1', 'value2'])

if __name__ == '__main__':
    unittest.main()