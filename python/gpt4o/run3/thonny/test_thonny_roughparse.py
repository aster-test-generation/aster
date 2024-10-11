import unittest
from thonny.roughparse import *


class TestRoughParse(unittest.TestCase):
    def test_synchre(self):
        result = _synchre("    def test():\n        pass")
        self.assertIsNotNone(result)

    def test_junkre(self):
        result = _junkre("_junkre", "    # This is a comment")
        self.assertIsNotNone(result)

    def test_match_stringre(self):
        result = _match_string_re('"""This is a docstring"""')
        self.assertIsNotNone(result)

    def test_itemre(self):
        result = re.compile(r"    item = 1")
        self.assertIsNotNone(result)

    def test_closere(self):
        result = _close_re("    return")
        self.assertIsNotNone(result)

    def test_chew_ordinaryre(self):
        result = _chew_ordinary_re("    ordinary text")
        self.assertIsNotNone(result)

    def test_is_char_in_string(self):
        result = _is_char_in_string('0')
        self.assertEqual(result, 1)

    def test_build_char_in_string_func(self):
        func = self._build_char_in_string_func(0)
        result = func(5)
        self.assertEqual(result, 1)

    def test_ascii_id_chars(self):
        self.assertIn('a', string.ascii_letters)
        self.assertIn('1', _ASCII_ID_CHARS)
        self.assertIn('_', _ASCII_ID_CHARS)

    def test_ascii_id_first_chars(self):
        self.assertIn('a', string.ascii_letters)
        self.assertNotIn('1', _ASCII_ID_FIRST_CHARS)
        self.assertIn('_', _ASCII_ID_FIRST_CHARS)

    def test_is_ascii_id_char(self):
        self.assertTrue(_is_ascii_id_char[ord('a')])
        self.assertTrue(_IS_ASCII_ID_CHAR[ord('1')])
        self.assertTrue(_IS_ASCII_ID_CHAR[ord('_')])
        self.assertFalse(_IS_ASCII_ID_CHAR[ord(' ')])
        
    def test_is_ascii_id_first_char(self):
        self.assertTrue(_is_ascii_id_first_char[ord('a')])
        self.assertFalse(_IS_ASCII_ID_FIRST_CHAR[ord('1')])
        self.assertTrue(_IS_ASCII_ID_FIRST_CHAR[ord('_')])
        self.assertFalse(_IS_ASCII_ID_FIRST_CHAR[ord(' ')])

if __name__ == '__main__':
    unittest.main()