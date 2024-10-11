from ansible.vars.reserved import display
import unittest
from ansible.playbook import Play
from ansible.playbook.block import Block
from ansible.playbook.role import Role
from ansible.playbook.task import Task
from ansible.vars.reserved import get_reserved_names, warn_if_reserved, is_reserved_name


class TestGetReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        result = get_reserved_names()
        self.assertIsInstance(result, set)

    def test_get_reserved_names_private(self):
        result = get_reserved_names(include_private=True)
        self.assertIsInstance(result, set)

class TestWarnIfReserved(unittest.TestCase):
    def test_warn_if_reserved(self):
        myvars = {'play': 'play'}
        warn_if_reserved(myvars)
        self.assertEqual(display.warning.call_count, 0)

    def test_warn_if_reserved_reserved_name(self):
        myvars = {'play': 'play'}
        warn_if_reserved(myvars, additional={'play'})
        self.assertEqual(display.warning.call_count, 1)

class TestIsReservedName(unittest.TestCase):
    def test_is_reserved_name(self):
        self.assertTrue(is_reserved_name('play'))

    def test_is_not_reserved_name(self):
        self.assertFalse(is_reserved_name('not_reserved'))

if __name__ == '__main__':
    unittest.main()