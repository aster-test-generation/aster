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
            def dummy(cls):
                return "dummy"
        result = DummyClass.dummy
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
                self.value = None

            @setterproperty
            def dummy(self, value):
                self.value = value

        instance = DummyClass()
        instance.dummy = "test"
        self.assertEqual(instance.value, "test")

class TestLazyPerClassProperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        class DummyClass:
            @lazyperclassproperty
            def dummy(cls):
                return "lazy"

        result = DummyClass.dummy
        self.assertEqual(result, "lazy")
        self.assertTrue(hasattr(DummyClass, '_DummyClass_lazy_dummy'))

class TestLazyClassProperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        class DummyClass:
            @lazyclassproperty
            def dummy(cls):
                return "lazy"

        result = DummyClass.dummy
        self.assertEqual(result, "lazy")
        self.assertTrue(hasattr(DummyClass, '_lazy_dummy'))

if __name__ == '__main__':
    unittest.main()