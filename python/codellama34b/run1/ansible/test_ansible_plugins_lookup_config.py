import unittest
from ansible.plugins.lookup import config


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        result = instance.run(terms=["test_terms"], variables=None, on_missing="error", plugin_type="test_plugin_type", plugin_name="test_plugin_name")
        self.assertEqual(result, ["test_terms"])

    def test_set_options(self):
        instance = LookupModule()
        instance.set_options(var_options=None, direct=None)
        self.assertEqual(instance.var_options, None)
        self.assertEqual(instance.direct, None)

    def test_get_option(self):
        instance = LookupModule()
        result = instance._get_option("test_option")
        self.assertEqual(result, "test_option")

    def test_get_plugin_config(self):
        result = _get_plugin_config("test_pname", "test_ptype", "test_config", "test_variables")
        self.assertEqual(result, "test_config")

    def test_get_global_config(self):
        result = _get_global_config("test_config")
        self.assertEqual(result, "test_config")

if __name__ == '__main__':
    unittest.main()