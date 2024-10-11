import unittest
from blib2to3.pgen2.parse import Parser, ParseError, lam_sub


class TestParser(unittest.TestCase):
    def test_init(self):
        grammar = object()
        parser = Parser(grammar)
        self.assertEqual(parser.grammar, grammar)
        self.assertEqual(parser.convert, lam_sub)

    def test_setup(self):
        grammar = object()
        parser = Parser(grammar)
        parser.setup()
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 0, (grammar.start, None, None, []))])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        grammar = object()
        parser = Parser(grammar)
        parser.setup()
        parser.addtoken(1, 'value', object())
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 0, (1, 'value', object(), []))])
        parser.addtoken(2, 'value', object())
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 0, [(1, 'value', object(), []), (2, 'value', object(), [])])])

    def test_classify(self):
        grammar = object()
        parser = Parser(grammar)
        self.assertEqual(parser.classify(1, 'value', object()), 1)
        self.assertEqual(parser.classify(token.NAME, 'value', object()), 2)

    def test_shift(self):
        grammar = object()
        parser = Parser(grammar)
        parser.setup()
        parser.shift(1, 'value', 2, object())
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 2, [(1, 'value', object(), [])])])

    def test_push(self):
        grammar = object()
        parser = Parser(grammar)
        parser.setup()
        parser.push(1, grammar.dfas[1], 2, object())
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 2, [(1, 'value', object(), [])]), (grammar.dfas[1], 0, (1, None, object(), []))])

    def test_pop(self):
        grammar = object()
        parser = Parser(grammar)
        parser.setup()
        parser.push(1, grammar.dfas[1], 2, object())
        parser.pop()
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 2, [(1, 'value', object(), [])])])

    def test_parse_error(self):
        grammar = object()
        parser = Parser(grammar)
        with self.assertRaises(ParseError):
            parser.addtoken(1, 'value', object())

    def test_str(self):
        grammar = object()
        parser = Parser(grammar)
        self.assertEqual(str(parser), 'Parser')

    def test_repr(self):
        grammar = object()
        parser = Parser(grammar)
        self.assertEqual(repr(parser), 'Parser(grammar)')

    def test_eq(self):
        grammar1 = object()
        grammar2 = object()
        parser1 = Parser(grammar1)
        parser2 = Parser(grammar2)
        self.assertNotEqual(parser1, parser2)
        self.assertEqual(parser1, parser1)

if __name__ == '__main__':
    unittest.main()