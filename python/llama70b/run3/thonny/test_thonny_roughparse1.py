import unittest
from thonny.roughparse import HyperParser, NUM_CONTEXT_LINES, _synchre, _junkre, _match_stringre, _itemre, _closere, _ASCII_ID_CHARS, _ASCII_ID_FIRST_CHARS, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR

class TestHyperParser(unittest.TestCase):
    def test___init__(self):
        text = "some text"
        index = 10
        hp = HyperParser(text, index)
        self.assertIsNotNone(hp.text)
        self.assertIsNotNone(hp.rawtext)
        self.assertIsNotNone(hp.stopatindex)
        self.assertIsNotNone(hp.bracketing)
        self.assertIsNotNone(hp.isopener)

    def test_set_index(self):
        text = "some text"
        index = 10
        hp = HyperParser(text, index)
        hp.set_index(index)
        self.assertIsNotNone(hp.indexinrawtext)
        self.assertIsNotNone(hp.indexbracket)

    def test_is_in_string(self):
        text = "some text"
        index = 10
        hp = HyperParser(text, index)
        result = hp.is_in_string()
        self.assertIsInstance(result, bool)

    def test_is_in_code(self):
        text = "some text"
        index = 10
        hp = HyperParser(text, index)
        result = hp.is_in_code()
        self.assertIsInstance(result, bool)

    def test_get_surrounding_brackets(self):
        text = "some text"
        index = 10
        hp = HyperParser(text, index)
        result = hp.get_surrounding_brackets()
        self.assertIsInstance(result, tuple)

    def test__eat_identifier(self):
        s = "some string"
        limit = 5
        pos = 10
        result = HyperParser._eat_identifier(s, limit, pos)
        self.assertIsInstance(result, int)

class TestRegexPatterns(unittest.TestCase):
    def test_synchre(self):
        result = _synchre("some text")
        self.assertIsNotNone(result)

    def test_junkre(self):
        result = _junkre("some text")
        self.assertIsNotNone(result)

    def test_match_stringre(self):
        result = _match_stringre("some text")
        self.assertIsNotNone(result)

    def test_itemre(self):
        result = _itemre("some text")
        self.assertIsNotNone(result)

    def test_closere(self):
        result = _closere("some text")
        self.assertIsNotNone(result)

class TestConstants(unittest.TestCase):
    def test_NUM_CONTEXT_LINES(self):
        self.assertIsInstance(NUM_CONTEXT_LINES, tuple)

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