import unittest
from flutils.objutils import *


class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

        self.assertTrue(has_any_attrs(TestClass(), 'attr1', 'attr2'))
        self.assertFalse(has_any_attrs(TestClass(), 'attr3', 'attr4'))

    def test_has_any_callables(self):
        class TestClass:
            def method1(self):
                pass

            def method2(self):
                pass

        self.assertTrue(has_any_callables(TestClass(), 'method1', 'method2'))
        self.assertFalse(has_any_callables(TestClass(), 'method3', 'method4'))

    def test_has_attrs(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

        self.assertTrue(has_attrs(TestClass(), 'attr1', 'attr2'))
        self.assertFalse(has_attrs(TestClass(), 'attr3', 'attr4'))

    def test_has_callables(self):
        class TestClass:
            def method1(self):
                pass

            def method2(self):
                pass

        self.assertTrue(has_callables(TestClass(), 'method1', 'method2'))
        self.assertFalse(has_callables(TestClass(), 'method3', 'method4'))

    def test_is_list_like(self):
        self.assertTrue(is_list_like([]))
        self.assertTrue(is_list_like(set()))
        self.assertTrue(is_list_like(frozenset()))
        self.assertTrue(is_list_like(tuple()))
        from collections import deque
        self.assertTrue(is_list_like(Iterator))
        self.assertTrue(is_list_like(ValuesView))
        self.assertTrue(is_list_like(KeysView))
        self.assertTrue(is_list_like(UserList))
        self.assertFalse(is_list_like(1))
        self.assertFalse(is_list_like(''))
        self.assertFalse(is_list_like({}))
        self.assertFalse(is_list_like(object()))

    def test_is_subclass_of_any(self):
        class TestClass:
            pass

        self.assertTrue(is_subclass_of_any(TestClass(), object))
        self.assertTrue(is_subclass_of_any(TestClass(), TestClass))
        self.assertFalse(is_subclass_of_any(TestClass(), (int, float)))
        self.assertFalse(is_subclass_of_any(TestClass(), ''))
        self.assertFalse(is_subclass_of_any(TestClass(), {}))
        self.assertFalse(is_subclass_of_any(TestClass(), object()))

if __name__ == '__main__':
    unittest.main()