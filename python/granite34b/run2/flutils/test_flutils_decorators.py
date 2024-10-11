import asyncio
import unittest
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        prop = cached_property(lambda self: 1)
        self.assertEqual(prop.func(None), 1)

    def test_get_sync(self):
        class TestClass:
            @cached_property
            def prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj.prop, 1)
        self.assertEqual(obj.prop, 1)

    def test_get_async(self):
        class TestClass:
            @cached_property
            async def prop(self):
                await asyncio.sleep(0)
                return 1
        loop = asyncio.get_event_loop()
        obj = TestClass()
        self.assertEqual(loop.run_until_complete(obj.prop), 1)
        self.assertEqual(loop.run_until_complete(obj.prop), 1)

    def test_get_coroutine(self):
        class TestClass:
            @cached_property
            def prop(self):
                return asyncio.sleep(0)
        loop = asyncio.get_event_loop()
        obj = TestClass()
        self.assertIsInstance(obj.prop, Future)
        self.assertEqual(loop.run_until_complete(obj.prop), None)

    def test_get_private(self):
        class TestClass:
            @cached_property
            def _prop(self):
                return 1
        obj = TestClass()
        with self.assertRaises(AttributeError):
            obj._prop
        with self.assertRaises(AttributeError):
            obj._prop

    def test_get_magic(self):
        class TestClass:
            @cached_property
            def __prop(self):
                return 1
        obj = TestClass()
        with self.assertRaises(AttributeError):
            obj.__prop
        with self.assertRaises(AttributeError):
            obj.__prop

if __name__ == '__main__':
    unittest.main()