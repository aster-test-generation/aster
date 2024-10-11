import unittest
from ansible.module_utils.common.arg_spec import *



class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult(parameters={})
        self.assertEqual(result._no_log_values, set())
        self.assertEqual(result._unsupported_parameters, set())
        self.assertEqual(result._validated_parameters, {})
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.errors, AnsibleValidationErrorMultiple())

    def test_validated_parameters(self):
        result = ValidationResult(parameters={})
        self.assertEqual(result.validated_parameters, {})

    def test_unsupported_parameters(self):
        result = ValidationResult(parameters={})
        self.assertEqual(result.unsupported_parameters, set())

    def test_error_messages(self):
        result = ValidationResult(parameters={})
        self.assertEqual(result.error_messages, [])

class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ArgumentSpecValidator(argument_spec={},
                                          mutually_exclusive=None,
                                          required_together=None,
                                          required_one_of=None,
                                          required_if=None,
                                          required_by=None)
        self.assertEqual(validator._mutually_exclusive, None)
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, set())
        self.assertEqual(validator.argument_spec, {})

    def test_validate(self):
        validator = ArgumentSpecValidator(argument_spec={},
                                          mutually_exclusive=None,
                                          required_together=None,
                                          required_one_of=None,
                                          required_if=None,
                                          required_by=None)
        result = validator.validate(parameters={})
        self.assertEqual(result._no_log_values, set())
        self.assertEqual(result._unsupported_parameters, set())
        self.assertEqual(result._validated_parameters, {})
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.errors, AnsibleValidationErrorMultiple())

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ModuleArgumentSpecValidator(argument_spec={},
                                                mutually_exclusive=None,
                                                required_together=None,
                                                required_one_of=None,
                                                required_if=None,
                                                required_by=None)
        self.assertEqual(validator._mutually_exclusive, None)
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, set())
        self.assertEqual(validator.argument_spec, {})

class TestValidationResult(unittest.TestCase):
    def test_validated_parameters(self):
        result = ValidationResult({})
        self.assertEqual(result.validated_parameters, {})

    def test_unsupported_parameters(self):
        result = ValidationResult({})
        self.assertEqual(result.unsupported_parameters, set())

    def test_error_messages(self):
        result = ValidationResult({})
        self.assertEqual(result.error_messages, [])

class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate(self):
        result = ArgumentSpecValidator({}).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_mutually_exclusive(self):
        result = ArgumentSpecValidator({}, mutually_exclusive=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_required_together(self):
        result = ArgumentSpecValidator({}, required_together=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_required_one_of(self):
        result = ArgumentSpecValidator({}, required_one_of=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_required_if(self):
        result = ArgumentSpecValidator({}, required_if=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_required_by(self):
        result = ArgumentSpecValidator({}, required_by=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_validate(self):
        result = ModuleArgumentSpecValidator({}).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_mutually_exclusive(self):
        result = ModuleArgumentSpecValidator({}, mutually_exclusive=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_required_together(self):
        result = ModuleArgumentSpecValidator({}, required_together=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_with_required_one_of(self):
        result = ModuleArgumentSpecValidator({}, required_one_of=[{}]).validate({})
        self.assertEqual(result.validated_parameters, {})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

if __name__ == '__main__':
    unittest.main()