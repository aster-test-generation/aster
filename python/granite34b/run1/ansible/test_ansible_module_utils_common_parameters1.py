import unittest
from ansible.module_utils.common.parameters import *

class TestParameters(unittest.TestCase):
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
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 3)
        self.assertEqual(str(errors[0]), "value of param1 must be one of: 1, 2, 3, got: 4")
        self.assertEqual(str(errors[1]), "value of param2 must be one of: a, b, c, got: d")
        self.assertEqual(str(errors[2]), "value of param3 must be one of: True, False, got: True")

    def test_validate_sub_spec(self):
        argument_spec = {
            'param1': {'type': 'dict', 'options': {'sub_param1': {'type': 'str'}, 'sub_param2': {'type': 'int'}}},
            'param2': {'type': 'list', 'elements': 'dict', 'options': {'sub_param3': {'type': 'bool'}}}
        }
        parameters = {
            'param1': {'sub_param1': 'value1', 'sub_param2': 'value2'},
            'param2': [{'sub_param3': 'True'}, {'sub_param3': 'False'}]
        }
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 4)
        self.assertEqual(str(errors[0]), "value of 'sub_param1' must be of type str")
        self.assertEqual(str(errors[1]), "value of 'sub_param2' must be of type int")
        self.assertEqual(str(errors[2]), "value of 'sub_param3' must be of type bool")
        self.assertEqual(str(errors[3]), "value of 'sub_param3' must be of type bool")

    def test_env_fallback(self):
        os.environ['ENV_VAR'] = 'env_value'
        self.assertEqual(env_fallback('ENV_VAR', 'default_value'), 'env_value')
        del os.environ['ENV_VAR']
        self.assertEqual(env_fallback('ENV_VAR', 'default_value'), 'default_value')

    def test_set_fallbacks(self):
        argument_spec = {
            'param1': {'fallback': (env_fallback, 'ENV_VAR1', 'default_value1')},
            'param2': {'fallback': (env_fallback, 'ENV_VAR2', 'default_value2')}
        }
        parameters = {}
        no_log_values = set_fallbacks(argument_spec, parameters)
        self.assertEqual(parameters['param1'], 'default_value1')
        self.assertEqual(parameters['param2'], 'default_value2')
        os.environ['ENV_VAR1'] = 'env_value1'
        os.environ['ENV_VAR2'] = 'env_value2'
        no_log_values = set_fallbacks(argument_spec, parameters)
        self.assertEqual(parameters['param1'], 'env_value1')
        self.assertEqual(parameters['param2'], 'env_value2')
        del os.environ['ENV_VAR1']
        del os.environ['ENV_VAR2']

if __name__ == '__main__':
    unittest.main()