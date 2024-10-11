import threading
import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_attr(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator(attr='_lock')(test_method)
        instance = type('Test', (), {'_lock': threading.Lock()})()
        result = test_method(instance)
        self.assertEqual(result, 'test')

    def test_lock_decorator_lock(self):
        lock = threading.Lock()
        def test_method(self):
            return 'test'
        test_method = lock_decorator(lock=lock)(test_method)
        result = test_method(None)
        self.assertEqual(result, 'test')

    def test_lock_decorator_no_lock(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator()(test_method)
        result = test_method(None)
        self.assertEqual(result, 'test')

    def test_lock_decorator_outer(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator(attr='_lock')(test_method)
        instance = type('Test', (), {'_lock': threading.Lock()})()
        result = test_method(instance)
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()