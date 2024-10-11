import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator, ModuleArgumentSpecValidator


class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        argument_spec = {}
        validator = ArgumentSpecValidator(argument_spec)
        self.assertEqual(validator.argument_spec, argument_spec)
        self.assertEqual(validator._mutually_exclusive, None)
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, set())

    def test_validate(self):
        argument_spec = {}
        parameters = {}
        validator = ArgumentSpecValidator(argument_spec)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        argument_spec = {}
        validator = ModuleArgumentSpecValidator(argument_spec)
        self.assertEqual(validator.argument_spec, argument_spec)
        self.assertEqual(validator._mutually_exclusive, None)
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, set())

    def test_validate(self):
        argument_spec = {}
        parameters = {}
        validator = ModuleArgumentSpecValidator(argument_spec)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

if __name__ == '__main__':
    unittest.main()