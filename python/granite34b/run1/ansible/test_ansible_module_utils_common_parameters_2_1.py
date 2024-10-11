import unittest
from ansible.module_utils.common.parameters import _sanitize_keys_conditions, _validate_elements, _validate_argument_types, AnsibleValidationErrorMultiple


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_sanitize_keys_conditions(self):
        value = 'example'
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, 'example')

    def test_validate_elements(self):
        wanted_type = 'str'
        parameter = 'example'
        values = ['value1', 'value2']
        options_context = ['context1', 'context2']
        errors = AnsibleValidationErrorMultiple()
        result = _validate_elements(wanted_type, parameter, values, options_context, errors)
        self.assertEqual(result, ['value1', 'value2'])

    def test_validate_argument_types(self):
        argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'elements': 'str'}
        }
        parameters = {
            'param1': 'value1',
            'param2': [1, 2, 3]
        }
        prefix = 'prefix'
        options_context = ['context1', 'context2']
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_types(argument_spec, parameters, prefix, options_context, errors)
        self.assertEqual(parameters['param1'], 'value1')
        self.assertEqual(parameters['param2'], [1, 2, 3])

if __name__ == '__main__':
    unittest.main()