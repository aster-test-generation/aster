import unittest
from ansible.module_utils.common.parameters import *
from ansible.module_utils.common.parameters import _sanitize_keys_conditions


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'mutually_exclusive': [['param2', 'param3'], ['param4', 'param5']]}}
        result = check_mutually_exclusive(params, spec)
        self.assertEqual(result, [])

    def test_check_required_arguments(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required': True}, 'param2': {'required': True}}
        result = check_required_arguments(params, spec)
        self.assertEqual(result, None)

    def test_check_required_together(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_together': [['param2', 'param3'], ['param4', 'param5']]}}
        result = check_required_together(params, spec)
        self.assertEqual(result, [])

    def test_check_required_one_of(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_one_of': [['param2', 'param3'], ['param4', 'param5']]}}
        params = {'p': 1}
        self.assertEqual(result, None)

    def test_check_required_if(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_if': [['param2', 'equals', 1], ['param3', 'equals', 2]]}}
        result = check_required_if(params, spec)
        self.assertEqual(result, None)

    def test_check_required_by(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_by': {'param2': 'value1', 'param3': 'value2'}}}
        result = check_required_by(params, spec)
        self.assertEqual(result, None)

    def test_check_type_bits(self):
        value = '0644'
        result = check_type_bits(value)
        self.assertEqual(result, 644)

    def test_check_type_bool(self):
        value = 'yes'
        result = check_type_bool(value)
        self.assertEqual(result, True)

    def test_check_type_bytes(self):
        value = '1024'
        result = check_type_bytes(value)
        self.assertEqual(result, 1024)

    def test_check_type_dict(self):
        value = '{"key": "value"}'
        result = check_type_dict(value)
        self.assertEqual(result, {'key': 'value'})

    def test_check_type_float(self):
        value = '3.14'
        result = check_type_float(value)
        self.assertEqual(result, 3.14)

    def test_check_type_int(self):
        value = '42'
        result = check_type_int(value)
        self.assertEqual(result, 42)

    def test_check_type_jsonarg(self):
        value = '{"key": "value"}'
        result = check_type_jsonarg(value)
        self.assertEqual(result, '{"key": "value"}')

    def test_check_type_list(self):
        value = '["item1", "item2"]'
        result = check_type_list(value)
        self.assertEqual(result, ['item1', 'item2'])

    def test_check_type_path(self):
        value = '/path/to/file'
        result = check_type_path(value)
        self.assertEqual(result, '/path/to/file')

    def test_check_type_raw(self):
        value = 'raw_value'
        result = check_type_raw(value)
        self.assertEqual(result, 'raw_value')

class TestSanitizeKeysConditions(unittest.TestCase):
    def test_string(self):
        value = "example"
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, "example")

    def test_list(self):
        value = ["example1", "example2"]
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, [])

    def test_set(self):
        value = {"example1", "example2"}
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, set())

    def test_dict(self):
        value = {"example1": "value1", "example2": "value2"}
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, {})

    def test_integer(self):
        value = 123
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, 123)

    def test_datetime(self):
        value = datetime.datetime.now()
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, value)

if __name__ == '__main__':
    unittest.main()