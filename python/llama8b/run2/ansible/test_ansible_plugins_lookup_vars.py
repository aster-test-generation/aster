import unittest
from ansible.module_utils.basic import AnsibleModul


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['var1', 'var2']
        variables = {'var1': 'value1', 'var2': 'value2'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run_with_default(self):
        lookup = LookupModule()
        terms = ['var1', 'var2']
        variables = {}
        default = 'default_value'
        result = lookup.run(terms, variables, default=default)
        self.assertEqual(result, ['default_value', 'default_value'])

    def test_run_with_undefined_variable(self):
        lookup = LookupModule()
        terms = ['var1', 'var2']
        variables = {}
        with self.assertRaises(AnsibleUndefinedVariable):
            lookup.run(terms, variables)

    def test_run_with_invalid_setting_identifier(self):
        lookup = LookupModule()
        terms = [1, 2]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_set_options(self):
        lookup = LookupModule()
        variables = {'var1': 'value1'}
        lookup.set_options(var_options=variables, direct={'direct_var': 'direct_value'})
        self.assertEqual(lookup._templar.available_variables, variables)
        self.assertEqual(lookup.get_option('direct_var'), 'direct_value')

    def test_get_option(self):
        lookup = LookupModule()
        self.assertIsNone(lookup.get_option('non_existent_option'))

    def test_get_option_with_default(self):
        lookup = LookupModule()
        self.assertEqual(lookup.get_option('non_existent_option', default='default_value'), 'default_value')

    def test__templar_available_variables(self):
        lookup = LookupModule()
        self.assertEqual(lookup._templar_available_variables, {})

    def test__templar_available_variables_set(self):
        lookup = LookupModule()
        variables = {'var1': 'value1'}
        lookup._templar_available_variables = variables
        self.assertEqual(lookup._templar_available_variables, variables)

    def test__str__(self):
        lookup = LookupModule()
        self.assertEqual(str(lookup), 'LookupModule')

    def test__repr__(self):
        lookup = LookupModule()
        self.assertEqual(repr(lookup), 'LookupModule()')

if __name__ == '__main__':
    unittest.main()