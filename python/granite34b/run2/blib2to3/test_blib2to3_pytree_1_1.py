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

    def test_eq_with_other_class(self):
        base = Base()
        other_class = object()
        self.assertNotEqual(base, other_class)

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
        new_node = Node(1, [])
        base.replace(new_node)
        self.assertEqual(base.children, [new_node])

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

    def test_eq_with_other_class(self):
        leaf = Leaf(1, 'a')
        other_class = object()
        self.assertNotEqual(leaf, other_class)

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
        new_node = Node(1, [])
        leaf.replace(new_node)
        self.assertEqual(leaf.parent, None)
        self.assertEqual(new_node.parent, None)

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
        self.assertIsNone(leaf.parent)

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

if __name__ == '__main__':
    unittest.main()