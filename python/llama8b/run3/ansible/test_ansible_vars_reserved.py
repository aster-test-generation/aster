from ansible.vars.reserved import display
import unittest
from ansible.playbook import Play
from ansible.playbook.block import Block
from ansible.playbook.role import Role
from ansible.playbook.task import Task
from ansible.utils.display import Display
from ansible.vars.reserved import get_reserved_names, warn_if_reserved, is_reserved_name, _RESERVED_NAMES


class TestGetReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        result = get_reserved_names()
        self.assertIsInstance(result, set)
        self.assertGreater(len(result), 0)

    def test_get_reserved_names_include_private(self):
        result = get_reserved_names(include_private=True)
        self.assertIsInstance(result, set)
        self.assertGreater(len(result), 0)

    def test_get_reserved_names_include_private_empty(self):
        result = get_reserved_names(include_private=False)
        self.assertIsInstance(result, set)
        self.assertGreater(len(result), 0)

class TestWarnIfReserved(unittest.TestCase):
    def test_warn_if_reserved(self):
        myvars = {'a': 1, 'b': 2, 'c': 3}
        warn_if_reserved(myvars)
        self.assertEqual(len(display.messages), 0)

    def test_warn_if_reserved_reserved_name(self):
        myvars = {'a': 1, 'b': 2, 'c': 'loop'}
        warn_if_reserved(myvars)
        self.assertEqual(len(display.messages), 1)

    def test_warn_if_reserved_additional_reserved_name(self):
        myvars = {'a': 1, 'b': 2, 'c': 'with_'}
        warn_if_reserved(myvars, additional={'with_'})
        self.assertEqual(len(display.messages), 1)

class TestIsReservedName(unittest.TestCase):
    def test_is_reserved_name(self):
        self.assertTrue(is_reserved_name('a'))
        self.assertFalse(is_reserved_name('b'))

    def test_is_reserved_name_reserved_name(self):
        self.assertTrue(is_reserved_name('loop'))
        self.assertTrue(is_reserved_name('with_'))

    def test_is_reserved_name_not_reserved_name(self):
        self.assertFalse(is_reserved_name('not_reserved'))

if __name__ == '__main__':
    unittest.main()