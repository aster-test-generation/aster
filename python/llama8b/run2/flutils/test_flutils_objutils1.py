import unittest
from flutils.objutils import has_any_attrs, has_any_callables, has_attrs, has_callables, is_list_like, is_subclass_of_any

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