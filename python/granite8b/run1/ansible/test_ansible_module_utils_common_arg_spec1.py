import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator, ModuleArgumentSpecValidator

class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate_method(self):
        argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {'param1': 'value1', 'param2': 10}
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_validate_method(self):
        argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int'},
        }
        validator = ModuleArgumentSpecValidator(argument_spec)
        parameters = {'param1': 'value1', 'param2': 10}
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

if __name__ == '__main__':
    unittest.main()