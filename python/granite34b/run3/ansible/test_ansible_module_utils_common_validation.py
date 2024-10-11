import os
import unittest
from ansible.module_utils.common.validation import (
    check_type_list,
    check_type_dict,
    check_type_bool,
    check_type_int,
    check_type_float,
    check_type_path,
    check_type_raw,
    check_type_bytes,
    check_type_bits,
    check_type_jsonarg,
)


class TestValidation(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list([1, 2, 3]), [1, 2, 3])
        self.assertEqual(check_type_list("1,2,3"), ["1", "2", "3"])
        self.assertEqual(check_type_list(1), ["1"])
        self.assertEqual(check_type_list(1.0), ["1.0"])
        with self.assertRaises(TypeError):
            check_type_list({"a": 1})

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict({"a": 1}), {"a": 1})
        self.assertEqual(check_type_dict("{\"a\": 1}"), {"a": 1})
        self.assertEqual(check_type_dict("a=1"), {"a": "1"})
        with self.assertRaises(TypeError):
            check_type_dict([1, 2, 3])

    def test_check_type_bool(self):
        self.assertTrue(check_type_bool(True))
        self.assertTrue(check_type_bool(1))
        self.assertTrue(check_type_bool("yes"))
        self.assertFalse(check_type_bool(False))
        self.assertFalse(check_type_bool(0))
        self.assertFalse(check_type_bool("no"))
        with self.assertRaises(TypeError):
            check_type_bool("maybe")

    def test_check_type_int(self):
        self.assertEqual(check_type_int(1), 1)
        self.assertEqual(check_type_int("1"), 1)
        with self.assertRaises(TypeError):
            check_type_int("one")

    def test_check_type_float(self):
        self.assertEqual(check_type_float(1.0), 1.0)
        self.assertEqual(check_type_float("1.0"), 1.0)
        with self.assertRaises(TypeError):
            check_type_float("one")

    def test_check_type_path(self):
        self.assertEqual(check_type_path("/path/to/file"), "/path/to/file")
        self.assertEqual(check_type_path("$HOME/file"), os.path.expanduser("$HOME/file"))
        self.assertEqual(check_type_path("$HOME/file"), os.path.expandvars("$HOME/file"))

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw("raw"), "raw")

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes("1K"), 1024)
        self.assertEqual(check_type_bytes("1M"), 1024 * 1024)
        self.assertEqual(check_type_bytes("1G"), 1024 * 1024 * 1024)
        with self.assertRaises(TypeError):
            check_type_bytes("1X")

    def test_check_type_bits(self):
        self.assertEqual(check_type_bits("1K"), 1000)
        self.assertEqual(check_type_bits("1M"), 1000 * 1000)
        self.assertEqual(check_type_bits("1G"), 1000 * 1000 * 1000)
        with self.assertRaises(TypeError):
            check_type_bits("1X")

if __name__ == '__main__':
    unittest.main()