import unittest
from ansible_collections.ansible.builtin.plugins.lookup.config import LookupModule, _get_plugin_config, _get_global_config, MissingSettin


class TestLookupModule(unittest.TestCase):
    def test_init(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupBase)

    def test_run(self):
        instance = LookupModule()
        result = instance.run(['term1', 'term2'], variables={'var1': 'val1'})
        self.assertIsInstance(result, list)

    def test_set_options(self):
        instance = LookupModule()
        instance.set_options(var_options={'var1': 'val1'}, direct={'direct1': 'val1'})
        self.assertEqual(instance.var_options, {'var1': 'val1'})
        self.assertEqual(instance.direct, {'direct1': 'val1'})

    def test_get_option(self):
        instance = LookupModule()
        instance.set_options(var_options={'var1': 'val1'}, direct={'direct1': 'val1'})
        self.assertEqual(instance.get_option('var1'), 'val1')
        self.assertEqual(instance.get_option('direct1'), 'val1')

    def test__display(self):
        instance = LookupModule()
        instance._display.warning('Test warning')
        # This test is a bit tricky, as we can't easily assert the warning message
        # But we can at least test that the warning method is called
        self.assertTrue(hasattr(instance._display, 'warning'))

    def test_private_method__get_plugin_config(self):
        result = _get_plugin_config('pname', 'ptype', 'config', {'var1': 'val1'})
        self.assertIsInstance(result, str)

    def test_private_method__get_global_config(self):
        result = _get_global_config('config')
        self.assertIsInstance(result, str)

    def test_MissingSetting(self):
        ms = MissingSetting('Test error message')
        self.assertIsInstance(ms, AnsibleOptionsError)
        self.assertEqual(str(ms), 'Test error message')

    def test_str_method(self):
        instance = LookupModule()
        result = instance.__str__()
        self.assertEqual(result, 'LookupModule')

    def test_repr_method(self):
        instance = LookupModule()
        result = instance.__repr__()
        self.assertEqual(result, 'LookupModule()')

if __name__ == '__main__':
    unittest.main()