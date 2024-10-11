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
        node = Node(1, [])
        self.assertEqual(str(node), '')

    def test_eq(self):
        node1 = Node(1, [])
        node2 = Node(1, [])
        self.assertEqual(node1, node2)

    def test_clone(self):
        node = Node(1, [])
        clone = node.clone()
        self.assertEqual(clone.type, 1)
        self.assertEqual(clone.children, [])
        self.assertEqual(clone.prefix, '')
        self.assertEqual(clone.fixers_applied, None)

    def test_post_order(self):
        node = Node(1, [])
        self.assertEqual(list(node.post_order()), [node])

    def test_pre_order(self):
        node = Node(1, [])
        self.assertEqual(list(node.pre_order()), [node])

    def test_prefix(self):
        node = Node(1, [])
        self.assertEqual(node.prefix, '')
        node.prefix = ' '
        self.assertEqual(node.prefix, ' ')

    def test_set_child(self):
        node = Node(1, [])
        child = Node(2, [])
        node.set_child(0, child)
        self.assertEqual(node.children, [child])

    def test_insert_child(self):
        node = Node(1, [])
        child = Node(2, [])
        node.insert_child(0, child)
        self.assertEqual(node.children, [child])

    def test_append_child(self):
        node = Node(1, [])
        child = Node(2, [])
        node.append_child(child)
        self.assertEqual(node.children, [child])

    def test_invalidate_sibling_maps(self):
        node = Node(1, [])
        node.invalidate_sibling_maps()
        self.assertEqual(node.prev_sibling_map, None)
        self.assertEqual(node.next_sibling_map, None)

    def test_update_sibling_maps(self):
        node = Node(1, [])
        node.update_sibling_maps()
        self.assertEqual(node.prev_sibling_map, {})
        self.assertEqual(node.next_sibling_map, {})

if __name__ == '__main__':
    unittest.main()