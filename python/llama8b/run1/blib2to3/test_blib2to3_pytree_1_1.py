import unittest
from blib2to3.pytree import Base, Leaf, Node


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base()
        self.assertEqual(instance.prefix, None)

    def test_eq(self):
        instance = Base()
        other = Base()
        self.assertTrue(instance == other)

    def test_eq_diff_class(self):
        instance = Base()
        other = object()
        self.assertEqual(instance == other, NotImplemented)

    def test_eq_diff_instance(self):
        instance = Base()
        other = Base()
        other.prefix = 'new'
        self.assertFalse(instance == other)

    def test_clone(self):
        instance = Base()
        clone = instance.clone()
        self.assertEqual(instance, clone)

    def test_post_order(self):
        instance = Node()
        instance.children = [Leaf(), Leaf()]
        result = list(instance.post_order())
        self.assertEqual(len(result), 2)

    def test_pre_order(self):
        instance = Node()
        instance.children = [Leaf(), Leaf()]
        result = list(instance.pre_order())
        self.assertEqual(len(result), 2)

    def test_replace(self):
        instance = Node()
        instance.children = [Leaf(), Leaf()]
        new_children = [Leaf(), Leaf(), Leaf()]
        instance.replace(new_children)
        self.assertEqual(len(instance.children), 3)

    def test_get_lineno(self):
        instance = Leaf()
        instance.lineno = 1
        self.assertEqual(instance.get_lineno(), 1)

    def test_changed(self):
        instance = Base()
        instance.changed()
        self.assertTrue(instance.was_changed)

    def test_remove(self):
        instance = Node()
        instance.children = [Leaf()]
        self.assertEqual(instance.remove(), 0)

    def test_next_sibling(self):
        instance = Node()
        instance.children = [Leaf(), Leaf()]
        self.assertEqual(instance.next_sibling, instance.children[1])

    def test_prev_sibling(self):
        instance = Node()
        instance.children = [Leaf(), Leaf()]
        self.assertEqual(instance.prev_sibling, None)

    def test_leaves(self):
        instance = Node()
        instance.children = [Leaf(), Leaf()]
        result = list(instance.leaves())
        self.assertEqual(len(result), 2)

    def test_depth(self):
        instance = Node()
        self.assertEqual(instance.depth(), 0)
        instance.children = [Node()]
        self.assertEqual(instance.depth(), 1)
        instance.children[0].children = [Node()]
        self.assertEqual(instance.depth(), 2)

    def test_get_suffix(self):
        instance = Node()
        instance.next_sibling = Leaf()
        self.assertEqual(instance.get_suffix(), 'new')

class TestLeaf(unittest.TestCase):
    def test_get_lineno(self):
        instance = Leaf()
        instance.lineno = 1
        self.assertEqual(instance.get_lineno(), 1)

class TestNode(unittest.TestCase):
    def test_get_lineno(self):
        instance = Node()
        instance.children = [Leaf()]
        self.assertEqual(instance.get_lineno(), 1)

if __name__ == '__main__':
    unittest.main()