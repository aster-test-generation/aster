import unittest
from blib2to3.pytree import *


class TestBase(unittest.TestCase):
    def test_init(self):
        instance = Base()
        self.assertIsInstance(instance, Base)

    def test_new(self):
        instance = Base()
        self.assertIsInstance(instance, Base)

    def test_eq(self):
        instance = Base()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

    def test_prefix(self):
        instance = Base(1)
        result = instance.prefix
        self.assertIsInstance(result, Text)

    def test_eq(self):
        instance = Base()
        result = instance._eq(None)
        self.assertEqual(result, NotImplemented)

    def test_clone(self):
        instance = Base(1)
        result = instance.clone()
        self.assertIsInstance(result, Base)

    def test_post_order(self):
        instance = Base(1, 2)
        result = instance.post_order()
        self.assertIsInstance(result, Iterator)

    def test_pre_order(self):
        instance = Base(1)
        result = instance.pre_order()
        self.assertIsInstance(result, Iterator)

    def test_replace(self):
        instance = Base()
        instance.replace(None)

    def test_get_lineno(self):
        instance = Base(10)
        result = instance.get_lineno()
        self.assertIsInstance(result, Optional[int])

    def test_changed(self):
        instance = Base(10)
        instance.changed()

    def test_remove(self):
        instance = Base(10)
        result = instance.remove()
        self.assertIsInstance(result, Optional[int])

    def test_next_sibling(self):
        instance = Base(10)
        result = instance.next_sibling
        self.assertIsInstance(result, Optional[NL])

    def test_prev_sibling(self):
        instance = Base(10)
        result = instance.prev_sibling
        self.assertIsInstance(result, Optional[NL])

    def test_leaves(self):
        instance = Base(10)
        result = instance.leaves()
        self.assertIsInstance(result, Iterator)

    def test_depth(self):
        instance = Base(10)
        result = instance.depth()
        self.assertIsInstance(result, int)

    def test_get_suffix(self):
        instance = Base(10)
        result = instance.get_suffix()
        self.assertIsInstance(result, Text)

if __name__ == '__main__':
    unittest.main()