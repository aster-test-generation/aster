import unittest
from ansible.module_utils.common.validation import *

class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'a': {'required': True}, 'b': {'required': False}}
        parameters = {'a': 'value'}
        self.assertEqual(check_required_arguments(argument_spec, parameters), [])
        parameters = {'b': 'value'}
        self.assertEqual(check_required_arguments(argument_spec, parameters), [])
        parameters = {}
        self.assertEqual(check_required_arguments(argument_spec, parameters), ['a'])

    def test_check_required_if(self):
        requirements = [('a', 'value', ['b', 'c'])]
        parameters = {'a': 'value', 'b': 'value'}
        self.assertEqual(check_required_if(requirements, parameters), [])
        parameters = {'a': 'value', 'c': 'value'}
        self.assertEqual(check_required_if(requirements, parameters), [])
        parameters = {'a': 'value'}
        self.assertEqual(check_required_if(requirements, parameters), [{'missing': ['b', 'c'], 'requires': 'all', 'parameter': 'a', 'value': 'value', 'requirements': ['b', 'c']}])

    def test_check_missing_parameters(self):
        required_parameters = ['a', 'b']
        parameters = {'a': 'value'}
        self.assertEqual(check_missing_parameters(parameters, required_parameters), ['b'])
        parameters = {'a': 'value', 'b': 'value'}
        self.assertEqual(check_missing_parameters(parameters, required_parameters), [])

    def test_check_type_str(self):
        value = 'value'
        self.assertEqual(check_type_str(value), value)
        value = 123
        self.assertEqual(check_type_str(value), '123')
        value = None
        with self.assertRaises(TypeError):
            check_type_str(value)

    def test_check_type_str_allow_conversion(self):
        value = 123
        self.assertEqual(check_type_str(value, allow_conversion=True), '123')
        value = None
        with self.assertRaises(TypeError):
            check_type_str(value, allow_conversion=True)

    def test_check_type_str_param(self):
        value = 'value'
        param = 'param'
        self.assertEqual(check_type_str(value, param=param), value)
        value = 123
        self.assertEqual(check_type_str(value, param=param), '123')
        value = None
        with self.assertRaises(TypeError):
            check_type_str(value, param=param)

    def test_check_type_str_prefix(self):
        value = 'value'
        prefix = 'prefix'
        self.assertEqual(check_type_str(value, prefix=prefix), value)
        value = 123
        self.assertEqual(check_type_str(value, prefix=prefix), '123')
        value = None
        with self.assertRaises(TypeError):
            check_type_str(value, prefix=prefix)

if __name__ == '__main__':
    unittest.main()