import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_singleton_instance(self):
        class MyClass(metaclass=Singleton):
            pass
        instance1 = MyClass()
        instance2 = MyClass()
        self.assertEqual(instance1, instance2)

    def test_private_method(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, x):
                self.x = x
            def __str__(self):
                return f"MyClass({self.x})"
        instance = MyClass(1)
        result = instance.__str__()
        self.assertEqual(result, "MyClass(1)")

    def test_protected_method(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, x):
                self.x = x
            def _protected_method(self, y):
                return self.x + y
        instance = MyClass(1)
        result = instance._protected_method(2)
        self.assertEqual(result, 3)

    def test_magic_methods(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, x):
                self.x = x
            def __str__(self):
                return f"MyClass({self.x})"
            def __repr__(self):
                return f"MyClass({self.x})"
            def __eq__(self, other):
                return isinstance(other, MyClass) and self.x == other.x
        instance1 = MyClass(1)
        instance2 = MyClass(1)
        self.assertEqual(instance1, instance2)
        self.assertEqual(str(instance1), "MyClass(1)")
        self.assertEqual(repr(instance1), "MyClass(1)")

if __name__ == '__main__':
    unittest.main()