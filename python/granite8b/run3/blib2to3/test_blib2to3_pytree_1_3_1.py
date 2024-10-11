import unittest
from blib2to3.pytree import BasePattern


class TestNodePattern(unittest.TestCase):
    def test_init(self):
        pattern = NodePattern(type=257, content=[])
        self.assertEqual(pattern.type, 257)
        self.assertEqual(pattern.content, [])

    def test_submatch(self):
        pattern = NodePattern(type=257, content=[])
        node = Node(257, [])
        self.assertTrue(pattern._submatch(node))

    def test_submatch_with_content(self):
        pattern = NodePattern(type=257, content=[WildcardPattern()])
        node = Node(257, [Leaf(258, 'foo')])
        self.assertTrue(pattern._submatch(node))

    def test_submatch_with_content_and_wildcard(self):
        pattern = NodePattern(type=257, content=[LeafPattern(258)])
        node = Node(257, [Leaf(258, 'foo')])
        self.assertTrue(pattern._submatch(node))

    def test_submatch_with_content_and_no_match(self):
        pattern = NodePattern(type=257, content=[LeafPattern(259)])
        node = Node(257, [Leaf(258, 'foo')])
        self.assertFalse(pattern._submatch(node))

    def test_submatch_with_content_and_multiple_matches(self):
        pattern = NodePattern(type=257, content=[LeafPattern(258), LeafPattern(258)])
        node = Node(257, [Leaf(258, 'foo'), Leaf(258, 'bar')])
        self.assertTrue(pattern._submatch(node))

    def test_submatch_with_content_and_multiple_matches_and_wildcard(self):
        pattern = NodePattern(type=257, content=[LeafPattern(258), WildcardPattern()])
        node = Node(257, [Leaf(258, 'foo'), Leaf(258, 'bar')])
        self.assertTrue(pattern._submatch(node))

    def test_submatch_with_content_and_multiple_matches_and_no_wildcard(self):
        pattern = NodePattern(type=257, content=[LeafPattern(258), LeafPattern(258)])
        node = Node(257, [Leaf(258, 'foo'), Leaf(258, 'bar')])
        self.assertFalse(pattern._submatch(node))

if __name__ == '__main__':
    unittest.main()