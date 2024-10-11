import unittest
from ansible.plugins.lookup import config


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        terms = ['terms']
        variables = {'variables': 'variables'}
        kwargs = {'kwargs': 'kwargs'}
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    def test_set_options(self):
        instance = LookupModule()
        var_options = {'var_options': 'var_options'}
        direct = {'direct': 'direct'}
        instance.set_options(var_options, direct)
        self.assertEqual(instance.var_options, var_options)
        self.assertEqual(instance.direct, direct)

    def test_get_option(self):
        instance = LookupModule()
        option = 'option'
        result = instance.get_option(option)
        self.assertEqual(result, None)

    def test_get_plugin_config(self):
        pname = 'pname'
        ptype = 'ptype'
        config = 'config'
        variables = {'variables': 'variables'}
        result = _get_plugin_config(pname, ptype, config, variables)
        self.assertEqual(result, None)

    def test_get_global_config(self):
        config = 'config'
        result = _get_global_config(config)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()