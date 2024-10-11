import unittest
from ansible.module_utils.basic import AnsibleModul


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2', 'c': '3'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['1', '2', '3'])

    def test_run_with_default(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2'}
        default = 'default'
        result = lookup.run(terms, variables, default=default)
        self.assertEqual(result, ['1', '2', default])

    def test_run_with_non_string_term(self):
        lookup = LookupModule()
        terms = [1, 2, 3]
        variables = {'a': '1', 'b': '2', 'c': '3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_with_undefined_variable(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {'a': '1'}
        with self.assertRaises(AnsibleUndefinedVariable):
            lookup.run(terms, variables)

    def test_run_with_hostvars(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {'a': '1', 'b': '2', 'c': '3', 'hostvars': {'host1': {'a': '1', 'b': '2', 'c': '3'}}}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['1', '2', '3'])

    def test_set_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'a': '1', 'b': '2'}, direct={'c': '3'})
        self.assertEqual(lookup._available_variables, {'a': '1', 'b': '2'})
        self.assertEqual(lookup._templar.available_variables, {'a': '1', 'b': '2'})
        self.assertEqual(lookup.get_option('default'), None)
        self.assertEqual(lookup.get_option('c'), '3')

    def test_get_option(self):
        lookup = LookupModule()
        self.assertIsNone(lookup.get_option('default'))
        self.assertIsNone(lookup.get_option('c'))

    def test_get_option_with_default(self):
        lookup = LookupModule()
        self.assertEqual(lookup.get_option('default', 'default'), 'default')

    def test_get_option_with_direct(self):
        lookup = LookupModule()
        lookup.set_options(direct={'c': '3'})
        self.assertEqual(lookup.get_option('c'), '3')

    def test_get_option_with_var_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'a': '1', 'b': '2'})
        self.assertEqual(lookup.get_option('a'), '1')
        self.assertEqual(lookup.get_option('b'), '2')

    def test_get_option_with_var_options_and_direct(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'a': '1', 'b': '2'}, direct={'c': '3'})
        self.assertEqual(lookup.get_option('a'), '1')
        self.assertEqual(lookup.get_option('b'), '2')
        self.assertEqual(lookup.get_option('c'), '3')

if __name__ == '__main__':
    unittest.main()