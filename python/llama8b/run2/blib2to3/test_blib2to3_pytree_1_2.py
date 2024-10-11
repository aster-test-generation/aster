import unittest
from blib2to3.pytree import Node, Grammar


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(256, [])
        self.assertEqual(node.type, 256)
        self.assertEqual(node.children, [])

    def test_repr(self):
        node = Node(256, [])
        result = repr(node)
        self.assertEqual(result, 'Node(256, [])')

    def test_str(self):
        node = Node(256, [1, 2, 3])
        result = str(node)
        self.assertEqual(result, '123')

    def test_eq(self):
        node1 = Node(256, [1, 2, 3])
        node2 = Node(256, [1, 2, 3])
        self.assertTrue(node1._eq(node2))

    def test_clone(self):
        node = Node(256, [1, 2, 3])
        cloned_node = node.clone()
        self.assertEqual(node.type, cloned_node.type)
        self.assertEqual(node.children, cloned_node.children)

    def test_post_order(self):
        node = Node(256, [1, 2, 3])
        result = list(node.post_order())
        self.assertEqual(result, [1, 2, 3])

    def test_pre_order(self):
        node = Node(256, [1, 2, 3])
        result = list(node.pre_order())
        self.assertEqual(result, [1, 2, 3])

    def test_prefix(self):
        node = Node(256, [1, 2, 3])
        self.assertEqual(node.prefix, '')

    def test_set_child(self):
        node = Node(256, [1, 2, 3])
        node.set_child(0, 4)
        self.assertEqual(node.children[0], 4)

    def test_insert_child(self):
        node = Node(256, [1, 2, 3])
        node.insert_child(1, 4)
        self.assertEqual(node.children[1], 4)

    def test_append_child(self):
        node = Node(256, [1, 2, 3])
        node.append_child(4)
        self.assertEqual(node.children[-1], 4)

    def test_invalidate_sibling_maps(self):
        node = Node(256, [1, 2, 3])
        node.invalidate_sibling_maps()
        self.assertIsNone(node.prev_sibling_map)
        self.assertIsNone(node.next_sibling_map)

    def test_update_sibling_maps(self):
        node = Node(256, [1, 2, 3])
        node.update_sibling_maps()
        self.assertIsNotNone(node.prev_sibling_map)
        self.assertIsNotNone(node.next_sibling_map)

if __name__ == '__main__':
    unittest.main()