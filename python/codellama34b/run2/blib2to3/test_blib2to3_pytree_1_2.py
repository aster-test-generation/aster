import unittest
from blib2to3.pytree import *


class TestNode(unittest.TestCase):
    def test_init(self):
        instance = Node(1, [])
        self.assertEqual(instance.type, 1)
        self.assertEqual(instance.children, [])

    def test_eq(self):
        instance = Node(1, [])
        self.assertEqual(instance._eq(Node(1, [])), True)

    def test_clone(self):
        instance = Node(1, [])
        self.assertEqual(instance.clone(), Node(1, []))

    def test_post_order(self):
        instance = Node(1, [])
        self.assertEqual(instance.post_order(), [])

    def test_pre_order(self):
        instance = Node(1, [])
        self.assertEqual(instance.pre_order(), [])

    def test_prefix(self):
        instance = Node(1, [])
        self.assertEqual(instance.prefix, '')

    def test_set_child(self):
        instance = Node(1, [])
        instance.set_child(0, Node(1, []))

    def test_insert_child(self):
        instance = Node(1, [])
        instance.insert_child(0, Node(1, []))

    def test_append_child(self):
        instance = Node(1, [])
        instance.append_child(Node(1, []))

    def test_invalidate_sibling_maps(self):
        instance = Node(1, [])
        instance.invalidate_sibling_maps()

    def test_update_sibling_maps(self):
        instance = Node(1, [])
        instance.update_sibling_maps()

if __name__ == '__main__':
    unittest.main()