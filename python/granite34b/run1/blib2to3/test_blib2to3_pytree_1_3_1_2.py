import unittest
from blib2to3.pytree import BasePattern


class TestBasePattern(unittest.TestCase):
    def test_init(self):
        pattern = BasePattern(name='BasePattern')
        self.assertIsInstance(pattern, BasePattern)

    def test_new(self):
        pattern = BasePattern.__new__(BasePattern)
        self.assertIsInstance(pattern, BasePattern)

    def test_repr(self):
        pattern = BasePattern(0)
        pattern.type = 1
        pattern.content = 2
        pattern.name = 3
        self.assertEqual(repr(pattern), 'BasePattern(1, 2, 3)')

    def test_submatch(self):
        pattern = BasePattern(0)
        node = object()
        results = {}
        self.assertFalse(pattern._submatch(node, results))

    def test_optimize(self):
        pattern = BasePattern(name='BasePattern')
        self.assertIs(pattern.optimize(), pattern)

    def test_match(self):
        pattern = BasePattern(1)
        node = object()
        results = {}
        self.assertFalse(pattern.match(node, results))

    def test_match_seq(self):
        pattern = BasePattern(1)
        nodes = [object()]
        results = {}
        self.assertFalse(pattern.match_seq(nodes, results))

    def test_generate_matches(self):
        pattern = BasePattern(None)
        nodes = [object()]
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(len(matches), 0)

if __name__ == '__main__':
    unittest.main()