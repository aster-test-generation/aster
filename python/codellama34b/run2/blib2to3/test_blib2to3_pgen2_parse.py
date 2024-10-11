import unittest
from blib2to3.pgen2.parse import *


class TestParser(unittest.TestCase):
    def test_init(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        self.assertEqual(parser.grammar, grammar)
        self.assertEqual(parser.convert, convert)

    def test_setup(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        start = 1
        parser.setup(start)
        self.assertEqual(parser.stack, [(grammar.dfas[start], 0, [])])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 1
        value = "test"
        context = Context()
        parser.addtoken(type, value, context)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_classify(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 1
        value = "test"
        context = Context()
        result = parser.classify(type, value, context)
        self.assertEqual(result, 1)

    def test_shift(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 1
        value = "test"
        context = Context()
        newstate = 1
        parser.shift(type, value, newstate, context)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_push(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 1
        newdfa = []
        newstate = 1
        context = Context()
        parser.push(type, newdfa, newstate, context)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_pop(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        parser.pop()
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())


if __name__ == '__main__':
    unittest.main()