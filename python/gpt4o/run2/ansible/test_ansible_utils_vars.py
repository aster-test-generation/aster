from ansible.utils.vars import context
import unittest
from ansible.utils.vars import (
    get_unique_id, _validate_mutable_mappings, combine_vars, merge_hash,
    load_extra_vars, load_options_vars, _isidentifier_PY3, _isidentifier_PY2, isidentifier
)
from ansible.errors import AnsibleError, AnsibleOptionsError
from ansible.module_utils.common._collections_compat import MutableMapping
from ansible.module_utils.six import PY3
from unittest.mock import Mock, patch
from ansible.utils.vars import (
    get_unique_id, _validate_mutable_mappings, combine_vars, merge_hash,
    load_extra_vars, load_options_vars, _isidentifier_PY3, _isidentifier_PY2, isidentifier
)
from ansible.module_utils.common._collections_compat import MutableMapping, MutableSequence
from ansible.utils.vars import *


class TestAnsibleUtilsVars(unittest.TestCase):

    def test_get_unique_id(self):
        result = get_unique_id()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result.split('-')), 5)

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
        result = combine_vars(a, b, merge=True)
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
        class MockLoader:
            def load_from_file(self, filename):
                return {'key': 'value'}

            def load(self, data):
                return {'key': 'value'}

        loader = MockLoader()
        context.CLIARGS = {'extra_vars': ('@filename',)}
        result = load_extra_vars(loader)
        self.assertEqual(result, {'key': 'value'})

    def test_load_options_vars(self):
        context.CLIARGS = {'check': True, 'verbosity': 2}
        result = load_options_vars('2.9')
        self.assertEqual(result, {'ansible_version': '2.9', 'ansible_check_mode': True, 'ansible_verbosity': 2})

    def test_isidentifier_PY3_valid(self):
        if PY3:
            self.assertTrue(_isidentifier_PY3('valid_identifier'))

    def test_isidentifier_PY3_invalid(self):
        if PY3:
            self.assertFalse(_isidentifier_PY3('invalid identifier'))

    def test_isidentifier_PY2_valid(self):
        if not PY3:
            self.assertTrue(_isidentifier_PY2('valid_identifier'))

    def test_isidentifier_PY2_invalid(self):
        if not PY3:
            self.assertFalse(_isidentifier_PY2('invalid identifier'))

    def test_isidentifier(self):
        if PY3:
            self.assertTrue(isidentifier('valid_identifier'))
        else:
            self.assertTrue(isidentifier('valid_identifier'))

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
            self.assertEqual(result, merge_hash(a, b))

    def test_combine_vars_no_merge(self):
        a = {'key1': 'value1'}
        b = {'key2': 'value2'}
        result = combine_vars(a, b, merge=False)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_merge_hash_replace(self):
        x = {'key1': 'value1'}
        y = {'key1': 'value2'}
        result = merge_hash(x, y, list_merge='replace')
        self.assertEqual(result, {'key1': 'value2'})

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
        loader.load.return_value = {'key2': 'value2'}
        context.CLIARGS = {'extra_vars': ['@file', '{"key3": "value3"}']}
        result = load_extra_vars(loader)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2', 'key3': 'value3'})

    def test_load_extra_vars_invalid(self):
        loader = Mock()
        context.CLIARGS = {'extra_vars': ['invalid']}
        with self.assertRaises(AnsibleOptionsError):
            load_extra_vars(loader)

    def test_load_options_vars(self):
        context.CLIARGS = {'check': True, 'diff': True, 'forks': 5}
        result = load_options_vars('2.9')
        self.assertEqual(result, {
            'ansible_version': '2.9',
            'ansible_check_mode': True,
            'ansible_diff_mode': True,
            'ansible_forks': 5
        })

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
        if PY3:
            self.assertTrue(isidentifier('valid_identifier'))
            self.assertFalse(isidentifier('123invalid'))
        else:
            self.assertTrue(isidentifier('valid_identifier'))
            self.assertFalse(isidentifier('123invalid'))

if __name__ == '__main__':
    unittest.main()