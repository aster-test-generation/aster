import unittest
from ansible.module_utils.common.validation import (
    check_required_arguments,
    check_required_if,
    check_missing_parameters,
    check_type_str,
)
from ansible.module_utils.common.validation import (
    check_required_arguments,
    check_required_if,
    check_missing_parameters,
    check_type_str
)


class TestValidationFunctions(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'foo': {'required': True}, 'bar': {'required': False}}
        parameters = {'foo': 'value'}
        result = check_required_arguments(argument_spec, parameters)
        self.assertEqual(result, [])

        parameters = {}
        result = check_required_arguments(argument_spec, parameters)
        self.assertEqual(result, ['foo'])

    def test_check_required_if(self):
        requirements = [('foo', 'value', ['bar', 'baz'])]
        parameters = {'foo': 'value', 'bar': 'value'}
        result = check_required_if(requirements, parameters)
        self.assertEqual(result, [])

        parameters = {'foo': 'value'}
        result = check_required_if(requirements, parameters)
        self.assertEqual(len(result), 1)

    def test_check_missing_parameters(self):
        required_parameters = ['foo', 'bar']
        parameters = {'foo': 'value'}
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, ['bar'])

        parameters = {'foo': 'value', 'bar': 'value'}
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, [])

    def test_check_type_str(self):
        value = 'hello'
        result = check_type_str(value)
        self.assertEqual(result, value)

        value = 123
        result = check_type_str(value)
        self.assertEqual(result, '123')

        value = 123
        result = check_type_str(value, allow_conversion=False)
        with self.assertRaises(TypeError):
            result

class TestValidationFunctions(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'foo': {'required': True}, 'bar': {'required': False}}
        parameters = {'foo': 'value'}
        result = check_required_arguments(argument_spec, parameters)
        self.assertEqual(result, [])

    def test_check_required_arguments_missing(self):
        argument_spec = {'foo': {'required': True}, 'bar': {'required': False}}
        parameters = {}
        with self.assertRaises(TypeError):
            check_required_arguments(argument_spec, parameters)

    def test_check_required_if(self):
        requirements = [('foo', 'value', ['bar', 'baz'])]
        parameters = {'foo': 'value', 'bar': 'value'}
        result = check_required_if(requirements, parameters)
        self.assertEqual(result, [])

    def test_check_required_if_missing(self):
        requirements = [('foo', 'value', ['bar', 'baz'])]
        parameters = {'foo': 'value'}
        with self.assertRaises(TypeError):
            check_required_if(requirements, parameters)

    def test_check_missing_parameters(self):
        required_parameters = ['foo', 'bar']
        parameters = {'foo': 'value', 'bar': 'value'}
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, [])

    def test_check_missing_parameters_missing(self):
        required_parameters = ['foo', 'bar']
        parameters = {'foo': 'value'}
        with self.assertRaises(TypeError):
            check_missing_parameters(parameters, required_parameters)

    def test_check_type_str(self):
        value = 'hello'
        result = check_type_str(value)
        self.assertEqual(result, value)

    def test_check_type_str_conversion(self):
        value = b'hello'
        result = check_type_str(value)
        self.assertEqual(result, 'hello')

    def test_check_type_str_error(self):
        value = 123
        with self.assertRaises(TypeError):
            check_type_str(value, allow_conversion=False)

if __name__ == '__main__':
    unittest.main()