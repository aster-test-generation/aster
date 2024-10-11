import unittest
from ansible.module_utils.common.parameters import *

class Test_validate_argument_values(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {'param': {'choices': ['a', 'b', 'c']}}
        parameters = {'param': 'a'}
        options_context = None
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, options_context, errors)
        self.assertEqual(errors, [])

class Test_validate_sub_spec(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {'param': {'type': 'dict', 'options': {'sub_param': {'type': 'str'}}}}
        parameters = {'param': {'sub_param': 'a'}}
        prefix = ''
        options_context = None
        errors = AnsibleValidationErrorMultiple()
        no_log_values = set()
        unsupported_parameters = set()
        _validate_sub_spec(argument_spec, parameters, prefix, options_context, errors, no_log_values, unsupported_parameters)
        self.assertEqual(errors, [])

class Test_env_fallback(unittest.TestCase):
    def test_env_fallback(self):
        self.assertEqual(env_fallback('a', 'b'), None)

class Test_set_fallbacks(unittest.TestCase):
    def test_set_fallbacks(self):
        argument_spec = {'param': {'fallback': (env_fallback, ('a', 'b'))}}
        parameters = {}
        self.assertEqual(set_fallbacks(argument_spec, parameters), set())

if __name__ == '__main__':
    unittest.main()