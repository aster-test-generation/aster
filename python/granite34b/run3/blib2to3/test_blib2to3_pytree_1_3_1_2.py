import unittest
from blib2to3.pytree import BasePattern


class TestBasePattern(unittest.TestCase):
    def test_init(self):
        pattern = BasePattern(name="TestPattern")
        self.assertIsInstance(pattern, BasePattern)

    def test_new(self):
        pattern = BasePattern.__new__(BasePattern, 'test')
        self.assertIsInstance(pattern, BasePattern)

    def test_repr(self):
        pattern = BasePattern(None)
        pattern.type = 1
        pattern.content = 2
        pattern.name = 3
        self.assertEqual(repr(pattern), 'BasePattern(1, 2, 3)')

    def test_submatch(self):
        pattern = BasePattern(1)
        node = object()
        with self.assertRaises(NotImplementedError):
            pattern._submatch(node)

    def test_optimize(self):
        pattern = BasePattern(0)
        optimized_pattern = pattern.optimize()
        self.assertIs(optimized_pattern, pattern)

    def test_match(self):
        pattern = BasePattern(1)
        node = object()
        results = {}
        self.assertTrue(pattern.match(node, results))

    def test_match_seq(self):
        pattern = BasePattern(1)
        nodes = [object()]
        results = {}
        self.assertTrue(pattern.match_seq(nodes, results))

    def test_generate_matches(self):
        pattern = BasePattern(name='BasePattern')
        nodes = [object()]
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(len(matches), 1)
        self.assertEqual(matches[0][0], 1)
        self.assertIsInstance(matches[0][1], dict)

if __name__ == '__main__':
    unittest.main()