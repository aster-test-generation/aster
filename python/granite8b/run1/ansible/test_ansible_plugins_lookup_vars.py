import unittest
from ansible.plugins.lookup.yaml import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_method(self):
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

    def test_magic_methods(self):
        lookup = LookupModule()
        self.assertEqual(str(lookup), 'LookupModule')
        self.assertEqual(repr(lookup), 'LookupModule()')

if __name__ == '__main__':
    unittest.main()