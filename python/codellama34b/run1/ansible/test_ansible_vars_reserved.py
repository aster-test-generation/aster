import unittest
from ansible.vars.reserved import *


class TestGetReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        result = get_reserved_names()
        self.assertIsInstance(result, frozenset)

    def test_get_reserved_names_include_private(self):
        result = get_reserved_names(include_private=True)
        self.assertIsInstance(result, frozenset)

    def test_get_reserved_names_not_include_private(self):
        result = get_reserved_names(include_private=False)
        self.assertIsInstance(result, frozenset)

class TestWarnIfReserved(unittest.TestCase):
    def test_warn_if_reserved(self):
        myvars = {'var1': 1, 'var2': 2}
        additional = {'var3': 3}
        result = warn_if_reserved(myvars, additional)
        self.assertIsNone(result)

    def test_warn_if_reserved_no_additional(self):
        myvars = {'var1': 1, 'var2': 2}
        result = warn_if_reserved(myvars)
        self.assertIsNone(result)

class TestIsReservedName(unittest.TestCase):
    def test_is_reserved_name(self):
        name = 'name'
        result = is_reserved_name(name)
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()