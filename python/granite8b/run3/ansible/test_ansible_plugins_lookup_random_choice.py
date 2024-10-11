import unittest
from ansible.plugins.lookup import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_with_terms(self):
        lookup = LookupModule()
        result = lookup.run(['a', 'b', 'c'])
        self.assertIn(result[0], ['a', 'b', 'c'])

    def test_run_without_terms(self):
        lookup = LookupModule()
        result = lookup.run([])
        self.assertEqual(result, [])

    def test_run_with_exception(self):
        lookup = LookupModule()
        with self.assertRaises(Exception) as cm:
            lookup.run([1, 2, 3], inject={'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(str(cm.exception), "Unable to choose random term: 'a'")

    def test_private_method(self):
        lookup = LookupModule()
        result = lookup._LookupModule__run(['a', 'b', 'c'])
        self.assertIn(result[0], ['a', 'b', 'c'])

    def test_protected_method(self):
        lookup = LookupModule()
        result = lookup._LookupModule__get_random_choice(['a', 'b', 'c'])
        self.assertIn(result, ['a', 'b', 'c'])

    def test_magic_method(self):
        lookup = LookupModule()
        result = lookup.__str__()
        self.assertEqual(result, "LookupModule")

    def test_magic_method_with_args(self):
        lookup = LookupModule()
        result = lookup.__str__("a")
        self.assertEqual(result, "LookupModule")

if __name__ == '__main__':
    unittest.main()