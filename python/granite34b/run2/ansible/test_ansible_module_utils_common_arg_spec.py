import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator, ModuleArgumentSpecValidator


class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        spec = {'name': {'type': 'str', 'required': True}}
        validator = ArgumentSpecValidator(spec)
        self.assertEqual(validator.argument_spec, spec)
        self.assertEqual(validator._mutually_exclusive, None)
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, {'name'})

    def test_validate(self):
        spec = {'name': {'type': 'str', 'required': True}}
        validator = ArgumentSpecValidator(spec)
        parameters = {'name': 'John'}
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        spec = {'name': {'type': 'str', 'required': True}}
        validator = ModuleArgumentSpecValidator(spec)
        self.assertEqual(validator.argument_spec, spec)
        self.assertEqual(validator._mutually_exclusive, None)
        self.assertEqual(validator._required_together, None)
        self.assertEqual(validator._required_one_of, None)
        self.assertEqual(validator._required_if, None)
        self.assertEqual(validator._required_by, None)
        self.assertEqual(validator._valid_parameter_names, {'name'})

    def test_validate(self):
        spec = {'name': {'type': 'str', 'required': True}}
        validator = ModuleArgumentSpecValidator(spec)
        parameters = {'name': 'John'}
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

if __name__ == '__main__':
    unittest.main()