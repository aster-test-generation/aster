import unittest
from unittest.mock import Mock, patch
from ansible.utils.vars import *
from ansible.errors import AnsibleError
from ansible.utils.vars import _isidentifier_PY3, _isidentifier_PY2, isidentifier, get_unique_id, _validate_mutable_mappings, combine_vars, merge_hash, load_extra_vars, load_options_vars
import ansible.constants as C
import ansible.context as context


class TestAnsibleUtilsVars(unittest.TestCase):

    def test_get_unique_id(self):
        global cur_id
        cur_id = 0
        result = get_unique_id()
        self.assertTrue(isinstance(result, str) and len(result.split('-')) == 5)

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
        with patch('ansible.constants.DEFAULT_HASH_BEHAVIOUR', 'merge'):
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

    def test_merge_hash_append(self):
        x = {'key1': [1, 2]}
        y = {'key1': [3, 4]}
        result = merge_hash(x, y, list_merge='append')
        self.assertEqual(result, {'key1': [1, 2, 3, 4]})

    def test_merge_hash_invalid_list_merge(self):
        x = {'key1': [1, 2]}
        y = {'key1': [3, 4]}
        with self.assertRaises(AnsibleError):
            merge_hash(x, y, list_merge='invalid')

    def test_load_extra_vars(self):
        loader = Mock()
        loader.load_from_file.return_value = {'key1': 'value1'}
        context.CLIARGS = {'extra_vars': ('@file',)}
        result = load_extra_vars(loader)
        self.assertEqual(result, {'key1': 'value1'})

    def test_load_options_vars(self):
        context.CLIARGS = {'check': True, 'diff': True}
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
        if C.PY3:
            result = isidentifier('valid_identifier')
        else:
            result = isidentifier('valid_identifier')
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()