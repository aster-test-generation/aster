import datetime
import unittest
from ansible.module_utils.common.parameters import _remove_values_conditions, _set_defaults


class TestRemoveValuesConditions(unittest.TestCase):
    def test_remove_values_conditions_text_type(self):
        value = 'Hello, World!'
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'Hello,**Hello**,**World**,**World**')

    def test_remove_values_conditions_binary_type(self):
        value = b'Hello, World!'
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'Hello,**Hello**,**World**,**World**')

    def test_remove_values_conditions_sequence(self):
        value = [1, 2, 3]
        no_log_strings = ['1', '2']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, [1, '**1**', '**2**', 3])

    def test_remove_values_conditions_set(self):
        value = {1, 2, 3}
        no_log_strings = ['1', '2']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, {1, '**1**', '**2**', 3})

    def test_remove_values_conditions_mapping(self):
        value = {'a': 1, 'b': 2}
        no_log_strings = ['1', '2']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, {'a': 1, 'b': '**2**'})

    def test_remove_values_conditions_tuple(self):
        value = (1, 2, 3)
        no_log_strings = ['1', '2']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, (1, '**1**', '**2**', 3))

    def test_remove_values_conditions_datetime(self):
        value = datetime.datetime(2022, 1, 1)
        no_log_strings = ['2022']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, '2022-01-01T00:00:00')

    def test_remove_values_conditions_none_type(self):
        value = None
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, None)

class TestSetDefaults(unittest.TestCase):
    def test_set_defaults(self):
        argument_spec = {'param1': {'default': 'Hello'}, 'param2': {'default': 'World'}}
        parameters = {}
        no_log_values = _set_defaults(argument_spec, parameters)
        self.assertEqual(no_log_values, {'Hello'})

    def test_set_defaults_no_log(self):
        argument_spec = {'param1': {'default': 'Hello', 'no_log': True}, 'param2': {'default': 'World'}}
        parameters = {}
        no_log_values = _set_defaults(argument_spec, parameters)
        self.assertEqual(no_log_values, {'Hello'})

    def test_set_defaults_no_default(self):
        argument_spec = {'param1': {}, 'param2': {'default': 'World'}}
        parameters = {}
        no_log_values = _set_defaults(argument_spec, parameters)
        self.assertEqual(no_log_values, set())

if __name__ == '__main__':
    unittest.main()