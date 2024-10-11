from ansible.vars.reserved import display
import unittest
from ansible.vars.reserved import get_reserved_names, warn_if_reserved, is_reserved_name


class TestReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        result = get_reserved_names()
        self.assertIsInstance(result, set)
        self.assertIn('vars', result)
        self.assertIn('play', result)

    def test_get_reserved_names_private(self):
        result = get_reserved_names(include_private=True)
        self.assertIsInstance(result, set)
        self.assertIn('vars', result)
        self.assertIn('play', result)
        self.assertIn('_attributes', result)

    def test_warn_if_reserved(self):
        myvars = {'play': 'test'}
        warn_if_reserved(myvars)
        self.assertEqual(display.warning.call_count, 0)

        myvars = {'play': 'test', 'vars': 'test'}
        warn_if_reserved(myvars)
        self.assertEqual(display.warning.call_count, 0)

        myvars = {'_attributes': 'test'}
        warn_if_reserved(myvars)
        self.assertEqual(display.warning.call_count, 1)

    def test_is_reserved_name(self):
        self.assertTrue(is_reserved_name('play'))
        self.assertTrue(is_reserved_name('vars'))
        self.assertFalse(is_reserved_name('test'))

if __name__ == '__main__':
    unittest.main()