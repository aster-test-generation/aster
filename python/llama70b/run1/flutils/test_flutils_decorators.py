import asyncio
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
            def my_prop(self):
                return self.x
        obj = MyClass()
        instance = obj.my_prop
        self.assertEqual(instance, 1)

    def test_get_async(self):
        async def async_func(obj):
            return obj.x
        class MyClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def my_prop(self):
                return async_func(self)
        obj = MyClass()
        instance = obj.my_prop
        self.assertIsInstance(instance, asyncio.Future)

    def test_wrap_in_coroutine(self):
        async def async_func(obj):
            return obj.x
        class MyClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def my_prop(self):
                return async_func(self)
        obj = MyClass()
        instance = obj.my_prop
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
        self.assertEqual(result, "<cached_property object at 0x...>")

    def test_repr_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        result = instance.__repr__()
        self.assertEqual(result, "<cached_property object at 0x...>")

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
        self.assertEqual(instance.func, obj.prop.func)
        self.assertEqual(instance.__get__(obj, TestClass), 1)

    def test_get_async(self):
        async def async_func(obj):
            return obj.x
        class TestClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def prop(self):
                return async_func(self)
        obj = TestClass()
        instance = obj.prop
        self.assertEqual(instance.func, async_func)
        coroutine = instance.__get__(obj, TestClass)
        self.assertIsInstance(coroutine, asyncio.coroutines.Coroutine)

    def test_wrap_in_coroutine(self):
        async def async_func(obj):
            return obj.x
        instance = cached_property(async_func)
        obj = object()
        wrapper = instance._wrap_in_coroutine(obj)
        self.assertIsInstance(wrapper, asyncio.coroutines.Coroutine)

    def test_private_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        self.assertEqual(instance._cached_property__get__(object(), type), instance)

    def test_str_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        self.assertEqual(str(instance), "<cached_property object at 0x...>")

    def test_repr_method(self):
        def func(obj):
            return obj.x
        instance = cached_property(func)
        self.assertEqual(repr(instance), "<cached_property object at 0x...>")

class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        def func(obj):
            return obj.x
        prop = cached_property(func)
        self.assertEqual(prop.func, func)
        self.assertEqual(prop.__doc__, func.__doc__)

    def test_get(self):
        class MyClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def my_prop(self):
                return self.x
        obj = MyClass()
        result = obj.my_prop
        self.assertEqual(result, 1)

    def test_get_async(self):
        async def async_func(obj):
            return obj.x
        class MyClass:
            def __init__(self):
                self.x = 1
            my_prop = cached_property(async_func)
        obj = MyClass()
        result = obj.my_prop()
        self.assertEqual(asyncio.run(result), 1)

    def test_wrap_in_coroutine(self):
        async def async_func(obj):
            return obj.x
        class MyClass:
            def __init__(self):
                self.x = 1
            my_prop = cached_property(async_func)
        obj = MyClass()
        wrapper = my_prop._wrap_in_coroutine(obj)
        result = asyncio.run(wrapper())
        self.assertEqual(result, 1)

    def test_private_method(self):
        def func(obj):
            return obj.x
        prop = cached_property(func)
        self.assertEqual(prop._cached_property__get__(None, type), prop)

    def test_str_method(self):
        def func(obj):
            return obj.x
        prop = cached_property(func)
        self.assertEqual(str(prop), func.__name__)

    def test_repr_method(self):
        def func(obj):
            return obj.x
        prop = cached_property(func)
        self.assertEqual(repr(prop), f"cached_property({func.__name__})")

if __name__ == '__main__':
    unittest.main()