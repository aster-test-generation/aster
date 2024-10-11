import unittest
from ansible.plugins.lookup import vars


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        terms = ['test_terms']
        variables = {'test_variables': 'test_variables'}
        kwargs = {'test_kwargs': 'test_kwargs'}
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, ['test_terms'])

    def test_set_options(self):
        instance = LookupModule()
        var_options = {'test_var_options': 'test_var_options'}
        direct = {'test_direct': 'test_direct'}
        result = instance.set_options(var_options, direct)
        self.assertEqual(result, None)

    def test_get_option(self):
        instance = LookupModule()
        result = instance.get_option('test_get_option')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()