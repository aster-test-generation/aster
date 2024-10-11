import unittest
from ansible.plugins.lookup.yaml import *


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        instance = LookupModule()
        result = instance._lookup_variables(terms, variables)
        self.assertEqual(result, [1, 2, 3])

    def test_run(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        instance = LookupModule()
        result = instance.run(terms, variables)
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()