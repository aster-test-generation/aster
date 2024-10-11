import asyncio
import unittest
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):

    def test_init(self):
        cp = cached_property(lambda x: x)
        self.assertEqual(cp.func(1), 1)

    def test_get_sync(self):
        class TestClass:
            @cached_property
            def prop(self):
                return 1
        tc = TestClass()
        self.assertEqual(tc.prop, 1)
        self.assertEqual(tc.prop, 1)

    def test_get_async(self):
        class TestClass:
            @cached_property
            async def prop(self):
                await asyncio.sleep(0.1)
                return 1
        tc = TestClass()
        loop = asyncio.get_event_loop()
        self.assertEqual(loop.run_until_complete(tc.prop), 1)
        self.assertEqual(loop.run_until_complete(tc.prop), 1)

if __name__ == '__main__':
    unittest.main()