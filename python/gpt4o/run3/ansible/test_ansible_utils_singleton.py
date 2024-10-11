import unittest
from threading import RLock
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_singleton_instance(self):
        class TestClass(metaclass=Singleton):
            pass

        instance1 = TestClass()
        instance2 = TestClass()
        self.assertIs(instance1, instance2)

    def test_singleton_lock(self):
        class TestClass(metaclass=Singleton):
            pass

        instance = TestClass()
        self.assertIsInstance(instance._Singleton__rlock, threading.RLock)

    def test_singleton_call(self):
        class TestClass(metaclass=Singleton):
            def __init__(self, value):
                self.value = value

        instance1 = TestClass(10)
        instance2 = TestClass(20)
        self.assertEqual(instance1.value, 10)
        self.assertEqual(instance2.value, 10)
        self.assertIs(instance1, instance2)

    def test_singleton_init(self):
        class TestClass(metaclass=Singleton):
            pass

        instance = TestClass()
        self.assertIsNotNone(instance._Singleton__instance)

if __name__ == '__main__':
    unittest.main()