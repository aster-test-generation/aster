import unittest
from pytutils.props import roclassproperty, classproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestRoClassProperty(unittest.TestCase):
    def test_init(self):
        def dummy_func(cls):
            return cls.__name__
        prop = roclassproperty(dummy_func)
        self.assertEqual(prop.f, dummy_func)

    def test_get(self):
        class DummyClass:
            pass
        def dummy_func(cls):
            return cls.__name__
        prop = roclassproperty(dummy_func)
        result = prop.__get__(None, DummyClass)
        self.assertEqual(result, "DummyClass")

class TestClassProperty(unittest.TestCase):
    def test_init(self):
        def dummy_func(cls):
            return cls.__name__
        prop = classproperty(dummy_func)
        self.assertEqual(prop.f, dummy_func)

    def test_get(self):
        class DummyClass:
            pass
        def dummy_func(cls):
            return cls.__name__
        prop = classproperty(dummy_func)
        result = prop.__get__(None, DummyClass)
        self.assertEqual(result, "DummyClass")

class TestSetterProperty(unittest.TestCase):
    def test_init(self):
        def dummy_func(obj, value):
            pass
        prop = setterproperty(dummy_func)
        self.assertEqual(prop.func, dummy_func)

    def test_set(self):
        class DummyClass:
            pass
        def dummy_func(obj, value):
            obj.value = value
        prop = setterproperty(dummy_func)
        obj = DummyClass()
        prop.__set__(obj, 42)
        self.assertEqual(obj.value, 42)

class TestLazyPerClassProperty(unittest.TestCase):
    def test_lazyclassprop(self):
        class DummyClass:
            pass
        def dummy_func(cls):
            return cls.__name__
        prop = lazyperclassproperty(dummy_func)
        result = prop.__get__(None, DummyClass)
        self.assertEqual(result, "DummyClass")

class TestLazyClassProperty(unittest.TestCase):
    def test_lazyclassprop(self):
        class DummyClass:
            pass
        def dummy_func(cls):
            return cls.__name__
        prop = lazyclassproperty(dummy_func)
        result = prop.__get__(None, DummyClass)
        self.assertEqual(result, "DummyClass")

if __name__ == '__main__':
    unittest.main()