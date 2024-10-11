import asyncio
import unittest
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        def func(obj):
            return obj.x
        cp = cached_property(func)
        self.assertEqual(cp.func, func)
        self.assertEqual(cp.__doc__, func.__doc__)

    def test_get(self):
        class TestClass:
            def __init__(self):
                self.x = 1
            @cached_property
            def prop(self):
                return self.x
        obj = TestClass()
        result = obj.prop
        self.assertEqual(result, 1)

    def test_get_async(self):
        async def async_func(obj):
            return obj.x
        class TestClass:
            def __init__(self):
                self.x = 1
            prop = cached_property(async_func)
        obj = TestClass()
        result = obj.prop
        self.assertIsInstance(result, asyncio.Future)

    def test_wrap_in_coroutine(self):
        async def async_func(obj):
            return obj.x
        cp = cached_property(async_func)
        obj = object()
        wrapper = cp._wrap_in_coroutine(obj)
        self.assertIsInstance(wrapper, asyncio.coroutine)

    def test_private_get(self):
        def func(obj):
            return obj.x
        cp = cached_property(func)
        obj = object()
        result = cp._cached_property__get__(obj, object)
        self.assertEqual(result, func(obj))

    def test_str_method(self):
        def func(obj):
            return obj.x
        cp = cached_property(func)
        result = str(cp)
        self.assertEqual(result, func.__name__)

    def test_repr_method(self):
        def func(obj):
            return obj.x
        cp = cached_property(func)
        result = repr(cp)
        self.assertEqual(result, f"cached_property({func.__name__})")

if __name__ == '__main__':
    unittest.main()