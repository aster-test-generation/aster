import unittest
from blib2to3.pytree import Node


def test_node_init():
    node = Node(1, [])
    assert node.type == 1
    assert node.children == []
    assert node.prefix == ''
    assert node.fixers_applied is None

def test_node_repr():
    node = Node(2, [])
    assert repr(node) == 'Node(2, [])'

def test_node_str():
    node = Node(3, [Node(4, []), Node(5, [])])
    assert str(node) == 'Node(4, [])Node(5, [])'

def test_node_eq():
    node1 = Node(6, [])
    node2 = Node(6, [])
    assert node1 == node2

def test_node_clone():
    node = Node(7, [Node(8, [])])
    cloned_node = node.clone()
    assert cloned_node == node

def test_node_post_order():
    node = Node(9, [Node(10, []), Node(11, [])])
    post_order_list = list(node.post_order())
    assert post_order_list == [Node(10, []), Node(11, []), Node(9, [Node(10, []), Node(11, [])])]

def test_node_pre_order():
    node = Node(12, [Node(13, []), Node(14, [])])
    pre_order_list = list(node.pre_order())
    assert pre_order_list == [Node(12, [Node(13, []), Node(14, [])]), Node(13, []), Node(14, [])]

def test_node_prefix():
    node = Node(15, [Node(16, [])])
    assert node.prefix == ''
    node.prefix = 'test'
    assert node.prefix == 'test'

def test_node_set_child():
    node = Node(17, [Node(18, [])])
    new_child = Node(19, [])
    node.set_child(0, new_child)
    assert node.children == [new_child]

def test_node_insert_child():
    node = Node(20, [Node(21, [])])
    new_child = Node(22, [])
    node.insert_child(0, new_child)
    assert node.children == [new_child, Node(21, [])]

def test_node_append_child():
    node = Node(23, [Node(24, [])])
    new_child = Node(25, [])
    node.append_child(new_child)
    assert node.children == [Node(24, []), new_child]

def test_node_invalidate_sibling_maps():
    node = Node(26, [Node(27, []), Node(28, [])])
    node.invalidate_sibling_maps()
    assert node.prev_sibling_map is None
    assert node.next_sibling_map is None

if __name__ == '__main__':
    unittest.main()