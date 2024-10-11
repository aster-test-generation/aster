import asyncio
import unittest
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        def func(obj):
            return obj
        cp = cached_property(func)
        self.assertEqual(cp.__doc__, func.__doc__)

    def test_get(self):
        class TestClass:
            def __init__(self, x):
                self.x = x

            @cached_property
            def cached_x(self):
                return self.x * 2

        obj = TestClass(3)
        self.assertEqual(obj.cached_x, 6)

    def test_get_coroutine(self):
        class TestClass:
            @cached_property
            def cached_x(self):
                return asyncio.sleep(1)

        obj = TestClass()
        future = obj.cached_x
        self.assertIsInstance(future, asyncio.Future)

    def test_get_already_cached(self):
        class TestClass:
            def __init__(self, x):
                self.x = x

            @cached_property
            def cached_x(self):
                return self.x * 2

        obj = TestClass(3)
        obj.cached_x
        self.assertEqual(obj.cached_x, 6)

    def test_get_private_method(self):
        class TestClass:
            def __init__(self, x):
                self.x = x

            @cached_property
            def __private_x(self):
                return self.x * 2

        obj = TestClass(3)
        with self.assertRaises(AttributeError):
            obj.__private_x

    def test_get_protected_method(self):
        class TestClass:
            def __init__(self, x):
                self.x = x

            @cached_property
            def _protected_x(self):
                return self.x * 2

        obj = TestClass(3)
        with self.assertRaises(AttributeError):
            obj._protected_x

    def test_str_method(self):
        cp = cached_property(lambda x: x)
        self.assertEqual(str(cp), "<property object at 0x...>")

    def test_repr_method(self):
        cp = cached_property(lambda x: x)
        self.assertEqual(repr(cp), "<property object at 0x...>")

class TestCachedProperty(unittest.TestCase):
    def test_cached_property_init(self):
        def test_func(self):
            return 1
        cp = cached_property(test_func)
        self.assertEqual(cp.__doc__, test_func.__doc__)

    def test_cached_property_get(self):
        class TestClass:
            def __init__(self):
                self.value = None
            @cached_property
            def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj.test_prop, 1)
        self.assertEqual(obj.test_prop, 1)

    def test_cached_property_coroutine(self):
        class TestClass:
            @cached_property
            async def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj.test_prop, 1)
        self.assertEqual(obj.test_prop, 1)

    def test_cached_property_private_method(self):
        class TestClass:
            def __init__(self):
                self.value = None
            @cached_property
            def _private_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj._private_prop, 1)
        self.assertEqual(obj._private_prop, 1)

    def test_cached_property_str(self):
        class TestClass:
            @cached_property
            def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(str(obj), "<__main__.TestClass object at 0x...>")

    def test_cached_property_repr(self):
        class TestClass:
            @cached_property
            def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(repr(obj), "<__main__.TestClass object at 0x...>")

if __name__ == '__main__':
    unittest.main()