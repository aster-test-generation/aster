import unittest
from blib2to3.pytree import Base


class TestBase(unittest.TestCase):
    def setUp(self):
        self.instance = Base()

    def test_init(self):
        self.assertIsInstance(self.instance, Base)

    def test_new(self):
        with self.assertRaises(AssertionError):
            Base()

    def test_eq(self):
        other_instance = Base()
        with self.assertRaises(NotImplementedError):
            self.instance == other_instance

    def test_prefix(self):
        with self.assertRaises(NotImplementedError):
            _ = self.instance.prefix

    def test_eq_protected(self):
        with self.assertRaises(NotImplementedError):
            self.instance._eq(self.instance)

    def test_clone(self):
        with self.assertRaises(NotImplementedError):
            self.instance.clone()

    def test_post_order(self):
        with self.assertRaises(NotImplementedError):
            list(self.instance.post_order())

    def test_pre_order(self):
        with self.assertRaises(NotImplementedError):
            list(self.instance.pre_order())

    def test_replace(self):
        self.instance.parent = unittest.mock.Mock()
        self.instance.parent.children = [self.instance]
        new_node = unittest.mock.Mock()
        self.instance.replace(new_node)
        self.assertIsNone(self.instance.parent)

    def test_get_lineno(self):
        self.instance.children = []
        self.assertIsNone(self.instance.get_lineno())

    def test_changed(self):
        self.instance.was_changed = False
        self.instance.parent = unittest.mock.Mock()
        self.instance.changed()
        self.assertTrue(self.instance.was_changed)

    def test_remove(self):
        self.instance.parent = unittest.mock.Mock()
        self.instance.parent.children = [self.instance]
        index = self.instance.remove()
        self.assertEqual(index, 0)

    def test_next_sibling(self):
        self.instance.parent = unittest.mock.Mock()
        self.instance.parent.next_sibling_map = {id(self.instance): None}
        self.assertIsNone(self.instance.next_sibling)

    def test_prev_sibling(self):
        self.instance.parent = unittest.mock.Mock()
        self.instance.parent.prev_sibling_map = {id(self.instance): None}
        self.assertIsNone(self.instance.prev_sibling)

    def test_leaves(self):
        self.instance.children = []
        self.assertEqual(list(self.instance.leaves()), [])

    def test_depth(self):
        self.assertEqual(self.instance.depth(), 0)

    def test_get_suffix(self):
        self.instance.parent = unittest.mock.Mock()
        self.instance.parent.next_sibling_map = {id(self.instance): None}
        self.assertEqual(self.instance.get_suffix(), '')

if __name__ == '__main__':
    unittest.main()