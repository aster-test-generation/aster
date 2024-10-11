import unittest
from ansible.plugins.lookup import nested as LookupModule


class TestLookupModule(unittest.TestCase):
    def test_lookup_variables(self):
        lookup = LookupModule()
        terms = ['{{ foo }}', '{{ bar }}']
        variables = {'foo': 'a', 'bar': 'b'}
        results = lookup._lookup_variables(terms, variables)
        self.assertEqual(results, [['a'], ['b']])

    def test_run(self):
        lookup = LookupModule()
        terms = [['a', 'b'], ['1', '2']]
        result = lookup.run(terms)
        self.assertEqual(result, [['a', '1'], ['a', '2'], ['b', '1'], ['b', '2']])

if __name__ == '__main__':
    unittest.main()