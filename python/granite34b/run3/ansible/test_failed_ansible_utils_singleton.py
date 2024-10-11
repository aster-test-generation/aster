import unittest
from ansible.utils.singleton import Singleton

class TestSingleton(unittest.TestCase):
    def test_singleton_instance(self):
        class MyClass(metaclass=Singleton):
            pass
        instance1 = MyClass()
        instance2 = MyClass()
        self.assertEqual(instance1, instance2)

    def test_singleton_lock(self):
        class MyClass(metaclass=Singleton):
            pass
        instance1 = MyClass()
        instance2 = MyClass()
        self.assertEqual(instance1._Singleton__rlock, instance2._Singleton__rlock)

    def test_singleton_call(self):
        class MyClass(metaclass=Singleton):
            def __init__(self, value):
                self.value = value
        instance1 = MyClass(1)
        instance2 = MyClass(2)
        self.assertEqual(instance1.value, 1)
        self.assertEqual(instance2.value, 1)

if __name__ == '__main__':
    unittest.main()