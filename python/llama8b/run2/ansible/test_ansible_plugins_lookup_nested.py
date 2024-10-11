import unittest
from unittest.mock import patch
from ansible.module_utils.basic import AnsibleModul


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup_module = LookupModule()

    def test__lookup_variables(self):
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2', 'c': '3'}
        result = self.lookup_module._lookup_variables(terms, variables)
        self.assertEqual(result, [['1'], ['2'], ['3']])

    def test__lookup_variables_undefined(self):
        terms = ['a', 'b', 'c']
        variables = {'a': '1'}
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup_module._lookup_variables(terms, variables)

    def test_run(self):
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2', 'c': '3'}
        result = self.lookup_module.run(terms, variables)
        self.assertEqual(result, [['3'], ['2', '3'], ['1', '2', '3']])

    def test_run_empty(self):
        terms = []
        variables = {}
        with self.assertRaises(AnsibleError):
            self.lookup_module.run(terms, variables)

    def test__combine(self):
        result = ['a', 'b', 'c']
        new_result = self.lookup_module._combine(result, ['d', 'e'])
        self.assertEqual(new_result, ['a', 'b', 'c', 'd', 'e'])

    def test__flatten(self):
        result = [['a', 'b'], ['c', 'd']]
        new_result = [self.lookup_module._flatten(x) for x in result]
        self.assertEqual(new_result, ['a', 'b', 'c', 'd'])

    def test__init__(self):
        lookup_module = LookupModule()
        self.assertIsInstance(lookup_module, LookupModule)

    def test__str__(self):
        lookup_module = LookupModule()
        result = str(lookup_module)
        self.assertEqual(result, 'LookupModule')

    def test__repr__(self):
        lookup_module = LookupModule()
        result = repr(lookup_module)
        self.assertEqual(result, 'LookupModule()')

if __name__ == '__main__':
    unittest.main()