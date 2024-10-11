import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test_sanitize_keys(self):
        obj = {'a': 1, 'b': 2, 'c': {'d': 3, 'e': 4}}
        no_log_strings = ['a', 'b']
        result = sanitize_keys(obj, no_log_strings)
        self.assertEqual(result, {'c': {'d': 3, 'e': 4}})

    def test_remove_values(self):
        value = {'a': 1, 'b': 2, 'c': {'d': 3, 'e': 4}}
        no_log_strings = ['a', 'b']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, {'c': {'d': 3, 'e': 4}})

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive({'a': 1, 'b': 2}, ['a', 'b'])
        self.assertEqual(result, None)

    def test_check_required_arguments(self):
        result = check_required_arguments({'a': 1}, ['a'])
        self.assertEqual(result, None)

    def test_check_required_together(self):
        result = check_required_together({'a': 1, 'b': 2}, ['a', 'b'])
        self.assertEqual(result, None)

    def test_check_required_one_of(self):
        result = check_required_one_of({'a': 1}, ['a', 'b'])
        self.assertEqual(result, None)

    def test_check_required_if(self):
        result = check_required_if({'a': 1}, 'a', ['b'])
        self.assertEqual(result, None)

    def test_check_required_by(self):
        result = check_required_by({'a': 1}, 'a', ['b'])
        self.assertEqual(result, None)

    def test_check_type_bits(self):
        result = check_type_bits(1, 1)
        self.assertEqual(result, None)

    def test_check_type_bool(self):
        result = check_type_bool(True)
        self.assertEqual(result, None)

    def test_check_type_bytes(self):
        result = check_type_bytes(b'hello')
        self.assertEqual(result, None)

    def test_check_type_dict(self):
        result = check_type_dict({'a': 1})
        self.assertEqual(result, None)

    def test_check_type_float(self):
        result = check_type_float(1.0)
        self.assertEqual(result, None)

    def test_check_type_int(self):
        result = check_type_int(1)
        self.assertEqual(result, None)

    def test_check_type_jsonarg(self):
        result = check_type_jsonarg({'a': 1})
        self.assertEqual(result, None)

    def test_check_type_list(self):
        result = check_type_list([1, 2, 3])
        self.assertEqual(result, None)

    def test_check_type_path(self):
        result = check_type_path('/path/to/file')
        self.assertEqual(result, None)

    def test_check_type_raw(self):
        result = check_type_raw(b'hello')
        self.assertEqual(result, None)

    def test_check_type_str(self):
        result = check_type_str('hello')
        self.assertEqual(result, None)

    def test_check_type_str_with_none(self):
        result = check_type_str(None)
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_int(self):
        result = check_type_str(1)
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_float(self):
        result = check_type_str(1.0)
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_bytes(self):
        result = check_type_str(b'hello')
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_list(self):
        result = check_type_str([1, 2, 3])
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_dict(self):
        result = check_type_str({'a': 1})
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_jsonarg(self):
        result = check_type_str({'a': 1})
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_path(self):
        result = check_type_str('/path/to/file')
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_raw(self):
        result = check_type_str(b'hello')
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_bits(self):
        result = check_type_str(1)
        self.assertRaises(ArgumentTypeError)

    def test_check_type_str_with_bool(self):
        result = check_type_str(True)
        self.assertRaises(ArgumentTypeError)

if __name__ == '__main__':
    unittest.main()