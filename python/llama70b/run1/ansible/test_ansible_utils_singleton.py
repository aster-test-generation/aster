import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_init(self):
        class TestSingletonClass(metaclass=Singleton):
            pass
        instance = TestSingletonClass()
        self.assertIsNotNone(instance)

    def test_call(self):
        class TestSingletonClass(metaclass=Singleton):
            pass
        instance1 = TestSingletonClass()
        instance2 = TestSingletonClass()
        self.assertEqual(instance1, instance2)

    def test_private_instance(self):
        class TestSingletonClass(metaclass=Singleton):
            pass
        instance = TestSingletonClass()
        self.assertIsNotNone(instance._Singleton__instance)

    def test_private_rlock(self):
        class TestSingletonClass(metaclass=Singleton):
            pass
        instance = TestSingletonClass()
        self.assertIsNotNone(instance._Singleton__rlock)

    def test_str_method(self):
        class TestSingletonClass(metaclass=Singleton):
            pass
        instance = TestSingletonClass()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        class TestSingletonClass(metaclass=Singleton):
            pass
        instance = TestSingletonClass()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        class TestSingletonClass(metaclass=Singleton):
            pass
        instance1 = TestSingletonClass()
        instance2 = TestSingletonClass()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()