import unittest
from ansible.module_utils.common.validation import *

class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'a': {'required': True}, 'b': {'required': False}}
        parameters = {'a': 'value'}
        result = check_required_arguments(argument_spec, parameters)
        self.assertEqual(result, [])

    def test_check_required_arguments_missing(self):
        argument_spec = {'a': {'required': True}, 'b': {'required': False}}
        parameters = {}
        with self.assertRaises(TypeError):
            check_required_arguments(argument_spec, parameters)

    def test_check_required_if(self):
        requirements = [('a', 'value', ['b', 'c'])]
        parameters = {'a': 'value', 'b': 'value', 'c': 'value'}
        result = check_required_if(requirements, parameters)
        self.assertEqual(result, [])

    def test_check_required_if_missing(self):
        requirements = [('a', 'value', ['b', 'c'])]
        parameters = {'a': 'value', 'b': 'value'}
        with self.assertRaises(TypeError):
            check_required_if(requirements, parameters)

    def test_check_missing_parameters(self):
        required_parameters = ['a', 'b']
        parameters = {'a': 'value'}
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, ['b'])

    def test_check_missing_parameters_all_present(self):
        required_parameters = ['a', 'b']
        parameters = {'a': 'value', 'b': 'value'}
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, [])

    def test_check_type_str(self):
        value = 'value'
        result = check_type_str(value)
        self.assertEqual(result, 'value')

    def test_check_type_str_conversion(self):
        value = 123
        result = check_type_str(value, allow_conversion=True)
        self.assertEqual(result, '123')

    def test_check_type_str_conversion_error(self):
        value = 123
        with self.assertRaises(TypeError):
            check_type_str(value, allow_conversion=False)

if __name__ == '__main__':
    unittest.main()