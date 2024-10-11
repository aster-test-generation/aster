import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test_sanitize_keys(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value1']
        ignore_keys = frozenset()
        new_value = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(new_value, {'key1': 'VALUE_SANITIZED', 'key2': 'value2'})

    def test_remove_values(self):
        value = 'value1'
        no_log_strings = ['value1']
        new_value = remove_values(value, no_log_strings)
        self.assertEqual(new_value, 'VALUE_SANITIZED')

if __name__ == '__main__':
    unittest.main()