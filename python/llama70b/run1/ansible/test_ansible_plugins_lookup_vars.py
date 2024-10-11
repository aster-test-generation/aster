from ansible.plugins.lookup import vars as lookup_vars 
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
        instance.set_options(var_options=variables, direct={'default': default})
        result = instance.run(terms, variables)
        self.assertEqual(result, ['value1', 'default_value'])

    def test_run_with_undefined_variable(self):
        instance = LookupModule()
        terms = ['term1', 'term2']
        variables = {}
        with self.assertRaises(AnsibleUndefinedVariable):
            instance.run(terms, variables)

    def test_set_options(self):
        instance = LookupModule()
        variables = {'term1': 'value1', 'term2': 'value2'}
        direct = {'default': 'default_value'}
        instance.set_options(var_options=variables, direct=direct)
        self.assertEqual(instance._templar.available_variables, variables)
        self.assertEqual(instance.get_option('default'), 'default_value')

    def test_get_option(self):
        instance = LookupModule()
        instance.set_options(var_options={}, direct={'default': 'default_value'})
        result = instance.get_option('default')
        self.assertEqual(result, 'default_value')

    def test__templar_template(self):
        instance = LookupModule()
        value = 'template_value'
        result = instance._templar.template(value, fail_on_undefined=True)
        self.assertEqual(result, value)

    def test__str__(self):
        instance = LookupModule()
        result = str(instance)
        self.assertEqual(result, 'LookupModule')

    def test__repr__(self):
        instance = LookupModule()
        result = repr(instance)
        self.assertEqual(result, 'LookupModule()')

if __name__ == '__main__':
    unittest.main()