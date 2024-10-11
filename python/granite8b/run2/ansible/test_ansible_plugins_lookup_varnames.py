from ansible.errors import AnsibleError
import unittest
from ansible.plugins.lookup.varnames import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_method(self):
        lookup = LookupModule()
        variables = {'var1': 1, 'var2': 2, 'var3': 3}
        terms = ['var1', 'var2']
        result = lookup.run(terms, variables=variables)
        self.assertEqual(result, ['var1', 'var2'])

    def test_run_method_with_regex(self):
        lookup = LookupModule()
        variables = {'var1': 1, 'var2': 2, 'var3': 3}
        terms = ['var\d']
        result = lookup.run(terms, variables=variables)
        self.assertEqual(result, ['var1', 'var2'])

    def test_run_method_with_invalid_regex(self):
        lookup = LookupModule()
        variables = {'var1': 1, 'var2': 2, 'var3': 3}
        terms = ['var(1|2)']
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables=variables)

    def test_run_method_with_invalid_term(self):
        lookup = LookupModule()
        variables = {'var1': 1, 'var2': 2, 'var3': 3}
        terms = [1, 2]
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables=variables)

if __name__ == '__main__':
    unittest.main()