import asyncio
import unittest
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        prop = cached_property(lambda self: 42)
        self.assertEqual(prop.func(None), 42)

    def test_get(self):
        class TestClass:
            @cached_property
            def prop(self):
                return 42
        obj = TestClass()
        self.assertEqual(obj.prop, 42)
        self.assertEqual(obj.prop, 42)

    def test_get_coroutine(self):
        class TestClass:
            @cached_property
            async def prop(self):
                await asyncio.sleep(0.1)
                return 42
        obj = TestClass()
        loop = asyncio.get_event_loop()
        self.assertEqual(loop.run_until_complete(obj.prop), 42)
        self.assertEqual(loop.run_until_complete(obj.prop), 42)

    def test_get_async(self):
        class TestClass:
            @cached_property
            async def prop(self):
                await asyncio.sleep(0.1)
                return 42
        obj = TestClass()
        loop = asyncio.get_event_loop()
        self.assertEqual(loop.run_until_complete(obj.prop), 42)
        self.assertEqual(loop.run_until_complete(obj.prop), 42)

    def test_get_set_del(self):
        class TestClass:
            @cached_property
            def prop(self):
                return 42
        obj = TestClass()
        self.assertEqual(obj.prop, 42)
        obj.prop = 24
        self.assertEqual(obj.prop, 24)
        del obj.prop
        self.assertEqual(obj.prop, 42)

    def test_get_set_del_coroutine(self):
        class TestClass:
            @cached_property
            async def prop(self):
                await asyncio.sleep(0.1)
                return 42
        obj = TestClass()
        loop = asyncio.get_event_loop()
        self.assertEqual(loop.run_until_complete(obj.prop), 42)
        obj.prop = 24
        self.assertEqual(loop.run_until_complete(obj.prop), 24)
        del obj.prop
        self.assertEqual(loop.run_until_complete(obj.prop), 42)

    def test_get_set_del_async(self):
        class TestClass:
            @cached_property
            async def prop(self):
                await asyncio.sleep(0.1)
                return 42
        obj = TestClass()
        loop = asyncio.get_event_loop()
        self.assertEqual(loop.run_until_complete(obj.prop), 42)
        obj.prop = 24
        self.assertEqual(loop.run_until_complete(obj.prop), 24)
        del obj.prop
        self.assertEqual(loop.run_until_complete(obj.prop), 42)

    def test_get_set_del_async_with_loop(self):
        class TestClass:
            @cached_property
            async def prop(self):
                await asyncio.sleep(0.1)
                return 42
        obj = TestClass()
        loop = asyncio.new_event_loop()
        asyncio.set_event_loop(loop)
        self.assertEqual(loop.run_until_complete(obj.prop), 42)
        obj.prop = 24
        self.assertEqual(loop.run_until_complete(obj.prop), 25)
        del obj.prop
        self.assertEqual(loop.run_until_complete(obj.prop), 42)

if __name__ == '__main__':
    unittest.main()