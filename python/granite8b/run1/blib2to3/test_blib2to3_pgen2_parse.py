import unittest
from blib2to3.pgen2.parse import Parser, ParseError


class TestParser(unittest.TestCase):
    def test_setup(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup()
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 0, (grammar.start, None, None, []))])
        self.assertIsNone(parser.rootnode)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup()
        with self.assertRaises(ParseError):
            parser.addtoken(token.NAME, "foo", object())

    def test_classify(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        self.assertEqual(parser.classify(token.NAME, "foo", object()), NAME)
        self.assertEqual(parser.classify(token.NUMBER, "123", object()), 258)
        self.assertEqual(parser.classify(token.OP, "+", object()), 259)
        self.assertEqual(parser.classify(token.ERRORTOKEN, "!", object()), 260)

    def test_shift(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup()
        parser.shift(token.NAME, "foo", 0, object())
        self.assertEqual(parser.stack, [
            (grammar.dfas[grammar.start], 0, (grammar.start, None, None, [
                (token.NAME, "foo", object(), None)
            ]))
        ])

    def test_push(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup(start='2017-01-01')
        parser.push(token.LPAR, grammar.dfas[token.LPAR], 0, object())
        self.assertEqual(parser.stack, [
            (grammar.dfas[grammar.start], 0, (grammar.start, None, None, [])),
            (grammar.dfas[token.LPAR], 0, (token.LPAR, None, object(), None))
        ])

    def test_pop(self):
        grammar = object()
        convert = object()
        parser = Parser(grammar, convert)
        parser.setup(start='2018-01-01', end='2018-01-02')
        parser.pop()
        self.assertEqual(parser.stack, [])
        self.assertIsNotNone(parser.rootnode)


if __name__ == '__main__':
    unittest.main()