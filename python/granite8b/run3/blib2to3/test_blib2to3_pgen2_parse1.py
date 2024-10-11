import unittest
from blib2to3.pgen2.parse import Parser, ParseError

class TestParser(unittest.TestCase):
    def test_addtoken(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup()
        parser.addtoken(1, "value", object())

    def test_classify(self):
        grammar = object()
        parser = Parser(grammar)
        parser.classify(1, "value", object())

    def test_shift(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup()
        parser.shift(1, "value", 0, object())

    def test_push(self):
        grammar = object()
        parser = Parser(grammar)
        parser.setup()
        parser.push(1, object(), 0, object())

    def test_pop(self):
        grammar = object()
        parser = Parser(grammar)
        parser.setup()
        parser.pop()

class TestParseError(unittest.TestCase):
    def test_init(self):
        ParseError("msg", 1, "value", object())

if __name__ == '__main__':
    unittest.main()