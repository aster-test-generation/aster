import unittest
from blib2to3.pytree import Leaf, Node


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, 'a')
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'a')
        self.assertEqual(leaf.prefix, '')
        self.assertEqual(leaf.lineno, None)
        self.assertEqual(leaf.column, None)
        self.assertEqual(leaf.fixers_applied, [])
        self.assertEqual(leaf.children, [])

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
        self.assertEqual(clone.lineno, None)
        self.assertEqual(clone.column, None)
        self.assertEqual(clone.fixers_applied, [])
        self.assertEqual(clone.children, [])

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

class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        self.assertEqual(node.type, 1)
        self.assertEqual(node.children, [Leaf(2, 'b'), Leaf(3, 'c')])

    def test_repr(self):
        node = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        self.assertEqual(repr(node), "Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])")

    def test_str(self):
        node = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        self.assertEqual(str(node), '(1 b c)')

    def test_eq(self):
        node1 = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        node2 = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        self.assertEqual(node1, node2)

    def test_clone(self):
        node = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        clone = node.clone()
        self.assertEqual(clone.type, 1)
        self.assertEqual(clone.children, [Leaf(2, 'b'), Leaf(3, 'c')])

    def test_leaves(self):
        node = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        leaves = list(node.leaves())
        self.assertEqual(leaves, [Leaf(2, 'b'), Leaf(3, 'c')])

    def test_post_order(self):
        node = Node(1, [Leaf(2, 'b'), Leaf(3, 'c')])
        post_order = list(node.post_order())
        self.assertEqual(post_order, [Leaf(2, 'b'), Leaf(3, 'c'), node])

if __name__ == '__main__':
    unittest.main()