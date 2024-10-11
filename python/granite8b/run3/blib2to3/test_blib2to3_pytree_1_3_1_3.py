import unittest
from blib2to3.pytree import Leaf, Node


class TestLeafPattern(unittest.TestCase):
    def test_match(self):
        leaf = Leaf(1, 'value')
        pattern = LeafPattern(1, 'value')
        self.assertTrue(pattern.match(leaf))

    def test_submatch(self):
        leaf = Leaf(1, 'value')
        pattern = LeafPattern(1, 'value')
        self.assertTrue(pattern._submatch(leaf))

    def test_no_match(self):
        leaf = Leaf(2, 'value')
        pattern = LeafPattern(1, 'value')
        self.assertFalse(pattern.match(leaf))

    def test_no_submatch(self):
        leaf = Leaf(1, 'other_value')
        pattern = LeafPattern(1, 'value')
        self.assertFalse(pattern._submatch(leaf))

if __name__ == '__main__':
    unittest.main()