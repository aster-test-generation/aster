import unittest
from blib2to3.pgen2.grammar import Grammar
from blib2to3.pytree import NegatedPattern


class TestNegatedPattern(unittest.TestCase):
    def test_init(self):
        negated_pattern = NegatedPattern()
        self.assertIsNone(negated_pattern.content)

    def test_init_with_content(self):
        content = object()
        negated_pattern = NegatedPattern(content)
        self.assertEqual(negated_pattern.content, content)

    def test_match(self):
        negated_pattern = NegatedPattern()
        node = object()
        results = {}
        self.assertFalse(negated_pattern.match(node, results))

    def test_match_seq(self):
        negated_pattern = NegatedPattern()
        nodes = [object()]
        results = {}
        self.assertFalse(negated_pattern.match_seq(nodes, results))

    def test_generate_matches(self):
        negated_pattern = NegatedPattern()
        nodes = [object()]
        self.assertEqual(list(negated_pattern.generate_matches(nodes)), [])

    def test_generate_matches_with_content(self):
        content = NegatedPattern()
        negated_pattern = NegatedPattern(content)
        nodes = [object()]
        self.assertEqual(list(negated_pattern.generate_matches(nodes)), [])

    def test_str(self):
        negated_pattern = NegatedPattern()
        self.assertEqual(str(negated_pattern), 'NegatedPattern')

    def test_repr(self):
        negated_pattern = NegatedPattern()
        self.assertEqual(repr(negated_pattern), 'NegatedPattern()')

    def test_eq(self):
        negated_pattern1 = NegatedPattern()
        negated_pattern2 = NegatedPattern()
        self.assertEqual(negated_pattern1, negated_pattern2)

if __name__ == '__main__':
    unittest.main()