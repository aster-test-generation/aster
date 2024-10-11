import unittest
from ansible.module_utils.common.validation import *

class TestValidationMethods(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list('a,b,c'), ['a', 'b', 'c'])
        self.assertEqual(check_type_list('a'), ['a'])
        self.assertEqual(check_type_list(['a', 'b', 'c']), ['a', 'b', 'c'])
        self.assertRaises(TypeError, check_type_list, 123)

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict('a=1,b=2,c=3'), {'a': '1', 'b': '2', 'c': '3'})
        self.assertEqual(check_type_dict('a=1'), {'a': '1'})
        self.assertEqual(check_type_dict({'a': '1', 'b': '2', 'c': '3'}), {'a': '1', 'b': '2', 'c': '3'})
        self.assertRaises(TypeError, check_type_dict, 123)

    def test_check_type_bool(self):
        self.assertEqual(check_type_bool(True), True)
        self.assertEqual(check_type_bool(False), False)
        self.assertEqual(check_type_bool('True'), True)
        self.assertEqual(check_type_bool('False'), False)
        self.assertEqual(check_type_bool('1'), True)
        self.assertEqual(check_type_bool('0'), False)
        self.assertRaises(TypeError, check_type_bool, 'abc')

    def test_check_type_int(self):
        self.assertEqual(check_type_int(123), 123)
        self.assertEqual(check_type_int('123'), 123)
        self.assertRaises(TypeError, check_type_int, 'abc')

    def test_check_type_float(self):
        self.assertEqual(check_type_float(123.45), 123.45)
        self.assertEqual(check_type_float('123.45'), 123.45)
        self.assertRaises(TypeError, check_type_float, 'abc')

    def test_check_type_path(self):
        self.assertEqual(check_type_path('~/test'), '/home/test')
        self.assertEqual(check_type_path('/test'), '/test')
        self.assertEqual(check_type_path('C:\\test'), 'C:\\test')

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw('abc'), 'abc')

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes('100B'), 100)
        self.assertEqual(check_type_bytes('100KB'), 102400)
        self.assertEqual(check_type_bytes('100MB'), 104857600)
        self.assertEqual(check_type_bytes('100GB'), 107374182400)
        self.assertEqual(check_type_bytes('100TB'), 1099511627776)
        self.assertRaises(TypeError, check_type_bytes, 'abc')

    def test_check_type_bits(self):
        self.assertEqual(check_type_bits('100b'), 100)
        self.assertEqual(check_type_bits('100kb'), 125000)
        self.assertEqual(check_type_bits('100mb'), 13421772800)
        self.assertEqual(check_type_bits('100gb'), 140737488355328)
        self.assertEqual(check_type_bits('100tb'), 147573952589676412928)
        self.assertRaises(TypeError, check_type_bits, 'abc')

if __name__ == '__main__':
    unittest.main()