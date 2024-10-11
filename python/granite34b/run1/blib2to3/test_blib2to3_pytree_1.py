import unittest
from blib2to3.pytree import Node, Leaf


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(1, [Leaf(2, "test")])
        self.assertEqual(node.type, 1)
        self.assertEqual(node.children, [Leaf(2, "test")])

    def test_repr(self):
        node = Node(1, [Leaf(2, "test")])
        self.assertEqual(repr(node), "Node(1, [Leaf(2, 'test')])")

    def test_eq(self):
        node1 = Node(1, [Leaf(2, "test")])
        node2 = Node(1, [Leaf(2, "test")])
        self.assertEqual(node1, node2)

class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, "test")
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, "test")

    def test_repr(self):
        leaf = Leaf(1, "test")
        self.assertEqual(repr(leaf), "Leaf(1, 'test')")

    def test_eq(self):
        leaf1 = Leaf(1, "test")
        leaf2 = Leaf(1, "test")
        self.assertEqual(leaf1, leaf2)

if __name__ == '__main__':
    unittest.main()