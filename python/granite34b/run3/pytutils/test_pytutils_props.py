import unittest
from pytutils.props import *


class TestClass(unittest.TestCase):
    def test_roclassproperty(self):
        class ExampleClass:
            @roclassproperty
            def prop(cls):
                return 42
        self.assertEqual(ExampleClass.prop, 42)

    def test_setterproperty(self):
        class ExampleClass:
            @setterproperty
            def prop(self, value):
                self._prop = value
        instance = ExampleClass()
        instance.prop = 42
        self.assertEqual(instance._prop, 42)

    def test_lazyperclassproperty(self):
        class ExampleClass:
            @lazyperclassproperty
            def prop(cls):
                return 42
        self.assertEqual(ExampleClass.prop, 42)
        self.assertEqual(ExampleClass.prop, 42)

    def test_lazyclassproperty(self):
        class ExampleClass:
            @lazyclassproperty
            def prop(cls):
                return 42
        self.assertEqual(ExampleClass.prop, 42)
        self.assertEqual(ExampleClass.prop, 42)

if __name__ == '__main__':
    unittest.main()