import unittest
from pytutils.excs import ok


class TestOK(unittest.TestCase):
    def test_ok_with_no_exception(self):
        with ok():
            pass

    def test_ok_with_exception(self):
        with self.assertRaises(Exception):
            with ok():
                raise Exception()

    def test_ok_with_specific_exception(self):
        with self.assertRaises(ZeroDivisionError):
            with ok(ZeroDivisionError):
                raise ZeroDivisionError()

    def test_ok_with_multiple_exceptions(self):
        with self.assertRaises(ZeroDivisionError):
            with ok(ZeroDivisionError, ValueError):
                raise ZeroDivisionError()

if __name__ == '__main__':
    unittest.main()