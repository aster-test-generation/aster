import unittest
from blib2to3.pytree import Base, Node, Leaf


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base()
        self.assertIsInstance(instance, Base)

    def test_new(self):
        instance = Base.__new__(Base)
        self.assertIsInstance(instance, Base)

    def test_eq(self):
        instance1 = Base()
        instance2 = Base()
        result = instance1.__eq__(instance2)
        self.assertIs(result, NotImplemented)

    def test_prefix(self):
        instance = Base()
        with self.assertRaises(NotImplementedError):
            instance.prefix

    def test_eq_private(self):
        instance1 = Base()
        instance2 = Base()
        result = instance1._Base__eq(instance2)
        self.assertIs(result, NotImplemented)

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
        result = instance.get_lineno()
        self.assertIsNone(result)

    def test_changed(self):
        instance = Base()
        instance.changed()
        self.assertTrue(instance.was_changed)

    def test_remove(self):
        instance = Base()
        result = instance.remove()
        self.assertIsNone(result)

    def test_next_sibling(self):
        instance = Base()
        result = instance.next_sibling
        self.assertIsNone(result)

    def test_prev_sibling(self):
        instance = Base()
        result = instance.prev_sibling
        self.assertIsNone(result)

    def test_leaves(self):
        instance = Base()
        result = list(instance.leaves())
        self.assertEqual(result, [])

    def test_depth(self):
        instance = Base()
        result = instance.depth()
        self.assertEqual(result, 0)

    def test_get_suffix(self):
        instance = Base()
        result = instance.get_suffix()
        self.assertEqual(result, '')

class TestNode(unittest.TestCase):
    def test_init(self):
        instance = Node()
        self.assertIsInstance(instance, Node)

class TestLeaf(unittest.TestCase):
    def test_init(self):
        instance = Leaf()
        self.assertIsInstance(instance, Leaf)

if __name__ == '__main__':
    unittest.main()