import threading
import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_attr(self):
        def test_method(self, attr='_lock'):
            return attr
        test_method = lock_decorator(attr='test_attr')(test_method)
        instance = type('Test', (), {'_lock': 'test_lock'})
        result = test_method(instance)
        self.assertEqual(result, 'test_lock')

    def test_lock_decorator_lock(self):
        def test_method(lock=threading.Lock()):
            return lock
        test_method = lock_decorator(lock=threading.Lock())(test_method)
        result = test_method()
        self.assertIsInstance(result, threading.Lock)

    def test_lock_decorator_no_lock(self):
        def test_method(self):
            return self._lock
        test_method = lock_decorator(attr='_lock')(test_method)
        instance = type('Test', (), {'_lock': 'test_lock'})
        result = test_method(instance)
        self.assertEqual(result, 'test_lock')

    def test_lock_decorator_no_lock_no_attr(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator()(test_method)
        result = test_method()
        self.assertEqual(result, 'test')

    def test_lock_decorator_str_method(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator(attr='_lock')(test_method)
        instance = type('Test', (), {'_lock': 'test_lock'})
        result = test_method(instance)
        self.assertEqual(result, 'test')

    def test_lock_decorator_repr_method(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator(attr='_lock')(test_method)
        instance = type('Test', (), {'_lock': 'test_lock'})
        result = test_method(instance)
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()