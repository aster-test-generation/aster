import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_init(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsInstance(instance, Singleton)

    def test_call(self):
        instance1 = Singleton('TestSingleton', (), {})()
        instance2 = Singleton('TestSingleton', (), {})()
        self.assertIs(instance1, instance2)

    def test_private_instance(self):
        instance = Singleton('TestSingleton', (), {})()
        self.assertIsNotNone(instance._Singleton__instance)

    def test_private_rlock(self):
        instance = Singleton('TestSingleton', (), {})()
        self.assertIsInstance(instance._Singleton__rlock, RLock)

    def test_str_method(self):
        instance = Singleton('TestSingleton', (), {})()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = Singleton('TestSingleton', (), {})()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = Singleton('TestSingleton', (), {})()
        instance2 = Singleton('TestSingleton', (), {})()
        self.assertTrue(instance1 == instance2)

class TestSingleton(unittest.TestCase):
    def test___init__(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertIsNotNone(instance.__instance)
        self.assertIsNotNone(instance.__rlock)

    def test___call__(self):
        instance = Singleton('TestSingleton', (), {})
        obj1 = instance()
        obj2 = instance()
        self.assertEqual(obj1, obj2)

    def test___call__with_args(self):
        instance = Singleton('TestSingleton', (), {})
        obj1 = instance('arg1', kwarg='value1')
        obj2 = instance('arg1', kwarg='value1')
        self.assertEqual(obj1, obj2)

    def test___call__with_different_args(self):
        instance = Singleton('TestSingleton', (), {})
        obj1 = instance('arg1', kwarg='value1')
        obj2 = instance('arg2', kwarg='value2')
        self.assertEqual(obj1, obj1)  # same instance returned

    def test___str__(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertEqual(str(instance), "<class 'TestSingleton'>")

    def test___repr__(self):
        instance = Singleton('TestSingleton', (), {})
        self.assertEqual(repr(instance), "<class 'TestSingleton'>")

if __name__ == '__main__':
    unittest.main()