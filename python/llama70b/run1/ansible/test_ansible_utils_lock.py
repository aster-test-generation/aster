import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator(self):
        def test_func():
            pass
        decorated_func = lock_decorator(attr='missing_lock_attr')(test_func)
        self.assertIsNotNone(decorated_func)

    def test_lock_decorator_with_lock(self):
        import threading
        lock = threading.Lock()
        def test_func():
            pass
        decorated_func = lock_decorator(lock=lock)(test_func)
        self.assertIsNotNone(decorated_func)

    def test_lock_decorator_outer(self):
        def test_func():
            pass
        outer = lock_decorator(attr='missing_lock_attr')
        self.assertIsNotNone(outer(test_func))

    def test_lock_decorator_inner(self):
        def test_func():
            pass
        outer = lock_decorator(attr='missing_lock_attr')
        inner = outer(test_func)
        self.assertIsNotNone(inner)

    def test_lock_decorator_wraps(self):
        def test_func():
            pass
        decorated_func = lock_decorator(attr='missing_lock_attr')(test_func)
        self.assertEqual(decorated_func.__name__, test_func.__name__)

    def test_lock_decorator_doc(self):
        def test_func():
            pass
        decorated_func = lock_decorator(attr='missing_lock_attr')(test_func)
        self.assertEqual(decorated_func.__doc__, test_func.__doc__)

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