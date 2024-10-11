import unittest
from ansible.module_utils.common.parameters import _validate_argument_values, _validate_sub_spec, env_fallback, set_fallbacks


class TestValidateArgumentValues(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {'param1': {'type': 'str'}, 'param2': {'type': 'list'}}
        parameters = {'param1': 'value1', 'param2': ['value2', 'value3']}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_argument_values_with_choices(self):
        argument_spec = {'param1': {'type': 'str', 'choices': ['value1', 'value2']}}
        parameters = {'param1': 'value3'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)

    def test_validate_argument_values_with_no_log(self):
        argument_spec = {'param1': {'type': 'str', 'no_log': True}}
        parameters = {'param1': 'value1'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

class TestValidateSubSpec(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'key1': {'type': 'str'}, 'key2': {'type': 'int'}}}}
        parameters = {'param1': {'key1': 'value1', 'key2': 2}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_sub_spec_with_no_log(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'key1': {'type': 'str', 'no_log': True}}, 'apply_defaults': True}}
        parameters = {'param1': {'key1': 'value1'}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

class TestEnvFallback(unittest.TestCase):
    def test_env_fallback(self):
        os.environ['VARIABLE'] = 'value'
        self.assertEqual(env_fallback('VARIABLE'), 'value')

    def test_env_fallback_not_found(self):
        with self.assertRaises(AnsibleFallbackNotFound):
            env_fallback('VARIABLE')

class TestSetFallbacks(unittest.TestCase):
    def test_set_fallbacks(self):
        argument_spec = {'param1': {'type': 'str', 'fallback': ['os.environ.get', {'key': 'value'}]}}
        parameters = {}
        no_log_values = set()
        set_fallbacks(argument_spec, parameters)
        self.assertIn('value', no_log_values)

if __name__ == '__main__':
    unittest.main()