import unittest
from thonny.roughparse import _is_char_in_string, _build_char_in_string_func, _synchre, _junkre, _match_stringre, _itemre, _closere, _chew_ordinaryre


class TestRoughParse(unittest.TestCase):
    def test_is_char_in_string(self):
        result = _is_char_in_string(0)
        self.assertEqual(result, 1)

    def test_build_char_in_string_func(self):
        func = _build_char_in_string_func(10)
        result = func("5")
        self.assertEqual(result, 1)

    def test_synchre(self):
        result = _synchre("    def test():\n        pass")
        self.assertIsNotNone(result)

    def test_junkre(self):
        result = _junkre("    # This is a comment")
        self.assertIsNotNone(result)

    def test_match_stringre(self):
        result = _match_stringre('    "This is a string"')
        self.assertIsNotNone(result)

    def test_itemre(self):
        result = _itemre("    item")
        self.assertIsNotNone(result)

    def test_closere(self):
        result = _closere("    return")
        self.assertIsNotNone(result)

    def test_chew_ordinaryre(self):
        result = _chew_ordinaryre("    ordinary text")
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()