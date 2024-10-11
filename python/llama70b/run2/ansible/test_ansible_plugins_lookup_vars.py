from ansible.plugins.lookup import vars as lookup_var
import unittest
from ansible.plugins.lookup.vars import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_init(self):
        instance = LookupModule()
        self.assertIsInstance(instance, LookupModule)

    def test_run(self):
        instance = LookupModule()
        terms = ['term1', 'term2']
        variables = {'term1': 'value1', 'term2': 'value2'}
        result = instance.run(terms, variables)
        self.assertEqual(result, ['value1', 'value2'])

    def test_run_with_default(self):
        instance = LookupModule()
        terms = ['term1', 'term2']
        variables = {'term1': 'value1'}
        default = 'default_value'
        result = instance.run(terms, variables, default=default)
        self.assertEqual(result, ['value1', 'default_value'])

    def test_run_with_invalid_term(self):
        instance = LookupModule()
        terms = ['term1', 123]
        variables = {'term1': 'value1'}
        with self.assertRaises(AnsibleError):
            instance.run(terms, variables)

    def test_set_options(self):
        instance = LookupModule()
        var_options = {'key': 'value'}
        direct = {'direct_key': 'direct_value'}
        instance.set_options(var_options=var_options, direct=direct)
        self.assertEqual(instance._options, {'var_options': var_options, 'direct': direct})

    def test_get_option(self):
        instance = LookupModule()
        instance._options = {'default': 'default_value'}
        result = instance.get_option('default')
        self.assertEqual(result, 'default_value')

    def test__templar_template(self):
        instance = LookupModule()
        templar = instance._templar
        value = 'template_value'
        result = templar.template(value, fail_on_undefined=True)
        self.assertEqual(result, value)

    def test__templar_available_variables(self):
        instance = LookupModule()
        variables = {'key': 'value'}
        instance._templar.available_variables = variables
        result = instance._templar._available_variables
        self.assertEqual(result, variables)

    def test_str_method(self):
        instance = LookupModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = LookupModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()