import unittest
from blib2to3.pytree import Leaf, Base


class TestLeaf(unittest.TestCase):
    def setUp(self):
        self.leaf = Leaf(1, 'value', context=('prefix', (1, 2)), prefix='prefix', fixers_applied=['fixer1'])

    def test_init(self):
        self.assertEqual(self.leaf.type, 1)
        self.assertEqual(self.leaf.value, 'value')
        self.assertEqual(self.leaf.prefix, 'prefix')
        self.assertEqual(self.leaf.lineno, 1)
        self.assertEqual(self.leaf.column, 2)
        self.assertEqual(self.leaf.fixers_applied, ['fixer1'])
        self.assertEqual(self.leaf.children, [])

    def test_repr(self):
        result = repr(self.leaf)
        self.assertTrue(result.startswith("Leaf("))

    def test_str(self):
        result = str(self.leaf)
        self.assertEqual(result, 'prefixvalue')

    def test_eq(self):
        other_leaf = Leaf(1, 'value')
        self.assertTrue(self.leaf._eq(other_leaf))

    def test_clone(self):
        clone = self.leaf.clone()
        self.assertEqual(clone.type, self.leaf.type)
        self.assertEqual(clone.value, self.leaf.value)
        self.assertEqual(clone.prefix, self.leaf.prefix)
        self.assertEqual(clone.lineno, self.leaf.lineno)
        self.assertEqual(clone.column, self.leaf.column)
        self.assertEqual(clone.fixers_applied, self.leaf.fixers_applied)

    def test_leaves(self):
        leaves = list(self.leaf.leaves())
        self.assertEqual(leaves, [self.leaf])

    def test_post_order(self):
        post_order = list(self.leaf.post_order())
        self.assertEqual(post_order, [self.leaf])

    def test_pre_order(self):
        pre_order = list(self.leaf.pre_order())
        self.assertEqual(pre_order, [self.leaf])

    def test_prefix_getter(self):
        self.assertEqual(self.leaf.prefix, 'prefix')

    def test_prefix_setter(self):
        self.leaf.prefix = 'new_prefix'
        self.assertEqual(self.leaf.prefix, 'new_prefix')

if __name__ == '__main__':
    unittest.main()