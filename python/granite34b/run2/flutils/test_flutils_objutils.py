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
        obj = {1, 2, 3}
        self.assertTrue(is_list_like(obj))
        obj = (1, 2, 3)
        self.assertTrue(is_list_like(obj))
        from collections import deque
        self.assertTrue(is_list_like(obj))
        obj = iter([1, 2, 3])
        self.assertTrue(is_list_like(obj))
        obj = ValuesView({1: 2, 3: 4})
        self.assertTrue(is_list_like(obj))
        obj = KeysView({1: 2, 3: 4})
        self.assertTrue(is_list_like(obj))
        obj = UserList([1, 2, 3])
        self.assertTrue(is_list_like(obj))
        obj = 1
        self.assertFalse(is_list_like(obj))
        obj = 'string'
        self.assertFalse(is_list_like(obj))
    def test_is_subclass_of_any(self):
        class MyList(list):
            pass
        obj = MyList()
        self.assertTrue(is_subclass_of_any(obj, list, tuple))
        self.assertFalse(is_subclass_of_any(obj, dict, set))
if __name__ == '__main__':
    unittest.main()