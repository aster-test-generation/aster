import unittest
from ansible.module_utils.common.parameters import *


class Test_sanitize_keys_conditions(unittest.TestCase):
    def test_sanitize_keys_conditions(self):
        value = None
        no_log_strings = None
        ignore_keys = None
        deferred_removals = None
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, None)

class Test_validate_elements(unittest.TestCase):
    def test_validate_elements(self):
        wanted_type = None
        parameter = None
        values = None
        options_context = None
        errors = None
        result = self._validate_elements(wanted_type, parameter, values, options_context, errors)
        self.assertEqual(result, None)

class Test_validate_argument_types(unittest.TestCase):
    def test_validate_argument_types(self):
        argument_spec = None
        parameters = None
        prefix = None
        options_context = None
        errors = None
        result = validate_argument_types(argument_spec, parameters, prefix, options_context, errors)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()