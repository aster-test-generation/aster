import unittest
from ansible.errors import AnsibleError, AnsibleUndefinedVariable
from ansible.module_utils.six import string_types
from ansible.plugins.lookup.vars import LookupModule


class MockTemplar:
    def __init__(self, available_variables):
        self._available_variables = available_variables

    def template(self, value, fail_on_undefined):
        if fail_on_undefined and value is None:
            raise AnsibleUndefinedVariable("Undefined variable")
        return value

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.templar = MockTemplar({
            'var1': 'value1',
            'hostvars': {
                'localhost': {
                    'var2': 'value2'
                }
            },
            'inventory_hostname': 'localhost'
        })
        self.lookup = LookupModule()
        self.lookup._templar = self.templar

    def test_run_with_valid_term(self):
        result = self.lookup.get(['var1'])
        self.assertEqual(result, ['value1'])

    def test_run_with_hostvars_term(self):
        result = self.lookup.get(['var2'])
        self.assertEqual(result, ['value2'])

    def test_run_with_invalid_term(self):
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup.lookup(['var3'])

    def test_run_with_invalid_type_term(self):
        with self.assertRaises(AnsibleError):
            self.lookup.lookup([123])

    def test_run_with_default(self):
        self.lookup.set_options(var_options=None, direct={'default': 'default_value'}, indirect=None)
        result = self.lookup.run(['var3'])
        self.assertEqual(result, ['default_value'])

    def test_run_with_no_default(self):
        with self.assertRaises(AnsibleUndefinedVariable):
            self.lookup.get(['var3'])

    def test_set_options(self):
        self.lookup.set_options(var_options={'option1': 'value1'}, direct={'option2': 'value2'}, loader=self.loader)
        self.assertEqual(self.lookup.get_option('option1'), 'value1')
        self.assertEqual(self.lookup.get_option('option2'), 'value2')

if __name__ == '__main__':
    unittest.main()