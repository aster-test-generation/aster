import unittest
from thonny.roughparse import *


class TestConstants(unittest.TestCase):
    def test_NUM_CONTEXT_LINES(self):
        self.assertEqual(NUM_CONTEXT_LINES, (50, 500, 5000000))

    def test_C_NONE(self):
        self.assertEqual(C_NONE, 0)

    def test_C_BACKSLASH(self):
        self.assertEqual(C_BACKSLASH, 1)

    def test_C_STRING_FIRST_LINE(self):
        self.assertEqual(C_STRING_FIRST_LINE, 2)

    def test_C_STRING_NEXT_LINES(self):
        self.assertEqual(C_STRING_NEXT_LINES, 3)

    def test_C_BRACKET(self):
        self.assertEqual(C_BRACKET, 4)

class TestRegexPatterns(unittest.TestCase):
    def test_synchre(self):
        self.assertIsInstance(_synchre, re.Pattern)

    def test_junkre(self):
        self.assertIsInstance(_junkre, re.Pattern)

    def test_match_stringre(self):
        self.assertIsInstance(_match_stringre, re.Pattern)

    def test_itemre(self):
        self.assertIsInstance(_itemre, re.Pattern)

    def test_closere(self):
        self.assertIsInstance(_closere, re.Pattern)

    def test_chew_ordinaryre(self):
        self.assertIsInstance(_chew_ordinaryre, re.Pattern)

class TestASCIIIDChars(unittest.TestCase):
    def test_ASCII_ID_CHARS(self):
        self.assertIsInstance(_ASCII_ID_CHARS, frozenset)

    def test_ASCII_ID_FIRST_CHARS(self):
        self.assertIsInstance(_ASCII_ID_FIRST_CHARS, frozenset)

    def test_IS_ASCII_ID_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_CHAR, list)

    def test_IS_ASCII_ID_FIRST_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_FIRST_CHAR, list)

class TestFunctions(unittest.TestCase):
    def test_is_char_in_string(self):
        self.assertEqual(_is_char_in_string(0), 1)

    def test_build_char_in_string_func(self):
        func = _build_char_in_string_func(0)
        self.assertEqual(func(1), 1)

if __name__ == '__main__':
    unittest.main()