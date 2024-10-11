import unittest
from ansible.module_utils.common.validation import *



class TestCheckTypeList(unittest.TestCase):
    def test_check_type_list(self):
        result = check_type_list(1)
        self.assertEqual(result, ['1'])

    def test_check_type_list_2(self):
        result = check_type_list('1,2,3')
        self.assertEqual(result, ['1', '2', '3'])

    def test_check_type_list_3(self):
        result = check_type_list([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_check_type_list_4(self):
        result = check_type_list({'1': 1, '2': 2, '3': 3})
        self.assertEqual(result, ['1', '2', '3'])

    def test_check_type_list_5(self):
        result = check_type_list(True)
        self.assertEqual(result, ['True'])

    def test_check_type_list_6(self):
        result = check_type_list(1.1)
        self.assertEqual(result, ['1.1'])

    def test_check_type_list_7(self):
        result = check_type_list(None)
        self.assertEqual(result, [])

    def test_check_type_list_8(self):
        result = check_type_list('')
        self.assertEqual(result, [])

    def test_check_type_list_9(self):
        result = check_type_list([])
        self.assertEqual(result, [])

    def test_check_type_list_10(self):
        result = check_type_list({})
        self.assertEqual(result, [])

    def test_check_type_list_11(self):
        result = check_type_list(False)
        self.assertEqual(result, ['False'])

    def test_check_type_list_12(self):
        result = check_type_list(0)
        self.assertEqual(result, ['0'])

    def test_check_type_list_13(self):
        result = check_type_list(0.0)
        self.assertEqual(result, ['0.0'])

    def test_check_type_list_14(self):
        result = check_type_list('1')
        self.assertEqual(result, ['1'])

    def test_check_type_list_15(self):
        result = check_type_list('1,2,3')
        self.assertEqual(result, ['1', '2', '3'])

    def test_check_type_list_16(self):
        result = check_type_list([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_check_type_list_17(self):
        result = check_type_list({'1': 1, '2': 2, '3': 3})
        self.assertEqual(result, ['1', '2', '3'])

    def test_check_type_list_18(self):
        result = check_type_list(True)
        self.assertEqual(result, ['True'])

    def test_check_type_list_19(self):
        result = check_type_list(1.1)
        self.assertEqual(result, ['1.1'])

    def test_check_type_list_20(self):
        result = check_type_list(None)
        self.assertEqual(result, [])

    def test_check_type_list_21(self):
        result = check_type_list('')
        self.assertEqual(result, [])

    def test_check_type_list_22(self):
        result = check_type_list([])
        self.assertEqual(result, [])

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

    def test_check_type_list_invalid(self):
        value = {'a': 'b'}
        self.assertRaises(TypeError, check_type_list, value)

class TestCheckTypeDict(unittest.TestCase):
    def test_check_type_dict_dict(self):
        value = {'a': 'b'}
        result = check_type_dict(value)
        self.assertEqual(result, value)

    def test_check_type_dict_string(self):
        value = '{"a": "b"}'
        result = check_type_dict(value)
        self.assertEqual(result, {'a': 'b'})

    def test_check_type_dict_invalid(self):
        value = ['a', 'b', 'c']
        self.assertRaises(TypeError, check_type_dict, value)

class TestCheckTypeBool(unittest.TestCase):
    def test_check_type_bool_bool(self):
        value = True
        result = check_type_bool(value)
        self.assertEqual(result, value)

    def test_check_type_bool_string(self):
        value = 'true'
        result = check_type_bool(value)
        self.assertEqual(result, True)

    def test_check_type_bool_int(self):
        value = 1
        result = check_type_bool(value)
        self.assertEqual(result, True)

    def test_check_type_bool_invalid(self):
        value = ['a', 'b', 'c']
        self.assertRaises(TypeError, check_type_bool, value)

class TestCheckTypeInt(unittest.TestCase):
    def test_check_type_int_int(self):
        value = 1
        result = check_type_int(value)
        self.assertEqual(result, value)

    def test_check_type_int_string(self):
        value = '1'
        result = check_type_int(value)
        self.assertEqual(result, 1)

    def test_check_type_int_invalid(self):
        value = ['a', 'b', 'c']
        self.assertRaises(TypeError, check_type_int, value)

class TestCheckTypeFloat(unittest.TestCase):
    def test_check_type_float_float(self):
        value = 1.0
        result = check_type_float(value)
        self.assertEqual(result, value)

    def test_check_type_float_string(self):
        value = '1.0'
        result = check_type_float(value)
        self.assertEqual(result, 1.0)

    def test_check_type_float_int(self):
        value = 1
        result = check_type_float(value)
        self.assertEqual(result, 1.0)

    def test_check_type_float_invalid(self):
        value = ['a', 'b', 'c']
        self.assertRaises(TypeError, check_type_float, value)

if __name__ == '__main__':
    unittest.main()