from ansible.plugins.lookup.together import togethe
import unittest
from unittest.mock import patch
from ansible.plugins.lookup.together import LookupModule


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup_module = LookupModule()

    def test__lookup_variables(self):
        terms = [['a', 'b', 'c'], ['1', '2', '3']]
        result = self.lookup_module._lookup_variables(terms)
        self.assertEqual(result, [['a', '1'], ['b', '2'], ['c', '3']])

    def test_run(self):
        terms = [['a', 'b', 'c'], ['1', '2', '3']]
        result = self.lookup_module.run(terms)
        self.assertEqual(result, [['a', '1'], ['b', '2'], ['c', '3']])

    def test_run_empty_terms(self):
        terms = []
        with self.assertRaises(AnsibleError):
            self.lookup_module.run(terms)

    def test_run_fillvalue(self):
        terms = [['a', 'b', 'c'], ['1', '2']]
        result = self.lookup_module.run(terms)
        self.assertEqual(result, [['a', '1'], ['b', '2'], ['c', None]])

    def test_run_multiple_fillvalues(self):
        terms = [['a', 'b', 'c'], ['1', '2'], ['x', 'y', 'z']]
        result = self.lookup_module.run(terms)
        self.assertEqual(result, [['a', '1', 'x'], ['b', '2', 'y'], ['c', None, 'z']])

    def test_run_with_variables(self):
        terms = [['a', 'b', 'c'], ['1', '2', '3']]
        variables = {'a': 'A', 'b': 'B', 'c': 'C'}
        result = self.lookup_module.run(terms, variables)
        self.assertEqual(result, [['A', '1'], ['B', '2'], ['C', '3']])

    @patch('ansible.plugins.lookup.together.LookupModule._lookup_variables')
    def test_run_calls__lookup_variables(self, mock_lookup_variables):
        terms = [['a', 'b', 'c'], ['1', '2', '3']]
        self.lookup_module.run(terms)
        mock_lookup_variables.assert_called_once_with(terms)

if __name__ == '__main__':
    unittest.main()