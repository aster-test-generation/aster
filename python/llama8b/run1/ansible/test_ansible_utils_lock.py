import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_with_attr(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator(attr='_lock')(test_method)
        self.assertEqual(test_method.__wrapped__.__name__, 'test_method')

    def test_lock_decorator_with_lock(self):
        lock = object()
        def test_method(self):
            return 'test'
        test_method = lock_decorator(lock=lock)(test_method)
        self.assertEqual(test_method.__wrapped__.__name__, 'test_method')

    def test_lock_decorator_with_no_lock(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator()(test_method)
        self.assertEqual(test_method.__wrapped__.__name__, 'test_method')

    def test_lock_decorator_with_no_lock_and_no_attr(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator()(test_method)
        self.assertEqual(test_method.__wrapped__.__name__, 'test_method')

    def test_lock_decorator_with_no_lock_and_attr(self):
        def test_method(self):
            return 'test'
        test_method = lock_decorator(attr='test')(test_method)
        self.assertEqual(test_method.__wrapped__.__name__, 'test_method')

class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_attr(self):
        @lock_decorator(attr='_callback_lock')
        def send_callback(self, x):
            return x + 1
        instance = type('Test', (), {'_callback_lock': threading.Lock()})()
        result = send_callback(instance, 1)
        self.assertEqual(result, 2)

    def test_lock_decorator_lock(self):
        lock = threading.Lock()
        @lock_decorator(lock=lock)
        def some_method(self, y):
            return y * 2
        instance = type('Test', (), {})()
        with lock:
            result = some_method(instance, 2)
            self.assertEqual(result, 4)

    def test_lock_decorator_no_lock(self):
        @lock_decorator(attr='missing_lock_attr')
        def send_callback(self, x):
            return x + 1
        instance = type('Test', (), {})()
        with self.assertRaises(AttributeError):
            send_callback(instance, 1)

    def test_lock_decorator_no_attr(self):
        @lock_decorator(lock=None)
        def some_method(self, y):
            return y * 2
        instance = type('Test', (), {})()
        with self.assertRaises(AttributeError):
            some_method(instance, 2)

    def test_lock_decorator_str_method(self):
        @lock_decorator(attr='_callback_lock')
        def send_callback(self, x):
            return x + 1
        instance = type('Test', (), {'_callback_lock': threading.Lock()})()
        result = str(send_callback(instance, 1))
        self.assertEqual(result, '<function send_callback at 0x...>')

    def test_lock_decorator_repr_method(self):
        @lock_decorator(attr='_callback_lock')
        def send_callback(self, x):
            return x + 1
        instance = type('Test', (), {'_callback_lock': threading.Lock()})()
        result = repr(send_callback(instance, 1))
        self.assertEqual(result, '<function send_callback at 0x...>')

if __name__ == '__main__':
    unittest.main()