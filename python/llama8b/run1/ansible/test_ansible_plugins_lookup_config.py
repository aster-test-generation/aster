import unittest
from ansible.module_utils.basic import AnsibleModule, missing_required_li
from ansible.plugins.loader import plugin_loader
from ansible.module_utils._text import to_native
from ansible.module_utils.six import string_types
from ansible.utils.sentinel import Sentinel


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        terms = ['term1', 'term2']
        variables = {'var1': 'value1', 'var2': 'value2'}
        kwargs = {'plugin_type': 'type', 'plugin_name': 'name'}
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    def test_get_option(self):
        instance = LookupModule()
        self.assertEqual(instance.get_option('on_missing'), None)
        instance.set_options(var_options={'on_missing': 'error'})
        self.assertEqual(instance.get_option('on_missing'), 'error')

    def test_set_options(self):
        instance = LookupModule()
        instance.set_options(var_options={'var1': 'value1'})
        self.assertEqual(instance.get_option('var1'), 'value1')

    def test_get_plugin_config(self):
        instance = LookupModule()
        pname = 'pname'
        ptype = 'type'
        config = 'config'
        variables = {'var1': 'value1'}
        result = instance._get_plugin_config(pname, ptype, config, variables)
        self.assertEqual(result, None)

    def test_get_global_config(self):
        instance = LookupModule()
        config = 'config'
        result = instance._get_global_config(config)
        self.assertEqual(result, None)

    def test_missing_setting(self):
        instance = LookupModule()
        pname = 'pname'
        ptype = 'type'
        config = 'config'
        variables = {'var1': 'value1'}
        with self.assertRaises(MissingSetting):
            instance._get_plugin_config(pname, ptype, config, variables)

    def test_invalid_setting(self):
        instance = LookupModule()
        config = 'config'
        with self.assertRaises(MissingSetting):
            instance._get_global_config(config)

    def test_invalid_plugin_type(self):
        instance = LookupModule()
        pname = 'pname'
        ptype = 'invalid_type'
        config = 'config'
        variables = {'var1': 'value1'}
        with self.assertRaises(AnsibleOptionsError):
            instance._get_plugin_config(pname, ptype, config, variables)

    def test_invalid_plugin_name(self):
        instance = LookupModule()
        pname = 'invalid_pname'
        ptype = 'type'
        config = 'config'
        variables = {'var1': 'value1'}
        with self.assertRaises(AnsibleOptionsError):
            instance._get_plugin_config(pname, ptype, config, variables)

    def test_invalid_on_missing(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleOptionsError):
            instance.set_options(var_options={'on_missing': 'invalid'})

if __name__ == '__main__':
    unittest.main()