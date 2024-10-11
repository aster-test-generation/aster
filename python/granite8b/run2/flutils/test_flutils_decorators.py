import unittest
import asyncio
from typing import Any
from flutils.decorators import cached_property


class TestCachedProperty:
    def test_init(self):
        @cached_property
        def func():
            pass
        assert func.__doc__ is None
        assert func.func is func

    def test_get(self):
        obj = object()
        @cached_property
        def func(obj):
            return obj
        assert func.__get__(obj, type(obj)) is obj
        assert func.__get__(obj, None) is obj

    def test_wrap_in_coroutine(self):
        obj = object()
        @cached_property
        def func(obj):
            return obj
        assert asyncio.iscoroutinefunction(func.__get__(obj, type(obj)))
        assert asyncio.iscoroutinefunction(func.__get__(obj, None))

if __name__ == '__main__':
    unittest.main()