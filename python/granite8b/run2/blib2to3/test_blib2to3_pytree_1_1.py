import unittest
from blib2to3.pytree import Base, Leaf


class TestBase(unittest.TestCase):
    def test_init(self):
        base = Base()
        self.assertIsInstance(base, Base)

    def test_new(self):
        base = Base()
        new_base = Base.__new__(Base)
        self.assertIsInstance(new_base, Base)

    def test_eq(self):
        base1 = Base()
        base2 = Base()
        self.assertEqual(base1, base2)

    def test_clone(self):
        base = Base()
        clone = base.clone()
        self.assertIsInstance(clone, Base)

    def test_post_order(self):
        base = Base()
        post_order = list(base.post_order())
        self.assertEqual(post_order, [])

    def test_pre_order(self):
        base = Base()
        pre_order = list(base.pre_order())
        self.assertEqual(pre_order, [])

    def test_replace(self):
        base = Base()
        new_base = Base()
        base.replace(new_base)
        self.assertEqual(base.children, [new_base])

    def test_get_lineno(self):
        leaf = Leaf(0, 'leaf', None, None)
        self.assertEqual(leaf.get_lineno(), None)

    def test_changed(self):
        base = Base()
        base.changed()
        self.assertTrue(base.was_changed)

    def test_remove(self):
        base = Base()
        removed = base.remove()
        self.assertEqual(removed, None)

    def test_next_sibling(self):
        base = Base()
        next_sibling = base.next_sibling
        self.assertEqual(next_sibling, None)

    def test_prev_sibling(self):
        base = Base()
        prev_sibling = base.prev_sibling
        self.assertEqual(prev_sibling, None)

    def test_leaves(self):
        base = Base()
        leaves = list(base.leaves())
        self.assertEqual(leaves, [])

    def test_depth(self):
        base = Base()
        depth = base.depth()
        self.assertEqual(depth, 0)

    def test_get_suffix(self):
        base = Base()
        suffix = base.get_suffix()
        self.assertEqual(suffix, '')

class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(0, 'leaf', None, None)
        self.assertIsInstance(leaf, Leaf)

    def test_leaves(self):
        leaf = Leaf(0, 'leaf', None, None)
        leaves = list(leaf.leaves())
        self.assertEqual(leaves, [leaf])

if __name__ == '__main__':
    unittest.main()