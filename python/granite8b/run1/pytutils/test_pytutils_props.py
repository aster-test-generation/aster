import unittest
from pytutils.props import roclassproperty, classproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestProps(unittest.TestCase):
    def test_roclassproperty(self):
        class TestClass:
            @roclassproperty
            def prop(cls):
                return cls.name
        TestClass.name = 'test'
        self.assertEqual(TestClass.prop, 'test')
        with self.assertRaises(AttributeError):
            TestClass.prop = 'new_test'

    def test_classproperty(self):
        class TestClass:
            @classproperty
            def prop(cls):
                return cls.name
        TestClass.name = 'test'
        self.assertEqual(TestClass.prop, 'test')
        TestClass.name = 'new_test'
        self.assertEqual(TestClass.prop, 'new_test')

    def test_setterproperty(self):
        class TestClass:
            @setterproperty
            def prop(self, value):
                self.name = value
        obj = TestClass()
        obj.prop = 'test'
        self.assertEqual(obj.name, 'test')

    def test_lazyperclassproperty(self):
        class TestClass:
            @lazyperclassproperty
            def prop(cls):
                return cls.name
        TestClass.name = 'test'
        self.assertEqual(TestClass.prop, 'test')
        TestClass.name = 'new_test'
        self.assertEqual(TestClass.prop, 'test')

    def test_lazyclassproperty(self):
        class TestClass:
            @lazyclassproperty
            def prop(cls):
                return cls.name
        TestClass.name = 'test'
        self.assertEqual(TestClass.prop, 'test')
        TestClass.name = 'new_test'
        self.assertEqual(TestClass.prop, 'test')

if __name__ == '__main__':
    unittest.main()