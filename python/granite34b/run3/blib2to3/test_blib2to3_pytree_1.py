import unittest
from blib2to3.pytree import *


class TestPytree(unittest.TestCase):
    def test_negated_pattern_match(self):
        negated_pattern = NegatedPattern()
        node = Node(1, [Leaf(2, "test")])
        self.assertFalse(negated_pattern.match(node))

    def test_negated_pattern_match_seq(self):
        negated_pattern = NegatedPattern()
        nodes = [Leaf(1, "test")]
        self.assertFalse(negated_pattern.match_seq(nodes))

    def test_negated_pattern_generate_matches(self):
        negated_pattern = NegatedPattern()
        nodes = [Leaf(1, "test")]
        matches = negated_pattern.generate_matches(nodes)
        self.assertEqual(list(matches), [(0, {})])

    def test_negated_pattern_generate_matches_with_content(self):
        negated_pattern = NegatedPattern(BasePattern())
        nodes = [Leaf(1, "test")]
        matches = negated_pattern.generate_matches(nodes)
        self.assertEqual(list(matches), [(0, {})])

if __name__ == '__main__':
    unittest.main()