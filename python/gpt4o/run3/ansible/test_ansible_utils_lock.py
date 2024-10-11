import unittest
from unittest.mock import MagicMock, patch
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def setUp(self):
        class TestClass:
            def __init__(self):
                self._callback_lock = MagicMock()

            @lock_decorator(attr='_callback_lock')
            def method_with_lock(self, x):
                return x + 1

            @lock_decorator(lock=MagicMock())
            def method_with_explicit_lock(self, y):
                return y * 2

        self.test_instance = TestClass()

    def test_method_with_lock(self):
        result = self.test_instance.method_with_lock(1)
        self.test_instance._callback_lock.__enter__.assert_called_once()
        self.test_instance._callback_lock.__exit__.assert_called_once()
        self.assertEqual(result, 2)

    def test_method_with_explicit_lock(self):
        result = self.test_instance.method_with_explicit_lock(2)
        self.test_instance.method_with_explicit_lock.__wrapped__.__globals__['lock'].__enter__.assert_called_once_with()
        self.test_instance.method_with_explicit_lock.__wrapped__.__globals__['lock'].__exit__.assert_called_once()
        self.assertEqual(result, 4)

if __name__ == '__main__':
    unittest.main()