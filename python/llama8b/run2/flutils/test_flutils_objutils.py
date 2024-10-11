import unittest
from flutils.objutils import has_any_attrs, has_any_callables, has_attrs, has_callables, is_list_like, is_subclass_of_any


class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        obj = object()
        self.assertFalse(has_any_attrs(obj, 'attr1', 'attr2'))
        obj.attr1 = 1
        self.assertTrue(has_any_attrs(obj, 'attr1', 'attr2'))
        obj.attr2 = 2
        self.assertTrue(has_any_attrs(obj, 'attr1', 'attr2'))

    def test_has_any_callables(self):
        obj = object()
        self.assertFalse(has_any_callables(obj, 'attr1', 'attr2'))
        obj.attr1 = lambda: None
        self.assertTrue(has_any_callables(obj, 'attr1', 'attr2'))
        obj.attr2 = lambda: None
        self.assertTrue(has_any_callables(obj, 'attr1', 'attr2'))

    def test_has_attrs(self):
        obj = object()
        self.assertTrue(has_attrs(obj))
        obj.attr1 = 1
        self.assertTrue(has_attrs(obj, 'attr1'))
        self.assertFalse(has_attrs(obj, 'attr2'))

    def test_has_callables(self):
        obj = object()
        self.assertTrue(has_callables(obj))
        obj.attr1 = lambda: None
        self.assertTrue(has_callables(obj, 'attr1'))
        self.assertFalse(has_callables(obj, 'attr2'))

    def test_is_list_like(self):
        self.assertFalse(is_list_like(object()))
        self.assertTrue(is_list_like(list()))
        self.assertTrue(is_list_like(set()))
        self.assertTrue(is_list_like(frozenset()))
        self.assertTrue(is_list_like(tuple()))
        self.assertTrue(is_list_like(deque()))
        self.assertTrue(is_list_like(Iterator()))
        self.assertTrue(is_list_like(ValuesView()))
        self.assertTrue(is_list_like(KeysView()))
        self.assertTrue(is_list_like(UserList()))

    def test_is_subclass_of_any(self):
        class A:
            pass
        class B(A):
            pass
        self.assertTrue(is_subclass_of_any(B, A))
        self.assertFalse(is_subclass_of_any(B, object))

class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        obj = {'a': 1, 'b': 2}
        self.assertTrue(has_any_attrs(obj, 'a', 'b'))
        self.assertFalse(has_any_attrs(obj, 'c'))

    def test_has_any_callables(self):
        obj = {'a': 1, 'b': 2}
        self.assertFalse(has_any_callables(obj, 'a', 'b'))
        self.assertFalse(has_any_callables(obj, 'c'))

    def test_has_attrs(self):
        obj = {'a': 1, 'b': 2}
        self.assertTrue(has_attrs(obj, 'a', 'b'))
        self.assertFalse(has_attrs(obj, 'c'))

    def test_has_callables(self):
        obj = {'a': 1, 'b': 2}
        self.assertFalse(has_callables(obj, 'a', 'b'))
        self.assertFalse(has_callables(obj, 'c'))

    def test_is_list_like(self):
        self.assertTrue(is_list_like([1, 2, 3]))
        self.assertFalse(is_list_like({'a': 1, 'b': 2}))

    def test_is_subclass_of_any(self):
        class A:
            pass
        class B(A):
            pass
        self.assertTrue(is_subclass_of_any(B, A))
        self.assertFalse(is_subclass_of_any(B, object))

if __name__ == '__main__':
    unittest.main()