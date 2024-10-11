import unittest
from ansible.plugins.lookup import vars as LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['test_var']
        variables = {'test_var': 'test_value'}
        result = lookup.run(terms, variables=variables)
        self.assertEqual(result, ['test_value'])

    def test_private_method(self):
        lookup = LookupModule()
        terms = ['test_var']
        variables = {'test_var': 'test_value'}
        result = lookup._LookupModule__run(terms, variables=variables)
        self.assertEqual(result, ['test_value'])

    def test_protected_method(self):
        lookup = LookupModule()
        terms = ['test_var']
        variables = {'test_var': 'test_value'}
        result = lookup._LookupModule__set_options(terms, variables=variables)
        self.assertEqual(result, None)

    def test_magic_method(self):
        lookup = LookupModule()
        terms = ['test_var']
        variables = {'test_var': 'test_value'}
        result = lookup.__str__()
        self.assertEqual(result, 'LookupModule')

if __name__ == '__main__':
    unittest.main()