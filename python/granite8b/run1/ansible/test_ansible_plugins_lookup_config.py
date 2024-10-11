import unittest
from ansible.plugins.lookup.yaml import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_get_plugin_config(self):
        lookup = LookupModule()
        result = lookup._get_plugin_config('test_plugin', 'test_type', 'test_config', {})
        self.assertEqual(result, 'test_result')

    def test_get_global_config(self):
        lookup = LookupModule()
        result = lookup._get_global_config('test_config')
        self.assertEqual(result, 'test_result')

    def test_run(self):
        lookup = LookupModule()
        result = lookup.run(['test_term'], {})
        self.assertEqual(result, ['test_result'])

if __name__ == '__main__':
    unittest.main()