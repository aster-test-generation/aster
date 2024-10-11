import unittest
from blib2to3.pytree import Base


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, "test")
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, "test")
        self.assertEqual(leaf.context, None)
        self.assertEqual(leaf.prefix, None)
        self.assertEqual(leaf.fixers_applied, [])
        self.assertEqual(leaf.children, [])

    def test_repr(self):
        leaf = Leaf(1, "test")
        self.assertEqual(leaf.__repr__(), "Leaf(1, 'test')")

    def test_str(self):
        leaf = Leaf(1, "test")
        self.assertEqual(leaf.__str__(), "test")

    def test_eq(self):
        leaf = Leaf(1, "test")
        self.assertEqual(leaf._eq(leaf), True)

    def test_clone(self):
        leaf = Leaf(1, "test")
        self.assertEqual(leaf.clone(), leaf)

    def test_leaves(self):
        leaf = Leaf(1, "test")
        self.assertEqual(list(leaf.leaves()), [leaf])

    def test_post_order(self):
        leaf = Leaf(1, "test")
        self.assertEqual(list(leaf.post_order()), [leaf])

    def test_pre_order(self):
        leaf = Leaf(1, "test")
        self.assertEqual(list(leaf.pre_order()), [leaf])

    def test_prefix(self):
        leaf = Leaf(1, "test")
        self.assertEqual(leaf.prefix, None)
        leaf.prefix = "test"
        self.assertEqual(leaf.prefix, "test")

if __name__ == '__main__':
    unittest.main()