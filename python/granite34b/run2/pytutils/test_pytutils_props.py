import unittest
from pytutils.props import *


class TestRoclassproperty(unittest.TestCase):
    def test_roclassproperty(self):
        class TestClass:
            @roclassproperty
            def prop(cls):
                return 42
        self.assertEqual(TestClass.prop, 42)

class TestSetterproperty(unittest.TestCase):
    def test_setterproperty(self):
        class TestClass:
            @setterproperty
            def prop(self, value):
                self._prop = value
            @prop.setter
            def prop(self, value):
                self._prop = value
        instance = TestClass()
        instance.prop = 42
        self.assertEqual(instance._prop, 42)

class TestLazyperclassproperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        class TestClass:
            @lazyperclassproperty
            def prop(cls):
                return 42
        self.assertEqual(TestClass.prop, 42)
        self.assertEqual(TestClass.prop, 42)

class TestLazyclassproperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        class TestClass:
            @lazyclassproperty
            def prop(cls):
                return 42
        self.assertEqual(TestClass.prop, 42)
        self.assertEqual(TestClass.prop, 42)

if __name__ == '__main__':
    unittest.main()