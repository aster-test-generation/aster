import unittest
from blib2to3.pgen2.parse import ParseError, Parser, lam_sub
from blib2to3.pgen2.grammar import Grammar
from blib2to3.pytree import Context, Node, Leaf

class TestLamSub(unittest.TestCase):
    def test_lam_sub(self):
        grammar = Grammar()
        node = (1, None, None, [Leaf(1, 'a')])
        result = lam_sub(grammar, node)
        self.assertIsInstance(result, Node)
        self.assertEqual(result.type, 1)
        self.assertEqual(result.children, [Leaf(1, 'a')])

class TestParseError(unittest.TestCase):
    def test_parse_error_init(self):
        context = Context()
        error = ParseError("error message", 1, "value", context)
        self.assertEqual(error.msg, "error message")
        self.assertEqual(error.type, 1)
        self.assertEqual(error.value, "value")
        self.assertEqual(error.context, context)

class TestParser(unittest.TestCase):
    def setUp(self):
        self.grammar = Grammar()
        self.parser = Parser(self.grammar)

    def test_parser_init(self):
        self.assertEqual(self.parser.grammar, self.grammar)
        self.assertEqual(self.parser.convert, lam_sub)

    def test_setup(self):
        self.parser.setup()
        self.assertEqual(len(self.parser.stack), 1)
        self.assertIsNone(self.parser.rootnode)
        self.assertEqual(self.parser.used_names, set())

    def test_addtoken(self):
        self.parser.setup()
        context = Context()
        with self.assertRaises(ParseError):
            self.parser.addtoken(1, "value", context)

    def test_classify(self):
        context = Context()
        with self.assertRaises(ParseError):
            self.parser.classify(1, "value", context)

    def test_shift(self):
        self.parser.setup()
        context = Context()
        self.parser.stack[-1] = (self.grammar.dfas[0], 0, (0, None, None, []))
        with self.assertRaises(AssertionError):
            self.parser.shift(1, None, 0, context)

    def test_push(self):
        self.parser.setup()
        context = Context()
        self.parser.stack[-1] = (self.grammar.dfas[0], 0, (0, None, None, []))
        self.parser.push(1, self.grammar.dfas[0], 0, context)
        self.assertEqual(len(self.parser.stack), 2)

    def test_pop(self):
        self.parser.setup()
        context = Context()
        self.parser.stack[-1] = (self.grammar.dfas[0], 0, (0, None, None, []))
        self.parser.pop()
        self.assertIsNone(self.parser.rootnode)

if __name__ == '__main__':
    unittest.main()