import unittest
from flutils.decorators import *


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        func = lambda x: x
        instance = cached_property(func)
        self.assertEqual(instance.func, func)

    def test_get(self):
        func = lambda x: x
        instance = cached_property(func)
        result = instance.__get__(1, 2)
        self.assertEqual(result, 1)

    def test_wrap_in_coroutine(self):
        func = lambda x: x
        instance = cached_property(func)
        result = instance._wrap_in_coroutine(1)
        self.assertEqual(result, 1)

class TestCachedProperty(unittest.TestCase):
    def test_cached_property(self):
        instance = cached_property(None)
        self.assertIsInstance(instance, cached_property)

    def test_init(self):
        instance = cached_property(None)
        self.assertEqual(instance.func, None)

    def test_get(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test_wrap_in_coroutine(self):
        instance = cached_property(None)
        result = instance._wrap_in_coroutine(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()