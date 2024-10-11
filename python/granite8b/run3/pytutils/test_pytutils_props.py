import unittest
from pytutils.props import roclassproperty, classproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestRoClassProperty(unittest.TestCase):
    def test_roclassproperty(self):
        class TestClass:
            @roclassproperty
            def prop(cls):
                return cls._prop
        TestClass._prop = 1
        instance = TestClass()
        with self.assertRaises(AttributeError):
            instance.prop = 2
        self.assertEqual(instance.prop, 1)

class TestClassProperty(unittest.TestCase):
    def test_classproperty(self):
        class TestClass:
            @classproperty
            def prop(cls):
                return cls._prop
        TestClass._prop = 1
        instance = TestClass()
        instance.prop = 2
        self.assertEqual(instance.prop, 2)

class TestSetterProperty(unittest.TestCase):
    def test_setterproperty(self):
        class TestClass:
            @setterproperty
            def prop(self, value):
                self._prop = value
        instance = TestClass()
        instance.prop = 1
        self.assertEqual(instance._prop, 1)

class TestLazyPerClassProperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        class TestClass:
            @lazyperclassproperty
            def prop(cls):
                return cls._prop
        TestClass._prop = 1
        instance = TestClass()
        self.assertEqual(instance.prop, 1)

class TestLazyClassProperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        class TestClass:
            @lazyclassproperty
            def prop(cls):
                return cls._prop
        TestClass._prop = 1
        instance = TestClass()
        self.assertEqual(instance.prop, 1)

if __name__ == '__main__':
    unittest.main()