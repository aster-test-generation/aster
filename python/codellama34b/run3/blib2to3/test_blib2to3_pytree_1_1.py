import unittest
from blib2to3.pytree import *


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base()
        self.assertIsInstance(instance, Base)

    def test_new(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

    def test_eq(self):
        instance = Base()
        self.assertIsInstance(instance, Base)

    def test_prefix(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

    def test_eq(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

    def test_clone(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

    def test_post_order(self):
        instance = Base()
        self.assertIsInstance(instance, Base)

    def test_pre_order(self):
        instance = Base(5)
        self.assertIsInstance(instance, Base)

    def test_replace(self):
        instance = Base()
        self.assertIsInstance(instance, Base)

    def test_get_lineno(self):
        instance = Base(10, 20)
        self.assertIsInstance(instance, Base)

    def test_changed(self):
        instance = Base(1)
        self.assertIsInstance(instance, Base)

    def test_remove(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

    def test_next_sibling(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

    def test_prev_sibling(self):
        instance = Base(1, 2)
        self.assertIsInstance(instance, Base)

    def test_leaves(self):
        instance = Base(1)
        self.assertIsInstance(instance, Base)

    def test_depth(self):
        instance = Base(1, 2)
        self.assertIsInstance(instance, Base)

    def test_get_suffix(self):
        instance = Base(10)
        self.assertIsInstance(instance, Base)

if __name__ == '__main__':
    unittest.main()