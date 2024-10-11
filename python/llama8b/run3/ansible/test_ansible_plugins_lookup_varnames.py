import unittest
from ansible.module_utils.basic import AnsibleModule, env_fallback, json, yam


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['var1', 'var2']
        variables = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['var1', 'var2'])

    def test_run_invalid_term(self):
        lookup = LookupModule()
        terms = ['invalid_term']
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

    def test_run_no_variables(self):
        lookup = LookupModule()
        terms = ['var1', 'var2']
        with self.assertRaises(AnsibleError):
            lookup.run(terms, None)

    def test_set_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'var1': 'value1', 'var2': 'value2'}, direct={'direct': 'value'})
        self.assertEqual(lookup.var_options, {'var1': 'value1', 'var2': 'value2'})
        self.assertEqual(lookup.direct, {'direct': 'value'})

if __name__ == '__main__':
    unittest.main()