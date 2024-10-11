import unittest
from ansible.module_utils.common.validation import check_required_arguments, check_required_if, check_missing_parameters, check_type_str


class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {
            'arg1': {'required': True},
            'arg2': {'required': True},
            'arg3': {'required': False}
        }
        parameters = {
            'arg1': 'value1',
            'arg2': 'value2'
        }
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, [])

    def test_check_required_if(self):
        requirements = [
            ('arg1', 'value1', ['arg2', 'arg3']),
            ('arg2', 'value2', ['arg1', 'arg3']),
            ('arg3', 'value3', ['arg1', 'arg2'])
        ]
        parameters = {
            'arg1': 'value1',
            'arg2': 'value2',
            'arg3': 'value3'
        }
        results = check_required_if(requirements, parameters)
        self.assertEqual(results, [])

    def test_check_missing_parameters(self):
        required_parameters = ['arg1', 'arg2', 'arg3']
        parameters = {
            'arg1': 'value1',
            'arg2': 'value2'
        }
        missing_params = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(missing_params, ['arg3'])

    def test_check_type_str(self):
        value = 'value'
        result = check_type_str(value)
        self.assertEqual(result, 'value')

class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {'param1': {'required': True}, 'param2': {'required': False}}
        parameters = {'param1': 'value1'}
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, [])
        parameters = {'param2': 'value2'}
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, ['param1'])

    def test_check_required_if(self):
        requirements = [('param1', 'value1', ['param2', 'param3']), ('param4', 'value4', ['param5', 'param6'])]
        parameters = {'param1': 'value1', 'param2': 'value2'}
        results = check_required_if(requirements, parameters)
        self.assertEqual(results, [])
        parameters = {'param1': 'value1', 'param4': 'value4'}
        results = check_required_if(requirements, parameters)
        self.assertEqual(results, [{'missing': ['param2', 'param3'], 'parameter': 'param1', 'value': 'value1', 'requirements': ['param2', 'param3']}])

    def test_check_missing_parameters(self):
        required_parameters = ['param1', 'param2']
        parameters = {'param1': 'value1'}
        missing = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(missing, ['param2'])

    def test_check_type_str(self):
        value = 'value'
        result = check_type_str(value)
        self.assertEqual(result, 'value')
        value = 123
        result = check_type_str(value)
        self.assertEqual(result, '123')
        value = 123.456
        result = check_type_str(value)
        self.assertEqual(result, '123.456')
        value = True
        result = check_type_str(value)
        self.assertEqual(result, 'True')
        value = False
        result = check_type_str(value)
        self.assertEqual(result, 'False')
        value = None
        result = check_type_str(value)
        self.assertEqual(result, 'None')
        value = ['list', 'of', 'strings']
        result = check_type_str(value)
        self.assertEqual(result, "['list', 'of', 'strings']")
        value = {'dict': 'of', 'strings': 'and', 'numbers': 123}
        result = check_type_str(value)
        self.assertEqual(result, "{'dict': 'of', 'numbers': 123, 'strings': 'and'}")

if __name__ == '__main__':
    unittest.main()