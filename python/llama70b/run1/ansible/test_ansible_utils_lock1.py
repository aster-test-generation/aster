import unittest
from ansible.utils.lock import lock_decorator

class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_without_lock(self):
        @lock_decorator(attr='_callback_lock')
        def send_callback(self):
            return True
        instance = type('Test', (), {'_callback_lock': None})()
        result = send_callback(instance)
        self.assertTrue(result)

    def test_lock_decorator_with_lock(self):
        import threading
        @lock_decorator(lock=threading.Lock())
        def some_method(self):
            return True
        instance = type('Test', (), {})()
        result = some_method(instance)
        self.assertTrue(result)

    def test_lock_decorator_inner_function(self):
        @lock_decorator(attr='_callback_lock')
        def send_callback(self):
            return True
        instance = type('Test', (), {'_callback_lock': None})()
        inner_func = send_callback.__wrapped__
        result = inner_func(instance)
        self.assertTrue(result)

    def test_lock_decorator_outer_function(self):
        def outer(func):
            return lock_decorator(attr='_callback_lock')(func)
        @outer
        def send_callback(self):
            return True
        instance = type('Test', (), {'_callback_lock': None})()
        result = send_callback(instance)
        self.assertTrue(result)

    def test_lock_decorator_private_method(self):
        instance = lock_decorator
        result = instance._lock_decorator__outer(None)
        self.assertIsNotNone(result)

    def test_lock_decorator_magic_method_str(self):
        instance = lock_decorator
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_lock_decorator_magic_method_repr(self):
        instance = lock_decorator
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()