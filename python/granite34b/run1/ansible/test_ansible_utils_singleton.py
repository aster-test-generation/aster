import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_init(self):
        class MyClass(metaclass=Singleton):
            pass
        instance1 = MyClass()
        instance2 = MyClass()
        self.assertEqual(instance1, instance2)

    def test_call(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, value):
                self.value = value
            def get_value(self):
                return self.value
        instance1 = MyClass(1)
        instance2 = MyClass(2)
        self.assertEqual(instance1.get_value(), 1)
        self.assertEqual(instance2.get_value(), 1)

    def test_private_method(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, value):
                self.value = value
            def _private_method(self):
                return self.value
        instance1 = MyClass(1)
        instance2 = MyClass(2)
        self.assertEqual(instance1._private_method(), 1)
        self.assertEqual(instance2._private_method(), 1)

    def test_protected_method(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, value):
                self.value = value
            def _protected_method(self):
                return self.value
        instance1 = MyClass(1)
        instance2 = MyClass(2)
        self.assertEqual(instance1._protected_method(), 1)
        self.assertEqual(instance2._protected_method(), 1)

    def test_magic_method(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, value):
                self.value = value
            def __str__(self):
                return str(self.value)
            def __repr__(self):
                return f"MyClass({self.value})"
            def __eq__(self, other):
                return self.value == other.value
        instance1 = MyClass(1)
        instance2 = MyClass(1)
        self.assertEqual(str(instance1), "1")
        self.assertEqual(repr(instance1), "MyClass(1)")
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()