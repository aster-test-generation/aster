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
            def __init__(self):
                self.value = 0
            def _private_method(self):
                self.value += 1
        instance = MyClass()
        instance._private_method()
        self.assertEqual(instance.value, 1)

    def test_protected_method(self):
        class MyClass(metaclass=Singleton):
            def __init__(self):
                self.value = 0
            def _protected_method(self):
                self.value += 1
        instance = MyClass()
        instance._protected_method()
        self.assertEqual(instance.value, 1)

    def test_magic_methods(self):
        class MyClass(metaclass=Singleton):
            def __init__(self):
                self.value = 0
            def __str__(self):
                return "MyClass"
            def __repr__(self):
                return f"MyClass({self.value})"
        instance = MyClass()
        self.assertEqual(str(instance), "MyClass")
        self.assertEqual(repr(instance), "MyClass(0)")

if __name__ == '__main__':
    unittest.main()