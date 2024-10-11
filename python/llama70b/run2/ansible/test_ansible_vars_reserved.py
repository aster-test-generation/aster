import unittest
from ansible.vars import reserved


class TestGetReservedNames(unittest.TestCase):
    def test_get_reserved_names(self):
        result = reserved.get_reserved_names()
        self.assertIsInstance(result, set)

    def test_get_reserved_names_include_private(self):
        result = reserved.get_reserved_names(include_private=True)
        self.assertIsInstance(result, set)

class TestWarnIfReserved(unittest.TestCase):
    def test_warn_if_reserved(self):
        myvars = {'foo': 'bar', 'reserved_name': 'baz'}
        with unittest.mock.patch.object(reserved.display, 'warning') as mock_warning:
            reserved.warn_if_reserved(myvars)
            mock_warning.assert_called_once_with('Found variable using reserved name: reserved_name')

    def test_warn_if_reserved_additional(self):
        myvars = {'foo': 'bar', 'additional_reserved_name': 'baz'}
        additional = {'additional_reserved_name'}
        with unittest.mock.patch.object(reserved.display, 'warning') as mock_warning:
            reserved.warn_if_reserved(myvars, additional=additional)
            mock_warning.assert_called_once_with('Found variable using reserved name: additional_reserved_name')

class TestIsReservedName(unittest.TestCase):
    def test_is_reserved_name(self):
        result = reserved.is_reserved_name('reserved_name')
        self.assertTrue(result)

    def test_is_reserved_name_not_reserved(self):
        result = reserved.is_reserved_name('not_reserved_name')
        self.assertFalse(result)

class TestRESERVED_NAMES(unittest.TestCase):
    def test_RESERVED_NAMES(self):
        result = reserved._RESERVED_NAMES
        self.assertIsInstance(result, frozenset)

if __name__ == '__main__':
    unittest.main()