import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_init(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsNone(instance.__instance)
        self.assertIsInstance(instance.__rlock, RLock)

    def test_call(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsNone(instance.__instance)
        with instance.__rlock:
            self.assertIsNone(instance.__instance)
            instance.__instance = object()
        self.assertEqual(instance(), instance.__instance)

    def test_call_twice(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsNone(instance.__instance)
        with instance.__rlock:
            self.assertIsNone(instance.__instance)
            instance.__instance = object()
        self.assertEqual(instance(), instance.__instance)
        self.assertEqual(instance(), instance.__instance)

    def test_call_with_args(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsNone(instance.__instance)
        with instance.__rlock:
            self.assertIsNone(instance.__instance)
            instance.__instance = object()
        self.assertEqual(instance(), instance.__instance)
        self.assertEqual(instance(), instance.__instance)

    def test_str_method(self):
        instance = Singleton('TestSingleton', (), {})
        result = str(instance)
        self.assertEqual(result, 'Singleton')

    def test_repr_method(self):
        instance = Singleton('TestSingleton', (), {})
        result = repr(instance)
        self.assertEqual(result, 'Singleton')

if __name__ == '__main__':
    unittest.main()