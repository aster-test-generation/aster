import unittest
from ansible.module_utils.common.parameters import _remove_values_conditions, _set_defaults


class TestRemoveValuesConditions(unittest.TestCase):
    def test_remove_values_conditions_text_type(self):
        result = _remove_values_conditions('Hello, World!', ['Hello', 'World'])
        self.assertEqual(result, 'Hello, * * *')

    def test_remove_values_conditions_binary_type(self):
        result = _remove_values_conditions(b'Hello, World!', ['Hello', 'World'])
        self.assertEqual(result, b'Hello, * * *')

    def test_remove_values_conditions_sequence(self):
        result = _remove_values_conditions([1, 2, 3], ['1', '2'])
        self.assertEqual(result, [1, 2, '*'])

    def test_remove_values_conditions_set(self):
        result = _remove_values_conditions({1, 2, 3}, {1, 2})
        self.assertEqual(result, {3})

    def test_remove_values_conditions_mapping(self):
        result = _remove_values_conditions({'a': 1, 'b': 2}, {'a': 1})
        self.assertEqual(result, {'b': 2})

    def test_remove_values_conditions_tuple(self):
        result = _remove_values_conditions((1, 2, 3), (1, 2))
        self.assertEqual(result, (1, 2, '*'))

    def test_remove_values_conditions_datetime(self):
        result = _remove_values_conditions(datetime.datetime.now(), [])
        self.assertIsInstance(result, str)

    def test_remove_values_conditions_type_error(self):
        with self.assertRaises(TypeError):
            _remove_values_conditions(None, [])

class TestSetDefaults(unittest.TestCase):
    def test_set_defaults(self):
        argument_spec = {'param1': {'default': 'default_value'}, 'param2': {'default': None}}
        parameters = {}
        result = _set_defaults(argument_spec, parameters)
        self.assertEqual(result, set())
        self.assertEqual(parameters, {'param1': 'default_value'})

    def test_set_defaults_no_log(self):
        argument_spec = {'param1': {'default': 'default_value', 'no_log': True}}
        parameters = {}
        result = _set_defaults(argument_spec, parameters)
        self.assertEqual(result, {'default_value'})
        self.assertEqual(parameters, {})

    def test_set_defaults_set_default_false(self):
        argument_spec = {'param1': {'default': 'default_value', 'set_default': False}}
        parameters = {}
        result = _set_defaults(argument_spec, parameters)
        self.assertEqual(result, set())
        self.assertEqual(parameters, {})

class TestRemoveValuesConditions(unittest.TestCase):
    def test_remove_values_conditions_text_type(self):
        value = 'Hello, World!'
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'Hello, *   *')

    def test_remove_values_conditions_binary_type(self):
        value = b'Hello, World!'
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'Hello, *   *')

    def test_remove_values_conditions_sequence(self):
        value = ['Hello', 'World']
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, ['*', '*'])

    def test_remove_values_conditions_set(self):
        value = {'Hello', 'World'}
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, {'*', '*'})

    def test_remove_values_conditions_mapping(self):
        value = {'Hello': 'World'}
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, {'*': '*'})

    def test_remove_values_conditions_tuple(self):
        value = ('Hello', 'World')
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, ('*', '*'))

    def test_remove_values_conditions_datetime(self):
        value = datetime.datetime.now()
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, value.isoformat())

    def test_remove_values_conditions_none_type(self):
        value = None
        no_log_strings = ['Hello', 'World']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, value)

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
        self.assertEqual(no_log_values, {'Hello', 'World'})

    def test_set_defaults_set_default_false(self):
        argument_spec = {'param1': {'default': 'Hello'}, 'param2': {'default': 'World'}}
        parameters = {'param1': 'Hello'}
        no_log_values = _set_defaults(argument_spec, parameters, set_default=False)
        self.assertEqual(no_log_values, set())

if __name__ == '__main__':
    unittest.main()