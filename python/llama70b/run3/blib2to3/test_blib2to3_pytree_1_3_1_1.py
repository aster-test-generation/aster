import unittest
from blib2to3.pytree import Leaf, Base


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'value')
        self.assertIsNone(leaf.context)
        self.assertIsNone(leaf.prefix)
        self.assertEqual(leaf.fixers_applied, [])

    def test_repr(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(leaf.__repr__(), "Leaf(1, 'value')")

    def test_str(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(leaf.__str__(), 'value')

    def test_eq(self):
        leaf1 = Leaf(1, 'value')
        leaf2 = Leaf(1, 'value')
        self.assertTrue(leaf1._eq(leaf2))

    def test_clone(self):
        leaf = Leaf(1, 'value')
        cloned_leaf = leaf.clone()
        self.assertIsNot(leaf, cloned_leaf)
        self.assertEqual(cloned_leaf.type, 1)
        self.assertEqual(cloned_leaf.value, 'value')

    def test_leaves(self):
        leaf = Leaf(1, 'value')
        leaves = list(leaf.leaves())
        self.assertEqual(leaves, [leaf])

    def test_post_order(self):
        leaf = Leaf(1, 'value')
        post_order = list(leaf.post_order())
        self.assertEqual(post_order, [leaf])

    def test_pre_order(self):
        leaf = Leaf(1, 'value')
        pre_order = list(leaf.pre_order())
        self.assertEqual(pre_order, [leaf])

    def test_prefix_getter(self):
        leaf = Leaf(1, 'value')
        self.assertIsNone(leaf.prefix)

    def test_prefix_setter(self):
        leaf = Leaf(1, 'value')
        leaf.prefix = 'new_prefix'
        self.assertEqual(leaf.prefix, 'new_prefix')

    def test_private_init(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(leaf._Leaf__init__(1, 'value'), None)

if __name__ == '__main__':
    unittest.main()