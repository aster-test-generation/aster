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

    def test_get_type_validator_callable(self):
        def custom_validator(value):
            return value
        type_checker, wanted = _get_type_validator(custom_validator)
        self.assertEqual(type_checker, custom_validator)
        self.assertEqual(wanted, 'function')

    def test_get_type_validator_non_callable(self):
        type_checker, wanted = _get_type_validator('str')
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

    def test_get_type_validator_none(self):
        type_checker, wanted = _get_type_validator(None)
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

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

    def test_handle_aliases(self):
        argument_spec = {
            'param1': {'aliases': ['alias1']},
            'param2': {'aliases': ['alias2']}
        }
        parameters = {'alias1': 'value1', 'param2': 'value2'}
        result = _handle_aliases(argument_spec, parameters)
        self.assertEqual(result, {'alias1': 'param1', 'alias2': 'param2'})
        self.assertEqual(parameters['param1'], 'value1')

    def test_handle_aliases_with_deprecations(self):
        argument_spec = {
            'param1': {'aliases': ['alias1'], 'deprecated_aliases': [{'name': 'old_alias1'}]},
            'param2': {'aliases': ['alias2']}
        }
        parameters = {'old_alias1': 'value1', 'param2': 'value2'}
        alias_deprecations = []
        result = _handle_aliases(argument_spec, parameters, alias_deprecations=alias_deprecations)
        self.assertEqual(result, {'alias1': 'param1', 'alias2': 'param2'})
        self.assertEqual(alias_deprecations, [{'name': 'old_alias1'}])

    def test_handle_aliases_with_warnings(self):
        argument_spec = {
            'param1': {'aliases': ['alias1']},
            'param2': {'aliases': ['alias2']}
        }
        parameters = {'alias1': 'value1', 'param1': 'value1', 'param2': 'value2'}
        alias_warnings = []
        result = _handle_aliases(argument_spec, parameters, alias_warnings=alias_warnings)
        self.assertEqual(result, {'alias1': 'param1', 'alias2': 'param2'})
        self.assertEqual(alias_warnings, [('param1', 'alias1')])

    def test_handle_aliases_invalid_aliases(self):
        argument_spec = {
            'param1': {'aliases': 'alias1'}
        }
        parameters = {}
        with self.assertRaises(TypeError):
            _handle_aliases(argument_spec, parameters)

    def test_handle_aliases_required_and_default(self):
        argument_spec = {
            'param1': {'aliases': ['alias1'], 'default': 'default_value', 'required': True}
        }
        parameters = {}
        with self.assertRaises(ValueError):
            _handle_aliases(argument_spec, parameters)

if __name__ == '__main__':
    unittest.main()