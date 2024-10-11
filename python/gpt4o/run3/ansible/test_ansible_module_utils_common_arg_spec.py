import unittest
from ansible.module_utils.common.arg_spec import ValidationResult, ArgumentSpecValidator, ModuleArgumentSpecValidator
from ansible.module_utils.errors import AnsibleValidationErrorMultiple, AliasError, NoLogError, RequiredDefaultError, MutuallyExclusiveError, RequiredError, UnsupportedError
from copy import deepcopy
from ansible.module_utils.common.parameters import set_fallbacks, _handle_aliases, _get_legal_inputs, _list_no_log_values, _get_unsupported_parameters, _set_defaults, _validate_argument_types, _validate_argument_values, _validate_sub_spec, _ADDITIONAL_CHECKS
from ansible.module_utils.common.validation import check_mutually_exclusive, check_required_arguments
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common.warnings import deprecate, warn
from ansible.module_utils.errors import (
    AliasError,
    AnsibleValidationErrorMultiple,
    MutuallyExclusiveError,
    NoLogError,
    RequiredDefaultError,
    RequiredError,
    UnsupportedError,
)
from ansible.module_utils.common.parameters import set_fallbacks, _handle_aliases, _get_legal_inputs, _list_no_log_values, _get_unsupported_parameters, _set_defaults, _validate_argument_types, _validate_argument_values, _validate_sub_spec


class TestValidationResult(unittest.TestCase):
    def setUp(self):
        self.parameters = {'param1': 'value1', 'param2': 'value2'}
        self.instance = ValidationResult(self.parameters)

    def test_init(self):
        self.assertEqual(self.instance._validated_parameters, deepcopy(self.parameters))
        self.assertEqual(self.instance._no_log_values, set())
        self.assertEqual(self.instance._unsupported_parameters, set())
        self.assertEqual(self.instance._deprecations, [])
        self.assertEqual(self.instance._warnings, [])
        self.assertIsInstance(self.instance.errors, AnsibleValidationErrorMultiple)

    def test_validated_parameters(self):
        self.assertEqual(self.instance.validated_parameters, self.parameters)

    def test_unsupported_parameters(self):
        self.assertEqual(self.instance.unsupported_parameters, set())

    def test_error_messages(self):
        self.assertEqual(self.instance.error_messages, self.instance.errors.messages)

class TestArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'aliases': ['alias2']}
        }
        self.instance = ArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.instance.argument_spec, self.argument_spec)
        self.assertEqual(self.instance._valid_parameter_names, {'param1', 'param2 (alias2)'})

    def test_validate(self):
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.instance.validate(parameters)
        self.assertIsInstance(result, ValidationResult)
        self.assertEqual(result.validated_parameters, parameters)

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'aliases': ['alias2']}
        }
        self.instance = ModuleArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.instance.argument_spec, self.argument_spec)
        self.assertEqual(self.instance._valid_parameter_names, {'param1', 'param2 (alias2)'})

    def test_validate(self):
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.instance.validate(parameters)
        self.assertIsInstance(result, ValidationResult)
        self.assertEqual(result.validated_parameters, parameters)

class TestValidationResult(unittest.TestCase):
    def setUp(self):
        self.parameters = {'param1': 'value1'}
        self.instance = ValidationResult(self.parameters)

    def test_init(self):
        self.assertEqual(self.instance._validated_parameters, self.parameters)
        self.assertIsInstance(self.instance.errors, AnsibleValidationErrorMultiple)

    def test_validated_parameters(self):
        self.assertEqual(self.instance.validated_parameters, self.parameters)

    def test_unsupported_parameters(self):
        self.assertEqual(self.instance.unsupported_parameters, set())

    def test_error_messages(self):
        self.assertEqual(self.instance.error_messages, self.instance.errors.messages)

class TestArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {'param1': {'type': 'str'}}
        self.instance = ArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.instance.argument_spec, self.argument_spec)
        self.assertIn('param1', self.instance._valid_parameter_names)

    def test_validate(self):
        parameters = {'param1': 'value1'}
        result = self.instance.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)

    def test_validate_with_aliases(self):
        self.argument_spec['param1']['aliases'] = ['alias1']
        self.instance = ArgumentSpecValidator(self.argument_spec)
        parameters = {'alias1': 'value1'}
        result = self.instance.validate(parameters)
        self.assertIn('param1', result.validated_parameters)

    def test_validate_with_errors(self):
        parameters = {'param2': 'value2'}
        result = self.instance.validate(parameters)
        self.assertIn('param2', result.unsupported_parameters)

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {'param1': {'type': 'str'}}
        self.instance = ModuleArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.instance.argument_spec, self.argument_spec)

    def test_validate(self):
        parameters = {'param1': 'value1'}
        result = self.instance.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)

    def test_validate_with_deprecations(self):
        self.argument_spec['param1']['aliases'] = ['alias1']
        self.instance = ModuleArgumentSpecValidator(self.argument_spec)
        parameters = {'alias1': 'value1'}
        result = self.instance.validate(parameters)
        self.assertIn('param1', result.validated_parameters)

class TestValidationResult(unittest.TestCase):
    def setUp(self):
        self.parameters = {'param1': 'value1'}
        self.instance = ValidationResult(self.parameters)

    def test_init(self):
        self.assertEqual(self.instance._validated_parameters, deepcopy(self.parameters))
        self.assertEqual(self.instance._no_log_values, set())
        self.assertEqual(self.instance._unsupported_parameters, set())
        self.assertEqual(self.instance._deprecations, [])
        self.assertEqual(self.instance._warnings, [])
        self.assertIsInstance(self.instance.errors, AnsibleValidationErrorMultiple)

    def test_validated_parameters(self):
        self.assertEqual(self.instance.validated_parameters, self.parameters)

    def test_unsupported_parameters(self):
        self.assertEqual(self.instance.unsupported_parameters, set())

    def test_error_messages(self):
        self.assertEqual(self.instance.error_messages, self.instance.errors.messages)

class TestArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'aliases': ['alias1', 'alias2']}
        }
        self.parameters = {'param1': 'value1', 'param2': 2}
        self.instance = ArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.instance.argument_spec, self.argument_spec)
        self.assertEqual(self.instance._valid_parameter_names, {'param1', 'param2 (alias1, alias2)'})

    def test_validate(self):
        result = self.instance.validate(self.parameters)
        self.assertIsInstance(result, ValidationResult)
        self.assertEqual(result.validated_parameters, self.parameters)

    def test_validate_with_errors(self):
        self.parameters['param2'] = 'invalid'
        result = self.instance.validate(self.parameters)
        self.assertIsInstance(result, ValidationResult)
        self.assertTrue(result.errors.messages)

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'aliases': ['alias1', 'alias2']}
        }
        self.parameters = {'param1': 'value1', 'param2': 2}
        self.instance = ModuleArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.instance.argument_spec, self.argument_spec)

    def test_validate(self):
        result = self.instance.validate(self.parameters)
        self.assertIsInstance(result, ValidationResult)
        self.assertEqual(result.validated_parameters, self.parameters)

    def test_validate_with_deprecations_and_warnings(self):
        self.parameters['alias1'] = 2
        result = self.instance.validate(self.parameters)
        self.assertIsInstance(result, ValidationResult)
        self.assertTrue(result._deprecations or result._warnings)

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
            'param2': {'type': 'int', 'aliases': ['alias2']}
        }
        self.validator = ArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.validator.argument_spec, self.argument_spec)
        self.assertIn('param2 (alias2)', self.validator._valid_parameter_names)

    def test_validate(self):
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)

    def test_validate_with_alias_error(self):
        parameters = {'param1': 'value1', 'param2': 'not_an_int'}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], AliasError)

    def test_validate_with_no_log_error(self):
        parameters = {'param1': 'value1', 'param2': 2}
        with unittest.mock.patch('ansible.module_utils.common.parameters._list_no_log_values', side_effect=TypeError('test error')):
            result = self.validator.validate(parameters)
            self.assertIsInstance(result.errors.messages[0], NoLogError)

    def test_validate_with_required_default_error(self):
        parameters = {'param1': 'value1', 'param2': 2}
        with unittest.mock.patch('ansible.module_utils.common.parameters._get_unsupported_parameters', side_effect=TypeError('test error')):
            result = self.validator.validate(parameters)
            self.assertIsInstance(result.errors.messages[0], RequiredDefaultError)

    def test_validate_with_mutually_exclusive_error(self):
        parameters = {'param1': 'value1', 'param2': 2}
        self.validator._mutually_exclusive = [['param1', 'param2']]
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], MutuallyExclusiveError)

    def test_validate_with_required_error(self):
        parameters = {'param1': 'value1'}
        with unittest.mock.patch('ansible.module_utils.common.validation.check_required_arguments', side_effect=TypeError('test error')):
            result = self.validator.validate(parameters)
            self.assertIsInstance(result.errors.messages[0], RequiredError)

    def test_validate_with_unsupported_error(self):
        parameters = {'param1': 'value1', 'param3': 'value3'}
        result = self.validator.validate(parameters)
        self.assertIsInstance(result.errors.messages[0], UnsupportedError)

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int', 'aliases': ['alias2']}
        }
        self.validator = ModuleArgumentSpecValidator(self.argument_spec)

    def test_init(self):
        self.assertEqual(self.validator.argument_spec, self.argument_spec)

    def test_validate(self):
        parameters = {'param1': 'value1', 'param2': 2}
        result = self.validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)

    def test_validate_with_deprecation_warning(self):
        parameters = {'param1': 'value1', 'param2': 2}
        with unittest.mock.patch('ansible.module_utils.common.warnings.deprecate') as mock_deprecate:
            self.validator.validate(parameters)
            mock_deprecate.assert_called()

    def test_validate_with_warning(self):
        parameters = {'param1': 'value1', 'param2': 2}
        with unittest.mock.patch('ansible.module_utils.common.warnings.warn') as mock_warn:
            self.validator.validate(parameters)
            mock_warn.assert_called()

if __name__ == '__main__':
    unittest.main()