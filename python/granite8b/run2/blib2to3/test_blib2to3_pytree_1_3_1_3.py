import unittest
from blib2to3.pytree import Leaf, Node


class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(type=1, value='abc', prefix=' ', context=(None, (1, 2)))
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, 'abc')
        self.assertEqual(leaf.prefix, ' ')
        self.assertEqual(leaf.context, (None, (1, 2)))

    def test_eq(self):
        leaf1 = Leaf(type=1, value='abc', prefix=' ', context=(None, (1, 2)))
        leaf2 = Leaf(type=1, value='abc', prefix=' ', context=(None, (1, 2)))
        self.assertEqual(leaf1, leaf2)

    def test_ne(self):
        leaf1 = Leaf(type=1, value='abc', prefix=' ', context=(None, (1, 2)))
        leaf2 = Leaf(type=2, value='abc', prefix=' ', context=(None, (1, 2)))
        self.assertNotEqual(leaf1, leaf2)

    def test_repr(self):
        leaf = Leaf(type=1, value='abc', prefix=' ', context=(None, (1, 2)))
        self.assertEqual(repr(leaf), "Leaf(type=1, value='abc', prefix=' ', context=(None, (1, 2)))")

    def test_str(self):
        leaf = Leaf(type=1, value='abc', prefix=' ', context=(None, (1, 2)))
        self.assertEqual(str(leaf), "abc")

class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(type=1, value='abc', prefix=' ', context=(None, (1, 2)), children=[])
        self.assertEqual(node.type, 1)
        self.assertEqual(node.value, 'abc')
        self.assertEqual(node.prefix, ' ')
        self.assertEqual(node.context, (None, (1, 2)))
        self.assertEqual(node.children, [])

    def test_eq(self):
        node1 = Node(type=1, value='abc', prefix=' ', context=(None, (1, 2)), children=[])
        node2 = Node(type=1, value='abc', prefix=' ', context=(None, (1, 2)), children=[])
        self.assertEqual(node1, node2)

    def test_ne(self):
        node1 = Node(type=1, value='abc', prefix=' ', context=(None, (1, 2)), children=[])
        node2 = Node(type=2, value='abc', prefix=' ', context=(None, (1, 2)), children=[])
        self.assertNotEqual(node1, node2)

    def test_repr(self):
        node = Node(type=1, value='abc', prefix=' ', context=(None, (1, 2)), children=[])
        self.assertEqual(repr(node), "Node(type=1, value='abc', prefix=' ', context=(None, (1, 2)), children=[])")

if __name__ == '__main__':
    unittest.main()