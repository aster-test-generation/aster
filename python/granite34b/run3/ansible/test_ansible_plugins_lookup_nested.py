import unittest
from ansible.plugins.lookup.nested import LookupModule


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_lookup_variables(self):
        terms = ['a', 'b', 'c']
        variables = {'a': 1, 'b': 2, 'c': 3}
        result = self.lookup.template(terms, variables)
        self.assertEqual(result, [[1], [2], [3]])

    def test_run(self):
        terms = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        result = self.lookup.run(terms)
        self.assertEqual(result, [[7, 8, 9, 4, 5, 6, 1, 2, 3]])

if __name__ == '__main__':
    unittest.main()