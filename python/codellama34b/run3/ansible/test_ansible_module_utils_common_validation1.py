
import unittest
from ansible.module_utils.common.validation import *

class TestCheckTypeList(unittest.TestCase):
    def test_check_type_list(self):
        value = [1, 2, 3]
        result = check_type_list(value)
        self.assertEqual(result, value)

    def test_check_type_list_string(self):
        value = '1,2,3'
        result = check_type_list(value)
        self.assertEqual(result, ['1', '2', '3'])

    def test_check_type_list_int(self):
        value = 1
        result = check_type_list(value)
        self.assertEqual(result, ['1'])

    def test_check_type_list_float(self):
        value = 1.0
        result = check_type_list(value)
        self.assertEqual(result, ['1.0'])

    def test_check_type_list_dict(self):
        value = {'a': 1}
        result = check_type_list(value)
        self.assertEqual(result, ['{"a": 1}'])

    def test_check_type_list_list(self):
        value = [1, 2, 3]
        result = check_type_list(value)
        self.assertEqual(result, value)

    def test_check_type_list_tuple(self):
        value = (1, 2, 3)
        result = check_type_list(value)
        self.assertEqual(result, [1, 2, 3])

    def test_check_type_list_none(self):
        value = None
        result = check_type_list(value)
        self.assertEqual(result, [])

    def test_check_type_list_invalid(self):
        value = 1j
        self.assertRaises(TypeError, check_type_list, value)

class TestCheckTypeDict(unittest.TestCase):
    def test_check_type_dict(self):
        value = {'a': 1}
        result = check_type_dict(value)
        self.assertEqual(result, value)

    def test_check_type_dict_string(self):
        value = '{"a": 1}'
        result = check_type_dict(value)
        self.assertEqual(result, {'a': 1})

    def test_check_type_dict_int(self):
        value = 1
        self.assertRaises(TypeError, check_type_dict, value)

    def test_check_type_dict_float(self):
        value = 1.0
        self.assertRaises(TypeError, check_type_dict, value)

    def test_check_type_dict_list(self):
        value = [1, 2, 3]
        self.assertRaises(TypeError, check_type_dict, value)

    def test_check_type_dict_tuple(self):
        value = (1, 2, 3)
        self.assertRaises(TypeError, check_type_dict, value)

    def test_check_type_dict_none(self):
        value = None
        self.assertRaises(TypeError, check_type_dict, value)

    def test_check_type_dict_invalid(self):
        value = 1j
        self.assertRaises(TypeError, check_type_dict, value)

class TestCheckTypeBool(unittest.TestCase):
    def test_check_type_bool(self):
        value = True
        result = check_type_bool(value)
        self.assertEqual(result, value)

    def test_check_type_bool_string(self):
        value = 'True'
        result = check_type_bool(value)
        self.assertEqual(result, True)

    def test_check_type_bool_int(self):
        value = 1
        result = check_type_bool(value)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()