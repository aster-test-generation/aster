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
        obj.attr2 = 2
        self.assertTrue(has_attrs(obj, 'attr1', 'attr2'))
        obj.attr3 = 3
        self.assertFalse(has_attrs(obj, 'attr4'))

    def test_has_callables(self):
        obj = object()
        self.assertTrue(has_callables(obj))
        obj.attr1 = lambda: None
        self.assertTrue(has_callables(obj, 'attr1'))
        obj.attr2 = lambda: None
        self.assertTrue(has_callables(obj, 'attr1', 'attr2'))
        obj.attr3 = lambda: None
        self.assertFalse(has_callables(obj, 'attr4'))

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
        class Subclass(list):
            pass
        self.assertTrue(is_subclass_of_any(Subclass, list))
        self.assertFalse(is_subclass_of_any(Subclass, tuple))
        self.assertFalse(is_subclass_of_any(Subclass, object))

class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        obj = object()
        attrs = ['attr1', 'attr2']
        self.assertTrue(has_any_attrs(obj, *attrs))
        self.assertFalse(has_any_attrs(obj, 'non_existent_attr'))

    def test_has_any_callables(self):
        obj = object()
        attrs = ['method1', 'method2']
        self.assertTrue(has_any_callables(obj, *attrs))
        self.assertFalse(has_any_callables(obj, 'non_existent_method'))

    def test_has_attrs(self):
        obj = object()
        attrs = ['attr1', 'attr2']
        self.assertTrue(has_attrs(obj, *attrs))
        self.assertFalse(has_attrs(obj, 'non_existent_attr'))

    def test_has_callables(self):
        obj = object()
        attrs = ['method1', 'method2']
        self.assertTrue(has_callables(obj, *attrs))
        self.assertFalse(has_callables(obj, 'non_existent_method'))

    def test_is_list_like(self):
        obj = list()
        self.assertTrue(is_list_like(obj))
        self.assertFalse(is_list_like(object()))

    def test_is_subclass_of_any(self):
        obj = list()
        self.assertTrue(is_subclass_of_any(obj, list))
        self.assertFalse(is_subclass_of_any(obj, dict))

if __name__ == '__main__':
    unittest.main()