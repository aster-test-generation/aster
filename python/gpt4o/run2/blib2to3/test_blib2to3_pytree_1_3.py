import unittest
from blib2to3.pytree import WildcardPattern, NodePattern, generate_matches, HUGE, BasePattern


class TestWildcardPattern(unittest.TestCase):
    def setUp(self):
        self.pattern = WildcardPattern(content="abc", min=1, max=2, name="test")

    def test_init(self):
        self.assertEqual(self.pattern.min, 1)
        self.assertEqual(self.pattern.max, 2)
        self.assertEqual(self.pattern.name, "test")
        self.assertEqual(self.pattern.content, (('a', 'b', 'c'),))

    def test_optimize(self):
        result = self.pattern.optimize()
        self.assertIsInstance(result, WildcardPattern)

    def test_match(self):
        node = "a"
        result = self.pattern.match(node)
        self.assertFalse(result)

    def test_match_seq(self):
        nodes = ["a", "b", "c"]
        result = self.pattern.match_seq(nodes)
        self.assertFalse(result)

    def test_generate_matches(self):
        nodes = ["a", "b", "c"]
        result = list(self.pattern.generate_matches(nodes))
        self.assertEqual(result, [])

    def test_iterative_matches(self):
        nodes = ["a", "b", "c"]
        result = list(self.pattern._iterative_matches(nodes))
        self.assertEqual(result, [])

    def test_bare_name_matches(self):
        self.pattern.name = "bare_name"
        nodes = ["a", "b", "c"]
        result = self.pattern._bare_name_matches(nodes)
        self.assertEqual(result, (0, {'bare_name': []}))

    def test_recursive_matches(self):
        nodes = ["a", "b", "c"]
        result = list(self.pattern._recursive_matches(nodes, 0))
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()