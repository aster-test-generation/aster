import unittest
from blib2to3.pytree import Node, Leaf


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        self.assertEqual(node.type, 1)
        self.assertEqual(node.children, [Leaf(2, 'a'), Leaf(3, 'b')])
        self.assertEqual(node.prefix, '')
        self.assertIsNone(node.parent)
        self.assertIsNone(node.prev_sibling)
        self.assertIsNone(node.next_sibling)
        self.assertIsNone(node.prev_sibling_map)
        self.assertIsNone(node.next_sibling_map)
        self.assertIsNone(node.fixers_applied)

    def test_clone(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        clone = node.clone()
        self.assertEqual(clone.type, 1)
        self.assertEqual(clone.children, [Leaf(2, 'a'), Leaf(3, 'b')])
        self.assertEqual(clone.prefix, '')
        self.assertIsNone(clone.parent)
        self.assertIsNone(clone.prev_sibling)
        self.assertIsNone(clone.next_sibling)
        self.assertIsNone(clone.prev_sibling_map)
        self.assertIsNone(clone.next_sibling_map)
        self.assertIsNone(clone.fixers_applied)
        self.assertIsNot(node, clone)
        self.assertIsNot(node.children[0], clone.children[0])
        self.assertIsNot(node.children[1], clone.children[1])

    def test_post_order(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        self.assertEqual(list(node.post_order()), [Leaf(2, 'a'), Leaf(3, 'b'), node])

    def test_pre_order(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        self.assertEqual(list(node.pre_order()), [node, Leaf(2, 'a'), Leaf(3, 'b')])

    def test_set_child(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        child = Leaf(4, 'c')
        node.set_child(0, child)
        self.assertEqual(node.children, [child, Leaf(3, 'b')])
        self.assertIsNone(node.children[0].parent)
        self.assertIs(node.children[1].parent, node)

    def test_insert_child(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        child = Leaf(4, 'c')
        node.insert_child(1, child)
        self.assertEqual(node.children, [Leaf(2, 'a'), child, Leaf(3, 'b')])
        self.assertIsNone(node.children[0].parent)
        self.assertIs(node.children[1].parent, node)
        self.assertIsNone(node.children[2].parent)

    def test_append_child(self):
        node = Node(1, [Leaf(2, 'a'), Leaf(3, 'b')])
        child = Leaf(4, 'c')
        node.append_child(child)
        self.assertEqual(node.children, [Leaf(2, 'a'), Leaf(3, 'b'), child])
        self.assertIsNone(node.children[0].parent)
        self.assertIs(node.children[1].parent, node)
        self.assertIsNone(node.children[2].parent)

if __name__ == '__main__':
    unittest.main()