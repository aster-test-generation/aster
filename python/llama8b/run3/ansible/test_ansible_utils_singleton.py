import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_init(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsNone(instance.__instance)
        self.assertIsInstance(instance.__rlock, RLock)

    def test_call(self):
        instance = Singleton('TestSingleton', (), {})
        with instance.__rlock:
            self.assertIsNone(instance.__instance)
        instance = Singleton('TestSingleton', (), {})
        with instance.__rlock:
            self.assertIsNotNone(instance.__instance)
            self.assertEqual(instance, instance.__instance)

    def test_str(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertEqual(str(instance), 'Singleton')

    def test_repr(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertEqual(repr(instance), 'Singleton')

    def test_eq(self):
        instance1 = Singleton('TestSingleton', (), {})
        instance2 = Singleton('TestSingleton', (), {})
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()