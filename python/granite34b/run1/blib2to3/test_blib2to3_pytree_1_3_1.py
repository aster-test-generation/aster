import unittest
from blib2to3.pytree import Node, Leaf


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(1, [Leaf(2, "a"), Leaf(3, "b")])
        self.assertEqual(node.type, 1)
        self.assertEqual(len(node.children), 2)
        self.assertEqual(node.children[0].type, 2)
        self.assertEqual(node.children[0].value, "a")
        self.assertEqual(node.children[1].type, 3)
        self.assertEqual(node.children[1].value, "b")

    def test_repr(self):
        node = Node(1, [Leaf(2, "a"), Leaf(3, "b")])
        self.assertEqual(repr(node), "Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])")

    def test_eq(self):
        node1 = Node(1, [Leaf(2, "a"), Leaf(3, "b")])
        node2 = Node(1, [Leaf(2, "a"), Leaf(3, "b")])
        node3 = Node(1, [Leaf(2, "a"), Leaf(4, "c")])
        self.assertEqual(node1, node2)
        self.assertNotEqual(node1, node3)

class TestLeaf(unittest.TestCase):
    def test_init(self):
        leaf = Leaf(1, "a")
        self.assertEqual(leaf.type, 1)
        self.assertEqual(leaf.value, "a")

    def test_repr(self):
        leaf = Leaf(1, "a")
        self.assertEqual(repr(leaf), "Leaf(1, 'a')")

    def test_eq(self):
        leaf1 = Leaf(1, "a")
        leaf2 = Leaf(1, "a")
        leaf3 = Leaf(1, "b")
        self.assertEqual(leaf1, leaf2)
        self.assertNotEqual(leaf1, leaf3)

if __name__ == '__main__':
    unittest.main()