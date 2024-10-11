import unittest
from ansible.module_utils.common.validation import (
    check_required_arguments,
    check_required_if,
    check_missing_parameters,
    check_type_str
)
from ansible.module_utils._text import to_native
from ansible.module_utils.common.validation import (
    check_required_arguments,
    check_required_if,
    check_missing_parameters,
    check_type_str
)


class TestValidationFunctions(unittest.TestCase):

    def test_check_required_arguments_no_missing(self):
        argument_spec = {'arg1': {'required': True}, 'arg2': {'required': False}}
        parameters = {'arg1': 'value1'}
        result = check_required_arguments(argument_spec, parameters)
        self.assertEqual(result, [])

    def test_check_required_arguments_missing(self):
        argument_spec = {'arg1': {'required': True}, 'arg2': {'required': False}}
        parameters = {}
        with self.assertRaises(TypeError) as context:
            check_required_arguments(argument_spec, parameters)
        self.assertIn('missing required arguments: arg1', str(context.exception))

    def test_check_required_if_no_missing(self):
        requirements = [('arg1', 'value1', ['arg2'])]
        parameters = {'arg1': 'value1', 'arg2': 'value2'}
        result = check_required_if(requirements, parameters)
        self.assertEqual(result, [])

    def test_check_required_if_missing(self):
        requirements = [('arg1', 'value1', ['arg2'])]
        parameters = {'arg1': 'value1'}
        with self.assertRaises(TypeError) as context:
            check_required_if(requirements, parameters)
        self.assertIn('arg1 is value1 but all of the following are missing: arg2', str(context.exception))

    def test_check_missing_parameters_no_missing(self):
        parameters = {'arg1': 'value1', 'arg2': 'value2'}
        required_parameters = ['arg1', 'arg2']
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, [])

    def test_check_missing_parameters_missing(self):
        parameters = {'arg1': 'value1'}
        required_parameters = ['arg1', 'arg2']
        with self.assertRaises(TypeError) as context:
            check_missing_parameters(parameters, required_parameters)
        self.assertIn('missing required arguments: arg2', str(context.exception))

    def test_check_type_str_valid_string(self):
        value = 'test'
        result = check_type_str(value)
        self.assertEqual(result, 'test')

    def test_check_type_str_conversion_allowed(self):
        value = 123
        result = check_type_str(value)
        self.assertEqual(result, '123')

    def test_check_type_str_conversion_not_allowed(self):
        value = 123
        with self.assertRaises(TypeError) as context:
            check_type_str(value, allow_conversion=False)
        self.assertIn("'123' is not a string and conversion is not allowed", str(context.exception))

class TestValidationFunctions(unittest.TestCase):

    def test_check_required_arguments_no_missing(self):
        argument_spec = {'arg1': {'required': True}, 'arg2': {'required': False}}
        parameters = {'arg1': 'value1'}
        result = check_required_arguments(argument_spec, parameters)
        self.assertEqual(result, [])

    def test_check_required_arguments_missing(self):
        argument_spec = {'arg1': {'required': True}, 'arg2': {'required': False}}
        parameters = {}
        with self.assertRaises(TypeError) as context:
            check_required_arguments(argument_spec, parameters)
        self.assertIn('missing required arguments: arg1', str(context.exception))

    def test_check_required_if_no_missing(self):
        requirements = [('arg1', 'value1', ['arg2'])]
        parameters = {'arg1': 'value1', 'arg2': 'value2'}
        result = check_required_if(requirements, parameters)
        self.assertEqual(result, [])

    def test_check_required_if_missing(self):
        requirements = [('arg1', 'value1', ['arg2'])]
        parameters = {'arg1': 'value1'}
        with self.assertRaises(TypeError) as context:
            check_required_if(requirements, parameters)
        self.assertIn('arg1 is value1 but all of the following are missing: arg2', str(context.exception))

    def test_check_required_if_is_one_of(self):
        requirements = [('arg1', 'value1', ['arg2', 'arg3'], True)]
        parameters = {'arg1': 'value1'}
        with self.assertRaises(TypeError) as context:
            check_required_if(requirements, parameters)
        self.assertIn('arg1 is value1 but any of the following are missing: arg2, arg3', str(context.exception))

    def test_check_missing_parameters_no_missing(self):
        parameters = {'arg1': 'value1', 'arg2': 'value2'}
        required_parameters = ['arg1', 'arg2']
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, [])

    def test_check_missing_parameters_missing(self):
        parameters = {'arg1': 'value1'}
        required_parameters = ['arg1', 'arg2']
        with self.assertRaises(TypeError) as context:
            check_missing_parameters(parameters, required_parameters)
        self.assertIn('missing required arguments: arg2', str(context.exception))

    def test_check_type_str_valid_string(self):
        value = 'test'
        result = check_type_str(value)
        self.assertEqual(result, 'test')

    def test_check_type_str_conversion_allowed(self):
        value = 123
        result = check_type_str(value)
        self.assertEqual(result, '123')

    def test_check_type_str_conversion_not_allowed(self):
        value = 123
        with self.assertRaises(TypeError) as context:
            check_type_str(value, allow_conversion=False)
        self.assertIn("'123' is not a string and conversion is not allowed", str(context.exception))

if __name__ == '__main__':
    unittest.main()