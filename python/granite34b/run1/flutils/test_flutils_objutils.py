import unittest
from flutils.objutils import (
    has_any_attrs,
    has_any_callables,
    has_attrs,
    has_callables,
    is_list_like,
    is_subclass_of_any,
)
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
        class TestClass:
            attr1 = 1
            attr2 = 2

        obj = TestClass()
        self.assertTrue(has_any_attrs(obj, 'attr1'))
        self.assertTrue(has_any_attrs(obj, 'attr2'))
        self.assertTrue(has_any_attrs(obj, 'attr1', 'attr2'))
        self.assertFalse(has_any_attrs(obj, 'attr3'))
        self.assertFalse(has_any_attrs(obj, 'attr1', 'attr3'))

    def test_has_any_callables(self):
        class TestClass:
            def method1(self):
                pass

            def method2(self):
                pass

        obj = TestClass()
        self.assertTrue(has_any_callables(obj, 'method1'))
        self.assertTrue(has_any_callables(obj, 'method2'))
        self.assertTrue(has_any_callables(obj, 'method1', 'method2'))
        self.assertFalse(has_any_callables(obj, 'method3'))
        self.assertFalse(has_any_callables(obj, 'method1', 'method3'))

    def test_has_attrs(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

        obj = TestClass()
        self.assertTrue(has_attrs(obj, 'attr1'))
        self.assertTrue(has_attrs(obj, 'attr2'))
        self.assertTrue(has_attrs(obj, 'attr1', 'attr2'))
        self.assertFalse(has_attrs(obj, 'attr3'))
        self.assertFalse(has_attrs(obj, 'attr1', 'attr3'))

    def test_has_callables(self):
        class TestClass:
            def method1(self):
                pass

            def method2(self):
                pass

        obj = TestClass()
        self.assertTrue(has_callables(obj, 'method1'))
        self.assertTrue(has_callables(obj, 'method2'))
        self.assertTrue(has_callables(obj, 'method1', 'method2'))
        self.assertFalse(has_callables(obj, 'method3'))
        self.assertFalse(has_callables(obj, 'method1', 'method3'))

    def test_is_list_like(self):
        self.assertTrue(is_list_like([1, 2, 3]))
        self.assertTrue(is_list_like(set([1, 2, 3])))
        self.assertTrue(is_list_like(frozenset([1, 2, 3])))
        self.assertTrue(is_list_like((1, 2, 3)))
        from collections import deque
        self.assertTrue(is_list_like(iter([1, 2, 3])))
        self.assertTrue(is_list_like(ValuesView({1: 2, 3: 4})))
        self.assertTrue(is_list_like(KeysView({1: 2, 3: 4})))
        self.assertTrue(is_list_like(UserList([1, 2, 3])))
        self.assertFalse(is_list_like(123))
        self.assertFalse(is_list_like('abc'))
        self.assertFalse(is_list_like({'a': 1, 'b': 2}))

    def test_is_subclass_of_any(self):
        class TestClass:
            pass

        class SubClass(TestClass):
            pass

class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        obj = object()
        self.assertTrue(has_any_attrs(obj, 'attr1', 'attr2'))
        self.assertFalse(has_any_attrs(obj, 'attr3', 'attr4'))

    def test_has_any_callables(self):
        obj = object()
        self.assertTrue(has_any_callables(obj, 'method1', 'method2'))
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
        self.assertTrue(is_list_like([1, 2, 3]))
        self.assertTrue(is_list_like((1, 2, 3)))
        self.assertTrue(is_list_like({1, 2, 3}))
        self.assertTrue(is_list_like(range(1, 4)))
        self.assertTrue(is_list_like(deque([1, 2, 3])))
        self.assertTrue(is_list_like(iter([1, 2, 3])))
        self.assertTrue(is_list_like(ValuesView({1: 'a', 2: 'b', 3: 'c'})))
        self.assertTrue(is_list_like(KeysView({1: 'a', 2: 'b', 3: 'c'})))
        self.assertTrue(is_list_like(UserList([1, 2, 3])))
        self.assertFalse(is_list_like(123))
        self.assertFalse(is_list_like('abc'))
        self.assertFalse(is_list_like({'a': 1, 'b': 2, 'c': 3}))

    def test_is_subclass_of_any(self):
        class A:
            pass

        class B(A):
            pass

        class C(A):
            pass

        class D(B, C):
            pass

        self.assertTrue(is_subclass_of_any(A, A))
        self.assertTrue(is_subclass_of_any(B, A))
        self.assertTrue(is_subclass_of_any(C, A))
        self.assertTrue(is_subclass_of_any(D, A))
        self.assertTrue(is_subclass_of_any(D, B))
        self.assertTrue(is_subclass_of_any(D, C))
        self.assertFalse(is_subclass_of_any(A, B))
        self.assertFalse(is_subclass_of_any(A, C))
        self.assertFalse(is_subclass_of_any(B, C))
        self.assertFalse(is_subclass_of_any(B, D))
        self.assertFalse(is_subclass_of_any(C, D))

if __name__ == '__main__':
    unittest.main()