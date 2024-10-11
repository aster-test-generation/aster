import unittest
from ansible.vars.reserved import get_reserved_names, warn_if_reserved, is_reserved_name


class TestReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        reserved_names = get_reserved_names()
        self.assertIn('action', reserved_names)
        self.assertIn('local_action', reserved_names)
        self.assertIn('with_', reserved_names)
        self.assertIn('vars', reserved_names)

    def test_warn_if_reserved(self):
        with self.assertWarns(UserWarning):
            warn_if_reserved({'vars': 'value'})

    def test_is_reserved_name(self):
        self.assertTrue(is_reserved_name('vars'))
        self.assertFalse(is_reserved_name('my_var'))

if __name__ == '__main__':
    unittest.main()