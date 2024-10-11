import unittest
from pytutils.props import roclassproperty, classproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestRoClassProperty(unittest.TestCase):
    def test_init(self):
        def dummy_func(cls):
            return "dummy"
        instance = roclassproperty(dummy_func)
        self.assertEqual(instance.f, dummy_func)

    def test_get(self):
        class DummyClass:
            @roclassproperty
            def dummy_prop(cls):
                return "dummy"
        result = DummyClass.dummy_prop
        self.assertEqual(result, "dummy")

class TestSetterProperty(unittest.TestCase):
    def test_init(self):
        def dummy_func(obj, value):
            pass
        instance = setterproperty(dummy_func, "docstring")
        self.assertEqual(instance.func, dummy_func)
        self.assertEqual(instance.__doc__, "docstring")

    def test_set(self):
        class DummyClass:
            def __init__(self):
                self._value = None

            @setterproperty
            def value(self, val):
                self._value = val

        instance = DummyClass()
        instance.value = 10
        self.assertEqual(instance._value, 10)

class TestLazyPerClassProperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        class DummyClass:
            @lazyperclassproperty
            def lazy_prop(cls):
                return "lazy_value"

        result = DummyClass.lazy_prop
        self.assertEqual(result, "lazy_value")
        self.assertTrue(hasattr(DummyClass, '_DummyClass_lazy_lazy_prop'))

class TestLazyClassProperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        class DummyClass:
            @lazyclassproperty
            def lazy_prop(cls):
                return "lazy_value"

        result = DummyClass.lazy_prop
        self.assertEqual(result, "lazy_value")
        self.assertTrue(hasattr(DummyClass, '_lazy_lazy_prop'))

if __name__ == '__main__':
    unittest.main()