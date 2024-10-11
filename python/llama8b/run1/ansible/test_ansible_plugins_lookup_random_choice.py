from ansible.plugins.lookup.random_choice import random_choic
import unittest
from ansible.plugins.lookup.random_choice import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_method(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        result = lookup.run(terms)
        self.assertEqual(result, ['a'])

    def test_run_method_empty_terms(self):
        lookup = LookupModule()
        terms = []
        result = lookup.run(terms)
        self.assertEqual(result, [])

    def test_run_method_single_term(self):
        lookup = LookupModule()
        terms = ['a']
        result = lookup.run(terms)
        self.assertEqual(result, ['a'])

    def test_run_method_error(self):
        lookup = LookupModule()
        terms = ['a', 'b']
        with self.assertRaises(AnsibleError):
            lookup.run(terms, inject='invalid')

    def test_init_method(self):
        lookup = LookupModule()
        self.assertEqual(lookup.__class__, LookupModule)

    def test_str_method(self):
        lookup = LookupModule()
        self.assertEqual(str(lookup), 'LookupModule')

    def test_repr_method(self):
        lookup = LookupModule()
        self.assertEqual(repr(lookup), 'LookupModule()')

    def test_eq_method(self):
        lookup1 = LookupModule()
        lookup2 = LookupModule()
        self.assertEqual(lookup1, lookup2)

if __name__ == '__main__':
    unittest.main()