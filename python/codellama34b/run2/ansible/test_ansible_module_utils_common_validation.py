import unittest
from ansible.module_utils.common.validation import *



class TestCheckTypeList(unittest.TestCase):
    def test_check_type_list(self):
        value = check_type_list([1, 2, 3])
        self.assertEqual(value, [1, 2, 3])

    def test_check_type_list_string(self):
        value = check_type_list("1,2,3")
        self.assertEqual(value, ["1", "2", "3"])

    def test_check_type_list_int(self):
        value = check_type_list(1)
        self.assertEqual(value, ["1"])

    def test_check_type_list_float(self):
        value = check_type_list(1.0)
        self.assertEqual(value, ["1.0"])

    def test_check_type_list_invalid(self):
        self.assertRaises(TypeError, check_type_list, dict())

class TestCheckTypeDict(unittest.TestCase):
    def test_check_type_dict(self):
        value = check_type_dict({"a": 1, "b": 2})
        self.assertEqual(value, {"a": 1, "b": 2})

    def test_check_type_dict_string(self):
        value = check_type_dict('{"a": 1, "b": 2}')
        self.assertEqual(value, {"a": 1, "b": 2})

    def test_check_type_dict_invalid(self):
        self.assertRaises(TypeError, check_type_dict, [1, 2, 3])

class TestCheckTypeBool(unittest.TestCase):
    def test_check_type_bool(self):
        value = check_type_bool(True)
        self.assertEqual(value, True)

    def test_check_type_bool_string(self):
        value = check_type_bool("True")
        self.assertEqual(value, True)

    def test_check_type_bool_int(self):
        value = check_type_bool(1)
        self.assertEqual(value, True)

    def test_check_type_bool_invalid(self):
        self.assertRaises(TypeError, check_type_bool, [1, 2, 3])

class TestCheckTypeInt(unittest.TestCase):
    def test_check_type_int(self):
        value = check_type_int(1)
        self.assertEqual(value, 1)

    def test_check_type_int_string(self):
        value = check_type_int("1")
        self.assertEqual(value, 1)

    def test_check_type_int_float(self):
        value = check_type_int(1.0)
        self.assertEqual(value, 1)

    def test_check_type_int_invalid(self):
        self.assertRaises(TypeError, check_type_int, [1, 2, 3])

class TestCheckTypeFloat(unittest.TestCase):
    def test_check_type_float(self):
        value = check_type_float(1.0)
        self.assertEqual(value, 1.0)

    def test_check_type_float_string(self):
        value = check_type_float("1.0")
        self.assertEqual(value, 1.0)

    def test_check_type_float_int(self):
        value = check_type_float(1)
        self.assertEqual(value, 1.0)

    def test_check_type_float_invalid(self):
        self.assertRaises(TypeError, check_type_float, [1, 2, 3])

class TestCheckTypePath(unittest.TestCase):
    def test_check_type_path(self):
        value = check_type_path("~/")
        self.assertEqual(value, os.path.expanduser("~/"))

if __name__ == '__main__':
    unittest.main()