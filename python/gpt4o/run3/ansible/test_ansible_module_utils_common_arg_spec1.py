import unittest
from ansible.module_utils.common.arg_spec import ValidationResult, ArgumentSpecValidator, ModuleArgumentSpecValidator
from ansible.module_utils.errors import AnsibleValidationErrorMultiple, AliasError, NoLogError, RequiredDefaultError, MutuallyExclusiveError, RequiredError, UnsupportedError
from ansible.module_utils.common.parameters import set_fallbacks, _handle_aliases, _get_legal_inputs, _list_no_log_values, _get_unsupported_parameters, _set_defaults, _validate_argument_types, _validate_argument_values, _validate_sub_spec, _ADDITIONAL_CHECKS
from ansible.module_utils.common.validation import check_mutually_exclusive, check_required_arguments
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common.warnings import deprecate, warn
from copy import deepcopy

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

if __name__ == '__main__':
    unittest.main()