import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test_sanitize_keys(self):
        obj = {'key1': 'value1', 'key2': 'value2', 'key3': 'value3'}
        no_log_strings = ['value2']
        ignore_keys = set(['key1'])
        new_value = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(new_value, {'key1': 'value1', 'key2': 'VALUE_SANITIZED', 'key3': 'value3'})

    def test_remove_values(self):
        value = {'key1': 'value1', 'key2': 'value2', 'key3': 'value3'}
        no_log_strings = ['value2']
        new_value = remove_values(value, no_log_strings)
        self.assertEqual(new_value, {'key1': 'value1', 'key2': 'VALUE_SANITIZED', 'key3': 'value3'})

if __name__ == '__main__':
    unittest.main()