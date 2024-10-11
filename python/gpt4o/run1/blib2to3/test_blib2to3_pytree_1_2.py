import unittest
from blib2to3.pytree import Node
from blib2to3.pgen2.grammar import Grammar


class TestNode(unittest.TestCase):
    def setUp(self):
        self.child1 = Node(257, [])
        self.child2 = Node(258, [])
        self.node = Node(256, [self.child1, self.child2])

    def test_init(self):
        self.assertEqual(self.node.type, 256)
        self.assertEqual(self.node.children, [self.child1, self.child2])
        self.assertIsNone(self.node.fixers_applied)

    def test_repr(self):
        result = repr(self.node)
        self.assertTrue(result.startswith("Node("))

    def test_str(self):
        result = str(self.node)
        self.assertEqual(result, "")

    def test_eq(self):
        other_node = Node(256, [self.child1, self.child2])
        self.assertTrue(self.node._eq(other_node))

    def test_clone(self):
        clone = self.node.clone()
        self.assertEqual(clone.type, self.node.type)
        self.assertEqual(len(clone.children), len(self.node.children))

    def test_post_order(self):
        result = list(self.node.post_order())
        self.assertEqual(result, [self.child1, self.child2, self.node])

    def test_pre_order(self):
        result = list(self.node.pre_order())
        self.assertEqual(result, [self.node, self.child1, self.child2])

    def test_prefix_getter(self):
        self.child1.prefix = "prefix"
        self.assertEqual(self.node.prefix, "prefix")

    def test_prefix_setter(self):
        self.node.prefix = "new_prefix"
        self.assertEqual(self.child1.prefix, "new_prefix")

    def test_set_child(self):
        new_child = Node(259, [])
        self.node.set_child(0, new_child)
        self.assertEqual(self.node.children[0], new_child)
        self.assertIsNone(self.child1.parent)
        self.assertEqual(new_child.parent, self.node)

    def test_insert_child(self):
        new_child = Node(259, [])
        self.node.insert_child(1, new_child)
        self.assertEqual(self.node.children[1], new_child)
        self.assertEqual(new_child.parent, self.node)

    def test_append_child(self):
        new_child = Node(259, [])
        self.node.append_child(new_child)
        self.assertEqual(self.node.children[-1], new_child)
        self.assertEqual(new_child.parent, self.node)

    def test_invalidate_sibling_maps(self):
        self.node.invalidate_sibling_maps()
        self.assertIsNone(self.node.prev_sibling_map)
        self.assertIsNone(self.node.next_sibling_map)

    def test_update_sibling_maps(self):
        self.node.update_sibling_maps()
        self.assertIsNotNone(self.node.prev_sibling_map)
        self.assertIsNotNone(self.node.next_sibling_map)
        self.assertEqual(self.node.prev_sibling_map[id(self.child1)], None)
        self.assertEqual(self.node.next_sibling_map[id(self.child1)], self.child2)

if __name__ == '__main__':
    unittest.main()