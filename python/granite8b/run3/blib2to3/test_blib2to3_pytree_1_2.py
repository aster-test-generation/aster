import unittest
from blib2to3.pytree import Node


class TestNode(unittest.TestCase):
    def test_init(self):
        node = Node(1, [])
        self.assertEqual(node.type, 1)
        self.assertEqual(node.children, [])
        self.assertIsNone(node.parent)
        self.assertIsNone(node.prefix)
        self.assertIsNone(node.fixers_applied)

    def test_clone(self):
        node = Node(1, [])
        cloned_node = node.clone()
        self.assertEqual(cloned_node.type, 1)
        self.assertEqual(cloned_node.children, [])
        self.assertIsNone(cloned_node.parent)
        self.assertIsNone(cloned_node.prefix)
        self.assertIsNone(cloned_node.fixers_applied)

    def test_post_order(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        self.assertEqual(list(node.post_order()), [node.children[0], node.children[1], node])

    def test_pre_order(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        self.assertEqual(list(node.pre_order()), [node, node.children[0], node.children[1]])

    def test_set_child(self):
        node = Node(1, [Node(2, [])])
        new_child = Node(3, [])
        node.set_child(0, new_child)
        self.assertEqual(node.children, [new_child])

    def test_insert_child(self):
        node = Node(1, [Node(2, [])])
        new_child = Node(3, [])
        node.insert_child(0, new_child)
        self.assertEqual(node.children, [new_child, node.children[0]])

    def test_append_child(self):
        node = Node(1, [Node(2, [])])
        new_child = Node(3, [])
        node.append_child(new_child)
        self.assertEqual(node.children, [node.children[0], new_child])

    def test_invalidate_sibling_maps(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        node.invalidate_sibling_maps()
        self.assertIsNone(node.prev_sibling_map)
        self.assertIsNone(node.next_sibling_map)

    def test_update_sibling_maps(self):
        node = Node(1, [Node(2, []), Node(3, [])])
        node.update_sibling_maps()
        self.assertEqual(node.prev_sibling_map, {id(node.children[1]): None, id(node.children[0]): None})
        self.assertEqual(node.next_sibling_map, {id(node.children[0]): id(node.children[1]), id(node.children[1]): None})

if __name__ == '__main__':
    unittest.main()