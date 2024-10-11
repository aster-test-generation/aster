import unittest
from blib2to3.pytree import Base


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, "value", (None, (1, 2)), "prefix", [])
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, "value")
        self.assertEqual(leaf.context, (None, (1, 2)))
        self.assertEqual(leaf.prefix, "prefix")
        self.assertEqual(leaf.fixers_applied, [])

    def test_eq(self):
        leaf = Leaf(1, "value")
        self.assertEqual(leaf._eq(leaf), True)

    def test_clone(self):
        leaf = Leaf(1, "value")
        self.assertEqual(leaf.clone(), leaf)

    def test_leaves(self):
        leaf = Leaf(1, "value")
        self.assertEqual(list(leaf.leaves()), [leaf])

    def test_post_order(self):
        leaf = Leaf(1, "value")
        self.assertEqual(list(leaf.post_order()), [leaf])

    def test_pre_order(self):
        leaf = Leaf(1, "value")
        self.assertEqual(list(leaf.pre_order()), [leaf])

    def test_prefix(self):
        leaf = Leaf(1, "value")
        self.assertEqual(leaf.prefix, "")
        leaf.prefix = "prefix"
        self.assertEqual(leaf.prefix, "prefix")

    def test_repr(self):
        leaf = Leaf(1, "value")
        self.assertEqual(repr(leaf), "Leaf(1, 'value')")

    def test_str(self):
        leaf = Leaf(1, "value")
        self.assertEqual(str(leaf), "value")


if __name__ == '__main__':
    unittest.main()