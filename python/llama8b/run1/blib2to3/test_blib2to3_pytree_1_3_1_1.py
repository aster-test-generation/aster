import unittest
from blib2to3.pytree import Leaf


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'value')
        self.assertEqual(leaf.prefix, 'prefix')
        self.assertEqual(leaf.fixers_applied, [])

    def test_repr(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        self.assertEqual(repr(leaf), 'Leaf(1, \'value\')')

    def test_str(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        self.assertEqual(str(leaf), 'prefixvalue')

    def test_eq(self):
        leaf1 = Leaf(1, 'value', prefix='prefix')
        leaf2 = Leaf(1, 'value', prefix='prefix')
        self.assertTrue(leaf1._eq(leaf2))

    def test_clone(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        cloned_leaf = leaf.clone()
        self.assertEqual(cloned_leaf.type, 1)
        self.assertEqual(cloned_leaf.value, 'value')
        self.assertEqual(cloned_leaf.prefix, 'prefix')
        self.assertEqual(cloned_leaf.fixers_applied, [])

    def test_leaves(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        leaves = list(leaf.leaves())
        self.assertEqual(len(leaves), 1)
        self.assertEqual(leaves[0], leaf)

    def test_post_order(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        leaves = list(leaf.post_order())
        self.assertEqual(len(leaves), 1)
        self.assertEqual(leaves[0], leaf)

    def test_pre_order(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        leaves = list(leaf.pre_order())
        self.assertEqual(len(leaves), 1)
        self.assertEqual(leaves[0], leaf)

    def test_prefix_setter(self):
        leaf = Leaf(1, 'value', prefix='prefix')
        leaf.prefix = 'new_prefix'
        self.assertEqual(leaf.prefix, 'new_prefix')

if __name__ == '__main__':
    unittest.main()