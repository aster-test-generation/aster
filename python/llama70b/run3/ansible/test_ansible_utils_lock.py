import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator(self):
        def example_func(*args, **kwargs):
            return "locked"
        decorated_func = lock_decorator(attr='lock_attr')(example_func)
        result = decorated_func(None, lock_attr="lock_obj")
        self.assertEqual(result, "locked")

    def test_lock_decorator_with_lock(self):
        import threading
        lock = threading.Lock()
        def example_func(*args, **kwargs):
            return "locked"
        decorated_func = lock_decorator(lock=lock)(example_func)
        result = decorated_func(None)
        self.assertEqual(result, "locked")

    def test_lock_decorator_without_lock(self):
        def example_func(*args, **kwargs):
            return "locked"
        decorated_func = lock_decorator(attr='lock_attr')(example_func)
        with self.assertRaises(AttributeError):
            decorated_func(None)

    def test_lock_decorator_private_method(self):
        def example_func(*args, **kwargs):
            return "locked"
        decorated_func = lock_decorator(attr='lock_attr')(example_func)
        result = decorated_func._lock_decorator__outer__inner(None, lock_attr="lock_obj")
        self.assertEqual(result, "locked")

    def test_lock_decorator_magic_method_str(self):
        def example_func(*args, **kwargs):
            return "locked"
        decorated_func = lock_decorator(attr='lock_attr')(example_func)
        result = str(decorated_func)
        self.assertIsInstance(result, str)

    def test_lock_decorator_magic_method_repr(self):
        def example_func(*args, **kwargs):
            return "locked"
        decorated_func = lock_decorator(attr='lock_attr')(example_func)
        result = repr(decorated_func)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()