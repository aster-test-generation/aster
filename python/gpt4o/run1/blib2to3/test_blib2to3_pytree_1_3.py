import unittest
from blib2to3.pytree import WildcardPattern, NodePattern, BasePattern, generate_matches
from blib2to3.pgen2.grammar import Grammar


class TestWildcardPattern(unittest.TestCase):
    def setUp(self):
        self.pattern = WildcardPattern(content="abc", min=1, max=2, name="test")

    def test_init(self):
        self.assertEqual(self.pattern.min, 1)
        self.assertEqual(self.pattern.max, 2)
        self.assertEqual(self.pattern.name, "test")
        self.assertEqual(self.pattern.content, (('a', 'b', 'c'),))

    def test_optimize(self):
        optimized = self.pattern.optimize()
        self.assertIsInstance(optimized, WildcardPattern)

    def test_match(self):
        node = "a"
        result = self.pattern.match(node)
        self.assertFalse(result)

    def test_match_seq(self):
        nodes = ["a", "b"]
        result = self.pattern.match_seq(nodes)
        self.assertFalse(result)

    def test_generate_matches(self):
        nodes = ["a", "b"]
        matches = list(self.pattern.generate_matches(nodes))
        self.assertEqual(matches, [])

    def test_iterative_matches(self):
        nodes = ["a", "b"]
        matches = list(self.pattern._iterative_matches(nodes))
        self.assertEqual(matches, [])

    def test_bare_name_matches(self):
        self.pattern.name = "bare_name"
        nodes = ["a", "b"]
        count, results = self.pattern._bare_name_matches(nodes)
        self.assertEqual(count, 0)
        self.assertEqual(results, {"bare_name": []})

    def test_recursive_matches(self):
        nodes = ["a", "b"]
        matches = list(self.pattern._recursive_matches(nodes, 0))
        self.assertEqual(matches, [])

if __name__ == '__main__':
    unittest.main()