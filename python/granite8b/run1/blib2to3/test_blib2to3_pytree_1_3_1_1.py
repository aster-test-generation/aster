import unittest
from blib2to3.pytree import Leaf


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'value')
        self.assertEqual(leaf.prefix, '')
        self.assertEqual(leaf.lineno, 1)
        self.assertEqual(leaf.column, 0)
        self.assertEqual(leaf.fixers_applied, [])

    def test_repr(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(repr(leaf), 'Leaf(1, "value")')

    def test_str(self):
        leaf = Leaf(1, 'value')
        self.assertEqual(str(leaf), 'value')

    def test_eq(self):
        leaf1 = Leaf(1, 'value')
        leaf2 = Leaf(1, 'value')
        leaf3 = Leaf(2, 'value')
        self.assertEqual(leaf1, leaf2)
        self.assertNotEqual(leaf1, leaf3)

    def test_clone(self):
        leaf = Leaf(1, 'value')
        clone = leaf.clone()
        self.assertEqual(leaf, clone)
        self.assertIsNot(leaf, clone)

if __name__ == '__main__':
    unittest.main()