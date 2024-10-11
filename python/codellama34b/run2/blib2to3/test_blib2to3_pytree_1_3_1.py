import unittest
from blib2to3.pytree import BasePattern



class TestNodePattern(unittest.TestCase):
    def test_init(self):
        NodePattern(None, None, None)

    def test_submatch(self):
        NodePattern(None, None, None)._submatch(None, None)

class TestNode(unittest.TestCase):
    def test_init(self):
        Node(None, None, None, None)

    def test_get_type(self):
        Node(None, None, None, None).get_type()

    def test_get_prefix(self):
        Node(None, None, None, None).get_prefix()

    def test_get_children(self):
        Node(None, None, None, None).get_children()

    def test_get_child_count(self):
        Node(None, None, None, None).get_child_count()

    def test_get_child(self):
        Node(None, None, None, None).get_child(None)

    def test_get_prev_sibling(self):
        Node(None, None, None, None).get_prev_sibling()

    def test_get_next_sibling(self):
        Node(None, None, None, None).get_next_sibling()

    def test_get_parent(self):
        Node(None, None, None, None).get_parent()

    def test_get_prev_leaf(self):
        Node(None, None, None, None).get_prev_leaf()

    def test_get_next_leaf(self):
        Node(None, None, None, None).get_next_leaf()

    def test_get_prev_node(self):
        Node(None, None, None, None).get_prev_node()

    def test_get_next_node(self):
        Node(None, None, None, None).get_next_node()

    def test_get_first_leaf(self):
        Node(None, None, None, None).get_first_leaf()

    def test_get_last_leaf(self):
        Node(None, None, None, None).get_last_leaf()

    def test_get_prev_matching_leaf(self):
        Node(None, None, None, None).get_prev_matching_leaf(None)

    def test_get_next_matching_leaf(self):
        Node(None, None, None, None).get_next_matching_leaf(None)

    def test_get_prev_matching_node(self):
        Node(None, None, None, None).get_prev_matching_node(None)

    def test_get_next_matching_node(self):
        Node(None, None, None, None).get_next_matching_node(None)

    def test_get_changes(self):
        Node(None, None, None, None).get_changes()

    def test_get_prefixed_changes(self):
        Node(None, None, None, None).get_prefixed_changes()

    def test_get_old_changes(self):
        Node(None, None, None, None).get_old_changes()

    def test_get_old_prefixed_changes(self):
        Node(None, None, None, None).get_old_prefixed_changes()

    def test_get_new_changes(self):
        Node(None, None, None, None).get_new_changes()

    def test_get_new_prefixed_changes(self):
        Node(None, None, None, None).get_new_prefixed_changes()

    def test_get_old_node(self):
        Node(None, None, None, None).get_old_node()

    def test_get_new_node(self):
        Node(None, None, None, None).get_new_node()

    def test_get_changes_recursive(self):
        Node(None, None, None, None).get_changes_recursive()

if __name__ == '__main__':
    unittest.main()