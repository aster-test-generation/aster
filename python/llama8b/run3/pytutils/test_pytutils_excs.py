import unittest
from pytutils.excs import ok


class TestOk(unittest.TestCase):
    def test_ok(self):
        with ok(ZeroDivisionError):
            1 / 1
        with self.assertRaises(ZeroDivisionError):
            1 / 0

    def test_ok_multiple_exceptions(self):
        with ok(ZeroDivisionError, TypeError):
            1 / 1
            'a' / 1
        with self.assertRaises(ZeroDivisionError):
            1 / 0
        with self.assertRaises(TypeError):
            'a' / 1

    def test_ok_no_exceptions(self):
        with ok():
            1 / 1
        with self.assertRaises(ZeroDivisionError):
            1 / 0

    def test_ok_no_exceptions_no_yield(self):
        with ok():
            pass
        with self.assertRaises(ZeroDivisionError):
            1 / 0

if __name__ == '__main__':
    unittest.main()