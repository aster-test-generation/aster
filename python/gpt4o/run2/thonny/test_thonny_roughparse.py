import unittest
from thonny.roughparse import *
from thonny.roughparse import _is_char_in_string, _build_char_in_string_func


class TestRoughParse(unittest.TestCase):
    def test_synchre(self):
        result = _synchre("    def test():\n        pass")
        self.assertIsNotNone(result)

    def test_junkre(self):
        result = _junkre("_junkre", "    # This is a comment")
        self.assertIsNotNone(result)

    def test_match_stringre(self):
        result = _match_string_re('    "This is a string"')
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
        result = is_char_in_string(0)
        self.assertEqual(result, 1)

    def test_build_char_in_string_func(self):
        func = self._build_char_in_string_func(0)
        result = func(1)
        self.assertEqual(result, 1)

class TestRoughParse(unittest.TestCase):
    def test_is_char_in_string(self):
        result = _is_char_in_string(0)
        self.assertEqual(result, 1)

    def test_build_char_in_string_func(self):
        func = _build_char_in_string_func(10)
        result = func(5)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()