import unittest
from unittest.mock import patch
from ansible.module_utils.basic import AnsibleModul


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup_module = LookupModule()

    def test_lookup_variables(self):
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2', 'c': '3'}
        results = self.lookup_module._lookup_variables(terms, variables)
        self.assertEqual(results, [['1'], ['2'], ['3']])

    def test_lookup_variables_undefined(self):
        terms = ['a', 'b', 'c']
        variables = {'a': '1'}
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup_module._lookup_variables(terms, variables)

    def test_run(self):
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2', 'c': '3'}
        result = self.lookup_module.run(terms, variables)
        self.assertEqual(result, [['3'], ['2'], ['1']])

    def test_run_empty(self):
        terms = []
        variables = {}
        with self.assertRaises(AnsibleError):
            self.lookup_module.run(terms, variables)

    def test_combine(self):
        result = ['a', 'b']
        item = ['c', 'd']
        new_result = self.lookup_module._combine(result, item)
        self.assertEqual(new_result, ['c', 'b', 'd', 'a'])

    def test_flatten(self):
        result = [['a', 'b'], ['c', 'd']]
        new_result = self.lookup_module._flatten(result)
        self.assertEqual(new_result, ['a', 'b', 'c', 'd'])

    def test_str(self):
        result = self.lookup_module.__str__()
        self.assertEqual(result, 'LookupModule')

    def test_repr(self):
        result = self.lookup_module.__repr__()
        self.assertEqual(result, 'LookupModule()')

if __name__ == '__main__':
    unittest.main()