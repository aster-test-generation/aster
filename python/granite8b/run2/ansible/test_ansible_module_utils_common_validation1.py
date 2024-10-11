import unittest
from ansible.module_utils.common.validation import check_required_arguments, check_required_if, check_missing_parameters, check_type_str

class TestValidation(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {
            'param1': {'required': True},
            'param2': {'required': True},
            'param3': {'required': False}
        }
        parameters = {
            'param1': 'value1',
            'param2': 'value2'
        }
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, [])

    def test_check_required_arguments_missing(self):
        argument_spec = {
            'param1': {'required': True},
            'param2': {'required': True},
            'param3': {'required': False}
        }
        parameters = {
            'param1': 'value1'
        }
        missing = check_required_arguments(argument_spec, parameters)
        self.assertEqual(missing, ['param2'])

    def test_check_required_if(self):
        requirements = [
            ('param1', 'value1', ['param2', 'param3']),
            ('param1', 'value2', ['param4'])
        ]
        parameters = {
            'param1': 'value1',
            'param2': 'value2'
        }
        missing = check_required_if(requirements, parameters)
        self.assertEqual(missing, [])

    def test_check_required_if_missing(self):
        requirements = [
            ('param1', 'value1', ['param2', 'param3']),
            ('param1', 'value2', ['param4'])
        ]
        parameters = {
            'param1': 'value1'
        }
        missing = check_required_if(requirements, parameters)
        self.assertEqual(missing, [{'missing': ['param2', 'param3'], 'parameter': 'param1', 'value': 'value1', 'requirements': ['param2', 'param3']}])

    def test_check_missing_parameters(self):
        required_parameters = ['param1', 'param2']
        parameters = {
            'param1': 'value1'
        }
        missing = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(missing, ['param2'])

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