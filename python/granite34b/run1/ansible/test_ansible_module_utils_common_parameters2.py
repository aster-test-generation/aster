import unittest
from ansible.module_utils.common.parameters import _validate_argument_values, _validate_sub_spec, env_fallback, set_fallbacks

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