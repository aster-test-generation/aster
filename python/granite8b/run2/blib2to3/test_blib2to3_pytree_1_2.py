import unittest
from blib2to3.pytree import Node


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(1, [])
        self.assertEqual(node.type, 1)
        self.assertEqual(node.children, [])
        self.assertEqual(node.prefix, '')
        self.assertEqual(node.fixers_applied, None)

    def test_repr(self):
        node = Node(1, [])
        self.assertEqual(repr(node), 'Node(1, [])')

    def test_str(self):
        node = Node(1, [Leaf(2, 'abc'), Leaf(3, 'def')])
        self.assertEqual(str(node), 'abcdef')

    def test_eq(self):
        node1 = Node(1, [])
        node2 = Node(1, [])
        self.assertEqual(node1, node2)
        node2.type = 2
        self.assertNotEqual(node1, node2)
        node2.type = 1
        node2.children.append(Leaf(2, 'abc'))
        self.assertNotEqual(node1, node2)

    def test_clone(self):
        node1 = Node(1, [Leaf(2, 'abc'), Leaf(3, 'def')])
        node2 = node1.clone()
        self.assertEqual(node1, node2)
        self.assertIsNot(node1, node2)
        self.assertIsNot(node1.children[0], node2.children[0])
        node2.children[0].prefix = 'x'
        self.assertNotEqual(node1, node2)
        self.assertEqual(node1.children[0].prefix, '')
        self.assertEqual(node2.children[0].prefix, 'x')

    def test_post_order(self):
        node = Node(1, [Node(2, [Leaf(3, 'abc')]), Leaf(4, 'def')])
        self.assertEqual(list(node.post_order()), [Leaf(3, 'abc'), Leaf(4, 'def'), Node(2, [Leaf(3, 'abc')]), Node(1, [])])

    def test_pre_order(self):
        node = Node(1, [Node(2, [Leaf(3, 'abc')]), Leaf(4, 'def')])
        self.assertEqual(list(node.pre_order()), [Node(1, []), Node(2, [Leaf(3, 'abc')]), Leaf(3, 'abc'), Leaf(4, 'def')])

    def test_set_child(self):
        node = Node(1, [Leaf(2, 'abc'), Leaf(3, 'def')])
        node.set_child(0, Leaf(4, 'ghi'))
        self.assertEqual(list(node.children), [Leaf(4, 'ghi'), Leaf(3, 'def')])

    def test_insert_child(self):
        node = Node(1, [Leaf(2, 'abc'), Leaf(3, 'def')])
        node.insert_child(0, Leaf(4, 'ghi'))
        self.assertEqual(list(node.children), [Leaf(4, 'ghi'), Leaf(2, 'abc'), Leaf(3, 'def')])

    def test_append_child(self):
        node = Node(1, [Leaf(2, 'abc'), Leaf(3, 'def')])
        node.append_child(Leaf(4, 'ghi'))
        self.assertEqual(list(node.children), [Leaf(2, 'abc'), Leaf(3, 'def'), Leaf(4, 'ghi')])

    def test_invalidate_sibling_maps(self):
        node = Node(1, [Leaf(2, 'abc'), Leaf(3, 'def')])
        node.invalidate_sibling_maps()
        self.assertEqual(node.prev_sibling_map, None)
        self.assertEqual(node.next_sibling_map, None)

    def test_update_sibling_maps(self):
        node = Node(1, [Leaf(2, 'abc'), Leaf(3, 'def')])
        node.update_sibling_maps()
        self.assertEqual(node.prev_sibling_map, {id(Leaf(2, 'abc')): None, id(Leaf(3, 'def')): None})
        self.assertEqual(node.next_sibling_map, {id(Leaf(2, 'abc')): None, id(Leaf(3, 'def')): None})

if __name__ == '__main__':
    unittest.main()