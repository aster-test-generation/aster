import unittest
from flutils.objutils import *


class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

        self.assertTrue(has_any_attrs(TestClass(), 'attr1', 'attr2', 'attr3'))
        self.assertFalse(has_any_attrs(TestClass(), 'attr3', 'attr4'))

    def test_has_any_callables(self):
        class TestClass:
            def method1(self):
                pass

            def method2(self):
                pass

        self.assertTrue(has_any_callables(TestClass(), 'method1', 'method2', 'method3'))
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
        self.assertTrue(is_list_like([1, 2, 3]))
        self.assertTrue(is_list_like(set([1, 2, 3])))
        self.assertTrue(is_list_like(frozenset([1, 2, 3])))
        self.assertTrue(is_list_like(tuple([1, 2, 3])))
        self.assertTrue(is_list_like(collections.deque([1, 2, 3])))
        self.assertTrue(is_list_like(range(3)))
        self.assertFalse(is_list_like(1))
        self.assertFalse(is_list_like('abc'))
        self.assertFalse(is_list_like({'a', 'b', 'c'}))

    def test_is_subclass_of_any(self):
        class TestClass:
            pass

        self.assertTrue(is_subclass_of_any(TestClass(), object, TestClass))
        self.assertFalse(is_subclass_of_any(TestClass(), object, int))

class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

        self.assertTrue(has_any_attrs(TestClass(), 'attr1', 'attr2'))
        self.assertFalse(has_any_attrs(TestClass(), 'attr3', 'attr4'))

    def test_has_any_callables(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

            def callable1(self):
                pass

            def callable2(self):
                pass

        self.assertTrue(has_any_callables(TestClass(), 'callable1', 'callable2'))
        self.assertFalse(has_any_callables(TestClass(), 'callable3', 'callable4'))

    def test_has_attrs(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

        self.assertTrue(has_attrs(TestClass(), 'attr1', 'attr2'))
        self.assertFalse(has_attrs(TestClass(), 'attr3', 'attr4'))

    def test_has_callables(self):
        class TestClass:
            attr1 = 1
            attr2 = 2

            def callable1(self):
                pass

            def callable2(self):
                pass

        self.assertTrue(has_callables(TestClass(), 'callable1', 'callable2'))
        self.assertFalse(has_callables(TestClass(), 'callable3', 'callable4'))

    def test_is_list_like(self):
        self.assertTrue(is_list_like([]))
        self.assertTrue(is_list_like(set()))
        self.assertTrue(is_list_like(frozenset()))
        self.assertTrue(is_list_like(tuple()))
        self.assertTrue(is_list_like(deque()))
        self.assertTrue(is_list_like(Iterator))
        self.assertTrue(is_list_like(ValuesView))
        self.assertTrue(is_list_like(KeysView))
        self.assertTrue(is_list_like(UserList))
        self.assertFalse(is_list_like(1))
        self.assertFalse(is_list_like(''))
        self.assertFalse(is_list_like({}))
        self.assertFalse(is_list_like(None))

    def test_is_subclass_of_any(self):
        class TestClass:
            pass

        self.assertTrue(is_subclass_of_any(TestClass(), object))
        self.assertTrue(is_subclass_of_any(TestClass(), TestClass))
        self.assertFalse(is_subclass_of_any(TestClass(), int))
        self.assertFalse(is_subclass_of_any(TestClass(), str))
        self.assertFalse(is_subclass_of_any(TestClass(), None))

if __name__ == '__main__':
    unittest.main()