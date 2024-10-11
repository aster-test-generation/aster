import unittest
from ansible.plugins.lookup import yaml


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = config.LookupModule()
        terms = ["test_terms"]
        variables = {"test_variables": "test_variables"}
        kwargs = {"test_kwargs": "test_kwargs"}
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, ["test_terms"])

    def test_set_options(self):
        instance = config.LookupModule()
        var_options = {"test_var_options": "test_var_options"}
        direct = {"test_direct": "test_direct"}
        result = instance.set_options(var_options, direct)
        self.assertEqual(result, None)

    def test_get_option(self):
        instance = config.LookupModule()
        config = "test_config"
        result = instance.get_option(config)
        self.assertEqual(result, "test_config")

    def test__get_plugin_config(self):
        pname = "test_pname"
        ptype = "test_ptype"
        config = "test_config"
        variables = {"test_variables": "test_variables"}
        result = config._get_plugin_config(pname, ptype, config, variables)
        self.assertEqual(result, "test_config")

    def test__get_global_config(self):
        config = "test_config"
        result = config._get_global_config(config)
        self.assertEqual(result, "test_config")

    def test_MissingSetting(self):
        instance = config.MissingSetting()
        self.assertEqual(instance.orig_exc, None)

if __name__ == '__main__':
    unittest.main()