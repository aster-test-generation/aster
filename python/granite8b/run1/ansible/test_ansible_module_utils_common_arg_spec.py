import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator, ModuleArgumentSpecValidator


class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate_argument_types(self):
        argument_spec = {
            'name': {'type': 'str'},
            'age': {'type': 'int'},
            'height': {'type': 'float'},
            'weight': {'type': 'float'},
            'is_student': {'type': 'bool'},
            'courses': {'type': 'list'},
            'grades': {'type': 'dict'},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {
            'name': 'John',
            'age': 25,
            'height': 1.75,
            'weight': 70.0,
            'is_student': True,
            'courses': ['Math', 'Science'],
            'grades': {'Math': 85, 'Science': 90},
        }
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(len(result.errors.messages), 0)

    def test_validate_argument_values(self):
        argument_spec = {
            'name': {'type': 'str'},
            'age': {'type': 'int', 'min': 0, 'max': 100},
            'height': {'type': 'float', 'min': 0.0, 'max': 2.5},
            'weight': {'type': 'float', 'min': 0.0, 'max': 200.0},
            'is_student': {'type': 'bool'},
            'courses': {'type': 'list'},
            'grades': {'type': 'dict'},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {
            'name': 'John',
            'age': 25,
            'height': 1.75,
            'weight': 70.0,
            'is_student': True,
            'courses': ['Math', 'Science'],
            'grades': {'Math': 85, 'Science': 90},
        }
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(len(result.errors.messages), 0)

    def test_validate_sub_spec(self):
        argument_spec = {
            'name': {'type': 'str'},
            'age': {'type': 'int'},
            'height': {'type': 'float'},
            'weight': {'type': 'float'},
            'is_student': {'type': 'bool'},
            'courses': {'type': 'list'},
            'grades': {'type': 'dict'},
            'address': {
                'type': 'dict',
                'required': True,
                'options': {
                    'street': {'type': 'str'},
                    'city': {'type': 'str'},
                    'state': {'type': 'str'},
                    'zip': {'type': 'str'},
                }
            },
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {
            'name': 'John',
            'age': 25,
            'height': 1.75,
            'weight': 70.0,
            'is_student': True,
            'courses': ['Math', 'Science'],
            'grades': {'Math': 85, 'Science': 90},
            'address': {
                'street': '123 Main St',
                'city': 'Anytown',
                'state': 'CA',
                'zip': '12345',
            }
        }
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(len(result.errors.messages), 0)


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