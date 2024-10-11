from ansible.errors import AnsibleError
import unittest
from ansible.plugins.lookup.together import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        lookup = LookupModule()
        terms = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        results = lookup._lookup_variables(terms)
        expected = [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
        self.assertEqual(results, expected)

    def test_run(self):
        lookup = LookupModule()
        terms = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        results = lookup.run(terms)
        expected = [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
        self.assertEqual(results, expected)

    def test_run_with_different_lengths(self):
        lookup = LookupModule()
        terms = [[1, 2, 3], [4, 5], [7, 8, 9]]
        with self.assertRaises(AnsibleError):
            lookup.run(terms)

    def test_run_with_empty_list(self):
        lookup = LookupModule()
        terms = []
        with self.assertRaises(AnsibleError):
            lookup.run(terms)

if __name__ == '__main__':
    unittest.main()