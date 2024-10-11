import unittest
from ansible.module_utils.common.parameters import sanitize_keys, remove_values
from collections import deque
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common._collections_compat import MutableSequence, MutableSet, Mapping


class TestSanitizeKeys(unittest.TestCase):
    def test_sanitize_keys_basic(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value1']
        result = sanitize_keys(obj, no_log_strings)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_sanitize_keys_with_ignore_keys(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value1']
        ignore_keys = frozenset(['key1'])
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_sanitize_keys_with_deferred_removals(self):
        obj = {'key1': 'value1', 'key2': {'key3': 'value3'}}
        no_log_strings = ['value3']
        result = sanitize_keys(obj, no_log_strings)
        self.assertEqual(result, {'key1': 'value1', 'key2': {'key3': 'value3'}})

class TestRemoveValues(unittest.TestCase):
    def test_remove_values_basic(self):
        value = 'sensitive_value'
        no_log_strings = ['sensitive_value']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, 'sensitive_value')

    def test_remove_values_with_mapping(self):
        value = {'key1': 'sensitive_value'}
        no_log_strings = ['sensitive_value']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, {'key1': 'sensitive_value'})

    def test_remove_values_with_deferred_removals(self):
        value = {'key1': 'sensitive_value', 'key2': {'key3': 'sensitive_value'}}
        no_log_strings = ['sensitive_value']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, {'key1': 'sensitive_value', 'key2': {'key3': 'sensitive_value'}})

if __name__ == '__main__':
    unittest.main()