import unittest
from ansible.module_utils.common.parameters import _validate_argument_values, _validate_sub_spec, env_fallback, set_fallbacks

class Test_validate_argument_values(unittest.TestCase):
    def test_validate_argument_values(self):
        argument_spec = {}
        parameters = {}
        options_context = None
        errors = None
        _validate_argument_values(argument_spec, parameters, options_context, errors)

class Test_validate_sub_spec(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {}
        parameters = {}
        prefix = ''
        options_context = None
        errors = None
        no_log_values = None
        unsupported_parameters = None
        _validate_sub_spec(argument_spec, parameters, prefix, options_context, errors, no_log_values, unsupported_parameters)

class Test_env_fallback(unittest.TestCase):
    def test_env_fallback(self):
        env_fallback()

class Test_set_fallbacks(unittest.TestCase):
    def test_set_fallbacks(self):
        argument_spec = {}
        parameters = {}
        set_fallbacks(argument_spec, parameters)

if __name__ == '__main__':
    unittest.main()