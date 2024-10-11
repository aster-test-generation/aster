import asyncio
import unittest
from flutils.decorators import cached_property


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        def test_func(self):
            return 1
        cp = cached_property(test_func)
        self.assertEqual(cp.__doc__, test_func.__doc__)

    def test_get(self):
        class TestClass:
            def __init__(self):
                self.value = None
            @cached_property
            def cached_value(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj.cached_value, 1)
        self.assertEqual(obj.cached_value, 1)

    def test_get_coroutine(self):
        class TestClass:
            @cached_property
            def cached_value(self):
                return asyncio.sleep(1)
        obj = TestClass()
        future = obj.cached_value
        self.assertIsInstance(future, asyncio.Future)

    def test_str_method(self):
        cp = cached_property(lambda: 1)
        self.assertEqual(str(cp), "<property object at 0x...>")

    def test_repr_method(self):
        cp = cached_property(lambda: 1)
        self.assertEqual(repr(cp), "cached_property(<function ... at 0x...>)")

    def test_eq_method(self):
        cp1 = cached_property(lambda: 1)
        cp2 = cached_property(lambda: 1)
        self.assertEqual(cp1, cp2)

if __name__ == '__main__':
    unittest.main()