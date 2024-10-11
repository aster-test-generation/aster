import unittest
from ansible.module_utils.common.arg_spec import ValidationResult, ArgumentSpecValidator, ModuleArgumentSpecValidator

class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertEqual(result._no_log_values, set())
        self.assertEqual(result._unsupported_parameters, set())
        self.assertEqual(result._validated_parameters, {'a': 1, 'b': 2})
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.errors, AnsibleValidationErrorMultiple())

    def test_validated_parameters(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertEqual(result.validated_parameters, {'a': 1, 'b': 2})

    def test_unsupported_parameters(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertEqual(result.unsupported_parameters, set())

    def test_error_messages(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertEqual(result.error_messages, [])

class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ArgumentSpecValidator({'a': 1, 'b': 2}, mutually_exclusive=['a', 'b'])
        self.assertEqual(validator._mutually_exclusive, ['a', 'b'])
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, {'a', 'b'})

    def test_validate(self):
        validator = ArgumentSpecValidator({'a': 1, 'b': 2}, mutually_exclusive=['a', 'b'])
        result = validator.validate({'a': 1}, mutually_exclusive=['a', 'b'])
        self.assertEqual(result._no_log_values, set())
        self.assertEqual(result._unsupported_parameters, set())
        self.assertEqual(result._validated_parameters, {'a': 1})
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.errors, AnsibleValidationErrorMultiple())

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ModuleArgumentSpecValidator({'a': 1, 'b': 2}, mutually_exclusive=['a', 'b'])
        self.assertEqual(validator._mutually_exclusive, ['a', 'b'])
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, {'a', 'b'})

    def test_validate(self):
        validator = ModuleArgumentSpecValidator({'a': 1, 'b': 2}, mutually_exclusive=['a', 'b'])
        result = validator.validate({'a': 1})
        self.assertEqual(result._no_log_values, set())
        self.assertEqual(result._unsupported_parameters, set())
        self.assertEqual(result._validated_parameters, {'a': 1})
        self.assertEqual(result._deprecations, [])
        self.assertEqual(result._warnings, [])
        self.assertEqual(result.errors, AnsibleValidationErrorMultiple())

if __name__ == '__main__':
    unittest.main()