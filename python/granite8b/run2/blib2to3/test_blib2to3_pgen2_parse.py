import unittest
from blib2to3.pgen2.parse import Parser, ParseError


class TestParser(unittest.TestCase):
    def test_addtoken(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup(start='2017-01-01')
        parser.addtoken(token.NAME, "foo", object())
        parser.addtoken(token.NAME, "bar", object())
        parser.addtoken(token.NAME, "baz", object())
        self.assertEqual(parser.rootnode.type, token.NAME)
        self.assertEqual(parser.rootnode.value, "foo")
        self.assertEqual(parser.rootnode.children[0].type, token.NAME)
        self.assertEqual(parser.rootnode.children[0].value, "bar")
        self.assertEqual(parser.rootnode.children[1].type, token.NAME)
        self.assertEqual(parser.rootnode.children[1].value, "baz")

    def test_classify(self):
        grammar = object()
        parser = Parser(grammar)
        self.assertEqual(parser.classify(token.NAME, "foo", object()), NAME)
        self.assertEqual(parser.classify(token.NAME, "bar", object()), 258)
        self.assertEqual(parser.classify(token.NUMBER, "123", object()), 259)
        self.assertEqual(parser.classify(token.STRING, '"foo"', object()), 260)

    def test_shift(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup(start='2017-01-01', end='2017-12-31')
        parser.shift(token.NAME, "foo", 0, object())
        self.assertEqual(parser.rootnode.type, token.NAME)
        self.assertEqual(parser.rootnode.value, "foo")

    def test_push(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup(start='2017-01-01')
        parser.push(token.LPAR, object(), 0, object())
        self.assertEqual(len(parser.stack), 2)
        self.assertEqual(parser.stack[0][0], object())
        self.assertEqual(parser.stack[0][1], 0)
        self.assertEqual(parser.stack[0][2].type, token.LPAR)
        self.assertEqual(parser.stack[1][0], object())
        self.assertEqual(parser.stack[1][1], 0)
        self.assertEqual(parser.stack[1][2].type, token.NAME)

    def test_pop(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup()
        parser.push(token.LPAR, object(), 0, object())
        parser.push(token.NAME, "foo", 0, object())
        parser.pop()
        self.assertEqual(len(parser.stack), 1)
        self.assertEqual(parser.stack[0][0], object())
        self.assertEqual(parser.stack[0][1], 0)
        self.assertEqual(parser.stack[0][2].type, token.NAME)
        self.assertEqual(parser.rootnode.type, token.NAME)
        self.assertEqual(parser.rootnode.value, "foo")


if __name__ == '__main__':
    unittest.main()