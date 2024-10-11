import unittest
from ansible.module_utils.common.parameters import *


class TestValidateArgumentValues(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {'param1': {'choices': ['a', 'b', 'c']}}
        parameters = {'param1': 'd'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentValueError)

    def test_validate_argument_values_list(self):
        argument_spec = {'param1': {'choices': ['a', 'b', 'c']}}
        parameters = {'param1': ['a', 'd']}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentValueError)

class TestValidateSubSpec(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'subparam1': {'type': 'str'}}}}
        parameters = {'param1': {'subparam1': 'value'}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_sub_spec_list(self):
        argument_spec = {'param1': {'type': 'list', 'elements': 'dict', 'options': {'subparam1': {'type': 'str'}}}}
        parameters = {'param1': [{'subparam1': 'value1'}, {'subparam1': 'value2'}]}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

class TestEnvFallback(unittest.TestCase):
    def test_env_fallback(self):
        os.environ['TEST_VAR'] = 'test_value'
        self.assertEqual(env_fallback('TEST_VAR'), 'test_value')

    def test_env_fallback_not_found(self):
        with self.assertRaises(AnsibleFallbackNotFound):
            env_fallback('NON_EXISTENT_VAR')

class TestSetFallbacks(unittest.TestCase):
    def test_set_fallbacks(self):
        argument_spec = {'param1': {'fallback': (env_fallback, 'TEST_VAR')}}
        parameters = {}
        no_log_values = set_fallbacks(argument_spec, parameters)
        self.assertEqual(len(no_log_values), 0)
        self.assertIn('param1', parameters)

if __name__ == '__main__':
    unittest.main()