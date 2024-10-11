import unittest
from copy import deepcopy
from ansible.module_utils.common.arg_spec import ValidationResult, ArgumentSpecValidator, ModuleArgumentSpecValidator
from ansible.module_utils.errors import (
    AliasError,
    AnsibleValidationErrorMultiple,
    MutuallyExclusiveError,
    NoLogError,
    RequiredDefaultError,
    RequiredError,
    UnsupportedError,
)

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

if __name__ == '__main__':
    unittest.main()