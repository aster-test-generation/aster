import unittest
from ansible.vars.reserved import (
    get_reserved_names,
    warn_if_reserved,
    is_reserved_name,
)


class TestReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        result = get_reserved_names()
        self.assertIsInstance(result, set)
        self.assertIn('action', result)
        self.assertIn('loop', result)
        self.assertIn('with_', result)

    def test_warn_if_reserved(self):
        myvars = {'action': 'foo', 'loop': 'bar', 'with_': 'baz'}
        warn_if_reserved(myvars)
        # No assert needed, just checking that no exceptions were raised

    def test_is_reserved_name(self):
        self.assertTrue(is_reserved_name('action'))
        self.assertTrue(is_reserved_name('loop'))
        self.assertTrue(is_reserved_name('with_'))
        self.assertFalse(is_reserved_name('foo'))

if __name__ == '__main__':
    unittest.main()