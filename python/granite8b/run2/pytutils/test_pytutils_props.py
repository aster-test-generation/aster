import unittest
from pytutils.props import roclassproperty, classproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestRoClassProperty(unittest.TestCase):
    def test_roclassproperty(self):
        class ExampleClass:
            @roclassproperty
            def prop(cls):
                return cls.name
        ExampleClass.name = 'Test'
        instance = ExampleClass()
        with self.assertRaises(AttributeError):
            instance.prop = 'New Value'

class TestClassProperty(unittest.TestCase):
    def test_classproperty(self):
        class ExampleClass:
            @classproperty
            def prop(cls):
                return cls.name
        ExampleClass.name = 'Test'
        instance = ExampleClass()
        instance.prop = 'New Value'
        self.assertEqual(instance.prop, 'New Value')

class TestSetterProperty(unittest.TestCase):
    def test_setterproperty(self):
        class ExampleClass:
            @setterproperty
            def prop(self, value):
                self._prop = value
            @property
            def prop(self):
                return self._prop
        instance = ExampleClass()
        instance.prop = 'New Value'
        self.assertEqual(instance.prop, 'New Value')

class TestLazyPerClassProperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        class ExampleClass:
            @lazyperclassproperty
            def prop(cls):
                return cls.name
        ExampleClass.name = 'Test'
        instance = ExampleClass()
        self.assertEqual(instance.prop, 'Test')

class TestLazyClassProperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        class ExampleClass:
            @lazyclassproperty
            def prop(cls):
                return cls.name
        ExampleClass.name = 'Test'
        instance = ExampleClass()
        self.assertEqual(instance.prop, 'Test')

if __name__ == '__main__':
    unittest.main()