import unittest
from pytutils.props import roclassproperty, classproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestProps(unittest.TestCase):
    def test_roclassproperty(self):
        class TestClass:
            @roclassproperty
            def prop(cls):
                return 42
        self.assertEqual(TestClass.prop, 42)
        with self.assertRaises(AttributeError):
            TestClass.prop = 100
        with self.assertRaises(AttributeError):
            del TestClass.prop

    def test_classproperty(self):
        class TestClass:
            @classproperty
            def prop(cls):
                return 42
        self.assertEqual(TestClass.prop, 42)
        with self.assertRaises(AttributeError):
            TestClass.prop = 100
        with self.assertRaises(AttributeError):
            del TestClass.prop

    def test_setterproperty(self):
        class TestClass:
            _prop = None
            @setterproperty
            def prop(self, value):
                self._prop = value
        instance = TestClass()
        instance.prop = 42
        self.assertEqual(instance._prop, 42)

    def test_lazyperclassproperty(self):
        class TestClass:
            @lazyperclassproperty
            def prop(cls):
                return 42
        self.assertEqual(TestClass.prop, 42)
        self.assertEqual(TestClass.prop, 42)
        delattr(TestClass, '_TestProps__prop')
        self.assertEqual(TestClass.prop, 42)

    def test_lazyclassproperty(self):
        class TestClass:
            @lazyclassproperty
            def prop(cls):
                return 42
        self.assertEqual(TestClass.prop, 42)
        self.assertEqual(TestClass.prop, 42)
        delattr(TestClass, '_lazy_prop')
        self.assertEqual(TestClass.prop, 42)

if __name__ == '__main__':
    unittest.main()