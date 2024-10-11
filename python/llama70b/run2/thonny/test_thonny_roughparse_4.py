import unittest
from thonny.roughparse import HyperParser, _synchre, _junkre, _match_stringre, _itemre, _closere, _ASCII_ID_CHARS, _ASCII_ID_FIRST_CHARS, _IS_ASCII_ID_CHAR, _IS_ASCII_ID_FIRST_CHAR


class TestHyperParser(unittest.TestCase):
    def test___init__(self):
        text = "some sample text"
        index = 10
        hp = HyperParser(text, index)
        self.assertIsNotNone(hp.rawtext)
        self.assertIsNotNone(hp.stopatindex)
        self.assertIsNotNone(hp.bracketing)
        self.assertIsNotNone(hp.isopener)

    def test_set_index(self):
        text = "some sample text"
        index = 10
        hp = HyperParser(text, index)
        hp.set_index(20)
        self.assertEqual(hp.indexinrawtext, 10)
        self.assertEqual(hp.indexbracket, 1)

    def test_is_in_string(self):
        text = "some sample text"
        index = 10
        hp = HyperParser(text, index)
        hp.rawtext = '"hello"'
        hp.bracketing = [(0, 1), (5, 1)]
        hp.isopener = [True, False]
        self.assertTrue(hp.is_in_string())

    def test_is_in_code(self):
        text = "some sample text"
        index = 10
        hp = HyperParser(text, index)
        hp.rawtext = 'print("hello")'
        hp.bracketing = [(0, 1), (5, 1)]
        hp.isopener = [True, False]
        self.assertTrue(hp.is_in_code())

    def test_get_surrounding_brackets(self):
        text = "some sample text"
        index = 10
        hp = HyperParser(text, index)
        hp.rawtext = '(hello)'
        hp.bracketing = [(0, 1), (5, 1)]
        hp.isopener = [True, False]
        self.assertEqual(hp.get_surrounding_brackets(openers='([{'), ('10-5c', '10-1c'))

    def test__eat_identifier(self):
        cls = HyperParser
        s = "hello_world"
        limit = 0
        pos = 11
        self.assertEqual(cls._eat_identifier(s, limit, pos), 11 - 5)

class TestRegexPatterns(unittest.TestCase):
    def test_synchre(self):
        self.assertIsNotNone(_synchre("some sample text"))

    def test_junkre(self):
        self.assertIsNotNone(_junkre("some sample text"))

    def test_match_stringre(self):
        self.assertIsNotNone(_match_stringre("some sample text"))

    def test_itemre(self):
        self.assertIsNotNone(_itemre("some sample text"))

    def test_closere(self):
        self.assertIsNotNone(_closere("some sample text"))

if __name__ == '__main__':
    unittest.main()