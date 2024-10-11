import unittest
from ansible.module_utils.common.parameters import *



class Test_remove_values_conditions(unittest.TestCase):
    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_remove_values_conditions(self):
        value = 'value'
        no_log_strings = ['no_log_strings']
        deferred_removals = ['deferred_removals']
        result = remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

if __name__ == '__main__':
    unittest.main()