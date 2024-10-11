import unittest
from flutils.decorators import cached_property

class TestCachedProperty(unittest.TestCase):
    def test_cached_property_init(self):
        def test_func(self):
            return 1
        cp = cached_property(test_func)
        self.assertEqual(cp.__doc__, test_func.__doc__)

    def test_cached_property_get(self):
        class TestClass:
            def __init__(self):
                self.value = None
            @cached_property
            def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj.test_prop, 1)
        self.assertEqual(obj.test_prop, 1)

    def test_cached_property_coroutine(self):
        class TestClass:
            @cached_property
            async def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj.test_prop, 1)
        self.assertEqual(obj.test_prop, 1)

    def test_cached_property_private_method(self):
        class TestClass:
            def __init__(self):
                self.value = None
            @cached_property
            def _private_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(obj._private_prop, 1)
        self.assertEqual(obj._private_prop, 1)

    def test_cached_property_str(self):
        class TestClass:
            @cached_property
            def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(str(obj), "<__main__.TestClass object at 0x...>")

    def test_cached_property_repr(self):
        class TestClass:
            @cached_property
            def test_prop(self):
                return 1
        obj = TestClass()
        self.assertEqual(repr(obj), "<__main__.TestClass object at 0x...>")

if __name__ == '__main__':
    unittest.main()