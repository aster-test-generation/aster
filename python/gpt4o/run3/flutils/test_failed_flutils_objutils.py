import unittest
from flutils.objutils import *

class TestFlutilsObjutils(unittest.TestCase):
    def test_has_any_attrs_true(self):
        class TestClass:
            attr1 = True
        obj = TestClass()
        result = has_any_attrs(obj, 'attr1', 'attr2')
        self.assertTrue(result)

    def test_has_any_attrs_false(self):
        class TestClass:
            attr1 = True
        obj = TestClass()
        result = has_any_attrs(obj, 'attr2', 'attr3')
        self.assertFalse(result)

    def test_has_any_callables_true(self):
        class TestClass:
            def method1(self):
                pass
        obj = TestClass()
        result = has_any_callables(obj, 'method1', 'method2')
        self.assertTrue(result)

    def test_has_any_callables_false(self):
        class TestClass:
            attr1 = True
        obj = TestClass()
        result = has_any_callables(obj, 'attr1')
        self.assertFalse(result)

    def test_has_attrs_true(self):
        class TestClass:
            attr1 = True
            attr2 = False
        obj = TestClass()
        result = has_attrs(obj, 'attr1', 'attr2')
        self.assertTrue(result)

    def test_has_attrs_false(self):
        class TestClass:
            attr1 = True
        obj = TestClass()
        result = has_attrs(obj, 'attr1', 'attr2')
        self.assertFalse(result)

    def test_has_callables_true(self):
        class TestClass:
            def method1(self):
                pass
            def method2(self):
                pass
        obj = TestClass()
        result = has_callables(obj, 'method1', 'method2')
        self.assertTrue(result)

    def test_has_callables_false(self):
        class TestClass:
            def method1(self):
                pass
            attr1 = True
        obj = TestClass()
        result = has_callables(obj, 'method1', 'attr1')
        self.assertFalse(result)

    def test_is_list_like_true(self):
        obj = [1, 2, 3]
        result = is_list_like(obj)
        self.assertTrue(result)

    def test_is_list_like_false(self):
        obj = 123
        result = is_list_like(obj)
        self.assertFalse(result)

    def test_is_subclass_of_any_true(self):
        class TestClass:
            pass
        obj = TestClass()
        result = is_subclass_of_any(obj, object, list)
        self.assertTrue(result)

    def test_is_subclass_of_any_false(self):
        class TestClass:
            pass
        obj = TestClass()
        result = is_subclass_of_any(obj, list, dict)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()