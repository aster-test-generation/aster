import unittest
from ansible.module_utils.basic import AnsibleModule, env_fallbac


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['key1', 'key2']
        variables = {'key1': 'value1', 'key2': 'value2'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run_with_default(self):
        lookup = LookupModule()
        terms = ['key1', 'key2']
        variables = {'key1': 'value1'}
        default = 'default_value'
        result = lookup.run(terms, variables, default=default)
        self.assertEqual(result, ['value1', default])

    def test_run_with_invalid_term(self):
        lookup = LookupModule()
        terms = ['key1', 123]
        variables = {'key1': 'value1'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_with_undefined_variable(self):
        lookup = LookupModule()
        terms = ['key1', 'key2']
        variables = {'key1': 'value1'}
        with self.assertRaises(AnsibleUndefinedVariable):
            lookup.run(terms, variables)

    def test_run_with_hostvars(self):
        lookup = LookupModule()
        terms = ['key1', 'key2']
        variables = {'key1': 'value1', 'hostvars': {'host1': {'key2': 'value2'}}}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['value1', 'value2'])

    def test_str_method(self):
        lookup = LookupModule()
        result = str(lookup)
        self.assertEqual(result, 'LookupModule')

    def test_repr_method(self):
        lookup = LookupModule()
        result = repr(lookup)
        self.assertEqual(result, 'LookupModule()')

    def test_eq_method(self):
        lookup1 = LookupModule()
        lookup2 = LookupModule()
        self.assertEqual(lookup1, lookup2)

    def test_init_method(self):
        lookup = LookupModule()
        self.assertEqual(lookup._templar.available_variables, {})

if __name__ == '__main__':
    unittest.main()