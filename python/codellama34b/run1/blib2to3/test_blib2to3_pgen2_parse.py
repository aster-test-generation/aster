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
        start = 0
        parser.setup(start)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 0
        value = "value"
        context = Context()
        parser.addtoken(type, value, context)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_classify(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 0
        value = "value"
        context = Context()
        parser.classify(type, value, context)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_shift(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 0
        value = "value"
        context = Context()
        newstate = 0
        parser.shift(type, value, newstate, context)
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_push(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 0
        newdfa = []
        newstate = 0
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


class TestParseError(unittest.TestCase):
    def test_init(self):
        msg = "msg"
        type = 0
        value = "value"
        context = Context()
        parse_error = ParseError(msg, type, value, context)
        self.assertEqual(parse_error.msg, msg)
        self.assertEqual(parse_error.type, type)
        self.assertEqual(parse_error.value, value)
        self.assertEqual(parse_error.context, context)


class TestLamSub(unittest.TestCase):
    def test_lam_sub(self):
        grammar = Grammar()
        node = (0, "value", Context(), [])
        lam_sub(grammar, node)
        self.assertEqual(node, (0, "value", Context(), []))


if __name__ == '__main__':
    unittest.main()