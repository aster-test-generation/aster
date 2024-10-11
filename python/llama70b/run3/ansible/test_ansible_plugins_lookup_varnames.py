import unittest
from ansible_collections.ansible.builtin.plugins.lookup.varnames import LookupModul


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        variables = {'var1': 'value1', 'var2': 'value2'}
        terms = ['var1', 'var2']
        result = instance.run(terms, variables)
        self.assertEqual(result, ['var1', 'var2'])

    def test_run_no_variables(self):
        instance = LookupModule()
        terms = ['var1', 'var2']
        with self.assertRaises(AnsibleError):
            instance.run(terms)

    def test_run_invalid_term(self):
        instance = LookupModule()
        variables = {'var1': 'value1', 'var2': 'value2'}
        terms = [1, 'var2']
        with self.assertRaises(AnsibleError):
            instance.run(terms, variables)

    def test_run_invalid_regex(self):
        instance = LookupModule()
        variables = {'var1': 'value1', 'var2': 'value2'}
        terms = ['[invalid regex]', 'var2']
        with self.assertRaises(AnsibleError):
            instance.run(terms, variables)

    def test_set_options(self):
        instance = LookupModule()
        variables = {'var1': 'value1', 'var2': 'value2'}
        kwargs = {'direct': True}
        instance.set_options(var_options=variables, direct=kwargs)
        self.assertEqual(instance.var_options, variables)
        self.assertEqual(instance.direct, kwargs)

    def test___init__(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupBase)

    def test___str__(self):
        instance = LookupModule()
        result = instance.__str__()
        self.assertEqual(result, 'LookupModule')

    def test___repr__(self):
        instance = LookupModule()
        result = instance.__repr__()
        self.assertEqual(result, 'LookupModule()')

if __name__ == '__main__':
    unittest.main()