import unittest
from ansible.module_utils.common.arg_spec import ValidationResult, ArgumentSpecValidator, ModuleArgumentSpecValidator
from ansible.module_utils.errors import AnsibleValidationErrorMultiple, AliasError, NoLogError, RequiredDefaultError, MutuallyExclusiveError, RequiredError, UnsupportedError
from ansible.module_utils.common.parameters import (
    _ADDITIONAL_CHECKS,
    _get_legal_inputs,
    _get_unsupported_parameters,
    _handle_aliases,
    _list_no_log_values,
    _set_defaults,
    _validate_argument_types,
    _validate_argument_values,
    _validate_sub_spec,
    set_fallbacks,
)
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common.warnings import deprecate, warn
from ansible.module_utils.common.validation import check_mutually_exclusive, check_required_arguments

class TestValidationResult(unittest.TestCase):
    def setUp(self):
        self.parameters = {'param1': 'value1'}
        self.result = ValidationResult(self.parameters)

    def test_init(self):
        self.assertEqual(self.result._validated_parameters, self.parameters)
        self.assertIsInstance(self.result.errors, AnsibleValidationErrorMultiple)

    def test_validated_parameters(self):
        self.assertEqual(self.result.validated_parameters, self.parameters)

    def test_unsupported_parameters(self):
        self.assertEqual(self.result.unsupported_parameters, set())

    def test_error_messages(self):
        self.assertEqual(self.result.error_messages, [])

class TestArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'aliases': ['p2']}
        }
        self.validator = ArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.validator.argument_spec, self.argument_spec)
        self.assertIn('param2 (p2)', self.validator._valid_parameter_names)

    def test_validate(self):
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)

    def test_validate_with_alias_error(self):
        parameters = {'param1': 'value1', 'param2': 'not_an_int'}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], AliasError)

    def test_validate_with_no_log_error(self):
        self.argument_spec['param3'] = {'type': 'str', 'no_log': True}
        parameters = {'param1': 'value1', 'param2': 2, 'param3': 'secret'}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], NoLogError)

    def test_validate_with_required_default_error(self):
        self.argument_spec['param4'] = {'type': 'str', 'required': True}
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], RequiredDefaultError)

    def test_validate_with_mutually_exclusive_error(self):
        self.validator._mutually_exclusive = [['param1', 'param2']]
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], MutuallyExclusiveError)

    def test_validate_with_required_error(self):
        self.argument_spec['param5'] = {'type': 'str', 'required': True}
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], RequiredError)

    def test_validate_with_unsupported_error(self):
        parameters = {'param1': 'value1', 'param2': 2, 'param6': 'unsupported'}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], UnsupportedError)

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'aliases': ['p2']}
        }
        self.validator = ModuleArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.validator.argument_spec, self.argument_spec)

    def test_validate(self):
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)

    def test_validate_with_deprecation_warning(self):
        self.argument_spec['param2']['deprecated'] = {'version': '2.0', 'date': '2023-01-01'}
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertIn('Alias \'param2\' is deprecated.', result._deprecations[0]['name'])

    def test_validate_with_alias_warning(self):
        parameters = {'param1': 'value1', 'p2': 2}
        result = self.validator.validate(parameters)
        self.assertIn('Both option param2 and its alias p2 are set.', result._warnings[0]['option'])

if __name__ == '__main__':
    unittest.main()