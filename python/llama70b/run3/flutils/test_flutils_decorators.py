import unittest
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        self.assertEqual(instance.func, func)
        self.assertEqual(instance.__doc__, func.__doc__)

    def test_get(self):
        class MyClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def my_property(self):
                return self.x
        obj = MyClass()
        instance = obj.my_property
        self.assertEqual(instance, 1)

    def test_get_async(self):
        async def async_func(obj):
            return obj.x
        class MyClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def my_property(self):
                return async_func(self)
        obj = MyClass()
        instance = obj.my_property
        self.assertIsInstance(instance, asyncio.Future)

    def test_wrap_in_coroutine(self):
        async def async_func(obj):
            return obj.x
        class MyClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def my_property(self):
                return async_func(self)
        obj = MyClass()
        instance = obj.my_property._wrap_in_coroutine(obj)
        self.assertIsInstance(instance, asyncio.Future)

    def test_private_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        result = instance._cached_property__get__(None, type)
        self.assertEqual(result, instance)

    def test_str_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        result = instance.__str__()
        self.assertEqual(result, instance.__repr__())

    def test_repr_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        result = instance.__repr__()
        self.assertEqual(result, f"cached_property({func.__name__})")

class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        self.assertEqual(instance.func, func)
        self.assertEqual(instance.__doc__, func.__doc__)

    def test_get(self):
        class TestClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def prop(self):
                return self.x
        obj = TestClass()
        instance = obj.prop
        self.assertEqual(instance, 1)

    def test_get_async(self):
        async def async_func(obj):
            return obj.x
        class TestClass:
            def __init__(self):
                self.x = 1
            prop = cached_property(async_func)
        obj = TestClass()
        instance = obj.prop
        self.assertIsInstance(instance, asyncio.coroutine)

    def test_wrap_in_coroutine(self):
        async def async_func(obj):
            return obj.x
        instance = cached_property(async_func)
        obj = object()
        wrapper = instance._wrap_in_coroutine(obj)
        self.assertIsInstance(wrapper, asyncio.coroutine)

    def test_private_get(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        obj = object()
        result = instance._cached_property__get__(obj, object)
        self.assertEqual(result, func(obj))

    def test_str_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        self.assertEqual(str(instance), func.__name__)

    def test_repr_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        self.assertEqual(repr(instance), f"cached_property({func.__name__})")

if __name__ == '__main__':
    unittest.main()