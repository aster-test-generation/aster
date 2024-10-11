import unittest
from blib2to3.pytree import *


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

    def test_new(self):
        instance = Base(1)
        self.assertIsInstance(instance, Base)

    def test_eq(self):
        instance = Base()
        self.assertEqual(instance, instance)

    def test_prefix(self):
        instance = Base()
        self.assertIsInstance(instance.prefix, Text)

    def test_eq(self):
        instance = Base(1)
        self.assertEqual(instance, instance)

    def test_clone(self):
        instance = Base(10)
        self.assertIsInstance(instance.clone(), Base)

    def test_post_order(self):
        instance = Base()
        self.assertIsInstance(instance.post_order(), Iterator[NL])

    def test_pre_order(self):
        instance = Base()
        self.assertIsInstance(instance.pre_order(), Iterator[NL])

    def test_replace(self):
        instance = Base()
        instance.replace(None)

    def test_get_lineno(self):
        instance = Base(1)
        self.assertIsInstance(instance.get_lineno(), Optional[int])

    def test_changed(self):
        instance = Base(10)
        instance.changed()

    def test_remove(self):
        instance = Base(10)
        self.assertIsInstance(instance.remove(), Optional[int])

    def test_next_sibling(self):
        instance = Base(1, 2)
        self.assertIsInstance(instance.next_sibling, Optional[NL])

    def test_prev_sibling(self):
        instance = Base(1, 2)
        self.assertIsInstance(instance.prev_sibling, Optional[NL])

    def test_leaves(self):
        instance = Base()
        self.assertIsInstance(instance.leaves(), Iterator['Leaf'])

    def test_depth(self):
        instance = Base(10)
        self.assertIsInstance(instance.depth(), int)

    def test_get_suffix(self):
        instance = Base(10)
        self.assertIsInstance(instance.get_suffix(), Text)

if __name__ == '__main__':
    unittest.main()