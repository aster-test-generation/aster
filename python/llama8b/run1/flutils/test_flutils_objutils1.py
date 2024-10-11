import unittest
from flutils.objutils import has_any_attrs, has_any_callables, has_attrs, has_callables, is_list_like, is_subclass_of_any

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