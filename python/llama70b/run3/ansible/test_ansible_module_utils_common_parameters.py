import unittest
from ansible.module_utils.common.parameters import *


class TestSanitizeKeys(unittest.TestCase):
    def test_sanitize_keys(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value2']
        result = sanitize_keys(obj, no_log_strings)
        self.assertEqual(result, {'key1': 'value1'})

    def test_sanitize_keys_ignore_keys(self):
        obj = {'key1': 'value1', 'key2': 'value2', '_ansible_key': 'ansible_value'}
        no_log_strings = ['value2']
        ignore_keys = {'_ansible_key'}
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, {'key1': 'value1', '_ansible_key': 'ansible_value'})

class TestRemoveValues(unittest.TestCase):
    def test_remove_values(self):
        value = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value2']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, {'key1': 'value1'})

    def test_remove_values_list(self):
        value = [{'key1': 'value1'}, {'key2': 'value2'}]
        no_log_strings = ['value2']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, [{'key1': 'value1'}])

class TestPrivateMethods(unittest.TestCase):
    def test__sanitize_keys_conditions(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value2']
        ignore_keys = set()
        deferred_removals = deque()
        result = _sanitize_keys_conditions(obj, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, {'key1': 'value1'})

    def test__remove_values_conditions(self):
        value = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value2']
        deferred_removals = deque()
        result = _remove_values_conditions(value, no_log_strings, deferred_removals)
        self.assertEqual(result, {'key1': 'value1'})

if __name__ == '__main__':
    unittest.main()