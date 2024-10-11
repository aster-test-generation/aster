import unittest
from black import Lea


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base()
        self.assertEqual(instance, instance)

    def test_eq(self):
        instance = Base()
        other = Base()
        self.assertTrue(instance == other)

    def test_prefix(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.prefix

    def test_eq_private(self):
        instance = Base()
        other = Base()
        self.assertTrue(instance._eq(other))

    def test_clone(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.clone

    def test_post_order(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.post_order

    def test_pre_order(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.pre_order

    def test_replace(self):
        instance = Base()
        new = Leaf()
        instance.replace(new)

    def test_get_lineno(self):
        instance = Base()
        self.assertIsNone(instance.get_lineno())

    def test_changed(self):
        instance = Base()
        instance.changed()

    def test_remove(self):
        instance = Base()
        self.assertIsNone(instance.remove())

    def test_next_sibling(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.next_sibling

    def test_prev_sibling(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.prev_sibling

    def test_leaves(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.leaves()

    def test_depth(self):
        instance = Base()
        self.assertEqual(instance.depth(), 0)

    def test_get_suffix(self):
        with self.assertRaises(NotImplementedError):
            instance = Base()
            instance.get_suffix()

if __name__ == '__main__':
    unittest.main()