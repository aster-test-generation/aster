import unittest
from unittest.mock import MagicMock, patch
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def setUp(self):
        self.mock_lock = MagicMock()
        self.mock_func = MagicMock()

    def test_lock_decorator_with_attr(self):
        class TestClass:
            def __init__(self):
                self._callback_lock = mock.Mock()

            @lock_decorator(attr='_callback_lock')
            def test_method(self):
                self.mock_func()

        instance = TestClass()
        instance.test_method()
        self.mock_lock.__enter__.assert_called_once()
        self.mock_func.assert_called_once()
        self.mock_lock.__exit__.assert_called_once()

    def test_lock_decorator_with_lock(self):
        @lock_decorator(lock=self.mock_lock)
        def test_function():
            self.mock_func()

        test_function()
        self.mock_lock.__enter__.assert_called_once()
        self.mock_func.assert_called_once()
        self.mock_lock.__exit__.assert_called_once()

    def test_lock_decorator_with_missing_attr(self):
        class TestClass:
            @lock_decorator(attr='_missing_lock')
            def test_method(self):
                self.mock_func()

        instance = TestClass()
        with self.assertRaises(AttributeError):
            instance.test_method()

if __name__ == '__main__':
    unittest.main()