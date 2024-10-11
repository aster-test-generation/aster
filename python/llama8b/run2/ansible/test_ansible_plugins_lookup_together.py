from ansible.plugins.lookup import togethe
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

    def test_run_zip_longest(self):
        terms = [['a', 'b', 'c'], ['1', '2', '3', '4']]
        result = self.lookup_module.run(terms)
        self.assertEqual(result, [['a', '1'], ['b', '2'], ['c', '3'], [None, '4']])

    def test_str_method(self):
        result = str(self.lookup_module)
        self.assertEqual(result, 'LookupModule')

    def test_repr_method(self):
        result = repr(self.lookup_module)
        self.assertEqual(result, 'LookupModule()')

    def test_eq_method(self):
        other = LookupModule()
        self.assertEqual(self.lookup_module, other)

    @patch('ansible.module_utils.six.moves.zip_longest')
    def test_run_zip_longest_mock(self, mock_zip_longest):
        terms = [['a', 'b', 'c'], ['1', '2', '3', '4']]
        result = self.lookup_module.run(terms)
        mock_zip_longest.assert_called_once_with(*terms, fillvalue=None)

if __name__ == '__main__':
    unittest.main()