import unittest
from flutils.objutils import *
from flutils.objutils import (
    has_any_attrs,
    has_any_callables,
    has_attrs,
    has_callables,
    is_list_like,
    is_subclass_of_any,
)


class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        obj = object()
        self.assertTrue(has_any_attrs(obj, 'attr1', 'attr2'))
        self.assertFalse(has_any_attrs(obj, 'attr3', 'attr4'))

    def test_has_any_callables(self):
        obj = object()
        self.assertTrue(has_any_callables(obj, 'method1', 'method2', 'method3'))
        self.assertFalse(has_any_callables(obj, 'method3', 'method4'))

    def test_has_attrs(self):
        obj = object()
        self.assertTrue(has_attrs(obj, 'attr1', 'attr2'))
        self.assertFalse(has_attrs(obj, 'attr3', 'attr4'))

    def test_has_callables(self):
        obj = object()
        self.assertTrue(has_callables(obj, 'method1', 'method2'))
        self.assertFalse(has_callables(obj, 'method3', 'method4'))

    def test_is_list_like(self):
        obj = [1, 2, 3]
        self.assertTrue(is_list_like(obj))
        obj = set([1, 2, 3])
        self.assertTrue(is_list_like(obj))
        obj = frozenset([1, 2, 3])
        self.assertTrue(is_list_like(obj))
        obj = tuple([1, 2, 3])
        self.assertTrue(is_list_like(obj))
        from collections import deque
        self.assertTrue(is_list_like(obj))
        obj = iter([1, 2, 3])
        self.assertTrue(is_list_like(obj))
        obj = iter(range(1, 4))
        self.assertTrue(is_list_like(obj))
        obj = iter(set([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(frozenset([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(tuple([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(deque([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(UserList([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(range(1, 4))
        self.assertTrue(is_list_like(obj))
        obj = iter(set([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(frozenset([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(tuple([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(deque([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = iter(UserList([1, 2, 3]))
        self.assertTrue(is_list_like(obj))
        obj = 1
        self.assertFalse(is_list_like(obj))
        obj = 'string'
        self.assertFalse(is_list_like(obj))
        obj = None
        self.assertFalse(is_list_like(obj))

    def test_is_subclass_of_any(self):
        obj = object()
        self.assertTrue(is_subclass_of_any(obj, object))
        self.assertFalse(is_subclass_of_any(obj, int))

class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        obj = object()
        self.assertTrue(has_any_attrs(obj, 'a', 'b'))
        self.assertFalse(has_any_attrs(obj, 'a', 'b', 'c'))

    def test_has_any_callables(self):
        obj = object()
        self.assertTrue(has_any_callables(obj, 'a', 'b'))
        self.assertFalse(has_any_callables(obj, 'a', 'b', 'c'))

    def test_has_attrs(self):
        obj = object()
        self.assertTrue(has_attrs(obj, 'a', 'b'))
        self.assertFalse(has_attrs(obj, 'a', 'b', 'c'))

    def test_has_callables(self):
        obj = object()
        self.assertTrue(has_callables(obj, 'a', 'b'))
        self.assertFalse(has_callables(obj, 'a', 'b', 'c'))

    def test_is_list_like(self):
        obj = object()
        self.assertTrue(is_list_like(obj))
        self.assertFalse(is_list_like(obj))

    def test_is_subclass_of_any(self):
        obj = object()
        self.assertTrue(is_subclass_of_any(obj, object))
        self.assertFalse(is_subclass_of_any(obj, int))

if __name__ == '__main__':
    unittest.main()