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
        parser.setup()
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        parser.setup()
        type = 1
        value = "test"
        context = Context()
        result = parser.addtoken(type, value, context)
        self.assertEqual(result, False)

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
        result = parser.shift(type, value, newstate, context)
        self.assertEqual(result, None)

    def test_push(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        type = 1
        newdfa = DFAS()
        newstate = 1
        context = Context()
        result = parser.push(type, newdfa, newstate, context)
        self.assertEqual(result, None)

    def test_pop(self):
        grammar = Grammar()
        convert = lam_sub
        parser = Parser(grammar, convert)
        result = parser.pop()
        self.assertEqual(result, None)


class TestParseError(unittest.TestCase):
    def test_init(self):
        msg = "test"
        type = 1
        value = "test"
        context = Context()
        parse_error = ParseError(msg, type, value, context)
        self.assertEqual(parse_error.msg, msg)
        self.assertEqual(parse_error.type, type)
        self.assertEqual(parse_error.value, value)
        self.assertEqual(parse_error.context, context)


class TestLamSub(unittest.TestCase):
    def test_lam_sub(self):
        grammar = Grammar()
        node = RawNode()
        result = lam_sub(grammar, node)
        self.assertEqual(result, Node())


if __name__ == '__main__':
    unittest.main()