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
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters)
        self.assertEqual(len(errors), 3)
        self.assertEqual(str(errors[0]), "value of param1 must be one of: 1, 2, 3, got: 4")
        self.assertEqual(str(errors[1]), "value of param2 must be one of: a, b, c, got: d")
        self.assertEqual(str(errors[2]), "value of param3 must be one of: True, False, got: True")

    def test_validate_sub_spec(self):
        argument_spec = {
            'param1': {'type': 'dict', 'options': {'sub_param1': {'type': 'str'}, 'sub_param2': {'type': 'int'}}},
            'param2': {'type': 'list', 'elements': 'dict', 'options': {'sub_param3': {'type': 'bool'}, 'sub_param4': {'type': 'float'}}}
        }
        parameters = {
            'param1': {'sub_param1': 'value1', 'sub_param2': 10},
            'param2': [{'sub_param3': True, 'sub_param4': 3.14}, {'sub_param3': False, 'sub_param4': 2.71}]
        }
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters)
        self.assertEqual(len(errors), 0)

    def test_set_fallbacks(self):
        argument_spec = {
            'param1': {'fallback': (env_fallback, 'ENV_PARAM1')},
            'param2': {'fallback': (env_fallback, 'ENV_PARAM2', 'default_value')}
        }
        parameters = {}
        no_log_values = set_fallbacks(argument_spec, parameters)
        self.assertEqual(len(no_log_values), 0)
        self.assertEqual(parameters['ENV_PARAM1'], os.environ['ENV_PARAM1'])
        self.assertEqual(parameters['param2'], 'default_value')

if __name__ == '__main__':
    unittest.main()