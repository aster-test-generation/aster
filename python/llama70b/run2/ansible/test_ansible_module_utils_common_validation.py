import unittest
from ansible.module_utils.common.validation import *


class TestValidationFunctions(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list([1, 2, 3]), [1, 2, 3])
        self.assertEqual(check_type_list("1,2,3"), ["1", "2", "3"])
        self.assertEqual(check_type_list(1), ["1"])
        with self.assertRaises(TypeError):
            check_type_list({"a": 1})

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict({"a": 1}), {"a": 1})
        self.assertEqual(check_type_dict('{"a": 1}'), {"a": 1})
        self.assertEqual(check_type_dict("a=1,b=2"), {"a": "1", "b": "2"})
        with self.assertRaises(TypeError):
            check_type_dict([1, 2, 3])

    def test_check_type_bool(self):
        self.assertTrue(check_type_bool(True))
        self.assertTrue(check_type_bool("yes"))
        self.assertFalse(check_type_bool("no"))
        with self.assertRaises(TypeError):
            check_type_bool({"a": 1})

    def test_check_type_int(self):
        self.assertEqual(check_type_int(1), 1)
        self.assertEqual(check_type_int("1"), 1)
        with self.assertRaises(TypeError):
            check_type_int({"a": 1})

    def test_check_type_float(self):
        self.assertEqual(check_type_float(1.0), 1.0)
        self.assertEqual(check_type_float("1.0"), 1.0)
        with self.assertRaises(TypeError):
            check_type_float({"a": 1})

    def test_check_type_path(self):
        self.assertEqual(check_type_path("~/path"), os.path.expanduser("~/path"))
        with self.assertRaises(TypeError):
            check_type_path({"a": 1})

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw("raw"), "raw")

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes("1KB"), 1024)
        with self.assertRaises(TypeError):
            check_type_bytes({"a": 1})

    def test_check_type_bits(self):
        self.assertEqual(check_type_bits("1bit"), 1)
        with self.assertRaises(TypeError):
            check_type_bits({"a": 1})

    def test_check_type_jsonarg(self):
        self.assertEqual(check_type_jsonarg('{"a": 1}'), '{"a": 1}')
        self.assertEqual(check_type_jsonarg({"a": 1}), '{"a": 1}')
        with self.assertRaises(TypeError):
            check_type_jsonarg(1)

if __name__ == '__main__':
    unittest.main()