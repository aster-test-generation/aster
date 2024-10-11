import unittest
from blib2to3.pytree import BasePattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        pattern = WildcardPattern(content='abc', min=1, max=3, name='x')
        self.assertEqual(pattern.content, ('abc',))
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 3)
        self.assertEqual(pattern.name, 'x')

    def test_optimize(self):
        pattern = WildcardPattern(content='abc', min=1, max=3, name='x')
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern.content, ('abc',))
        self.assertEqual(optimized_pattern.min, 1)
        self.assertEqual(optimized_pattern.max, 3)
        self.assertEqual(optimized_pattern.name, 'x')

    def test_match(self):
        pattern = WildcardPattern(content='abc', min=1, max=3, name='x')
        node = Node(1, 'abc')
        self.assertTrue(pattern.match(node))

    def test_match_seq(self):
        pattern = WildcardPattern(content='abc', min=1, max=3, name='x')
        nodes = [Node(1, 'abc'), Node(2, 'def')]
        self.assertTrue(pattern.match_seq(nodes))

    def test_generate_matches(self):
        pattern = WildcardPattern(content='abc', min=1, max=3, name='x')
        nodes = [Node(1, 'abc'), Node(2, 'def')]
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(len(matches), 2)
        self.assertEqual(matches[0][0], 1)
        self.assertEqual(matches[1][0], 2)

    def test_bare_name_matches(self):
        pattern = WildcardPattern(content='abc', min=1, max=3, name='x')
        nodes = [Node(1, 'abc'), Node(2, 'def')]
        match = pattern._bare_name_matches(nodes)
        self.assertEqual(match[0], 1)
        self.assertEqual(match[1]['x'], [nodes[0]])

    def test_recursive_matches(self):
        pattern = WildcardPattern(content='abc', min=1, max=3, name='x')
        nodes = [Node(1, 'abc'), Node(2, 'def')]
        matches = list(pattern._recursive_matches(nodes, 0))
        self.assertEqual(len(matches), 2)
        self.assertEqual(matches[0][0], 1)
        self.assertEqual(matches[1][0], 2)

if __name__ == '__main__':
    unittest.main()