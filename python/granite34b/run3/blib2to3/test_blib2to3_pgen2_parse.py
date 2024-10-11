import unittest
from blib2to3.pgen2.parse import *


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
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_addtoken(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.addtoken(1, "test", Context())
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_classify(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.classify(1, "test", Context())
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_shift(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.shift(1, "test", 2, Context())
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_push(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.push(1, ((), {}), 2, Context())
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

    def test_pop(self):
        grammar = Grammar()
        parser = Parser(grammar)
        parser.setup()
        parser.pop()
        self.assertEqual(parser.stack, [])
        self.assertEqual(parser.rootnode, None)
        self.assertEqual(parser.used_names, set())

if __name__ == '__main__':
    unittest.main()