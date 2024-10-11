import unittest
from blib2to3.pytree import Base, Leaf, Node


class TestBase(unittest.TestCase):
    def test_eq(self):
        base1 = Base()
        base2 = Base()
        self.assertEqual(base1, base2)

    def test_prefix(self):
        base = Base()
        self.assertEqual(base.prefix, '')

    def test_clone(self):
        base = Base()
        cloned_base = base.clone()
        self.assertEqual(base, cloned_base)

    def test_post_order(self):
        base = Base()
        self.assertEqual(list(base.post_order()), [])

    def test_pre_order(self):
        base = Base()
        self.assertEqual(list(base.pre_order()), [])

    def test_replace(self):
        base = Base()
        new_base = Base()
        base.replace(new_base)
        self.assertEqual(base.children, [new_base])

    def test_get_lineno(self):
        base = Base()
        self.assertIsNone(base.get_lineno())

    def test_changed(self):
        base = Base()
        base.changed()
        self.assertTrue(base.was_changed)

    def test_remove(self):
        base = Base()
        self.assertIsNone(base.remove())

    def test_next_sibling(self):
        base = Base()
        self.assertIsNone(base.next_sibling)

    def test_prev_sibling(self):
        base = Base()
        self.assertIsNone(base.prev_sibling)

    def test_leaves(self):
        base = Base()
        self.assertEqual(list(base.leaves()), [])

    def test_depth(self):
        base = Base()
        self.assertEqual(base.depth(), 0)

    def test_get_suffix(self):
        base = Base()
        self.assertEqual(base.get_suffix(), '')

class TestLeaf(unittest.TestCase):
    def test_eq(self):
        leaf1 = Leaf(1, 'a')
        leaf2 = Leaf(1, 'a')
        self.assertEqual(leaf1, leaf2)

    def test_prefix(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.prefix, '')

    def test_clone(self):
        leaf = Leaf(1, 'a')
        cloned_leaf = leaf.clone()
        self.assertEqual(leaf, cloned_leaf)

    def test_post_order(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(list(leaf.post_order()), [leaf])

    def test_pre_order(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(list(leaf.pre_order()), [leaf])

    def test_replace(self):
        leaf = Leaf(1, 'a')
        new_leaf = Leaf(2, 'b')
        leaf.replace(new_leaf)
        self.assertEqual(leaf.children, [new_leaf])

    def test_get_lineno(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.get_lineno(), 1)

    def test_changed(self):
        leaf = Leaf(1, 'a')
        leaf.changed()
        self.assertTrue(leaf.was_changed)

    def test_remove(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.remove(), 0)

    def test_next_sibling(self):
        leaf = Leaf(1, 'a')
        self.assertIsNone(leaf.next_sibling)

    def test_prev_sibling(self):
        leaf = Leaf(1, 'a')
        self.assertIsNone(leaf.prev_sibling)

    def test_leaves(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(list(leaf.leaves()), [leaf])

    def test_depth(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.depth(), 0)

    def test_get_suffix(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.get_suffix(), '')

class TestNode(unittest.TestCase):
    def test_eq(self):
        node1 = Node(1, [])
        node2 = Node(1, [])
        self.assertEqual(node1, node2)

    def test_prefix(self):
        node = Node(1, [])
        self.assertEqual(node.prefix, '')

if __name__ == '__main__':
    unittest.main()