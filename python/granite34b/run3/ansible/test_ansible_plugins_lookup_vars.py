import unittest
from ansible.plugins.lookup.vars import LookupModule


class TestVarsLookup(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_run_with_variables(self):
        variables = {'var1': 'value1', 'var2': 'value2'}
        terms = ['var1', 'var2']
        result = self.lookup.run(terms, variables=variables)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run_with_default_value(self):
        variables = {'var1': 'value1'}
        terms = ['var1', 'var2']
        default = 'default_value'
        result = self.lookup.run(terms, variables=variables, default=default)
        self.assertEqual(result, ['value1', 'default_value'])

    def test_run_with_undefined_variable(self):
        variables = {'var1': 'value1'}
        terms = ['var1', 'var2']
        default = 'default_value'
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup.run(terms, variables=variables, default=default)

    def test_run_with_invalid_term(self):
        variables = {'var1': 'value1'}
        terms = [123]
        with self.assertRaises(AnsibleError):
            self.lookup.run(terms, variables=variables)

if __name__ == '__main__':
    unittest.main()