import unittest
from ansible.vars.reserved import *


class TestReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        self.assertIn('action', get_reserved_names())
        self.assertIn('loop', get_reserved_names())
        self.assertIn('with_', get_reserved_names())
        self.assertNotIn('vars', get_reserved_names())

    def test_warn_if_reserved(self):
        myvars = {'action': 'foo', 'loop': 'bar', 'with_': 'baz'}
        warn_if_reserved(myvars)
        self.assertWarns(UserWarning, warn_if_reserved, 'myvars')

    def test_is_reserved_name(self):
        self.assertTrue(is_reserved_name('action'))
        self.assertTrue(is_reserved_name('loop'))
        self.assertTrue(is_reserved_name('with_'))
        self.assertFalse(is_reserved_name('vars'))

if __name__ == '__main__':
    unittest.main()