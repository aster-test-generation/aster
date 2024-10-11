import unittest
from ansible.module_utils.common.parameters import _remove_values_conditions, _set_defaults

class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_remove_values_conditions(self):
        value = "example string"
        no_log_strings = ["example"]
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, "******** string")

    def test_set_defaults(self):
        argument_spec = {
            "param1": {"default": "value1"},
            "param2": {"default": "value2"}
        }
        parameters = {}
        no_log_values = _set_defaults(argument_spec, parameters)
        self.assertEqual(parameters, {"param1": "value1", "param2": "value2"})
        self.assertEqual(no_log_values, set())

if __name__ == '__main__':
    unittest.main()