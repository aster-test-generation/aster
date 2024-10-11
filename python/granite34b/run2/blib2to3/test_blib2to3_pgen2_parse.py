import unittest
from blib2to3.pgen2.parse import *


class TestParser(unittest.TestCase):
    def test_init(self):
        parser = Parser(Grammar())
        self.assertIsInstance(parser, Parser)

    def test_setup(self):
        parser = Parser(Grammar())
        parser.setup()
        self.assertIsNone(parser.rootnode)

    def test_addtoken(self):
        parser = Parser(Grammar())
        parser.setup()
        parser.addtoken(1, "token", Context())

    def test_classify(self):
        parser = Parser(Grammar())
        parser.setup()
        parser.classify(1, "token", Context())

    def test_shift(self):
        parser = Parser(Grammar())
        parser.setup()
        parser.shift(1, "token", 2, Context())

    def test_push(self):
        parser = Parser(Grammar())
        parser.setup()
        parser.push(1, (DFA, Dict[int, int]), 2, Context())

    def test_pop(self):
        parser = Parser(Grammar())
        parser.setup()
        parser.pop()

if __name__ == '__main__':
    unittest.main()