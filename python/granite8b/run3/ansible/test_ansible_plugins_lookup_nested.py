import unittest
from ansible.plugins.lookup import nested as LookupModule


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        lookup = LookupModule()
        terms = [["a", "b"], ["c", "d"]]
        variables = {}
        results = lookup._lookup_variables(terms, variables)
        expected_results = [[["a", "b"]], [["c", "d"]]]
        self.assertEqual(results, expected_results)

    def test_run(self):
        lookup = LookupModule()
        terms = [["a", "b"], ["c", "d"]]
        variables = {}
        result = lookup.run(terms, variables)
        expected_result = [["a", "b"], ["c", "d"]]
        self.assertEqual(result, expected_result)

    def test_run_with_private_method(self):
        lookup = LookupModule()
        terms = [["a", "b"], ["c", "d"]]
        variables = {}
        result = lookup._LookupModule__run(terms, variables)
        expected_result = [["a", "b"], ["c", "d"]]
        self.assertEqual(result, expected_result)

    def test_run_with_protected_method(self):
        lookup = LookupModule()
        terms = [["a", "b"], ["c", "d"]]
        variables = {}
        result = lookup._LookupModule__run(terms, variables)
        expected_result = [["a", "b"], ["c", "d"]]
        self.assertEqual(result, expected_result)

    def test_run_with_magic_method(self):
        lookup = LookupModule()
        terms = [["a", "b"], ["c", "d"]]
        variables = {}
        result = lookup.__run(terms, variables)
        expected_result = [["a", "b"], ["c", "d"]]
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()