import unittest
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