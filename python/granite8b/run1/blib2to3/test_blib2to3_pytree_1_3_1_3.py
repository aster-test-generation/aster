import unittest
from blib2to3.pytree import Leaf, Node


class TestLeafPattern(unittest.TestCase):
    def test_init(self):
        leaf_pattern = LeafPattern(type=1, content='abc', name='test')
        self.assertEqual(leaf_pattern.type, 1)
        self.assertEqual(leaf_pattern.content, 'abc')
        self.assertEqual(leaf_pattern.name, 'test')

    def test_match(self):
        leaf_pattern = LeafPattern(type=1, content='abc')
        leaf = Leaf(1, 'abc')
        self.assertTrue(leaf_pattern.match(leaf))

    def test_submatch(self):
        leaf_pattern = LeafPattern(content='abc')
        leaf = Leaf(1, 'abc')
        self.assertTrue(leaf_pattern._submatch(leaf))

if __name__ == '__main__':
    unittest.main()