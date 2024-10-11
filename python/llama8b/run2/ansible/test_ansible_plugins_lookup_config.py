import unittest
from ansible.module_utils.basic import AnsibleModule, missing_required_li
from ansible.module_utils._text import to_native


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        terms = ['term1', 'term2']
        variables = {'var1': 'value1', 'var2': 'value2'}
        result = instance.run(terms, variables)
        self.assertEqual(result, [])

    def test_set_options(self):
        instance = LookupModule()
        instance.set_options(var_options={'var1': 'value1'}, direct={'direct1': 'value2'})
        self.assertEqual(instance.get_option('var_options'), {'var1': 'value1'})
        self.assertEqual(instance.get_option('direct'), {'direct1': 'value2'})

    def test_get_option(self):
        instance = LookupModule()
        instance.set_options(var_options={'var1': 'value1'}, direct={'direct1': 'value2'})
        self.assertEqual(instance.get_option('var_options'), {'var1': 'value1'})
        self.assertEqual(instance.get_option('direct'), {'direct1': 'value2'})

    def test_get_option_missing(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleOptionsError):
            instance.get_option('non_existent_option')

    def test_get_plugin_config(self):
        instance = LookupModule()
        result = instance._get_plugin_config('pname', 'ptype', 'term', {'var1': 'value1'})
        self.assertEqual(result, 'result')

    def test_get_global_config(self):
        instance = LookupModule()
        result = instance._get_global_config('config')
        self.assertEqual(result, 'result')

    def test_missing_setting_error(self):
        instance = LookupModule()
        with self.assertRaises(MissingSetting):
            instance._get_plugin_config('pname', 'ptype', 'term', {'var1': 'value1'})

    def test_missing_setting_warn(self):
        instance = LookupModule()
        instance._display.warning('Skipping, did not find setting term')

    def test_missing_setting_skip(self):
        instance = LookupModule()
        instance._display.warning('Skipping, did not find setting term')

    def test_on_missing_error(self):
        instance = LookupModule()
        with self.assertRaises(AnsibleLookupError):
            instance._get_plugin_config('pname', 'ptype', 'term', {'var1': 'value1'})

    def test_on_missing_warn(self):
        instance = LookupModule()
        instance._display.warning('Skipping, did not find setting term')

    def test_on_missing_skip(self):
        instance = LookupModule()
        instance._display.warning('Skipping, did not find setting term')

    def test_to_native(self):
        instance = LookupModule()
        result = instance._to_native('native')
        self.assertEqual(result, 'native')

if __name__ == '__main__':
    unittest.main()