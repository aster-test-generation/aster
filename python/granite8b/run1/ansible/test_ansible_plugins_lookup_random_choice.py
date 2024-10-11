import unittest
from ansible.plugins.lookup import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        result = lookup.run(terms)
        self.assertIn(result[0], terms)

    def test_private_method(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        result = lookup._LookupModule__run(terms)
        self.assertIn(result[0], terms)

    def test_protected_method(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        result = lookup._LookupModule__run(terms)
        self.assertIn(result[0], terms)

    def test_magic_methods(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        result = lookup.__init__(terms)
        self.assertIn(result[0], terms)
        result = lookup.__str__()
        self.assertEqual(result, "LookupModule")
        result = lookup.__repr__()
        self.assertEqual(result, "LookupModule(terms)")
        result = lookup.__eq__(terms)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()