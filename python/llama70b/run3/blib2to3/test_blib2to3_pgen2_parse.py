import unittest
from blib2to3.pgen2.parse import *


class TestParseError(unittest.TestCase):
    def test_init(self):
        error = ParseError("msg", 1, "value", Context())
        self.assertEqual(error.msg, "msg")
        self.assertEqual(error.type, 1)
        self.assertEqual(error.value, "value")
        self.assertIsInstance(error.context, Context)

    def test_str(self):
        error = ParseError("msg", 1, "value", Context())
        self.assertEqual(str(error), "msg: type=1, value='value', context=Context()")

class TestParser(unittest.TestCase):
    def test_init(self):
        grammar = Grammar()
        parser = Parser(grammar)
        self.assertEqual(parser.grammar, grammar)
        self.assertEqual(parser.convert, lam_sub)

    def test_setup(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        self.assertIsNotNone(parser.stack)
        self.assertIsNone(parser.rootnode)
        self.assertIsInstance(parser.used_names, set)

    def test_addtoken(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        self.assertTrue(parser.addtoken(1, "value", Context()))

    def test_classify(self):
        grammar = Grammar()
        parser = Parser(grammar)
        self.assertEqual(parser.classify(1, "value", Context()), 1)

    def test_shift(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.shift(1, "value", 1, Context())
        self.assertIsNotNone(parser.stack[-1][2])

    def test_push(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.push(1, [(1, 1)], 1, Context())
        self.assertEqual(len(parser.stack), 2)

    def test_pop(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.push(1, [(1, 1)], 1, Context())
        parser.pop()
        self.assertEqual(len(parser.stack), 1)

    def test_private_method(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser._Parser__private_method()  # This method does not exist, so it will raise an AttributeError

class TestLamSub(unittest.TestCase):
    def test_lam_sub(self):
        grammar = Grammar()
        node = RawNode(1, None, None, [])
        result = lam_sub(grammar, node)
        self.assertIsInstance(result, Node)

if __name__ == '__main__':
    unittest.main()