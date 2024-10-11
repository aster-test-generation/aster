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
        self.assertEqual(check_type_list('a,b,c'), ['a', 'b', 'c'])
        self.assertEqual(check_type_list('a'), ['a'])
        self.assertEqual(check_type_list(['a', 'b', 'c']), ['a', 'b', 'c'])
        with self.assertRaises(TypeError):
            check_type_list(123)

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict('a=1,b=2,c=3'), {'a': '1', 'b': '2', 'c': '3'})
        self.assertEqual(check_type_dict('a=1'), {'a': '1'})
        self.assertEqual(check_type_dict({'a': '1', 'b': '2', 'c': '3'}), {'a': '1', 'b': '2', 'c': '3'})
        with self.assertRaises(TypeError):
            check_type_dict(123)

    def test_check_type_bool(self):
        self.assertEqual(check_type_bool('yes'), True)
        self.assertEqual(check_type_bool('no'), False)
        self.assertEqual(check_type_bool(True), True)
        self.assertEqual(check_type_bool(False), False)
        with self.assertRaises(TypeError):
            check_type_bool(123)

    def test_check_type_int(self):
        self.assertEqual(check_type_int('123'), 123)
        self.assertEqual(check_type_int(123), 123)
        with self.assertRaises(TypeError):
            check_type_int('abc')

    def test_check_type_float(self):
        self.assertEqual(check_type_float('123.45'), 123.45)
        self.assertEqual(check_type_float(123.45), 123.45)
        with self.assertRaises(TypeError):
            check_type_float('abc')

    def test_check_type_path(self):
        self.assertEqual(check_type_path('~/test'), '~/test')
        self.assertEqual(check_type_path('/test'), '/test')
        with self.assertRaises(TypeError):
            check_type_path(123)

    def test_check_type_raw(self):
        self.assertEqual(check_type_raw('abc'), 'abc')
        with self.assertRaises(TypeError):
            check_type_raw(123)

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes('100B'), 100)
        self.assertEqual(check_type_bytes('100KB'), 102400)
        self.assertEqual(check_type_bytes('100MB'), 104857600)
        self.assertEqual(check_type_bytes('100GB'), 107374182400)
        self.assertEqual(check_type_bytes('100TB'), 109951162777600)
        with self.assertRaises(TypeError):
            check_type_bytes('abc')

if __name__ == '__main__':
    unittest.main()