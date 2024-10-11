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

class TestValidateSubSpec(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'subparam1': {'type': 'str'}}}}
        parameters = {'param1': {'subparam1': 'value'}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

class TestEnvFallback(unittest.TestCase):
    def test_env_fallback(self):
        os.environ['TEST_VAR'] = 'test_value'
        self.assertEqual(env_fallback('TEST_VAR'), 'test_value')
        del os.environ['TEST_VAR']
        with self.assertRaises(AnsibleFallbackNotFound):
            env_fallback('TEST_VAR')

class TestSetFallbacks(unittest.TestCase):
    def test_set_fallbacks(self):
        argument_spec = {'param1': {'fallback': (env_fallback, 'TEST_VAR')}}
        parameters = {}
        no_log_values = set_fallbacks(argument_spec, parameters)
        self.assertEqual(no_log_values, set())

class TestHandleAliases(unittest.TestCase):
    def test_handle_aliases(self):
        sub_spec = {'subparam1': {'aliases': ['alias1', 'alias2']}}
        sub_parameters = {'subparam1': 'value', 'alias1': 'alias_value'}
        alias_warnings = []
        alias_deprecations = []
        options_aliases = _handle_aliases(sub_spec, sub_parameters, alias_warnings, alias_deprecations)
        self.assertEqual(options_aliases, {'subparam1': 'value'})

class TestGetLegalInputs(unittest.TestCase):
    def test_get_legal_inputs(self):
        sub_spec = {'subparam1': {'type': 'str'}}
        sub_parameters = {'subparam1': 'value'}
        legal_inputs = _get_legal_inputs(sub_spec, sub_parameters, {})
        self.assertEqual(legal_inputs, {'subparam1': 'value'})

class TestGetUnsupportedParameters(unittest.TestCase):
    def test_get_unsupported_parameters(self):
        sub_spec = {'subparam1': {'type': 'str'}}
        sub_parameters = {'subparam1': 'value', 'unsupported_param': 'unsupported_value'}
        legal_inputs = _get_legal_inputs(sub_spec, sub_parameters, {})
        unsupported_parameters = _get_unsupported_parameters(sub_spec, sub_parameters, legal_inputs, [])
        self.assertEqual(unsupported_parameters, {'unsupported_param'})

class TestSetDefaults(unittest.TestCase):
    def test_set_defaults(self):
        sub_spec = {'subparam1': {'default': 'default_value'}}
        sub_parameters = {}
        no_log_values = _set_defaults(sub_spec, sub_parameters)
        self.assertEqual(sub_parameters, {'subparam1': 'default_value'})

class TestValidateArgumentTypes(unittest.TestCase):
    def test_validate_argument_types(self):
        sub_spec = {'subparam1': {'type': 'str'}}
        sub_parameters = {'subparam1': 'value'}
        prefix = ''
        options_context = []
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_types(sub_spec, sub_parameters, prefix, options_context, errors=errors)
        self.assertEqual(len(errors), 0)

class TestListNoLogValues(unittest.TestCase):
    def test_list_no_log_values(self):
        sub_spec = {'subparam1': {'no_log': True}}
        sub_parameters = {'subparam1': 'value'}
        no_log_values = _list_no_log_values(sub_spec, sub_parameters)
        self.assertEqual(no_log_values, {'value'})

if __name__ == '__main__':
    unittest.main()