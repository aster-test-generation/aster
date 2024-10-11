import unittest
from blib2to3.pytree import Base


class TestNode(unittest.TestCase):
    def test_init(self):
        Node(1, [])

    def test_eq(self):
        node = Node(1, [])
        self.assertTrue(node._eq(node))

    def test_clone(self):
        node = Node(1, [])
        self.assertEqual(node.clone(), node)

    def test_post_order(self):
        node = Node(1, [])
        self.assertEqual(list(node.post_order()), [node])

    def test_pre_order(self):
        node = Node(1, [])
        self.assertEqual(list(node.pre_order()), [node])

    def test_prefix(self):
        node = Node(1, [])
        self.assertEqual(node.prefix, '')

    def test_set_child(self):
        node = Node(1, [])
        node.set_child(0, Node(1, []))

    def test_insert_child(self):
        node = Node(1, [])
        node.insert_child(0, Node(1, []))

    def test_append_child(self):
        node = Node(1, [])
        node.append_child(Node(1, []))

    def test_invalidate_sibling_maps(self):
        node = Node(1, [])
        node.invalidate_sibling_maps()

    def test_update_sibling_maps(self):
        node = Node(1, [])
        node.update_sibling_maps()


if __name__ == '__main__':
    unittest.main()