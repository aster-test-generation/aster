import unittest
from flutils.objutils import (
    has_any_attrs,
    has_any_callables,
    has_attrs,
    has_callables,
    is_list_like,
    is_subclass_of_any,
    _LIST_LIKE
)
from flutils.objutils import (
    has_any_attrs,
    has_any_callables,
    has_attrs,
    has_callables,
    is_list_like,
    is_subclass_of_any,
    _LIST_LIKE
)


class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = 'value1'
                self.attr2 = 'value2'
        obj = TestClass()
        result = has_any_attrs(obj, 'attr1', 'attr2', 'attr3')
        self.assertTrue(result)

    def test_has_any_callables(self):
        class TestClass:
            def __init__(self):
                self.method1 = lambda: None
                self.method2 = lambda: None
        obj = TestClass()
        result = has_any_callables(obj, 'method1', 'method2', 'method3')
        self.assertTrue(result)

    def test_has_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = 'value1'
                self.attr2 = 'value2'
        obj = TestClass()
        result = has_attrs(obj, 'attr1', 'attr2')
        self.assertTrue(result)

    def test_has_callables(self):
        class TestClass:
            def __init__(self):
                self.method1 = lambda: None
                self.method2 = lambda: None
        obj = TestClass()
        result = has_callables(obj, 'method1', 'method2')
        self.assertTrue(result)

    def test_is_list_like(self):
        result = is_list_like([1, 2, 3])
        self.assertTrue(result)

    def test_is_subclass_of_any(self):
        class TestClass(list):
            pass
        result = is_subclass_of_any(TestClass, list, tuple)
        self.assertTrue(result)

    def test_list_like_constant(self):
        result = _LIST_LIKE
        self.assertIsNotNone(result)

class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = True
                self.attr2 = False
        obj = TestClass()
        self.assertTrue(has_any_attrs(obj, 'attr1', 'attr2'))
        self.assertFalse(has_any_attrs(obj, 'attr3', 'attr4'))

    def test_has_any_callables(self):
        class TestClass:
            def __init__(self):
                self.attr1 = lambda: True
                self.attr2 = False
        obj = TestClass()
        self.assertTrue(has_any_callables(obj, 'attr1', 'attr2'))
        self.assertFalse(has_any_callables(obj, 'attr3', 'attr4'))

    def test_has_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = True
                self.attr2 = False
        obj = TestClass()
        self.assertTrue(has_attrs(obj, 'attr1', 'attr2'))
        self.assertFalse(has_attrs(obj, 'attr1', 'attr3'))

    def test_has_callables(self):
        class TestClass:
            def __init__(self):
                self.attr1 = lambda: True
                self.attr2 = lambda: False
        obj = TestClass()
        self.assertTrue(has_callables(obj, 'attr1', 'attr2'))
        self.assertFalse(has_callables(obj, 'attr1', 'attr3'))

    def test_is_list_like(self):
        self.assertTrue(is_list_like([1, 2, 3]))
        self.assertTrue(is_list_like((1, 2, 3)))
        self.assertTrue(is_list_like(deque([1, 2, 3])))
        self.assertFalse(is_list_like({'a': 1, 'b': 2}))

    def test_is_subclass_of_any(self):
        class TestClass:
            pass
        self.assertTrue(is_subclass_of_any(TestClass, object))
        self.assertFalse(is_subclass_of_any(TestClass, int))

    def test_LIST_LIKE(self):
        self.assertIsInstance(_LIST_LIKE, tuple)
        self.assertIn(list, _LIST_LIKE)
        self.assertIn(set, _LIST_LIKE)
        self.assertIn(frozenset, _LIST_LIKE)
        self.assertIn(tuple, _LIST_LIKE)
        self.assertIn(deque, _LIST_LIKE)
        self.assertIn(Iterator, _LIST_LIKE)
        self.assertIn(ValuesView, _LIST_LIKE)
        self.assertIn(KeysView, _LIST_LIKE)
        self.assertIn(UserList, _LIST_LIKE)

if __name__ == '__main__':
    unittest.main()