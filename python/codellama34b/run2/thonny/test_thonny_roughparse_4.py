import unittest
from thonny.roughparse import *


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        text = ""
        index = 0
        parser = HyperParser(text, index)
        self.assertEqual(parser.text, text)
        self.assertEqual(parser.stopatindex, stopatindex)
        self.assertEqual(parser.bracketing, bracketing)
        self.assertEqual(parser.isopener, isopener)
        self.assertEqual(parser.indexinrawtext, indexinrawtext)
        self.assertEqual(parser.indexbracket, indexbracket)

    def test_set_index(self):
        indexinrawtext = 0
        indexbracket = 0
        parser = HyperParser(text, index)
        parser.set_index(index)
        self.assertEqual(parser.indexinrawtext, indexinrawtext)
        self.assertEqual(parser.indexbracket, indexbracket)

    def test_is_in_string(self):
        parser = HyperParser(text, index)
        result = parser.is_in_string()
        self.assertEqual(result, is_in_string)

    def test_is_in_code(self):
        parser = HyperParser(text, index)
        result = parser.is_in_code()
        self.assertEqual(result, is_in_code)

    def test_get_surrounding_brackets(self):
        openers = '([{'
        mustclose = False
        parser = HyperParser(text, index)
        result = parser.get_surrounding_brackets(openers, mustclose)
        self.assertEqual(result, surrounding_brackets)

    def test_eat_identifier(self):
        s = ""
        limit = 0
        pos = 0
        result = HyperParser._eat_identifier(s, limit, pos)
        self.assertEqual(result, pos)

if __name__ == '__main__':
    unittest.main()