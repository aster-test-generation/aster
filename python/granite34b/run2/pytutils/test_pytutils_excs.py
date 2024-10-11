import unittest
from pytutils.excs import ok


class TestOKContextManager(unittest.TestCase):
    def test_ok_with_no_exception(self):
        with ok():
            pass

    def test_ok_with_specific_exception(self):
        with ok(ValueError):
            raise ValueError

    def test_ok_with_unspecified_exception(self):
        with self.assertRaises(ZeroDivisionError):
            with ok(ValueError):
                raise ZeroDivisionError

    def test_ok_with_multiple_exceptions(self):
        with ok(ValueError, ZeroDivisionError):
            raise ValueError
        with ok(ValueError, ZeroDivisionError):
            raise ZeroDivisionError
        with self.assertRaises(TypeError):
            with ok(ValueError, ZeroDivisionError):
                raise TypeError

if __name__ == '__main__':
    unittest.main()