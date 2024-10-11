import unittest
from blib2to3.pytree import Leaf, Base


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'value')

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
        self.assertEqual(cloned_leaf.type, 1)
        self.assertEqual(cloned_leaf.value, 'value')

    def test_leaves(self):
        leaf = Leaf(1, 'value')
        leaves = list(leaf.leaves())
        self.assertEqual(len(leaves), 1)
        self.assertEqual(leaves[0].type, 1)
        self.assertEqual(leaves[0].value, 'value')

    def test_post_order(self):
        leaf = Leaf(1, 'value')
        post_order = list(leaf.post_order())
        self.assertEqual(len(post_order), 1)
        self.assertEqual(post_order[0].type, 1)
        self.assertEqual(post_order[0].value, 'value')

    def test_pre_order(self):
        leaf = Leaf(1, 'value')
        pre_order = list(leaf.pre_order())
        self.assertEqual(len(pre_order), 1)
        self.assertEqual(pre_order[0].type, 1)
        self.assertEqual(pre_order[0].value, 'value')

    def test_prefix_getter(self):
        leaf = Leaf(1, 'value')
        self.assertIsNone(leaf.prefix)

    def test_prefix_setter(self):
        leaf = Leaf(1, 'value')
        leaf.prefix = 'prefix'
        self.assertEqual(leaf.prefix, 'prefix')

if __name__ == '__main__':
    unittest.main()