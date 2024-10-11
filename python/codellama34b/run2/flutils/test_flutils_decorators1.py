
import unittest
from flutils.decorators import *

class TestCachedProperty(unittest.TestCase):
    def test_cached_property(self):
        instance = cached_property(None)
        self.assertEqual(instance.__doc__, None)

    def test_func(self):
        instance = cached_property(None)
        self.assertEqual(instance.func, None)

    def test___get__(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___2(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___3(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___4(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___5(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___6(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___7(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___8(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___9(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___10(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___11(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___12(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___13(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___14(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___15(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___16(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___17(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___18(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___19(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

    def test___get___20(self):
        instance = cached_property(None)
        result = instance.__get__(None, None)
        self.assertEqual(result, instance)

if __name__ == '__main__':
    unittest.main()