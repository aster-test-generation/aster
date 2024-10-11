import unittest
from ansible.module_utils.common.validation import check_required_arguments, check_required_if, check_missing_parameters, check_type_str
from ansible.module_utils.common.validation import (
    check_required_arguments,
    check_required_if,
    check_missing_parameters,
    check_type_str,
)


class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'arg1': {'required': True}, 'arg2': {'required': False}}
        parameters = {'arg1': 'value1'}
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, ['arg2'])

    def test_check_required_if(self):
        requirements = [(('arg1', 'value1'), ['arg2', 'arg3'])]
        parameters = {'arg1': 'value1', 'arg2': 'value2'}
        missing = check_required_if(requirements, parameters)
        self.assertEqual(missing, [])

    def test_check_missing_parameters(self):
        required_parameters = ['param1', 'param2']
        parameters = {'param1': 'value1'}
        missing = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(missing, ['param2'])

    def test_check_type_str(self):
        value = 123
        converted_value = check_type_str(value, allow_conversion=True)
        self.assertEqual(converted_value, '123')

class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'arg1': {'required': True}, 'arg2': {'required': False}}
        parameters = {'arg1': 'value1'}
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, ['arg2'])

    def test_check_required_if(self):
        requirements = [
            ('arg1', 'value1', ['arg2', 'arg3']),
            ('arg2', 'value2', ['arg4', 'arg5'], True)
        ]
        parameters = {'arg1': 'value1', 'arg2': 'value2', 'arg4': 'value4'}
        missing = check_required_if(requirements, parameters)
        self.assertEqual(len(missing), 2)
        self.assertEqual(missing[0]['missing'], ['arg3'])
        self.assertEqual(missing[1]['missing'], ['arg5'])

    def test_check_missing_parameters(self):
        parameters = {'arg1': 'value1'}
        required_parameters = ['arg1', 'arg2', 'arg3']
        missing = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(missing, ['arg2', 'arg3'])

    def test_check_type_str(self):
        value = 123
        converted_value = check_type_str(value, allow_conversion=True)
        self.assertEqual(converted_value, '123')

class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'x': {'required': True}, 'y': {'required': False}}
        parameters = {'x': 1}
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, ['y'])

    def test_check_required_if(self):
        requirements = [
            ('x', 1, ['y', 'z']),
            ('x', 2, ['a', 'b'], True),
        ]
        parameters = {'x': 1, 'y': 1, 'z': 1}
        missing = check_required_if(requirements, parameters)
        self.assertEqual(missing, [])
        parameters = {'x': 1, 'y': 1}
        missing = check_required_if(requirements, parameters)
        self.assertEqual(missing, [{'missing': ['z'], 'parameter': 'x', 'requires': 'all', 'value': 1}])
        parameters = {'x': 2, 'a': 1, 'b': 1}
        missing = check_required_if(requirements, parameters)
        self.assertEqual(missing, [])
        parameters = {'x': 2, 'a': 1}
        missing = check_required_if(requirements, parameters)
        self.assertEqual(missing, [{'missing': ['b'], 'parameter': 'x', 'requires': 'any', 'value': 2}])

    def test_check_missing_parameters(self):
        parameters = {'x': 1, 'y': 2}
        required_parameters = ['x', 'y', 'z']
        missing_params = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(missing_params, ['z'])

    def test_check_type_str(self):
        value = 'hello'
        result = check_type_str(value)
        self.assertEqual(result, 'hello')
        value = 123
        result = check_type_str(value)
        self.assertEqual(result, '123')

if __name__ == '__main__':
    unittest.main()