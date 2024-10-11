from ansible.plugins.lookup.vars import AnsibleUndefinedVariable
import unittest
from ansible.plugins.lookup.vars import LookupModule


class TestVarsLookupModule(unittest.TestCase):

    def setUp(self):
        self.lookup = LookupModule()

    def test_run_with_variables(self):
        variables = {
            'myvar': 'myvalue',
            'hostvars': {
                'localhost': {
                    'myvar': 'localhostvalue'
                }
            }
        }
        terms = ['myvar']
        result = self.lookup.run(terms, variables=variables)
        self.assertEqual(result, ['myvalue'])

    def test_run_with_default_value(self):
        variables = {}
        terms = ['myvar']
        default = 'defaultvalue'
        result = self.lookup.run(terms, variables=variables, default=default)
        self.assertEqual(result, [default])

    def test_run_with_undefined_variable(self):
        variables = {}
        terms = ['myvar']
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup.run(terms, variables=variables)

    def test_run_with_undefined_variable_and_default_value(self):
        variables = {}
        terms = ['myvar']
        default = 'defaultvalue'
        result = self.lookup.run(terms, variables=variables, default=default)
        self.assertEqual(result, [default])

if __name__ == '__main__':
    unittest.main()