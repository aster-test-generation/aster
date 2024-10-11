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
from ansible.module_utils.common.validation import *


class TestValidation(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list('a,b,c'), ['a', 'b', 'c'])
        self.assertEqual(check_type_list('a'), ['a'])
        self.assertEqual(check_type_list(1), ['1'])
        self.assertEqual(check_type_list(1.0), ['1.0'])
        self.assertEqual(check_type_list(True), ['True'])
        self.assertEqual(check_type_list(False), ['False'])
        self.assertEqual(check_type_list({'a': 1, 'b': 2}), [{'a': 1, 'b': 2}])
        self.assertEqual(check_type_list([1, 2, 3]), [1, 2, 3])
        self.assertRaises(TypeError, check_type_list, {'a': 1, 'b': 2})

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict('a=1,b=2,c=3'), {'a': '1', 'b': '2', 'c': '3'})
        self.assertEqual(check_type_dict('a=1'), {'a': '1'})
        self.assertEqual(check_type_dict(1), {1: None})
        self.assertEqual(check_type_dict(1.0), {'1.0': None})
        self.assertEqual(check_type_dict(True), {'True': None})
        self.assertEqual(check_type_dict(False), {'False': None})
        self.assertEqual(check_type_dict({'a': 1, 'b': 2}), {'a': 1, 'b': 2})
        self.assertEqual(check_type_dict([1, 2, 3]), {'1': None, '2': None, '3': None})
        self.assertRaises(TypeError, check_type_dict, 'a=1,b=2,c=3')

    def test_check_type_bool(self):
        self.assertEqual(check_type_bool('True'), True)
        self.assertEqual(check_type_bool('False'), False)
        self.assertEqual(check_type_bool(True), True)
        self.assertEqual(check_type_bool(False), False)
        self.assertEqual(check_type_bool(1), True)
        self.assertEqual(check_type_bool(0), False)
        self.assertRaises(TypeError, check_type_bool, 1)

    def test_check_type_int(self):
        self.assertEqual(check_type_int('1'), 1)
        self.assertEqual(check_type_int(1), 1)
        self.assertEqual(check_type_int(1.0), 1.0)
        self.assertRaises(TypeError, check_type_int, '1.0')

    def test_check_type_float(self):
        self.assertEqual(check_type_float('1.0'), 1.0)
        self.assertEqual(check_type_float(1), 1.0)
        self.assertEqual(check_type_float(1.0), 1.0)
        self.assertRaises(TypeError, check_type_float, 1)

    def test_check_type_path(self):
        self.assertEqual(check_type_path('~/test'), '/home/test')
        self.assertEqual(check_type_path('/test'), '/test')
        self.assertEqual(check_type_path('C:\\test'), 'C:\\test')

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw('test'), 'test')

class TestValidation(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list('a,b,c'), ['a', 'b', 'c'])
        self.assertEqual(check_type_list('a'), ['a'])
        self.assertEqual(check_type_list(['a', 'b', 'c']), ['a', 'b', 'c'])
        self.assertEqual(check_type_list(1), ['1'])
        self.assertEqual(check_type_list(1.0), ['1.0'])
        self.assertEqual(check_type_list(True), ['True'])
        self.assertEqual(check_type_list(False), ['False'])
        self.assertEqual(check_type_list(None), ['None'])
        with self.assertRaises(TypeError):
            check_type_list({})

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict('a=1,b=2,c=3'), {'a': '1', 'b': '2', 'c': '3'})
        self.assertEqual(check_type_dict('a=1'), {'a': '1'})
        self.assertEqual(check_type_dict({'a': '1', 'b': '2', 'c': '3'}), {'a': '1', 'b': '2', 'c': '3'})
        self.assertEqual(check_type_dict(1), {'1': None})
        self.assertEqual(check_type_dict(1.0), {'1.0': None})
        self.assertEqual(check_type_dict(True), {'True': None})
        self.assertEqual(check_type_dict(False), {'False': None})
        self.assertEqual(check_type_dict(None), {'None': None})
        with self.assertRaises(TypeError):
            check_type_dict('a,b,c')

    def test_check_type_bool(self):
        self.assertEqual(check_type_bool('True'), True)
        self.assertEqual(check_type_bool('False'), False)
        self.assertEqual(check_type_bool(True), True)
        self.assertEqual(check_type_bool(False), False)
        self.assertEqual(check_type_bool(1), True)
        self.assertEqual(check_type_bool(0), False)
        self.assertEqual(check_type_bool('1'), True)
        self.assertEqual(check_type_bool('0'), False)
        with self.assertRaises(TypeError):
            check_type_bool('yes')

    def test_check_type_int(self):
        self.assertEqual(check_type_int('1'), 1)
        self.assertEqual(check_type_int(1), 1)
        self.assertEqual(check_type_int(1.0), 1)
        self.assertEqual(check_type_int('1.0'), 1)
        with self.assertRaises(TypeError):
            check_type_int('a')

    def test_check_type_float(self):
        self.assertEqual(check_type_float('1'), 1.0)
        self.assertEqual(check_type_float(1), 1.0)
        self.assertEqual(check_type_float(1.0), 1.0)
        self.assertEqual(check_type_float('1.0'), 1.0)
        with self.assertRaises(TypeError):
            check_type_float('a')

    def test_check_type_path(self):
        self.assertEqual(check_type_path('~/test'), '/home/test')
        self.assertEqual(check_type_path('${HOME}/test'), '${HOME}/test')
        self.assertEqual(check_type_path('$HOME/test'), '/home/test')

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw('a'), 'a')

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

class TestValidationMethods(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list('a,b,c'), ['a', 'b', 'c'])
        self.assertEqual(check_type_list('a'), ['a'])
        self.assertEqual(check_type_list(['a', 'b', 'c']), ['a', 'b', 'c'])
        self.assertRaises(TypeError, check_type_list, 123)

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict('a=b c=d'), {'a': 'b', 'c': 'd'})
        self.assertEqual(check_type_dict('a=b'), {'a': 'b'})
        self.assertEqual(check_type_dict({'a': 'b', 'c': 'd'}), {'a': 'b', 'c': 'd'})
        self.assertRaises(TypeError, check_type_dict, 'a')

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

class TestValidation(unittest.TestCase):
    def test_check_type_list(self):
        self.assertEqual(check_type_list('a,b,c'), ['a', 'b', 'c'])
        self.assertEqual(check_type_list('a'), ['a'])
        self.assertEqual(check_type_list(1), ['1'])
        self.assertEqual(check_type_list(1.0), ['1.0'])
        self.assertRaises(TypeError, check_type_list, 1+1j)

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict('a=b,c=d'), {'a': 'b', 'c': 'd'})
        self.assertEqual(check_type_dict('a=b'), {'a': 'b'})
        self.assertEqual(check_type_dict('a'), {'a': None})
        self.assertEqual(check_type_dict(1), {'1': None})
        self.assertEqual(check_type_dict(1.0), {'1.0': None})
        self.assertRaises(TypeError, check_type_dict, 1+1j)

    def test_check_type_bool(self):
        self.assertEqual(check_type_bool(True), True)
        self.assertEqual(check_type_bool(False), False)
        self.assertEqual(check_type_bool('True'), True)
        self.assertEqual(check_type_bool('False'), False)
        self.assertEqual(check_type_bool('1'), True)
        self.assertEqual(check_type_bool('0'), False)
        self.assertEqual(check_type_bool(1), True)
        self.assertEqual(check_type_bool(0), False)
        self.assertRaises(TypeError, check_type_bool, 1+1j)

    def test_check_type_int(self):
        self.assertEqual(check_type_int(1), 1)
        self.assertEqual(check_type_int('1'), 1)
        self.assertEqual(check_type_int(1.0), 1)
        self.assertEqual(check_type_int('1.0'), 1)
        self.assertRaises(TypeError, check_type_int, 'a')

    def test_check_type_float(self):
        self.assertEqual(check_type_float(1.0), 1.0)
        self.assertEqual(check_type_float('1.0'), 1.0)
        self.assertEqual(check_type_float(1), 1.0)
        self.assertEqual(check_type_float('1'), 1.0)
        self.assertRaises(TypeError, check_type_float, 'a')

    def test_check_type_path(self):
        self.assertEqual(check_type_path('~/a/b'), os.path.expanduser('~/a/b'))
        self.assertEqual(check_type_path('$HOME/a/b'), os.path.expanduser('$HOME/a/b'))

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw('a'), 'a')

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes('1024B'), 1024)
        self.assertEqual(check_type_bytes('1024KB'), 1024*1024)
        self.assertEqual(check_type_bytes('1024MB'), 1024*1024*1024)
        self.assertEqual(check_type_bytes('1024GB'), 1024*1024*1024*1024)
        self.assertEqual(check_type_bytes('1024TB'), 1024*1024*1024*1024*1024)
        self.assertRaises(TypeError, check_type_bytes, 'a')

if __name__ == '__main__':
    unittest.main()