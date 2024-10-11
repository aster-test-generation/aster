import unittest
from thonny.roughparse import *


class TestRoughParse(unittest.TestCase):
    def test_synchre(self):
        result = _synchre.search("    while\n    ")
        self.assertIsNotNone(result)

    def test_junkre(self):
        result = _junkre.search("    ")
        self.assertIsNotNone(result)

    def test_match_stringre(self):
        result = _match_stringre.match('"hello"')
        self.assertIsNotNone(result)

    def test_itemre(self):
        result = _itemre.match("    x = 1")
        self.assertIsNotNone(result)

    def test_closere(self):
        result = _closere.match("    return")
        self.assertIsNotNone(result)

    def test_chew_ordinaryre(self):
        result = _chew_ordinaryre.search("    x = 1")
        self.assertIsNotNone(result)

    def test_is_char_in_string(self):
        result = _is_char_in_string(0)
        self.assertEqual(result, 1)

    def test_build_char_in_string_func(self):
        func = _build_char_in_string_func(0)
        result = func(1)
        self.assertEqual(result, 1)

    def test_ASCII_ID_CHARS(self):
        self.assertIsInstance(_ASCII_ID_CHARS, frozenset)

    def test_ASCII_ID_FIRST_CHARS(self):
        self.assertIsInstance(_ASCII_ID_FIRST_CHARS, frozenset)

    def test_IS_ASCII_ID_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_CHAR, list)

    def test_IS_ASCII_ID_FIRST_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_FIRST_CHAR, list)

if __name__ == '__main__':
    unittest.main()