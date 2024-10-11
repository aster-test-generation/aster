from ansible.plugins.lookup.together import togethe
import unittest
from ansible.plugins.lookup.together import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        lookup = LookupModule()
        terms = [['a', 'b', 'c'], ['1', '2', '3']]
        result = lookup._lookup_variables(terms)
        self.assertEqual(result, [['a', '1'], ['b', '2'], ['c', '3']])

    def test_run(self):
        lookup = LookupModule()
        terms = [['a', 'b', 'c'], ['1', '2', '3']]
        result = lookup.run(terms)
        self.assertEqual(result, [['a', '1'], ['b', '2'], ['c', '3']])

    def test_run_empty_terms(self):
        lookup = LookupModule()
        terms = []
        with self.assertRaises(AnsibleError):
            lookup.run(terms)

    def test_run_fillvalue(self):
        lookup = LookupModule()
        terms = [['a', 'b', 'c'], ['1', '2']]
        result = lookup.run(terms)
        self.assertEqual(result, [['a', '1'], ['b', '2'], ['c', None]])

    def test_str_method(self):
        lookup = LookupModule()
        result = str(lookup)
        self.assertEqual(result, '<ansible.plugins.lookup.together.LookupModule object at 0x...>')

    def test_repr_method(self):
        lookup = LookupModule()
        result = repr(lookup)
        self.assertEqual(result, '<ansible.plugins.lookup.together.LookupModule object at 0x...>')

    def test_eq_method(self):
        lookup1 = LookupModule()
        lookup2 = LookupModule()
        self.assertEqual(lookup1, lookup2)

if __name__ == '__main__':
    unittest.main()