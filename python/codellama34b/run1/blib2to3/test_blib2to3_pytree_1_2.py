import unittest
from blib2to3.pytree import Base


class TestNode(unittest.TestCase):
    def test_init(self):
        Node(1, [])
        Node(1, [], context=None)
        Node(1, [], prefix=None)
        Node(1, [], fixers_applied=None)

    def test_eq(self):
        node = Node(1, [])
        node._eq(node)

    def test_clone(self):
        node = Node(1, [])
        node.clone()

    def test_post_order(self):
        node = Node(1, [])
        node.post_order()

    def test_pre_order(self):
        node = Node(1, [])
        node.pre_order()

    def test_prefix(self):
        node = Node(1, [])
        node.prefix
        node.prefix = None

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