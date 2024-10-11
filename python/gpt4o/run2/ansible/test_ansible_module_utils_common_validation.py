import unittest
from ansible.module_utils.common.validation import *


class TestValidationFunctions(unittest.TestCase):
    def test_check_type_list_with_list(self):
        result = check_type_list([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_check_type_list_with_string(self):
        result = check_type_list("1,2,3")
        self.assertEqual(result, ["1", "2", "3"])

    def test_check_type_list_with_int(self):
        result = check_type_list(123)
        self.assertEqual(result, ["123"])

    def test_check_type_list_with_float(self):
        result = check_type_list(123.45)
        self.assertEqual(result, ["123.45"])

    def test_check_type_list_with_invalid_type(self):
        with self.assertRaises(TypeError):
            check_type_list({1: 'one'})

    def test_check_type_dict_with_dict(self):
        result = check_type_dict({"key": "value"})
        self.assertEqual(result, {"key": "value"})

    def test_check_type_dict_with_json_string(self):
        result = check_type_dict('{"key": "value"}')
        self.assertEqual(result, {"key": "value"})

    def test_check_type_dict_with_key_value_string(self):
        result = check_type_dict("key=value")
        self.assertEqual(result, {"key": "value"})

    def test_check_type_dict_with_invalid_string(self):
        with self.assertRaises(TypeError):
            check_type_dict("invalid_string")

    def test_check_type_dict_with_invalid_type(self):
        with self.assertRaises(TypeError):
            check_type_dict([1, 2, 3])

    def test_check_type_bool_with_bool(self):
        result = check_type_bool(True)
        self.assertEqual(result, True)

    def test_check_type_bool_with_string(self):
        result = check_type_bool("true")
        self.assertEqual(result, True)

    def test_check_type_bool_with_int(self):
        result = check_type_bool(1)
        self.assertEqual(result, True)

    def test_check_type_bool_with_invalid_type(self):
        with self.assertRaises(TypeError):
            check_type_bool([1, 2, 3])

    def test_check_type_int_with_int(self):
        result = check_type_int(123)
        self.assertEqual(result, 123)

    def test_check_type_int_with_string(self):
        result = check_type_int("123")
        self.assertEqual(result, 123)

    def test_check_type_int_with_invalid_string(self):
        with self.assertRaises(TypeError):
            check_type_int("abc")

    def test_check_type_int_with_invalid_type(self):
        with self.assertRaises(TypeError):
            check_type_int([1, 2, 3])

    def test_check_type_float_with_float(self):
        result = check_type_float(123.45)
        self.assertEqual(result, 123.45)

    def test_check_type_float_with_string(self):
        result = check_type_float("123.45")
        self.assertEqual(result, 123.45)

    def test_check_type_float_with_invalid_string(self):
        with self.assertRaises(TypeError):
            check_type_float("abc")

    def test_check_type_float_with_invalid_type(self):
        with self.assertRaises(TypeError):
            check_type_float([1, 2, 3])

    def test_check_type_path_with_string(self):
        result = check_type_path("~/test")
        self.assertEqual(result, os.path.expanduser("~/test"))

    def test_check_type_raw(self):
        result = check_type_raw("raw_value")
        self.assertEqual(result, "raw_value")

    def test_check_type_bytes_with_valid_string(self):
        result = check_type_bytes("1MB")
        self.assertEqual(result, 1048576)

    def test_check_type_bytes_with_invalid_string(self):
        with self.assertRaises(TypeError):
            check_type_bytes("invalid")

    def test_check_type_bits_with_valid_string(self):
        result = check_type_bits("1Mb")
        self.assertEqual(result, 131072)

    def test_check_type_bits_with_invalid_string(self):
        with self.assertRaises(TypeError):
            check_type_bits("invalid")

    def test_check_type_jsonarg_with_string(self):
        result = check_type_jsonarg("  json_arg  ")
        self.assertEqual(result, "json_arg")

    def test_check_type_jsonarg_with_dict(self):
        result = check_type_jsonarg({"key": "value"})
        self.assertEqual(result, '{"key": "value"}')

    def test_check_type_jsonarg_with_invalid_type(self):
        with self.assertRaises(TypeError):
            check_type_jsonarg(123)

if __name__ == '__main__':
    unittest.main()