import unittest
from ansible.utils.singleton import Singleton

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