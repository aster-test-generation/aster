import unittest
from blib2to3.pytree import Node, Base


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(256, [Node(1, [])])
        self.assertEqual(node.type, 256)
        self.assertEqual(node.children, [Node(1, [])])
        self.assertIsNone(node.context)
        self.assertIsNone(node.prefix)
        self.assertIsNone(node.fixers_applied)

    def test_repr(self):
        node = Node(256, [Node(1, [])])
        self.assertEqual(str(node), "Node(256, [Node(1, [])])")

    def test_str(self):
        node = Node(256, [Node(1, [])])
        self.assertEqual(str(node), "Node(256, [Node(1, [])])")

    def test_eq(self):
        node1 = Node(256, [Node(1, [])])
        node2 = Node(256, [Node(1, [])])
        self.assertTrue(node1._eq(node2))

    def test_clone(self):
        node = Node(256, [Node(1, [])])
        cloned_node = node.clone()
        self.assertEqual(node.type, cloned_node.type)
        self.assertEqual(node.children, cloned_node.children)

    def test_post_order(self):
        node = Node(256, [Node(1, []), Node(2, [])])
        result = list(node.post_order())
        self.assertEqual(result, [Node(1, []), Node(2, []), Node(256, [Node(1, []), Node(2, [])])])

    def test_pre_order(self):
        node = Node(256, [Node(1, []), Node(2, [])])
        result = list(node.pre_order())
        self.assertEqual(result, [Node(256, [Node(1, []), Node(2, [])]), Node(1, []), Node(2, [])])

    def test_prefix(self):
        node = Node(256, [Node(1, [])])
        self.assertEqual(node.prefix, '')
        node.prefix = 'prefix'
        self.assertEqual(node.prefix, 'prefix')

    def test_set_child(self):
        node = Node(256, [Node(1, [])])
        node.set_child(0, Node(2, []))
        self.assertEqual(node.children, [Node(2, [])])

    def test_insert_child(self):
        node = Node(256, [Node(1, [])])
        node.insert_child(0, Node(2, []))
        self.assertEqual(node.children, [Node(2, []), Node(1, [])])

    def test_append_child(self):
        node = Node(256, [Node(1, [])])
        node.append_child(Node(2, []))
        self.assertEqual(node.children, [Node(1, []), Node(2, [])])

    def test_invalidate_sibling_maps(self):
        node = Node(256, [Node(1, []), Node(2, [])])
        node.invalidate_sibling_maps()
        self.assertIsNone(node.prev_sibling_map)
        self.assertIsNone(node.next_sibling_map)

    def test_update_sibling_maps(self):
        node = Node(256, [Node(1, []), Node(2, [])])
        node.update_sibling_maps()
        self.assertIsNotNone(node.prev_sibling_map)
        self.assertIsNotNone(node.next_sibling_map)

if __name__ == '__main__':
    unittest.main()