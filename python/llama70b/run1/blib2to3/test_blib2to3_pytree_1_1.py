import unittest
from blib2to3.pytree import Base, Node, Leaf


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base()
        self.assertIsNotNone(instance)

    def test_new(self):
        instance = Base.__new__(Base)
        self.assertIsNotNone(instance)

    def test_eq(self):
        instance1 = Base()
        instance2 = Base()
        self.assertNotEqual(instance1, instance2)

    def test_eq_private_method(self):
        instance1 = Base()
        instance2 = Base()
        self.assertNotEqual(instance1._Base__eq(instance2), True)

    def test_clone(self):
        instance = Base()
        with self.assertRaises(NotImplementedError):
            instance.clone()

    def test_post_order(self):
        instance = Base()
        with self.assertRaises(NotImplementedError):
            instance.post_order()

    def test_pre_order(self):
        instance = Base()
        with self.assertRaises(NotImplementedError):
            instance.pre_order()

    def test_replace(self):
        instance = Base()
        with self.assertRaises(AssertionError):
            instance.replace(None)

    def test_get_lineno(self):
        instance = Base()
        self.assertIsNone(instance.get_lineno())

    def test_changed(self):
        instance = Base()
        instance.changed()
        self.assertTrue(instance.was_changed)

    def test_remove(self):
        instance = Base()
        self.assertIsNone(instance.remove())

    def test_next_sibling(self):
        instance = Base()
        self.assertIsNone(instance.next_sibling)

    def test_prev_sibling(self):
        instance = Base()
        self.assertIsNone(instance.prev_sibling)

    def test_leaves(self):
        instance = Base()
        with self.assertRaises(NotImplementedError):
            instance.leaves()

    def test_depth(self):
        instance = Base()
        self.assertEqual(instance.depth(), 0)

    def test_get_suffix(self):
        instance = Base()
        self.assertEqual(instance.get_suffix(), '')

class TestNode(unittest.TestCase):
    def test_init(self):
        instance = Node()
        self.assertIsNotNone(instance)

class TestLeaf(unittest.TestCase):
    def test_init(self):
        instance = Leaf()
        self.assertIsNotNone(instance)

if __name__ == '__main__':
    unittest.main()