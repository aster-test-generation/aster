import unittest
from ansible.plugins.lookup import *


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        instance = LookupModule()
        terms = [1, 2, 3]
        results = instance._lookup_variables(terms)
        self.assertEqual(results, [1, 2, 3])

    def test_run(self):
        instance = LookupModule()
        terms = [1, 2, 3]
        results = instance.run(terms)
        self.assertEqual(results, [[1, 2, 3]])

if __name__ == '__main__':
    unittest.main()