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
        self.assertEqual(result, {'key1': 'VALUE_NOT_LOGGED', 'key2': 'value2'})

    def test_sanitize_keys_ignore_keys(self):
        obj = {'key1': 'value1', '_ansible_key2': 'value2'}
        no_log_strings = ['value1']
        ignore_keys = frozenset(['_ansible_key2'])
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, {'key1': 'VALUE_NOT_LOGGED', '_ansible_key2': 'value2'})

    def test_sanitize_keys_nested(self):
        obj = {'key1': {'nested_key1': 'value1'}, 'key2': 'value2'}
        no_log_strings = ['value1']
        result = sanitize_keys(obj, no_log_strings)
        self.assertEqual(result, {'key1': {'nested_key1': 'VALUE_NOT_LOGGED'}, 'key2': 'value2'})

    def test_sanitize_keys_deferred_removals(self):
        obj = {'key1': ['value1', 'value2'], 'key2': 'value3'}
        no_log_strings = ['value1']
        result = sanitize_keys(obj, no_log_strings)
        self.assertEqual(result, {'key1': ['VALUE_NOT_LOGGED', 'value2'], 'key2': 'value3'})

class TestRemoveValues(unittest.TestCase):
    def test_remove_values_basic(self):
        value = 'value1'
        no_log_strings = ['value1']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, 'VALUE_NOT_LOGGED')

    def test_remove_values_mapping(self):
        value = {'key1': 'value1', 'key2': 'value2'}
        no_log_strings = ['value1']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, {'key1': 'VALUE_NOT_LOGGED', 'key2': 'value2'})

    def test_remove_values_sequence(self):
        value = ['value1', 'value2']
        no_log_strings = ['value1']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, ['VALUE_NOT_LOGGED', 'value2'])

    def test_remove_values_set(self):
        value = {'value1', 'value2'}
        no_log_strings = ['value1']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, {'VALUE_NOT_LOGGED', 'value2'})

if __name__ == '__main__':
    unittest.main()