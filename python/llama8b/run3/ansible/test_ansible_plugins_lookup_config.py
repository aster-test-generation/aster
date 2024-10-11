import unittest
from ansible.module_utils.basic import *
from ansible.plugins.loader import plugin_loader
from ansible.module_utils._text import to_native
from ansible.module_utils.six import string_types
from ansible.utils.sentinel import Sentinel


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['term1', 'term2']
        variables = {'var1': 'value1', 'var2': 'value2'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, [])

    def test_get_option(self):
        lookup = LookupModule()
        self.assertEqual(lookup.get_option('on_missing'), None)
        self.assertEqual(lookup.get_option('plugin_type'), None)
        self.assertEqual(lookup.get_option('plugin_name'), None)

    def test_set_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'var1': 'value1'}, direct={'direct1': 'value1'})
        self.assertEqual(lookup.get_option('var_options'), {'var1': 'value1'})
        self.assertEqual(lookup.get_option('direct'), {'direct1': 'value1'})

    def test_get_plugin_config(self):
        lookup = LookupModule()
        pname = 'pname'
        ptype = 'ptype'
        config = 'config'
        variables = {'var1': 'value1'}
        result = lookup._get_plugin_config(pname, ptype, config, variables)
        self.assertEqual(result, None)

    def test_get_global_config(self):
        lookup = LookupModule()
        config = 'config'
        result = lookup._get_global_config(config)
        self.assertEqual(result, None)

    def test_missing_setting(self):
        lookup = LookupModule()
        pname = 'pname'
        ptype = 'ptype'
        config = 'config'
        variables = {'var1': 'value1'}
        try:
            lookup._get_plugin_config(pname, ptype, config, variables)
        except MissingSetting as e:
            self.assertEqual(str(e), 'Unable to find setting config')

    def test_invalid_setting(self):
        lookup = LookupModule()
        config = 'config'
        try:
            lookup._get_global_config(config)
        except MissingSetting as e:
            self.assertEqual(str(e), 'Invalid setting "config" attempted')

    def test_invalid_plugin_type(self):
        lookup = LookupModule()
        pname = 'pname'
        ptype = 'ptype'
        config = 'config'
        variables = {'var1': 'value1'}
        try:
            lookup._get_plugin_config(pname, ptype, config, variables)
        except AnsibleOptionsError as e:
            self.assertEqual(str(e), 'Both plugin_type and plugin_name are required, cannot use one without the other')

    def test_invalid_on_missing(self):
        lookup = LookupModule()
        try:
            lookup.get_option('on_missing')
        except AnsibleOptionsError as e:
            self.assertEqual(str(e), '"on_missing" must be a string and one of "error", "warn" or "skip", not None')

    def test_invalid_term(self):
        lookup = LookupModule()
        terms = [123]
        try:
            lookup.run(terms, {})
        except AnsibleOptionsError as e:
            self.assertEqual(str(e), 'Invalid setting identifier, "123" is not a string, its a <class \'int\'>')

if __name__ == '__main__':
    unittest.main()