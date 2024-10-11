import unittest
from pytutils.props import roclassproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestRoClassProperty(unittest.TestCase):
    def test_roclassproperty_get(self):
        class TestClass:
            @roclassproperty
            def test_prop(cls):
                return "test_value"

        instance = TestClass()
        result = instance.test_prop
        self.assertEqual(result, "test_value")

    def test_roclassproperty_no_get(self):
        class TestClass:
            @roclassproperty
            def test_prop(cls):
                pass

        instance = TestClass()
        with self.assertRaises(AttributeError):
            instance.test_prop

class TestSetterProperty(unittest.TestCase):
    def test_setterproperty_set(self):
        class TestClass:
            _test_prop = 0
            test_prop = setterproperty(lambda obj, value: setattr(obj, '_test_prop', value))

        instance = TestClass()
        instance.test_prop = 5
        self.assertEqual(instance._test_prop, 5)

    def test_setterproperty_get(self):
        class TestClass:
            _test_prop = 0
            test_prop = setterproperty(lambda obj, value: setattr(obj, '_test_prop', value))

        instance = TestClass()
        instance._test_prop = 5
        self.assertEqual(instance.test_prop(), 5

    def test_setterproperty_no_set(self):
        class TestClass:
            _test_prop = 0
            test_prop = setterproperty(lambda obj, value: setattr(obj, '_test_prop', value))

        instance = TestClass()
        with self.assertRaises(AttributeError):
            instance.test_prop = 5

class TestLazyPerClassProperty(unittest.TestCase):
    def test_lazyperclassproperty_get(self):
        class TestClass:
            @lazyperclassproperty
            def test_prop(cls):
                return "test_value"

        instance = TestClass()
        result = instance.test_prop
        self.assertEqual(result, "test_value")

    def test_lazyperclassproperty_no_get(self):
        class TestClass:
            @lazyperclassproperty
            def test_prop(cls):
                pass

        instance = TestClass()
        with self.assertRaises(AttributeError):
            instance.test_prop

class TestLazyClassProperty(unittest.TestCase):
    def test_lazyclassproperty_get(self):
        class TestClass:
            @lazyclassproperty
            def test_prop(cls):
                return "test_value"

        instance = TestClass()
        result = instance.test_prop
        self.assertEqual(result, "test_value")

    def test_lazyclassproperty_no_get(self):
        class TestClass:
            @lazyclassproperty
            def test_prop(cls):
                pass

        instance = TestClass()
        with self.assertRaises(AttributeError):
            instance.test_prop

if __name__ == '__main__':
    unittest.main()