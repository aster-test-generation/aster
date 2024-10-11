from ansible.module_utils.basic import AnsibleModule, error
import unittest
from ansible.plugins.lookup.varnames import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['var1', 'var2']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['var1', 'var2'])

    def test_run_invalid_term(self):
        lookup = LookupModule()
        terms = ['invalid term']
        variables = {'var1': 'value1', 'var2': 'value2'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_non_string_term(self):
        lookup = LookupModule()
        terms = [1]
        variables = {'var1': 'value1', 'var2': 'value2'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_variable_names(self):
        lookup = LookupModule()
        terms = ['var1', 'var2']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['var1', 'var2'])

    def test_run_variable_names_with_pattern(self):
        lookup = LookupModule()
        terms = ['var']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['var1', 'var2', 'var3'])

    def test_run_variable_names_with_pattern_and_invalid_term(self):
        lookup = LookupModule()
        terms = ['var', 'invalid term']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_variable_names_with_pattern_and_non_string_term(self):
        lookup = LookupModule()
        terms = ['var', 1]
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_variable_names_with_pattern_and_variable_names(self):
        lookup = LookupModule()
        terms = ['var']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['var1', 'var2', 'var3'])

    def test_run_variable_names_with_pattern_and_variable_names_and_invalid_term(self):
        lookup = LookupModule()
        terms = ['var', 'invalid term']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_variable_names_with_pattern_and_variable_names_and_non_string_term(self):
        lookup = LookupModule()
        terms = ['var', 1]
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_variable_names_with_pattern_and_variable_names_and_variable_names(self):
        lookup = LookupModule()
        terms = ['var']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['var1', 'var2', 'var3'])

    def test_run_variable_names_with_pattern_and_variable_names_and_variable_names_and_invalid_term(self):
        lookup = LookupModule()
        terms = ['var', 'invalid term']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_variable_names_with_pattern_and_variable_names_and_variable_names_and_non_string_term(self):
        lookup = LookupModule()
        terms = ['var', 1]
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

if __name__ == '__main__':
    unittest.main()