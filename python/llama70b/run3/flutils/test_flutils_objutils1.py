import unittest
from flutils.objutils import (
    has_any_attrs,
    has_any_callables,
    has_attrs,
    has_callables,
    is_list_like,
    is_subclass_of_any,
    _LIST_LIKE,
)

class TestObjUtils(unittest.TestCase):
    def test_has_any_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = True
                self.attr2 = True
        obj = TestClass()
        result = has_any_attrs(obj, 'attr1', 'attr2', 'attr3')
        self.assertTrue(result)

    def test_has_any_callables(self):
        class TestClass:
            def __init__(self):
                self.attr1 = lambda: True
                self.attr2 = lambda: True
        obj = TestClass()
        result = has_any_callables(obj, 'attr1', 'attr2', 'attr3')
        self.assertTrue(result)

    def test_has_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = True
                self.attr2 = True
        obj = TestClass()
        result = has_attrs(obj, 'attr1', 'attr2')
        self.assertTrue(result)

    def test_has_callables(self):
        class TestClass:
            def __init__(self):
                self.attr1 = lambda: True
                self.attr2 = lambda: True
        obj = TestClass()
        result = has_callables(obj, 'attr1', 'attr2')
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

if __name__ == '__main__':
    unittest.main()