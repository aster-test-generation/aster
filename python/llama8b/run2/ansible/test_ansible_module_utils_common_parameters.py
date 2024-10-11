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

    def test_check_required_together(self):
        result = check_required_together(None, None)
        self.assertIsNone(result)

    def test_check_required_one_of(self):
        result = check_required_one_of(None, None)
        self.assertIsNone(result)

    def test_check_required_if(self):
        result = check_required_if(None, None, None)
        self.assertIsNone(result)

    def test_check_required_by(self):
        result = check_required_by(None, None)
        self.assertIsNone(result)

    def test_check_type_bits(self):
        result = check_type_bits(None)
        self.assertIsNone(result)

    def test_check_type_bool(self):
        result = check_type_bool(None)
        self.assertIsNone(result)

    def test_check_type_bytes(self):
        result = check_type_bytes(None)
        self.assertIsNone(result)

    def test_check_type_dict(self):
        result = check_type_dict(None)
        self.assertIsNone(result)

    def test_check_type_float(self):
        result = check_type_float(None)
        self.assertIsNone(result)

    def test_check_type_int(self):
        result = check_type_int(None)
        self.assertIsNone(result)

    def test_check_type_jsonarg(self):
        result = check_type_jsonarg(None)
        self.assertIsNone(result)

    def test_check_type_list(self):
        result = check_type_list(None)
        self.assertIsNone(result)

    def test_check_type_path(self):
        result = check_type_path(None)
        self.assertIsNone(result)

    def test_check_type_raw(self):
        result = check_type_raw(None)
        self.assertIsNone(result)

    def test_check_type_str(self):
        result = check_type_str(None)
        self.assertIsNone(result)

    def test_check_type_bits_private(self):
        result = check_type_bits.__code__
        self.assertIsNotNone(result)

    def test_check_type_bool_private(self):
        result = check_type_bool.__code__
        self.assertIsNotNone(result)

    def test_check_type_bytes_private(self):
        result = check_type_bytes.__code__
        self.assertIsNotNone(result)

    def test_check_type_dict_private(self):
        result = check_type_dict.__code__
        self.assertIsNotNone(result)

    def test_check_type_float_private(self):
        result = check_type_float.__code__
        self.assertIsNotNone(result)

    def test_check_type_int_private(self):
        result = check_type_int.__code__
        self.assertIsNotNone(result)

    def test_check_type_jsonarg_private(self):
        result = check_type_jsonarg.__code__
        self.assertIsNotNone(result)

    def test_check_type_list_private(self):
        result = check_type_list.__code__
        self.assertIsNotNone(result)

    def test_check_type_path_private(self):
        result = check_type_path.__code__
        self.assertIsNotNone(result)

    def test_check_type_raw_private(self):
        result = check_type_raw.__code__
        self.assertIsNotNone(result)

    def test_check_type_str_private(self):
        result = check_type_str.__code__
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()