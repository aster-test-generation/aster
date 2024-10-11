import unittest
from unittest.mock import Mock, patch
from ansible.utils.vars import (
    get_unique_id, _validate_mutable_mappings, combine_vars, merge_hash,
    load_extra_vars, load_options_vars, _isidentifier_PY3, _isidentifier_PY2, isidentifier
)
from ansible.errors import AnsibleError, AnsibleOptionsError
from ansible.module_utils.common._collections_compat import MutableMapping, MutableSequence

class TestAnsibleUtilsVars(unittest.TestCase):

    def test_get_unique_id(self):
        global cur_id
        cur_id = 0
        result = get_unique_id()
        self.assertTrue(result.startswith("00000000"))

    def test_validate_mutable_mappings_valid(self):
        a = {'key1': 'value1'}
        b = {'key2': 'value2'}
        try:
            _validate_mutable_mappings(a, b)
        except AnsibleError:
            self.fail("_validate_mutable_mappings raised AnsibleError unexpectedly!")

    def test_validate_mutable_mappings_invalid(self):
        a = {'key1': 'value1'}
        b = ['value2']
        with self.assertRaises(AnsibleError):
            _validate_mutable_mappings(a, b)

    def test_combine_vars_merge(self):
        a = {'key1': 'value1'}
        b = {'key2': 'value2'}
        with patch('ansible.utils.vars.C.DEFAULT_HASH_BEHAVIOUR', 'merge'):
            result = combine_vars(a, b)
            self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_combine_vars_no_merge(self):
        a = {'key1': 'value1'}
        b = {'key2': 'value2'}
        result = combine_vars(a, b, merge=False)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_merge_hash_replace(self):
        x = {'key1': 'value1'}
        y = {'key2': 'value2'}
        result = merge_hash(x, y, list_merge='replace')
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_merge_hash_invalid_list_merge(self):
        x = {'key1': 'value1'}
        y = {'key2': 'value2'}
        with self.assertRaises(AnsibleError):
            merge_hash(x, y, list_merge='invalid')

    def test_load_extra_vars(self):
        loader = Mock()
        loader.load_from_file.return_value = {'key1': 'value1'}
        loader.load.return_value = {'key2': 'value2'}
        with patch('ansible.utils.vars.context.CLIARGS', {'extra_vars': ('@file', '{"key2": "value2"}')}):
            result = load_extra_vars(loader)
            self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_load_options_vars(self):
        with patch('ansible.utils.vars.context.CLIARGS', {'check': True, 'diff': True}):
            result = load_options_vars('2.9')
            self.assertEqual(result, {'ansible_version': '2.9', 'ansible_check_mode': True, 'ansible_diff_mode': True})

    def test_isidentifier_PY3_valid(self):
        result = _isidentifier_PY3('valid_identifier')
        self.assertTrue(result)

    def test_isidentifier_PY3_invalid(self):
        result = _isidentifier_PY3('123invalid')
        self.assertFalse(result)

    def test_isidentifier_PY2_valid(self):
        result = _isidentifier_PY2('valid_identifier')
        self.assertTrue(result)

    def test_isidentifier_PY2_invalid(self):
        result = _isidentifier_PY2('123invalid')
        self.assertFalse(result)

    def test_isidentifier(self):
        result = isidentifier('valid_identifier')
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()