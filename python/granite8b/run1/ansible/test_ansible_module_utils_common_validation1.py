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

if __name__ == '__main__':
    unittest.main()