import threading
import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_with_attr(self):
        class TestClass:
            _lock = threading.Lock()
            @lock_decorator(attr='_lock')
            def test_method(self):
                pass
        instance = TestClass()
        instance.test_method()
        self.assertTrue(hasattr(instance, '_lock'))

    def test_lock_decorator_with_lock(self):
        lock = threading.Lock()
        @lock_decorator(lock=lock)
        def test_function():
            pass
        test_function()
        self.assertTrue(hasattr(test_function, 'lock'))

    def test_lock_decorator_with_no_args(self):
        with self.assertRaises(TypeError):
            @lock_decorator()
            def test_function():
                pass

if __name__ == '__main__':
    unittest.main()