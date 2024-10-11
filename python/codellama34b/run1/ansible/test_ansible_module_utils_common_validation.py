import unittest
from ansible.module_utils.common.validation import *



class TestCheckTypeList(unittest.TestCase):
    def test_check_type_list_list(self):
        value = ['a', 'b', 'c']
        result = check_type_list(value)
        self.assertEqual(result, value)

    def test_check_type_list_string(self):
        value = 'a,b,c'
        result = check_type_list(value)
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_check_type_list_int(self):
        value = 1
        result = check_type_list(value)
        self.assertEqual(result, ['1'])

    def test_check_type_list_float(self):
        value = 1.0
        result = check_type_list(value)
        self.assertEqual(result, ['1.0'])

    def test_check_type_list_dict(self):
        value = {'a': 'b'}
        with self.assertRaises(TypeError):
            check_type_list(value)

    def test_check_type_list_bool(self):
        value = True
        with self.assertRaises(TypeError):
            check_type_list(value)

class TestCheckTypeDict(unittest.TestCase):
    def test_check_type_dict_dict(self):
        value = {'a': 'b'}
        result = check_type_dict(value)
        self.assertEqual(result, value)

    def test_check_type_dict_string(self):
        value = '{"a": "b"}'
        result = check_type_dict(value)
        self.assertEqual(result, {'a': 'b'})

    def test_check_type_dict_int(self):
        value = 1
        with self.assertRaises(TypeError):
            check_type_dict(value)

    def test_check_type_dict_float(self):
        value = 1.0
        with self.assertRaises(TypeError):
            check_type_dict(value)

    def test_check_type_dict_list(self):
        value = ['a', 'b', 'c']
        with self.assertRaises(TypeError):
            check_type_dict(value)

    def test_check_type_dict_bool(self):
        value = True
        with self.assertRaises(TypeError):
            check_type_dict(value)

class TestCheckTypeBool(unittest.TestCase):
    def test_check_type_bool_bool(self):
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

    def test_check_type_bool_float(self):
        value = 1.0
        result = check_type_bool(value)
        self.assertEqual(result, True)

    def test_check_type_bool_list(self):
        value = ['a', 'b', 'c']
        with self.assertRaises(TypeError):
            check_type_bool(value)

    def test_check_type_bool_dict(self):
        value = {'a': 'b'}
        with self.assertRaises(TypeError):
            check_type_bool(value)

class TestCheckTypeInt(unittest.TestCase):
    def test_check_type_int_int(self):
        value = 1
        result = check_type_int(value)
        self.assertEqual(result, value)

if __name__ == '__main__':
    unittest.main()