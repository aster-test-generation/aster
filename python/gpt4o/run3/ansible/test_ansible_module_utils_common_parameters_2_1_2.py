import unittest
from ansible.module_utils.common.parameters import _remove_values_conditions, _set_defaults
from ansible.module_utils.common.text.converters import to_bytes, to_text, to_native
from ansible.module_utils.six import PY2, PY3
import datetime


class TestRemoveValuesConditions(unittest.TestCase):
    def test_remove_values_conditions_text_type(self):
        value = "secret"
        no_log_strings = ["secret"]
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions_binary_type(self):
        value = b"secret"
        no_log_strings = [b"secret"]
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions_sequence(self):
        value = ["secret"]
        no_log_strings = ["secret"]
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, [])

    def test_remove_values_conditions_set(self):
        value = {"secret"}
        no_log_strings = ["secret"]
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, set())

    def test_remove_values_conditions_mapping(self):
        value = {"key": "secret"}
        no_log_strings = ["secret"]
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, {})

    def test_remove_values_conditions_tuple(self):
        value = (1, 2.0, True, None)
        no_log_strings = ["1", "2.0", "True", "None"]
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions_datetime(self):
        value = datetime.datetime(2023, 1, 1)
        no_log_strings = []
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, '2023-01-01T00:00:00')

    def test_remove_values_conditions_unknown_type(self):
        value = object()
        no_log_strings = []
        deferred_removals = []
        with self.assertRaises(TypeError):
            _remove_values_conditions(value, no_log_strings, deferred_removals)

class TestSetDefaults(unittest.TestCase):
    def test_set_defaults(self):
        argument_spec = {
            'param1': {'default': 'value1', 'no_log': True},
            'param2': {'default': 'value2'},
            'param3': {}
        }
        parameters = {}
        result = _set_defaults(argument_spec, parameters)
        self.assertEqual(result, {'value1'})
        self.assertEqual(parameters, {'param1': 'value1', 'param2': 'value2', 'param3': None})

    def test_set_defaults_no_default(self):
        argument_spec = {
            'param1': {'default': 'value1', 'no_log': True},
            'param2': {'default': 'value2'},
            'param3': {}
        }
        parameters = {'param1': 'existing_value1'}
        result = _set_defaults(argument_spec, parameters)
        self.assertEqual(result, set())
        self.assertEqual(parameters, {'param1': 'existing_value1', 'param2': 'value2', 'param3': None})

if __name__ == '__main__':
    unittest.main()