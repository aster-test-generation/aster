import unittest
from ansible.utils.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_init(self):
        instance = Singleton()
        self.assertEqual(instance.__instance, None)
        self.assertEqual(instance.__rlock, RLock())

    def test_call(self):
        instance = Singleton()
        result = instance.__call__()
        self.assertEqual(result, instance.__instance)

    def test_private_method(self):
        instance = Singleton()
        result = instance._Singleton__instance
        self.assertEqual(result, instance.__instance)

    def test_protected_method(self):
        instance = Singleton()
        result = instance._Singleton__rlock
        self.assertEqual(result, instance.__rlock)

    def test_str_method(self):
        instance = Singleton()
        result = instance.__str__()
        self.assertEqual(result, "Singleton")

    def test_repr_method(self):
        instance = Singleton()
        result = instance.__repr__()
        self.assertEqual(result, "Singleton(None)")

    def test_eq_method(self):
        instance = Singleton()
        result = instance.__eq__(instance)
        self.assertEqual(result, True)


if __name__ == '__main__':
    unittest.main()