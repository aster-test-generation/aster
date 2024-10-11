import unittest
from blib2to3.pytree import Leaf


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'value')
        self.assertIsNone(leaf.prefix)
        self.assertEqual(leaf.fixers_applied, [])

    def test_repr(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(repr(leaf), 'Leaf(1, \'value\')')

    def test_str(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(str(leaf), 'value')

    def test_eq(self):
        leaf1 = Leaf(1, 'value')
        leaf2 = Leaf(1, 'value')
        self.assertTrue(leaf1._eq(leaf2))
        leaf3 = Leaf(2, 'value')
        self.assertFalse(leaf1._eq(leaf3))

    def test_clone(self):
        leaf = Leaf(1, 'value')
        cloned_leaf = leaf.clone()
        self.assertEqual(cloned_leaf.type, 1)
        self.assertEqual(cloned_leaf.value, 'value')
        self.assertIsNone(cloned_leaf.prefix)
        self.assertEqual(cloned_leaf.fixers_applied, [])

    def test_leaves(self):
        leaf = Leaf(1, 'value')
        leaves = list(leaf.leaves())
        self.assertEqual(len(leaves), 1)
        self.assertEqual(leaves[0], leaf)

    def test_post_order(self):
        leaf = Leaf(1, 'value')
        leaves = list(leaf.post_order())
        self.assertEqual(len(leaves), 1)
        self.assertEqual(leaves[0], leaf)

    def test_pre_order(self):
        leaf = Leaf(1, 'value')
        leaves = list(leaf.pre_order())
        self.assertEqual(len(leaves), 1)
        self.assertEqual(leaves[0], leaf)

    def test_prefix(self):
        leaf = Leaf(1, 'value')
        leaf.prefix = 'prefix'
        self.assertEqual(leaf.prefix, 'prefix')

    def test_prefix_setter(self):
        leaf = Leaf(1, 'value')
        leaf.prefix = 'prefix'
        self.assertEqual(leaf.prefix, 'prefix')

if __name__ == '__main__':
    unittest.main()