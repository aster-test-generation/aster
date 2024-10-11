import unittest
from ansible.errors import AnsibleError, AnsibleUndefinedVariable
from ansible.plugins.lookup.vars import LookupModule
from ansible.module_utils.six import string_types


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()
        self.lookup._templar = type('templar', (object,), {'available_variables': {}, 'template': lambda self, x, fail_on_undefined: x})

    def test_run_with_valid_term(self):
        self.lookup._templar.available_variables = {'valid_term': 'value'}
        result = self.lookup.lookup(['valid_term'])
        self.assertEqual(result, ['value'])

    def test_run_with_invalid_term_type(self):
        with self.assertRaises(AnsibleError):
            self.lookup.lookup([123])

    def test_run_with_missing_term(self):
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup._load_name('missing_term')

    def test_run_with_default_option(self):
        self.lookup.set_options = lambda var_options, direct: None
        self.lookup.get_option = lambda option: 'default_value' if option == 'default' else None
        result = self.lookup.run(['missing_term'])
        self.assertEqual(result, ['default_value'])

    def test_run_with_hostvars(self):
        self.lookup._templar.available_variables = {
            'hostvars': {
                'localhost': {
                    'valid_term': 'host_value'
                }
            },
            'inventory_hostname': 'localhost'
        }
        result = self.lookup.lookup(['valid_term'])
        self.assertEqual(result, ['host_value'])

    def test_run_with_key_error_in_hostvars(self):
        self.lookup._templar.available_variables = {
            'hostvars': {
                'localhost': {}
            },
            'inventory_hostname': 'localhost'
        }
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup.lookup(['missing_term'])

    def test_run_with_templating(self):
        self.lookup._templar.template = lambda value, fail_on_undefined: f"templated_{value}"
        self.lookup._templar.available_variables = {'valid_term': 'value'}
        result = self.lookup.lookup(['valid_term'])
        self.assertEqual(result, ['templated_value'])

if __name__ == '__main__':
    unittest.main()