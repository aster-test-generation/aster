import unittest
from blib2to3.pytree import Leaf


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'a')
        self.assertEqual(leaf.prefix, '')
        self.assertEqual(leaf.lineno, 1)
        self.assertEqual(leaf.column, 0)
        self.assertEqual(leaf.fixers_applied, [])

    def test_repr(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(repr(leaf), "Leaf(1, 'a')")

    def test_str(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(str(leaf), 'a')

    def test_eq(self):
        leaf1 = Leaf(1, 'a')
        leaf2 = Leaf(1, 'a')
        self.assertEqual(leaf1, leaf2)

    def test_clone(self):
        leaf = Leaf(1, 'a')
        clone = leaf.clone()
        self.assertEqual(clone.type, 1)
        self.assertEqual(clone.value, 'a')
        self.assertEqual(clone.prefix, '')
        self.assertEqual(clone.lineno, 1)
        self.assertEqual(clone.column, 0)
        self.assertEqual(clone.fixers_applied, [])

    def test_leaves(self):
        leaf = Leaf(1, 'a')
        leaves = list(leaf.leaves())
        self.assertEqual(leaves, [leaf])

    def test_post_order(self):
        leaf = Leaf(1, 'a')
        post_order = list(leaf.post_order())
        self.assertEqual(post_order, [leaf])

    def test_pre_order(self):
        leaf = Leaf(1, 'a')
        pre_order = list(leaf.pre_order())
        self.assertEqual(pre_order, [leaf])

    def test_prefix(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.prefix, '')
        leaf.prefix = ' '
        self.assertEqual(leaf.prefix, ' ')

if __name__ == '__main__':
    unittest.main()