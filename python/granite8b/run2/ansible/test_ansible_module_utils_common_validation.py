import unittest
from ansible.module_utils.common.validation import (
    check_type_bool,
    check_type_bytes,
    check_type_dict,
    check_type_float,
    check_type_int,
    check_type_jsonarg,
    check_type_list,
    check_type_path,
    check_type_raw,
    check_type_str,
)


class TestValidation(unittest.TestCase):
    def test_check_type_bool(self):
        self.assertTrue(check_type_bool(True))
        self.assertFalse(check_type_bool(False))
        self.assertTrue(check_type_bool('True'))
        self.assertFalse(check_type_bool('False'))
        self.assertRaises(TypeError, check_type_bool, 1)
        self.assertRaises(TypeError, check_type_bool, 0)
        self.assertRaises(TypeError, check_type_bool, '1')
        self.assertRaises(TypeError, check_type_bool, '0')

    def test_check_type_bytes(self):
        self.assertEqual(check_type_bytes('100B'), 100)
        self.assertEqual(check_type_bytes('100KB'), 100 * 1024)
        self.assertEqual(check_type_bytes('100MB'), 100 * 1024 * 1024)
        self.assertEqual(check_type_bytes('100GB'), 100 * 1024 * 1024 * 1024)
        self.assertEqual(check_type_bytes('100TB'), 100 * 1024 * 1024 * 1024 * 1024)
        self.assertRaises(TypeError, check_type_bytes, '100')
        self.assertRaises(TypeError, check_type_bytes, '100K')
        self.assertRaises(TypeError, check_type_bytes, '100M')
        self.assertRaises(TypeError, check_type_bytes, '100G')
        self.assertRaises(TypeError, check_type_bytes, '100T')

    def test_check_type_dict(self):
        self.assertEqual(check_type_dict('foo=bar'), {'foo': 'bar'})
        self.assertEqual(check_type_dict('foo="bar"'), {'foo': 'bar'})
        self.assertEqual(check_type_dict('foo="bar baz"'), {'foo': 'bar baz'})
        self.assertEqual(check_type_dict('foo="bar baz" bar="foo"'), {'foo': 'bar baz', 'bar': 'foo'})
        self.assertEqual(check_type_dict('foo="bar baz" bar="foo"'), {'foo': 'bar baz', 'bar': 'foo'})
        self.assertEqual(check_type_dict('foo="bar baz" bar="foo"'), {'foo': 'bar baz', 'bar': 'foo'})
        self.assertRaises(TypeError, check_type_dict, 'foo=bar=baz')
        self.assertRaises(TypeError, check_type_dict, 'foo="bar baz" bar="foo" qux')

    def test_check_type_float(self):
        self.assertEqual(check_type_float('1.0'), 1.0)
        self.assertEqual(check_type_float('1'), 1.0)
        self.assertRaises(TypeError, check_type_float, 'foo')

    def test_check_type_int(self):
        self.assertEqual(check_type_int('1'), 1)
        self.assertEqual(check_type_int('1.0'), 1)
        self.assertRaises(TypeError, check_type_int, '1.1')
        self.assertRaises(TypeError, check_type_int, 'foo')

    def test_check_type_jsonarg(self):
        self.assertEqual(check_type_jsonarg('foo'), 'foo')
        self.assertEqual(check_type_jsonarg('{"foo": "bar"}'), '{"foo": "bar"}')
        self.assertEqual(check_type_jsonarg('["foo", "bar"]'), '["foo", "bar"]')
        self.assertRaises(TypeError, check_type_jsonarg, '{"foo": "bar}')
        self.assertRaises(TypeError, check_type_jsonarg, '["foo", "bar}')

if __name__ == '__main__':
    unittest.main()