import unittest
from thonny.roughparse import HyperParser, _synchre, _junkre, _match_stringre, _itemre, _closere, _ASCII_ID_CHARS, _ASCII_ID_FIRST_CHARS, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR


class TestHyperParser(unittest.TestCase):
    def test___init__(self):
        text = "some sample text"
        index = 10
        parser = HyperParser(text, index)
        self.assertIsInstance(parser, HyperParser)

    def test_set_index(self):
        text = "some sample text"
        index = 10
        parser = HyperParser(text, index)
        parser.set_index(20)
        self.assertEqual(parser.indexinrawtext, 20)

    def test_is_in_string(self):
        text = "some sample text"
        index = 10
        parser = HyperParser(text, index)
        self.assertFalse(parser.is_in_string())

    def test_is_in_code(self):
        text = "some sample text"
        index = 10
        parser = HyperParser(text, index)
        self.assertTrue(parser.is_in_code())

    def test_get_surrounding_brackets(self):
        text = "some sample text"
        index = 10
        parser = HyperParser(text, index)
        self.assertIsNone(parser.get_surrounding_brackets())

    def test__eat_identifier(self):
        s = "some sample text"
        limit = 10
        pos = 15
        result = HyperParser._eat_identifier(s, limit, pos)
        self.assertEqual(result, 10)

class TestRegexPatterns(unittest.TestCase):
    def test_synchre(self):
        text = "some sample text\n    while True:\n        pass"
        match = _synchre(text)
        self.assertIsNotNone(match)

    def test_junkre(self):
        text = "some sample junk text"
        match = _junkre(text)
        self.assertIsNotNone(match)

    def test_match_stringre(self):
        text = "some sample string text"
        match = _match_stringre(text)
        self.assertIsNotNone(match)

    def test_itemre(self):
        text = "some sample item text"
        match = _itemre(text)
        self.assertIsNotNone(match)

    def test_closere(self):
        text = "some sample close text\n    return"
        match = _closere(text)
        self.assertIsNotNone(match)

if __name__ == '__main__':
    unittest.main()