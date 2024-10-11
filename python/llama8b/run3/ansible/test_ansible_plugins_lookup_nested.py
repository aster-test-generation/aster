import unittest
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestLookupModule(unittest.TestCase):
    def test__lookup_variables(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2', 'c': '3'}
        result = lookup._lookup_variables(terms, variables)
        self.assertEqual(result, [['1'], ['2'], ['3']])

    def test__lookup_variables_undefined(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {'a': '1'}
        with self.assertRaises(AnsibleUndefinedVariable):
            lookup._lookup_variables(terms, variables)

    def test_run(self):
        lookup = LookupModule()
        terms = [['a', 'b', 'c'], ['d', 'e', 'f']]
        variables = {'a': '1', 'b': '2', 'c': '3', 'd': '4', 'e': '5', 'f': '6'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, [['6', '5', '4'], ['3', '2', '1']])

    def test_run_empty(self):
        lookup = LookupModule()
        terms = []
        variables = {'a': '1', 'b': '2', 'c': '3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test__combine(self):
        lookup = LookupModule()
        result = [['a', 'b'], ['c', 'd']]
        my_list = ['e', 'f']
        result = lookup._combine(result, my_list)
        self.assertEqual(result, [['a', 'b', 'e', 'f'], ['c', 'd']])

    def test__flatten(self):
        lookup = LookupModule()
        result = [['a', 'b'], ['c', 'd']]
        flattened = lookup._flatten(result)
        self.assertEqual(flattened, ['a', 'b', 'c', 'd'])

    def test__init__(self):
        lookup = LookupModule()
        self.assertEqual(lookup._templar, None)
        self.assertEqual(lookup._loader, None)

    def test__str__(self):
        lookup = LookupModule()
        self.assertEqual(str(lookup), 'LookupModule')

    def test__repr__(self):
        lookup = LookupModule()
        self.assertEqual(repr(lookup), 'LookupModule()')

    def test__eq__(self):
        lookup1 = LookupModule()
        lookup2 = LookupModule()
        self.assertEqual(lookup1, lookup2)

if __name__ == '__main__':
    unittest.main()