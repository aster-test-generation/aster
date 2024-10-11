import unittest
from blib2to3.pytree import BasePattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        pattern = WildcardPattern()
        self.assertEqual(pattern.content, None)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, HUGE)
        self.assertEqual(pattern.name, None)
        pattern = WildcardPattern(content=[])
        self.assertEqual(pattern.content, [])
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, HUGE)
        self.assertEqual(pattern.name, None)
        pattern = WildcardPattern(content=[], min=1, max=1, name="test")
        self.assertEqual(pattern.content, [])
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 1)
        self.assertEqual(pattern.name, "test")

    def test_optimize(self):
        pattern = WildcardPattern()
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern, pattern)
        pattern = WildcardPattern(content=[])
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern, pattern)
        pattern = WildcardPattern(content=[], min=1, max=1, name="test")
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern, pattern)
        pattern = WildcardPattern(content=[[NodePattern(name="test")]])
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern.content[0][0].name, "test")
        pattern = WildcardPattern(content=[[NodePattern(name="test")]], min=1, max=1, name="test")
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern.content[0][0].name, "test")

    def test_match(self):
        pattern = WildcardPattern()
        self.assertFalse(pattern.match(Node()))
        pattern = WildcardPattern(content=[])
        self.assertTrue(pattern.match(Node()))
        pattern = WildcardPattern(content=[], min=1, max=1, name="test")
        self.assertFalse(pattern.match(Node()))
        pattern = WildcardPattern(content=[[NodePattern(name="test")]])
        self.assertTrue(pattern.match(Node(name="test")))
        pattern = WildcardPattern(content=[[NodePattern(name="test")]], min=1, max=1, name="test")
        self.assertTrue(pattern.match(Node(name="test")))

    def test_generate_matches(self):
        pattern = WildcardPattern()
        self.assertEqual(list(pattern.generate_matches([])), [])
        pattern = WildcardPattern(content=[])
        self.assertEqual(list(pattern.generate_matches([])), [(0, {})])
        pattern = WildcardPattern(content=[], min=1, max=1, name="test")
        self.assertEqual(list(pattern.generate_matches([])), [])
        pattern = WildcardPattern(content=[[NodePattern(name="test")]])
        self.assertEqual(list(pattern.generate_matches([Node(name="test")])), [(1, {"test": [Node(name="test")]})])
        pattern = WildcardPattern(content=[[NodePattern(name="test")]], min=1, max=1, name="test")
        self.assertEqual(list(pattern.generate_matches([Node(name="test")])), [(1, {"test": [Node(name="test")]})])

if __name__ == '__main__':
    unittest.main()