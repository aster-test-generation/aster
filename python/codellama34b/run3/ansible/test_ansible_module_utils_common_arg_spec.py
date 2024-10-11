import unittest
from ansible.module_utils.common.arg_spec import *



class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult(parameters)
        self.assertEqual(result._no_log_values, set_fallbacks(self.argument_spec, result._validated_parameters))
        self.assertEqual(result._unsupported_parameters, set_fallbacks(self.argument_spec, result._validated_parameters))
        self.assertEqual(result._validated_parameters, deepcopy(parameters))
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.errors, AnsibleValidationErrorMultiple())

    def test_validated_parameters(self):
        result = ValidationResult(parameters)
        self.assertEqual(result.validated_parameters, deepcopy(parameters))

    def test_unsupported_parameters(self):
        result = ValidationResult(parameters)
        self.assertEqual(result.unsupported_parameters, set_fallbacks(self.argument_spec, result._validated_parameters))

    def test_error_messages(self):
        result = ValidationResult(parameters=parameters)
        self.assertEqual(result.error_messages, AnsibleValidationErrorMultiple().messages)

class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ArgumentSpecValidator(argument_spec=argument_spec,
                                          mutually_exclusive=None,
                                          required_together=None,
                                          required_one_of=None,
                                          required_if=None,
                                          required_by=None,
                                          )
        self.assertEqual(validator._mutually_exclusive, mutually_exclusive)
        self.assertEqual(validator._required_together, required_together)
        self.assertEqual(validator._required_one_of, required_one_of)
        self.assertEqual(validator._required_if, required_if)
        self.assertEqual(validator._required_by, required_by)
        self.assertEqual(validator._valid_parameter_names, set())
        self.assertEqual(validator.argument_spec, argument_spec)

    def test_validate(self):
        result = Validator.validate(parameters, *args, **kwargs)
        self.assertEqual(result, ValidationResult(parameters))

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ModuleArgumentSpecValidator(self, *args, **kwargs)
        self.assertEqual(validator._mutually_exclusive, mutually_exclusive)
        self.assertEqual(validator._required_together, required_together)
        self.assertEqual(validator._required_one_of, required_one_of)
        self.assertEqual(validator._required_if, required_if)
        self.assertEqual(validator._required_by, required_by)
        self.assertEqual(validator._valid_parameter_names, set())
        self.assertEqual(validator.argument_spec, argument_spec)

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