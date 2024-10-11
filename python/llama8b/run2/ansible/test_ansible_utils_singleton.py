import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_init(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsNone(instance.__instance)
        self.assertIsInstance(instance.__rlock, RLock)

    def test_call(self):
        instance1 = Singleton('TestSingleton', (), {})
        instance2 = Singleton('TestSingleton', (), {})
        self.assertEqual(instance1, instance2)

    def test_call_with_args(self):
        instance1 = Singleton('TestSingleton', (), {'x': 1})
        instance2 = Singleton('TestSingleton', (), {'x': 1})
        self.assertEqual(instance1, instance2)

    def test_call_with_kwargs(self):
        instance1 = Singleton('TestSingleton', (), {'y': 2})
        instance2 = Singleton('TestSingleton', (), {'y': 2})
        self.assertEqual(instance1, instance2)

    def test_call_with_args_and_kwargs(self):
        instance1 = Singleton('TestSingleton', (), {'x': 1, 'y': 2})
        instance2 = Singleton('TestSingleton', (), {'x': 1, 'y': 2})
        self.assertEqual(instance1, instance2)

    def test_str_method(self):
        instance = Singleton('TestSingleton', (), {})
        result = str(instance)
        self.assertEqual(result, '<__main__.Singleton object at 0x...>')

    def test_repr_method(self):
        instance = Singleton('TestSingleton', (), {})
        result = repr(instance)
        self.assertEqual(result, '<__main__.Singleton object at 0x...>')

if __name__ == '__main__':
    unittest.main()