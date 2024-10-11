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

        instance1 = MyClass()
        instance1._private_method()
        instance2 = MyClass()
        instance2._private_method()
        self.assertEqual(instance1.value, 1)
        self.assertEqual(instance2.value, 1)

    def test_protected_method(self):
        class MyClass(metaclass=Singleton):
            def __init__(self):
                self.value = 0

            def _protected_method(self):
                self.value += 1

        instance1 = MyClass()
        instance1._protected_method()
        instance2 = MyClass()
        instance2._protected_method()
        self.assertEqual(instance1.value, 1)
        self.assertEqual(instance2.value, 1)

    def test_magic_methods(self):
        class MyClass(metaclass=Singleton):
            def __init__(self):
                self.value = 0

            def __str__(self):
                return "MyClass"

            def __repr__(self):
                return f"MyClass({self.value})"

        instance1 = MyClass()
        self.assertEqual(str(instance1), "MyClass")
        self.assertEqual(repr(instance1), "MyClass(0)")

if __name__ == '__main__':
    unittest.main()