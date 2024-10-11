import unittest
from ansible.module_utils.common.parameters import (
    _get_type_validator,
    _get_legal_inputs,
    _get_unsupported_parameters,
    _handle_aliases,
    DEFAULT_TYPE_VALIDATORS
)
from ansible.module_utils.common.validation import check_type_str

class TestParametersModule(unittest.TestCase):

    def test_get_type_validator_with_callable(self):
        def custom_validator(value):
            return value
        type_checker, wanted = _get_type_validator(custom_validator)
        self.assertEqual(type_checker, custom_validator)
        self.assertEqual(wanted, 'function')

    def test_get_type_validator_with_none(self):
        type_checker, wanted = _get_type_validator(None)
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

    def test_get_type_validator_with_string(self):
        type_checker, wanted = _get_type_validator('int')
        self.assertEqual(type_checker, DEFAULT_TYPE_VALIDATORS['int'])
        self.assertEqual(wanted, 'int')

    def test_get_legal_inputs(self):
        argument_spec = {'param1': {}, 'param2': {}}
        parameters = {'param1': 'value1'}
        result = _get_legal_inputs(argument_spec, parameters)
        self.assertEqual(result, ['param1', 'param2'])

    def test_get_unsupported_parameters(self):
        argument_spec = {'param1': {}, 'param2': {}}
        parameters = {'param1': 'value1', 'param3': 'value3'}
        result = _get_unsupported_parameters(argument_spec, parameters)
        self.assertEqual(result, {'param3'})

    def test_get_unsupported_parameters_with_context(self):
        argument_spec = {'param1': {}, 'param2': {}}
        parameters = {'param1': 'value1', 'param3': 'value3'}
        result = _get_unsupported_parameters(argument_spec, parameters, options_context=['context'])
        self.assertEqual(result, {('context', 'param3')})

    def test_handle_aliases(self):
        argument_spec = {
            'param1': {'aliases': ['alias1']},
            'param2': {}
        }
        parameters = {'alias1': 'value1'}
        result = _handle_aliases(argument_spec, parameters)
        self.assertEqual(result, {'alias1': 'param1'})
        self.assertEqual(parameters['param1'], 'value1')

    def test_handle_aliases_with_non_iterable(self):
        argument_spec = {
            'param1': {'aliases': 'alias1'},
            'param2': {}
        }
        parameters = {}
        with self.assertRaises(TypeError):
            _handle_aliases(argument_spec, parameters)

    def test_handle_aliases_with_required_and_default(self):
        argument_spec = {
            'param1': {'aliases': ['alias1'], 'default': 'default1', 'required': True},
            'param2': {}
        }
        parameters = {}
        with self.assertRaises(ValueError):
            _handle_aliases(argument_spec, parameters)

if __name__ == '__main__':
    unittest.main()