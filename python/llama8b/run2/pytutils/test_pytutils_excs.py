import unittest
from pytutils.excs import ok


class TestOkContextManager(unittest.TestCase):
    def test_ok_context_manager(self):
        with ok(ZeroDivisionError):
            1 / 1
        with self.assertRaises(ZeroDivisionError):
            with ok(ZeroDivisionError):
                1 / 0

    def test_ok_context_manager_multiple_exceptions(self):
        with ok(ZeroDivisionError, ValueError):
            1 / 1
        with self.assertRaises((ZeroDivisionError, ValueError)):
            with ok(ZeroDivisionError, ValueError):
                1 / 0
        with self.assertRaises(ZeroDivisionError):
            with ok(ZeroDivisionError, ValueError):
                1 / 1
        with self.assertRaises(ValueError):
            with ok(ZeroDivisionError, ValueError):
                2 + 2

    def test_ok_context_manager_no_exceptions(self):
        with ok(ZeroDivisionError):
            1 / 1
        with self.assertRaises(ZeroDivisionError):
            with ok(ZeroDivisionError):
                1 / 0
        with self.assertRaises(ZeroDivisionError):
            with ok(ZeroDivisionError):
                1 / 1

if __name__ == '__main__':
    unittest.main()