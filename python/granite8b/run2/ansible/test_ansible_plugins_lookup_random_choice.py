from ansible.errors import AnsibleError
import unittest
from ansible.plugins.lookup.random_choice import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_with_terms(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        result = lookup.run(terms)
        self.assertIn(result[0], terms)

    def test_run_with_empty_terms(self):
        lookup = LookupModule()
        terms = []
        result = lookup.run(terms)
        self.assertEqual(result, [])

    def test_run_with_non_iterable_terms(self):
        lookup = LookupModule()
        terms = 'abc'
        with self.assertRaises(AnsibleError):
            lookup.run(terms)

    def test_run_with_exception(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        with self.assertRaises(AnsibleError):
            lookup.run(terms)

if __name__ == '__main__':
    unittest.main()