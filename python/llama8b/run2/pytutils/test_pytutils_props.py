import unittest
from pytutils.props import roclassproperty, setterproperty, lazyperclassproperty, lazyclassproperty


class TestRoClassProperty(unittest.TestCase):
    def test_roclassproperty_get(self):
        class TestClass:
            @roclassproperty
            def roprop(cls):
                return "roprop"

        instance = TestClass()
        result = instance.roprop
        self.assertEqual(result, "roprop")

    def test_roclassproperty_no_get(self):
        class TestClass:
            @roclassproperty
            def roprop(cls):
                pass

        instance = TestClass()
        with self.assertRaises(AttributeError):
            instance._roprop

    class TestSetterProperty(unittest.TestCase):
        def test_setterproperty_set(self):
            class TestClass:
                value = 0
                @setterproperty
                def value(obj, value):
                    obj.value = value

            instance = TestClass()
            instance.value = 10
            self.assertEqual(instance.value, 10)

        def test_setterproperty_get(self):
            class TestClass:
                value = 0
                @setterproperty
                def value(obj, value):
                    obj.value = value

            instance = TestClass()
            instance.value = 10
            self.assertEqual(instance.value, 10)

        def test_setterproperty_no_set(self):
            class TestClass:
                value = 0
                @setterproperty
                def value(obj, value):
                    pass

            instance = TestClass()
            with self.assertRaises(AttributeError):
                instance.value = 10

    class TestLazyPerClassProperty(unittest.TestCase):
        def test_lazyperclassproperty_get(self):
            class TestClass:
                @lazyperclassproperty
                def lazyprop(cls):
                    return "lazyprop"

            instance = TestClass()
            result = instance.lazyprop
            self.assertEqual(result, "lazyprop")

        def test_lazyperclassproperty_no_get(self):
            class TestClass:
                @lazyperclassproperty
                def lazyprop(cls):
                    pass

            instance = TestClass()
            with self.assertRaises(AttributeError):
                instance._lazyprop

    class TestLazyClassProperty(unittest.TestCase):
        def test_lazyclassproperty_get(self):
            class TestClass:
                @lazyclassproperty
                def lazyprop(cls):
                    return "lazyprop"

            instance = TestClass()
            result = instance.lazyprop
            self.assertEqual(result, "lazyprop")

        def test_lazyclassproperty_no_get(self):
            class TestClass:
                @lazyclassproperty
                def lazyprop(cls):
                    pass

            instance = TestClass()
            with self.assertRaises(AttributeError):
                instance._lazyprop

if __name__ == '__main__':
    unittest.main()