import unittest
from blib2to3.pgen2.parse import Parser, ParseError, Grammar, token, NL, Context, RawNode, Leaf, Node
from blib2to3.pgen2.grammar import DFA, DFAS
from lib2to3.pytree import PyNode, Pkg, Leaf 


class TestParser(unittest.TestCase):
    def test_init(self):
        grammar = Grammar()
        parser = Parser(grammar)
        self.assertEqual(parser.grammar, grammar)
        self.assertEqual(parser.convert, Parser.lam_sub)

    def test_setup(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 0, (grammar.start, None, None, []))])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.addtoken(token.NAME, 'test', Context())
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 0, (grammar.start, None, None, [('test',)]))])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, {'test'})

    def test_classify(self):
        grammar = Grammar()
        parser = Parser(grammar)
        self.assertEqual(parser.classify(token.NAME, 'test', Context()), grammar.tokens[token.NAME])
        self.assertEqual(parser.classify(token.NAME, None, Context()), None)
        self.assertEqual(parser.classify(256, 'test', Context()), grammar.dfas[256][0][0][1])

    def test_shift(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.shift(token.NAME, 'test', 1, Context())
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 1, (grammar.start, None, None, [('test',)]))])

    def test_push(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.push(256, grammar.dfas[256], 1, Context())
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 1, (grammar.start, None, None, [])), (grammar.dfas[256], 0, (256, None, Context(), []))])

    def test_pop(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.push(256, grammar.dfas[256], 1, Context())
        parser.pop()
        self.assertEqual(parser.stack, [(grammar.dfas[grammar.start], 1, (grammar.start, None, None, []))])

    def test_parse_error(self):
        grammar = Grammar()
        parser = Parser(grammar)
        with self.assertRaises(ParseError):
            parser.addtoken(token.NAME, 'test', Context())

    def test_str(self):
        grammar = Grammar()
        parser = Parser(grammar)
        self.assertEqual(str(parser), 'Parser')

    def test_repr(self):
        grammar = Grammar()
        parser = Parser(grammar)
        self.assertEqual(repr(parser), 'Parser(grammar=Grammar())')

    def test_eq(self):
        grammar1 = Grammar()
        grammar2 = Grammar()
        parser1 = Parser(grammar1)
        parser2 = Parser(grammar2)
        self.assertEqual(parser1, parser2)
        self.assertNotEqual(parser1, object())

if __name__ == '__main__':
    unittest.main()