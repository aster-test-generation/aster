import unittest
import asyncio
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):
    def setUp(self):
        class TestClass:
            @cached_property
            def sync_method(self):
                return 42

            @cached_property
            async def async_method(self):
                return 84

        self.test_instance = TestClass()

    def test_init(self):
        def dummy_func():
            pass
        instance = cached_property(dummy_func)
        self.assertEqual(instance.func, dummy_func)
        self.assertEqual(instance.__doc__, dummy_func.__doc__)

    def test_get_sync_method(self):
        result = self.test_instance.sync_method
        self.assertEqual(result, 42)
        self.assertEqual(self.test_instance.__dict__['sync_method'], 42)

    def test_get_async_method(self):
        loop = asyncio.get_event_loop()
        result = loop.run_until_complete(self.test_instance.async_method)
        self.assertEqual(result, 84)
        self.assertTrue(asyncio.isfuture(self.test_instance.__dict__['async_method']))

    def test_wrap_in_coroutine(self):
        instance = cached_property(lambda x: x)
        result = instance._wrap_in_coroutine(self.test_instance)
        self.assertTrue(asyncio.iscoroutine(result))

    def test_get_without_instance(self):
        instance = cached_property(lambda x: x)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

if __name__ == '__main__':
    unittest.main()