import unittest
from blib2to3.pytree import Node, Base


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(1, [Node(2, [])])
        self.assertEqual(node.type, 1)
        self.assertEqual(node.children, [Node(2, [])])
        self.assertIsNone(node.context)
        self.assertIsNone(node.prefix)
        self.assertIsNone(node.fixers_applied)

    def test_repr(self):
        node = Node(1, [Node(2, [])])
        self.assertEqual(repr(node), 'Node(1, [Node(2, [])])')

    def test_str(self):
        node = Node(1, [Node(2, [])])
        self.assertEqual(str(node), '1')

    def test_eq(self):
        node1 = Node(1, [Node(2, [])])
        node2 = Node(1, [Node(2, [])])
        self.assertTrue(node1._eq(node2))

    def test_clone(self):
        node = Node(1, [Node(2, [])])
        cloned_node = node.clone()
        self.assertEqual(node.type, cloned_node.type)
        self.assertEqual(node.children, cloned_node.children)
        self.assertEqual(node.fixers_applied, cloned_node.fixers_applied)

    def test_post_order(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        result = list(node.post_order())
        self.assertEqual(result, [Node(2, []), Node(3, []), Node(1, [Node(2, []), Node(3, [])])])

    def test_pre_order(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        result = list(node.pre_order())
        self.assertEqual(result, [Node(1, [Node(2, []), Node(3, [])]), Node(2, []), Node(3, [])])

    def test_prefix(self):
        node = Node(1, [Node(2, [])])
        self.assertEqual(node.prefix, '')
        node.prefix = 'prefix'
        self.assertEqual(node.prefix, 'prefix')

    def test_set_child(self):
        node = Node(1, [Node(2, [])])
        node.set_child(0, Node(3, []))
        self.assertEqual(node.children[0], Node(3, []))

    def test_insert_child(self):
        node = Node(1, [Node(2, [])])
        node.insert_child(0, Node(3, []))
        self.assertEqual(node.children[0], Node(3, []))

    def test_append_child(self):
        node = Node(1, [Node(2, [])])
        node.append_child(Node(3, []))
        self.assertEqual(node.children[1], Node(3, []))

    def test_invalidate_sibling_maps(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        node.invalidate_sibling_maps()
        self.assertIsNone(node.prev_sibling_map)
        self.assertIsNone(node.next_sibling_map)

    def test_update_sibling_maps(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        node.update_sibling_maps()
        self.assertIsNotNone(node.prev_sibling_map)
        self.assertIsNotNone(node.next_sibling_map)

if __name__ == '__main__':
    unittest.main()