import unittest
from blib2to3.pytree import Base, Node


class TestBase(unittest.TestCase):
    def test_init(self):
        base = Base()
        self.assertEqual(base.prefix, '')

    def test_new(self):
        class Subclass(Base):
            pass
        obj = Subclass()
        self.assertIsInstance(obj, Base)

    def test_eq(self):
        base1 = Base()
        base2 = Base()
        self.assertEqual(base1, base2)

    def test_clone(self):
        base = Base()
        clone = base.clone()
        self.assertIsInstance(clone, Base)
        self.assertEqual(base, clone)

    def test_post_order(self):
        base = Base()
        self.assertEqual(list(base.post_order()), [])

    def test_pre_order(self):
        base = Base()
        self.assertEqual(list(base.pre_order()), [])

    def test_replace(self):
        base = Base()
        new_node = Leaf(0, 'new')
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
    def test_init(self):
        leaf = Leaf(0, 'value')
        self.assertEqual(leaf.type, 0)
        self.assertEqual(leaf.value, 'value')

    def test_eq(self):
        leaf1 = Leaf(0, 'value')
        leaf2 = Leaf(0, 'value')
        self.assertEqual(leaf1, leaf2)

    def test_clone(self):
        leaf = Leaf(0, 'value')
        clone = leaf.clone()
        self.assertIsInstance(clone, Leaf)
        self.assertEqual(leaf, clone)

    def test_post_order(self):
        leaf = Leaf(0, 'value')
        self.assertEqual(list(leaf.post_order()), [leaf])

    def test_pre_order(self):
        leaf = Leaf(0, 'value')
        self.assertEqual(list(leaf.pre_order()), [leaf])

    def test_replace(self):
        leaf = Leaf(0, 'value')
        new_leaf = Leaf(0, 'new')
        leaf.replace(new_leaf)
        self.assertEqual(leaf.children, [new_leaf])

    def test_get_lineno(self):
        leaf = Leaf(0, 'value')
        self.assertEqual(leaf.get_lineno(), 0)

    def test_changed(self):
        leaf = Leaf(0, 'value')
        leaf.changed()
        self.assertTrue(leaf.was_changed)

    def test_remove(self):
        leaf = Leaf(0, 'value')
        self.assertIsNone(leaf.remove())

    def test_next_sibling(self):
        leaf = Leaf(0, 'value')
        self.assertIsNone(leaf.next_sibling)

    def test_prev_sibling(self):
        leaf = Leaf(0, 'value')
        self.assertIsNone(leaf.prev_sibling)

    def test_leaves(self):
        leaf = Leaf(0, 'value')
        self.assertEqual(list(leaf.leaves()), [leaf])

    def test_depth(self):
        leaf = Leaf(0, 'value')
        self.assertEqual(leaf.depth(), 0)

    def test_get_suffix(self):
        leaf = Leaf(0, 'value')
        self.assertEqual(leaf.get_suffix(), '')


if __name__ == '__main__':
    unittest.main()