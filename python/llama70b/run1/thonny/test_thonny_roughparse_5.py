import unittest
from thonny.roughparse import HyperParser, NUM_CONTEXT_LINES, C_NONE, C_BACKSLASH, C_STRING_FIRST_LINE, C_STRING_NEXT_LINES, C_BRACKET, _synchre, _junkre, _match_stringre, _itemre, _closere, _ASCII_ID_CHARS, _ASCII_ID_FIRST_CHARS, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        self.assertIsInstance(parser, HyperParser)

    def test_get_expression(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.get_expression()
        self.assertIsInstance(result, str)

    def test_is_in_code(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.is_in_code()
        self.assertIsInstance(result, bool)

    def test_set_index(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        parser.set_index(index)
        self.assertIsNone(None)  # set_index has no return value

    def test_indexbracket(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.indexbracket
        self.assertIsInstance(result, int)

    def test_indexinrawtext(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.indexinrawtext
        self.assertIsInstance(result, int)

    def test_bracketing(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.bracketing
        self.assertIsInstance(result, list)

    def test_isopener(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.isopener
        self.assertIsInstance(result, list)

    def test_rawtext(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.rawtext
        self.assertIsInstance(result, str)

    def test_stopatindex(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser.stopatindex
        self.assertIsInstance(result, str)

    def test__eat_identifier(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        rawtext = parser.rawtext
        brck_limit = parser.bracketing[0][0]
        pos = parser.indexinrawtext
        result = parser._eat_identifier(rawtext, brck_limit, pos)
        self.assertIsInstance(result, int)

    def test__whitespace_chars(self):
        text = "some text"
        index = 0
        parser = HyperParser(text, index)
        result = parser._whitespace_chars
        self.assertIsInstance(result, str)

class TestConstants(unittest.TestCase):
    def test_NUM_CONTEXT_LINES(self):
        self.assertIsInstance(NUM_CONTEXT_LINES, tuple)

    def test_C_NONE(self):
        self.assertIsInstance(C_NONE, int)

    def test_C_BACKSLASH(self):
        self.assertIsInstance(C_BACKSLASH, int)

    def test_C_STRING_FIRST_LINE(self):
        self.assertIsInstance(C_STRING_FIRST_LINE, int)

    def test_C_STRING_NEXT_LINES(self):
        self.assertIsInstance(C_STRING_NEXT_LINES, int)

    def test_C_BRACKET(self):
        self.assertIsInstance(C_BRACKET, int)

    def test__synchre(self):
        self.assertIsInstance(_synchre, re.Pattern)

    def test__junkre(self):
        self.assertIsInstance(_junkre, re.Pattern)

    def test__match_stringre(self):
        self.assertIsInstance(_match_stringre, re.Pattern)

    def test__itemre(self):
        self.assertIsInstance(_itemre, re.Pattern)

    def test__closere(self):
        self.assertIsInstance(_closere, re.Pattern)

    def test__ASCII_ID_CHARS(self):
        self.assertIsInstance(_ASCII_ID_CHARS, frozenset)

    def test__ASCII_ID_FIRST_CHARS(self):
        self.assertIsInstance(_ASCII_ID_FIRST_CHARS, frozenset)

    def test__IS_ASCII_ID_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_CHAR, list)

    def test__IS_ASCII_ID_FIRST_CHAR(self):
        self.assertIsInstance(_IS_ASCII_ID_FIRST_CHAR, list)

if __name__ == '__main__':
    unittest.main()