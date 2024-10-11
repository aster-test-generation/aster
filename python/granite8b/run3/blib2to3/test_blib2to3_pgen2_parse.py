import token
import unittest
from blib2to3.pgen2.parse import Parser
from blib2to3.pgen2.parse import Parser, ParseError


class TestParser(unittest.TestCase):
    def test_setup(self):
        parser = Parser(None)
        parser.setup()
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        parser = Parser(None)
        parser.setup()
        self.assertFalse(parser.addtoken(token.NAME, "foo", None))
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_classify(self):
        parser = Parser(None)
        self.assertEqual(parser.classify(token.NAME, "foo", None), 256)
        self.assertEqual(parser.classify(token.NUMBER, "123", None), 258)
        self.assertEqual(parser.classify(token.OP, "+", None), 259)
        self.assertEqual(parser.classify(token.ERRORTOKEN, "!", None), 260)

    def test_shift(self):
        parser = Parser(None)
        parser.setup()
        parser.shift(token.NAME, "foo", 0, None)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_push(self):
        parser = Parser(None)
        parser.setup()
        parser.push(token.NAME, None, 0, None)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_pop(self):
        parser = Parser(None)
        parser.setup()
        parser.pop()
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

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