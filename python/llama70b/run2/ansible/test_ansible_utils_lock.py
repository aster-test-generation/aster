import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator(self):
        def example_func(*args, **kwargs):
            return "example_func called"
        
        decorated_func = lock_decorator(attr='_callback_lock')(example_func)
        result = decorated_func(object(), 'arg1', 'arg2')
        self.assertEqual(result, "example_func called")

    def test_lock_decorator_with_lock(self):
        import threading
        lock = threading.Lock()
        def example_func(*args, **kwargs):
            return "example_func called"
        
        decorated_func = lock_decorator(lock=lock)(example_func)
        result = decorated_func('arg1', 'arg2')
        self.assertEqual(result, "example_func called")

    def test_lock_decorator_private_method(self):
        def example_func(*args, **kwargs):
            return "example_func called"
        
        decorated_func = lock_decorator(attr='_callback_lock')(example_func)
        result = decorated_func.__wrapped__('arg1', 'arg2')
        self.assertEqual(result, "example_func called")

    def test_lock_decorator_magic_method_str(self):
        def example_func(*args, **kwargs):
            return "example_func called"
        
        decorated_func = lock_decorator(attr='_callback_lock')(example_func)
        result = str(decorated_func)
        self.assertIsInstance(result, str)

    def test_lock_decorator_magic_method_repr(self):
        def example_func(*args, **kwargs):
            return "example_func called"
        
        decorated_func = lock_decorator(attr='_callback_lock')(example_func)
        result = repr(decorated_func)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()