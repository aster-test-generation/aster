import threading
import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_with_attr(self):
        class ExampleClass:
            _callback_lock = threading.Lock()

            @lock_decorator(attr='_callback_lock')
            def send_callback(self):
                pass

        instance = ExampleClass()
        instance.send_callback()

    def test_lock_decorator_with_lock(self):
        lock = threading.Lock()

        @lock_decorator(lock=lock)
        def some_method():
            pass

        some_method()

    def test_lock_decorator_with_no_args(self):
        with self.assertRaises(TypeError):
            @lock_decorator
            def some_method():
                pass

            some_method()

if __name__ == '__main__':
    unittest.main()