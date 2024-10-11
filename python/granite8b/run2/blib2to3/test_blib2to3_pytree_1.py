import unittest
from blib2to3.pytree import BasePattern


class TestNegatedPattern(unittest.TestCase):
    def test_init(self):
        pattern = NegatedPattern()
        self.assertIsNone(pattern.content)

    def test_match(self):
        pattern = NegatedPattern()
        node = object()
        self.assertFalse(pattern.match(node))

    def test_match_seq(self):
        pattern = NegatedPattern()
        nodes = [object()]
        self.assertFalse(pattern.match_seq(nodes))

    def test_generate_matches(self):
        pattern = NegatedPattern()
        nodes = [object()]
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(matches, [(0, {})])

if __name__ == '__main__':
    unittest.main()