import unittest
from blib2to3.pytree import Base, Leaf, Node


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base()
        self.assertEqual(instance.prefix, None)

    def test_eq(self):
        instance1 = Base()
        instance2 = Base()
        self.assertTrue(instance1 == instance2)

    def test_eq_diff_class(self):
        instance1 = Base()
        instance2 = object()
        self.assertEqual(instance1.__eq__(instance2), NotImplemented)

    def test_clone(self):
        instance = Base()
        cloned_instance = instance.clone()
        self.assertEqual(instance, cloned_instance)

    def test_post_order(self):
        instance = Base()
        self.assertEqual(list(instance.post_order()), [])

    def test_pre_order(self):
        instance = Base()
        self.assertEqual(list(instance.pre_order()), [])

    def test_replace(self):
        instance = Base()
        new = Leaf()
        instance.replace(new)
        self.assertEqual(instance.children, [new])

    def test_get_lineno(self):
        instance = Leaf()
        instance.lineno = 1
        self.assertEqual(instance.get_lineno(), 1)

    def test_changed(self):
        instance = Base()
        instance.changed()
        self.assertTrue(instance.was_changed)

    def test_remove(self):
        instance = Base()
        instance.parent = Node()
        instance.parent.children = [instance]
        self.assertEqual(instance.remove(), 0)

    def test_next_sibling(self):
        instance = Leaf()
        instance.parent = Node()
        instance.parent.children = [instance, Leaf()]
        self.assertEqual(instance.next_sibling, instance.parent.children[1])

    def test_prev_sibling(self):
        instance = Leaf()
        instance.parent = Node()
        instance.parent.children = [Leaf(), instance]
        self.assertEqual(instance.prev_sibling, instance.parent.children[0])

    def test_leaves(self):
        instance = Node()
        instance.children = [Leaf(), Leaf()]
        self.assertEqual(list(instance.leaves()), [instance.children[0], instance.children[1]])

    def test_depth(self):
        instance = Node()
        self.assertEqual(instance.depth(), 1)

    def test_get_suffix(self):
        instance = Leaf()
        instance.next_sibling = Leaf()
        self.assertEqual(instance.get_suffix(), instance.next_sibling.prefix)

if __name__ == '__main__':
    unittest.main()