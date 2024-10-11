import unittest
from ansible.module_utils.common.parameters import *
from ansible.module_utils.common.parameters import _validate_argument_values, _validate_sub_spec, env_fallback, set_fallbacks


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {
            'param1': {'choices': [1, 2, 3]},
            'param2': {'choices': ['a', 'b', 'c']},
            'param3': {'choices': ['True', 'False']}
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
        self.assertEqual(parameters['param1'], os.environ.get('ENV_PARAM1'))
        self.assertEqual(parameters['param2'], 'default_value')

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

class TestValidateArgumentValues(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {
            'param1': {'choices': [1, 2, 3]},
            'param2': {'choices': [4, 5, 6]}
        }
        parameters = {
            'param1': 1,
            'param2': 4
        }
        _validate_argument_values(argument_spec, parameters)
        parameters['param1'] = 7
        with self.assertRaises(ArgumentValueError):
            _validate_argument_values(argument_spec, parameters)

class TestValidateSubSpec(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {
            'param1': {'type': 'dict', 'options': {'sub_param1': {'type': 'str'}, 'sub_param2': {'type': 'int'}}},
            'param2': {'type': 'list', 'elements': 'dict', 'options': {'sub_param1': {'type': 'str'}, 'sub_param2': {'type': 'int'}}}
        }
        parameters = {
            'param1': {'sub_param1': 'value1', 'sub_param2': 1},
            'param2': [{'sub_param1': 'value2', 'sub_param2': 2}, {'sub_param1': 'value3', 'sub_param2': 3}]
        }
        _validate_sub_spec(argument_spec, parameters)
        parameters['param1']['sub_param3'] = 'value4'
        with self.assertRaises(SubParameterTypeError):
            _validate_sub_spec(argument_spec, parameters)

class TestEnvFallback(unittest.TestCase):
    def test_env_fallback(self):
        os.environ['ENV_VAR'] = 'value'
        self.assertEqual(env_fallback('ENV_VAR', 'default'), 'value')
        self.assertEqual(env_fallback('NOT_EXISTS', 'default'), 'default')

class TestSetFallbacks(unittest.TestCase):
    def test_set_fallbacks(self):
        argument_spec = {
            'param1': {'fallback': (env_fallback, 'ENV_VAR', 'default')},
            'param2': {'fallback': (env_fallback, 'NOT_EXISTS', 'default')}
        }
        parameters = {}
        no_log_values = set_fallbacks(argument_spec, parameters)
        self.assertEqual(parameters['param1'], 'value')
        self.assertEqual(parameters['param2'], 'default')
        self.assertEqual(no_log_values, set())

if __name__ == '__main__':
    unittest.main()