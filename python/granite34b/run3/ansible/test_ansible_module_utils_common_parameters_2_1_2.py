import unittest
from ansible.module_utils.common.parameters import _remove_values_conditions, _set_defaults


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_remove_values_conditions(self):
        value = 'test'
        no_log_strings = ['test']
        deferred_removals = []
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_set_defaults(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {}
        no_log_values = _set_defaults(argument_spec, parameters)
        self.assertEqual(parameters['param'], 'default_value')
        self.assertEqual(no_log_values, set())

if __name__ == '__main__':
    unittest.main()