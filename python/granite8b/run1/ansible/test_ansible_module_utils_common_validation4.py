import unittest
from ansible.module_utils.common.validation import *

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