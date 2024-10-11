import unittest
from ansible.module_utils.common.parameters import _validate_argument_values, _validate_sub_spec, env_fallback, set_fallbacks

class TestValidateArgumentValues(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {'param1': {'type': 'str'}, 'param2': {'type': 'list'}}
        parameters = {'param1': 'value1', 'param2': ['value2', 'value3']}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_argument_values_invalid_choice(self):
        argument_spec = {'param1': {'type': 'str', 'choices': ['choice1', 'choice2']}}
        parameters = {'param1': 'invalid_choice'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)

    def test_validate_argument_values_invalid_type(self):
        argument_spec = {'param1': {'type': 'str'}}
        parameters = {'param1': 123}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)

class TestValidateSubSpec(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'option1': {'type': 'str'}}}}
        parameters = {'param1': {'option1': 'value1'}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_sub_spec_invalid_type(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'option1': {'type': 'str'}}}}
        parameters = {'param1': {'option1': 123}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)

    def test_validate_sub_spec_missing_option(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'option1': {'type': 'str'}}}}
        parameters = {'param1': {}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)

class TestEnvFallback(unittest.TestCase):
    def test_env_fallback(self):
        os.environ['FOO'] = 'bar'
        self.assertEqual(env_fallback('FOO'), 'bar')

    def test_env_fallback_not_found(self):
        with self.assertRaises(AnsibleFallbackNotFound):
            env_fallback('FOO')

class TestSetFallbacks(unittest.TestCase):
    def test_set_fallbacks(self):
        argument_spec = {'param1': {'type': 'str', 'fallback': ('os.environ.get', 'FOO')}}
        parameters = {}
        no_log_values = set()
        set_fallbacks(argument_spec, parameters)
        self.assertIn('FOO', no_log_values)

    def test_set_fallbacks_no_log(self):
        argument_spec = {'param1': {'type': 'str', 'fallback': ('os.environ.get', 'FOO'), 'no_log': True}}
        parameters = {}
        no_log_values = set()
        set_fallbacks(argument_spec, parameters)
        self.assertIn('FOO', no_log_values)

if __name__ == '__main__':
    unittest.main()