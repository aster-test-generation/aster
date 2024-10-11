import unittest
from ansible_collections.ansible.builtin.plugins.lookup.varnames import LookupModul


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        instance = LookupModule()
        terms = ['foo', 'bar']
        variables = {'foo': 'value1', 'bar': 'value2', 'baz': 'value3'}
        result = instance.run(terms, variables)
        self.assertEqual(result, ['foo', 'bar'])

    def test_run_no_variables(self):
        instance = LookupModule()
        terms = ['foo', 'bar']
        with self.assertRaises(AnsibleError):
            instance.run(terms)

    def test_run_invalid_term(self):
        instance = LookupModule()
        terms = [1, 'bar']
        variables = {'foo': 'value1', 'bar': 'value2', 'baz': 'value3'}
        with self.assertRaises(AnsibleError):
            instance.run(terms, variables)

    def test_run_invalid_regex(self):
        instance = LookupModule()
        terms = ['[invalid regex']
        variables = {'foo': 'value1', 'bar': 'value2', 'baz': 'value3'}
        with self.assertRaises(AnsibleError):
            instance.run(terms, variables)

    def test_set_options(self):
        instance = LookupModule()
        variables = {'foo': 'value1', 'bar': 'value2', 'baz': 'value3'}
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