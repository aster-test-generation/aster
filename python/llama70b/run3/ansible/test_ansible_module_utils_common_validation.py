import unittest
from ansible.module_utils.common.validation import *


class TestValidationFunctions(unittest.TestCase):
    def test_check_type_list(self):
        result = check_type_list([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_check_type_list_string(self):
        result = check_type_list("1,2,3")
        self.assertEqual(result, ["1", "2", "3"])

    def test_check_type_list_int(self):
        result = check_type_list(1)
        self.assertEqual(result, ["1"])

    def test_check_type_list_error(self):
        with self.assertRaises(TypeError):
            check_type_list({})

    def test_check_type_dict(self):
        result = check_type_dict({"a": 1, "b": 2})
        self.assertEqual(result, {"a": 1, "b": 2})

    def test_check_type_dict_string(self):
        result = check_type_dict("a=1,b=2")
        self.assertEqual(result, {"a": "1", "b": "2"})

    def test_check_type_dict_json(self):
        result = check_type_dict('{"a": 1, "b": 2}')
        self.assertEqual(result, {"a": 1, "b": 2})

    def test_check_type_dict_error(self):
        with self.assertRaises(TypeError):
            check_type_dict(1)

    def test_check_type_bool(self):
        result = check_type_bool(True)
        self.assertEqual(result, True)

    def test_check_type_bool_string(self):
        result = check_type_bool("yes")
        self.assertEqual(result, True)

    def test_check_type_bool_int(self):
        result = check_type_bool(1)
        self.assertEqual(result, True)

    def test_check_type_bool_error(self):
        with self.assertRaises(TypeError):
            check_type_bool({})

    def test_check_type_int(self):
        result = check_type_int(1)
        self.assertEqual(result, 1)

    def test_check_type_int_string(self):
        result = check_type_int("1")
        self.assertEqual(result, 1)

    def test_check_type_int_error(self):
        with self.assertRaises(TypeError):
            check_type_int({})

    def test_check_type_float(self):
        result = check_type_float(1.0)
        self.assertEqual(result, 1.0)

    def test_check_type_float_string(self):
        result = check_type_float("1.0")
        self.assertEqual(result, 1.0)

    def test_check_type_float_error(self):
        with self.assertRaises(TypeError):
            check_type_float({})

    def test_check_type_path(self):
        result = check_type_path("~/path")
        self.assertEqual(result, os.path.expanduser(os.path.expandvars("~/path")))

    def test_check_type_raw(self):
        result = check_type_raw("raw")
        self.assertEqual(result, "raw")

    def test_check_type_bytes(self):
        result = check_type_bytes("1KB")
        self.assertEqual(result, human_to_bytes("1KB"))

    def test_check_type_bytes_error(self):
        with self.assertRaises(TypeError):
            check_type_bytes({})

    def test_check_type_bits(self):
        result = check_type_bits("1KB")
        self.assertEqual(result, human_to_bytes("1KB", isbits=True))

    def test_check_type_bits_error(self):
        with self.assertRaises(TypeError):
            check_type_bits({})

    def test_check_type_jsonarg(self):
        result = check_type_jsonarg({"a": 1, "b": 2})
        self.assertEqual(result, jsonify({"a": 1, "b": 2}))

    def test_check_type_jsonarg_string(self):
        result = check_type_jsonarg('{"a": 1, "b": 2}')
        self.assertEqual(result, '{"a": 1, "b": 2}')

    def test_check_type_jsonarg_error(self):
        with self.assertRaises(TypeError):
            check_type_jsonarg(1)

if __name__ == '__main__':
    unittest.main()