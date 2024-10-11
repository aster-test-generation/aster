from ansible.plugins.lookup.random_choice import AnsibleError
import unittest
from ansible.plugins.lookup.random_choice import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_with_terms(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        result = lookup.run(terms)
        self.assertIn(result[0], terms)

    def test_run_without_terms(self):
        lookup = LookupModule()
        result = lookup.run([])
        self.assertEqual(result, [])

    def test_run_with_error(self):
        lookup = LookupModule()
        terms = "not a list"
        with self.assertRaises(AnsibleError):
            lookup.run(terms)
        self.assertTrue("Unable to choose random term" in str(context.exception))

if __name__ == '__main__':
    unittest.main()