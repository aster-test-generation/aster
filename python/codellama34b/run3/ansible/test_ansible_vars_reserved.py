import unittest
from ansible.vars.reserved import *


class TestGetReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        result = get_reserved_names()
        self.assertIsInstance(result, set)

    def test_get_reserved_names_include_private(self):
        result = get_reserved_names(include_private=True)
        self.assertIsInstance(result, set)

    def test_get_reserved_names_not_include_private(self):
        result = get_reserved_names(include_private=False)
        self.assertIsInstance(result, set)

class TestWarnIfReserved(unittest.TestCase):
    def test_warn_if_reserved(self):
        myvars = {}
        additional = None
        result = warn_if_reserved(myvars, additional)
        self.assertIsNone(result)

    def test_warn_if_reserved_additional(self):
        myvars = {}
        additional = set()
        result = warn_if_reserved(myvars, additional)
        self.assertIsNone(result)

class TestIsReservedName(unittest.TestCase):
    def test_is_reserved_name(self):
        name = ''
        result = is_reserved_name(name)
        self.assertFalse(result)

    def test_is_reserved_name_name(self):
        name = 'name'
        result = is_reserved_name(name)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()