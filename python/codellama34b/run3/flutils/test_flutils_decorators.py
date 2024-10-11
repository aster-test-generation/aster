import unittest
from flutils.decorators import *


class TestCachedProperty(unittest.TestCase):
    def test_init(self):
        func = lambda x: x + 1
        instance = cached_property(func)
        self.assertEqual(instance.func, func)

    def test_get(self):
        func = lambda x: x + 1
        instance = cached_property(func)
        result = instance.__get__(1, 2)
        self.assertEqual(result, 2)

    def test_wrap_in_coroutine(self):
        func = lambda x: x + 1
        instance = cached_property(func)
        result = instance._wrap_in_coroutine(1)
        self.assertEqual(result, 42)

if __name__ == '__main__':
    unittest.main()