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
        self.assertEqual(check_type_dict('{"a": 1}'), {"a": 1})
        self.assertEqual(check_type_dict("a=1"), {"a": "1"})
        with self.assertRaises(TypeError):
            check_type_dict([1, 2, 3])

    def test_check_type_bool(self):
        self.assertEqual(check_type_bool(True), True)
        self.assertEqual(check_type_bool(False), False)
        self.assertEqual(check_type_bool(1), True)
        self.assertEqual(check_type_bool(0), False)
        self.assertEqual(check_type_bool("yes"), True)
        self.assertEqual(check_type_bool("no"), False)
        with self.assertRaises(TypeError):
            check_type_bool([1, 2, 3])

    def test_check_type_int(self):
        self.assertEqual(check_type_int(1), 1)
        self.assertEqual(check_type_int("1"), 1)
        with self.assertRaises(TypeError):
            check_type_int("a")

    def test_check_type_float(self):
        self.assertEqual(check_type_float(1.0), 1.0)
        self.assertEqual(check_type_float("1.0"), 1.0)
        with self.assertRaises(TypeError):
            check_type_float("a")

    def test_check_type_path(self):
        self.assertEqual(check_type_path("/path/to/file"), "/path/to/file")
        self.assertEqual(check_type_path("$HOME/file"), os.path.expanduser("$HOME/file"))
        self.assertEqual(check_type_path("$HOME/file"), os.path.expandvars("$HOME/file"))

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw("raw"), "raw")

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes("10K"), 10240)
        self.assertEqual(check_type_bytes("10M"), 10485760)
        self.assertEqual(check_type_bytes("10G"), 10737418240)
        with self.assertRaises(TypeError):
            check_type_bytes("10X")

    def test_check_type_bits(self):
        self.assertEqual(check_type_bits("10K"), 10240)
        self.assertEqual(check_type_bits("10M"), 10485760)
        self.assertEqual(check_type_bits("10G"), 10737418240)
        with self.assertRaises(TypeError):
            check_type_bits("10X")

class TestValidation(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list([1, 2, 3]), [1, 2, 3])
        self.assertEqual(check_type_list("1,2,3"), ["1", "2", "3"])
        self.assertEqual(check_type_list(1), ["1"])
        with self.assertRaises(TypeError):
            check_type_list({"a": 1})

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict({"a": 1}), {"a": 1})
        self.assertEqual(check_type_dict("{a: 1}"), {"a": 1})
        self.assertEqual(check_type_dict("a=1"), {"a": "1"})
        with self.assertRaises(TypeError):
            check_type_dict([1, 2, 3])

    def test_check_type_bool(self):
        self.assertEqual(check_type_bool(True), True)
        self.assertEqual(check_type_bool(False), False)
        self.assertEqual(check_type_bool(1), True)
        self.assertEqual(check_type_bool(0), False)
        self.assertEqual(check_type_bool("yes"), True)
        self.assertEqual(check_type_bool("no"), False)
        with self.assertRaises(TypeError):
            check_type_bool("true")

    def test_check_type_int(self):
        self.assertEqual(check_type_int(1), 1)
        self.assertEqual(check_type_int("1"), 1)
        with self.assertRaises(TypeError):
            check_type_int("a")

    def test_check_type_float(self):
        self.assertEqual(check_type_float(1.0), 1.0)
        self.assertEqual(check_type_float("1.0"), 1.0)
        with self.assertRaises(TypeError):
            check_type_float("a")

    def test_check_type_path(self):
        self.assertEqual(check_type_path("/path/to/file"), "/path/to/file")
        self.assertEqual(check_type_path("$HOME/file"), os.path.expanduser("$HOME/file"))
        self.assertEqual(check_type_path("$HOME/file"), os.path.expandvars("$HOME/file"))

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw("raw"), "raw")

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes("10M"), 10485760)
        self.assertEqual(check_type_bytes("10MB"), 10485760)
        self.assertEqual(check_type_bytes("10 M"), 10485760)
        with self.assertRaises(TypeError):
            check_type_bytes("10X")

    def test_check_type_bits(self):
        self.assertEqual(check_type_bits("10K"), 10240)
        self.assertEqual(check_type_bits("10KB"), 10240)
        self.assertEqual(check_type_bits("10 K"), 10240)
        with self.assertRaises(TypeError):
            check_type_bits("10X")

if __name__ == '__main__':
    unittest.main()