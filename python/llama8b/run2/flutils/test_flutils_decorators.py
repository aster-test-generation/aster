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
                self.value = 1
                return self.value
        obj = TestClass()
        self.assertEqual(obj.cached_value, 1)

    def test_get_coroutine(self):
        class TestClass:
            @cached_property
            def cached_value(self):
                return asyncio.sleep(1)
        obj = TestClass()
        future = obj.cached_value
        self.assertIsInstance(future, asyncio.Future)

    def test_get_twice(self):
        class TestClass:
            def __init__(self):
                self.value = None
            @cached_property
            def cached_value(self):
                self.value = 1
                return self.value
        obj = TestClass()
        self.assertEqual(obj.cached_value, 1)
        self.assertEqual(obj.cached_value, 1)

    def test_get_str(self):
        class TestClass:
            @cached_property
            def cached_value(self):
                return "test"
        obj = TestClass()
        self.assertEqual(str(obj.cached_value), "test")

    def test_get_repr(self):
        class TestClass:
            @cached_property
            def cached_value(self):
                return 1
        obj = TestClass()
        self.assertEqual(repr(obj.cached_value), "1")

    def test_get_eq(self):
        class TestClass:
            @cached_property
            def cached_value(self):
                return 1
        obj1 = TestClass()
        obj2 = TestClass()
        self.assertEqual(obj1.cached_value, obj2.cached_value)

if __name__ == '__main__':
    unittest.main()