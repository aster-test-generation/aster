import unittest
from ansible.plugins.lookup import nested


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        instance = LookupModule()
        terms = [1, 2, 3]
        variables = None
        result = instance._lookup_variables(terms, variables)
        self.assertEqual(result, [1, 2, 3])

    def test_run(self):
        instance = LookupModule()
        terms = [1, 2, 3]
        variables = None
        result = instance.run(terms, variables)
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()