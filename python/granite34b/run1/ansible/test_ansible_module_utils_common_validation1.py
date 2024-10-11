import unittest
from ansible.module_utils.common.validation import check_required_arguments, check_required_if, check_missing_parameters, check_type_str

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

if __name__ == '__main__':
    unittest.main()