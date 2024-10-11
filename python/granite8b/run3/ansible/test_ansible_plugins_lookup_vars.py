from ansible.errors import AnsibleUndefinedVariable
import unittest
from ansible.plugins.lookup.vars import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['foo', 'bar']
        variables = {'foo': 'FOO', 'bar': 'BAR'}
        result = lookup.run(terms, variables=variables)
        self.assertEqual(result, ['FOO', 'BAR'])

    def test_run_with_default(self):
        lookup = LookupModule()
        terms = ['foo', 'bar']
        variables = {'foo': 'FOO', 'bar': 'BAR'}
        default = 'DEFAULT'
        result = lookup.run(terms, variables=variables, default=default)
        self.assertEqual(result, ['FOO', 'BAR', 'DEFAULT'])

    def test_run_with_undefined_variable(self):
        lookup = LookupModule()
        terms = ['foo', 'bar']
        variables = {'foo': 'FOO'}
        with self.assertRaises(AnsibleUndefinedVariable):
            lookup.run(terms, variables=variables)

    def test_run_with_undefined_variable_and_default(self):
        lookup = LookupModule()
        terms = ['foo', 'bar']
        variables = {'foo': 'FOO'}
        default = 'DEFAULT'
        result = lookup.run(terms, variables=variables, default=default)
        self.assertEqual(result, ['FOO', 'DEFAULT'])

    def test_run_with_undefined_variable_and_no_default(self):
        lookup = LookupModule()
        terms = ['foo', 'bar']
        variables = {'foo': 'FOO'}
        with self.assertRaises(AnsibleUndefinedVariable):
            lookup.run(terms, variables=variables, default=None)

if __name__ == '__main__':
    unittest.main()