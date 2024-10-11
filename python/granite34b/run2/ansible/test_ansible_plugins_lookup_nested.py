import unittest
from ansible.plugins.lookup.nested import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {'a': 1, 'b': 2, 'c': 3}
        result = lookup.template(terms, variables)
        expected = [[1], [2], [3]]
        self.assertEqual(result, expected)

    def test_run(self):
        lookup = LookupModule()
        terms = [[1, 2, 3], [4, 5, 6]]
        variables = {}
        result = lookup.run(terms, variables)
        expected = [[4, 5, 6], [1, 2, 3]]
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()