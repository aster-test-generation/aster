import unittest
from blib2to3.pytree import Node


class TestNode:
    def test_init(self):
        node = Node(1, [2, 3])
        assert node.type == 1
        assert node.children == [2, 3]
        assert node.prefix == ''
        assert node.fixers_applied is None

    def test_repr(self):
        node = Node(1, [2, 3])
        assert repr(node) == "Node(1, [2, 3])"

    def test_str(self):
        node = Node(1, [2, 3])
        assert str(node) == "23"

    def test_eq(self):
        node1 = Node(1, [2, 3])
        node2 = Node(1, [2, 3])
        assert node1 == node2

    def test_clone(self):
        node = Node(1, [2, 3])
        cloned_node = node.clone()
        assert cloned_node == node
        assert cloned_node is not node

    def test_post_order(self):
        node = Node(1, [2, 3])
        assert list(node.post_order()) == [2, 3, node]

    def test_pre_order(self):
        node = Node(1, [2, 3])
        assert list(node.pre_order()) == [node, 2, 3]

    def test_prefix(self):
        node = Node(1, [2, 3])
        assert node.prefix == ''
        node.prefix = 'x'
        assert node.prefix == 'x'

    def test_set_child(self):
        node = Node(1, [2, 3])
        node.set_child(0, 4)
        assert node.children == [4, 3]

    def test_insert_child(self):
        node = Node(1, [2, 3])
        node.insert_child(1, 4)
        assert node.children == [2, 4, 3]

    def test_append_child(self):
        node = Node(1, [2, 3])
        node.append_child(4)
        assert node.children == [2, 3, 4]

    def test_invalidate_sibling_maps(self):
        node = Node(1, [2, 3])
        node.invalidate_sibling_maps()
        assert node.prev_sibling_map is None
        assert node.next_sibling_map is None

if __name__ == '__main__':
    unittest.main()