import unittest
from ansible.module_utils.common.parameters import *


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {
            'param1': {'choices': [1, 2, 3]},
            'param2': {'choices': ['a', 'b', 'c']},
            'param3': {'choices': [True, False]}
        }
        parameters = {
            'param1': 4,
            'param2': 'd',
            'param3': 'True'
        }
        options_context = ['option1', 'option2']
        errors = AnsibleValidationErrorMultiple()

        _validate_argument_values(argument_spec, parameters, options_context, errors)

        self.assertEqual(len(errors), 3)
        self.assertEqual(str(errors[0]), 'value of param1 must be one of: 1, 2, 3, got: 4')
        self.assertEqual(str(errors[1]), 'value of param2 must be one of: a, b, c, got: d')
        self.assertEqual(str(errors[2]), 'value of param3 must be one of: True, False, got: True')

    def test_validate_sub_spec(self):
        argument_spec = {
            'param1': {'type': 'dict', 'options': {'sub_param1': {'type': 'str'}, 'sub_param2': {'type': 'int'}}},
            'param2': {'type': 'list', 'elements': 'dict', 'options': {'sub_param3': {'type': 'bool'}, 'sub_param4': {'type': 'float'}}}
        }
        parameters = {
            'param1': {'sub_param1': 'value1', 'sub_param2': 10},
            'param2': [{'sub_param3': True, 'sub_param4': 3.14}, {'sub_param3': False, 'sub_param4': 2.71}]
        }
        options_context = ['option1', 'option2']
        errors = AnsibleValidationErrorMultiple()

        _validate_sub_spec(argument_spec, parameters, '', options_context, errors)

        self.assertEqual(len(errors), 0)

    def test_env_fallback(self):
        os.environ['ENV_VAR'] = 'env_value'
        result = env_fallback('ENV_VAR', 'default_value')
        self.assertEqual(result, 'env_value')

    def test_set_fallbacks(self):
        argument_spec = {
            'param1': {'fallback': (env_fallback, 'ENV_VAR1', 'default_value1')},
            'param2': {'fallback': (env_fallback, 'ENV_VAR2', 'default_value2')}
        }
        parameters = {}
        no_log_values = set_fallbacks(argument_spec, parameters)
        self.assertEqual(parameters['param1'], '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-Ghk9I1EC-py3.11/bin/python')
        self.assertEqual(parameters['param2'], 'default_value2')
        self.assertEqual(len(no_log_values), 0)

if __name__ == '__main__':
    unittest.main()