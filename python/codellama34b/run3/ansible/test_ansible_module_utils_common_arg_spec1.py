
import unittest
from ansible.module_utils.common.arg_spec import *

class TestValidationResult(unittest.TestCase):
    def test_init(self):
        parameters = {}
        result = ValidationResult(parameters)
        self.assertEqual(result._no_log_values, set())
        self.assertEqual(result._unsupported_parameters, set())
        self.assertEqual(result._validated_parameters, parameters)
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.errors.messages, [])
    def test_validated_parameters(self):
        parameters = {}
        result = ValidationResult(parameters)
        self.assertEqual(result.validated_parameters, parameters)
    def test_unsupported_parameters(self):
        parameters = {}
        result = ValidationResult(parameters)
        self.assertEqual(result.unsupported_parameters, set())
    def test_error_messages(self):
        parameters = {}
        result = ValidationResult(parameters)
        self.assertEqual(result.error_messages, [])

class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        argument_spec = {}
        mutually_exclusive = []
        required_together = []
        required_one_of = []
        required_if = []
        required_by = []
        validator = ArgumentSpecValidator(argument_spec, mutually_exclusive, required_together, required_one_of, required_if, required_by)
        self.assertEqual(validator._mutually_exclusive, mutually_exclusive)
        self.assertEqual(validator._required_together, required_together)
        self.assertEqual(validator._required_one_of, required_one_of)
        self.assertEqual(validator._required_if, required_if)
        self.assertEqual(validator._required_by, required_by)
        self.assertEqual(validator._valid_parameter_names, set())
        self.assertEqual(validator.argument_spec, argument_spec)
    def test_validate(self):
        argument_spec = {}
        mutually_exclusive = []
        required_together = []
        required_one_of = []
        required_if = []
        required_by = []
        validator = ArgumentSpecValidator(argument_spec, mutually_exclusive, required_together, required_one_of, required_if, required_by)
        parameters = {}
        result = validator.validate(parameters)
        self.assertEqual(result._no_log_values, set())
        self.assertEqual(result._unsupported_parameters, set())
        self.assertEqual(result._validated_parameters, parameters)
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.error_messages, [])

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        argument_spec = {}
        mutually_exclusive = []
        required_together = []
        required_one_of = []
        required_if = []
        required_by = []
        validator = ModuleArgumentSpecValidator(argument_spec, mutually_exclusive, required_together, required_one_of, required_if, required_by)
        self.assertEqual(validator._mutually_exclusive, mutually_exclusive)
        self.assertEqual(validator._required_together, required_together)
        self.assertEqual(validator._required_one_of, required_one_of)
        self.assertEqual(validator._required_if, required_if)
        self.assertEqual(validator._required_by, required_by)
        self.assertEqual(validator._valid_parameter_names, set())
        self.assertEqual(validator.argument_spec, argument_spec)

if __name__ == '__main__':
    unittest.main()