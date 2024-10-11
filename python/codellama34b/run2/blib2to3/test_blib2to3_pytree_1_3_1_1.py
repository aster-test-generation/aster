import unittest
from blib2to3.pytree import Base


class TestLeaf(unittest.TestCase):
    def test_init(self):
        Leaf(1, 'test')

    def test_repr(self):
        leaf = Leaf(1, 'test')
        result = leaf.__repr__()
        self.assertEqual(result, "Leaf(1, 'test')")

    def test_str(self):
        leaf = Leaf(1, 'test')
        result = leaf.__str__()
        self.assertEqual(result, 'test')

    def test_eq(self):
        leaf = Leaf(1, 'test')
        result = leaf._eq(leaf)
        self.assertEqual(result, True)

    def test_clone(self):
        leaf = Leaf(1, 'test')
        result = leaf.clone()
        self.assertEqual(result, Leaf(1, 'test'))

    def test_leaves(self):
        leaf = Leaf(1, 'test')
        result = leaf.leaves()
        self.assertEqual(result, [Leaf(1, 'test')])

    def test_post_order(self):
        leaf = Leaf(1, 'test')
        result = leaf.post_order()
        self.assertEqual(result, [Leaf(1, 'test')])

    def test_pre_order(self):
        leaf = Leaf(1, 'test')
        result = leaf.pre_order()
        self.assertEqual(result, [Leaf(1, 'test')])

    def test_prefix(self):
        leaf = Leaf(1, 'test')
        result = leaf.prefix
        self.assertEqual(result, None)

    def test_prefix_setter(self):
        leaf = Leaf(1, 'test')
        leaf.prefix = 'test'
        result = leaf.prefix
        self.assertEqual(result, 'test')


if __name__ == '__main__':
    unittest.main()