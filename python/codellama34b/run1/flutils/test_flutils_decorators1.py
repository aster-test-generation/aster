import unittest
from flutils.decorators import *

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