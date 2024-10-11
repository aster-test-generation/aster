import unittest
from pytutils.props import roclassproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestRoClassProperty(unittest.TestCase):
    def test_roclassproperty_get(self):
        class TestClass:
            @roclassproperty
            def foo(cls):
                return 'bar'

        self.assertEqual(TestClass.foo, 'bar')

    def test_roclassproperty_set(self):
        with self.assertRaises(AttributeError):
            from test_class import TestClass

class TestSetterProperty(unittest.TestCase):
    def test_setterproperty_set(self):
        class TestClass:
            foo = setterproperty(lambda obj, value: value)

        obj = TestClass()
        obj.foo = 'baz'
        self.assertEqual(obj.foo(), 'baz'

    def test_setterproperty_get(self):
        with self.assertRaises(AttributeError):
            from your_module import TestClass

class TestLazyPerClassProperty(unittest.TestCase):
    def test_lazyperclassproperty_get(self):
        class TestClass:
            @lazyperclassproperty
            def foo(cls):
                return 'bar'

        self.assertEqual(TestClass.foo, 'bar')

    def test_lazyperclassproperty_set(self):
        with self.assertRaises(AttributeError):
            TestClass = type('TestClass', (), {'foo': 'baz'}

class TestLazyClassProperty(unittest.TestCase):
    def test_lazyclassproperty_get(self):
        class TestClass:
            @lazyclassproperty
            def foo(cls):
                return 'bar'

        self.assertEqual(TestClass.foo, 'bar')

    def test_lazyclassproperty_set(self):
        with self.assertRaises(AttributeError):
            TestClass.foo = 'baz'

if __name__ == '__main__':
    unittest.main()