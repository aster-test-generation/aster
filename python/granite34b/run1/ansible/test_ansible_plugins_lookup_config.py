import unittest
from ansible.plugins.lookup.config import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup_module = LookupModule()
        terms = ['term1', 'term2']
        variables = {}
        result = lookup_module._load_name(terms, variables)
        self.assertEqual(result, [])

    def test_get_plugin_config(self):
        lookup_module = LookupModule()
        pname = 'plugin_name'
        ptype = 'plugin_type'
        config = 'config'
        variables = {}
        result = lookup_module.get_plugin_config(pname, ptype, config, variables)
        self.assertEqual(result, None)

    def test_get_global_config(self):
        lookup_module = LookupModule()
        config = 'config'
        result = lookup_module._get_global_config()
        self.assertEqual(result, None)

    def test_set_options(self):
        lookup_module = LookupModule()
        var_options = {}
        direct = {}
        lookup_module.set_options(var_options, direct)

    def test_get_option(self):
        lookup_module = LookupModule()
        option = 'option'
        result = lookup_module.get_option(option)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()