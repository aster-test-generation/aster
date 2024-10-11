import unittest
from pytutils.excs import ok


class TestOkContextManager(unittest.TestCase):
    def test_ok_context_manager(self):
        with ok(ZeroDivisionError):
            raise ZeroDivisionError
        with self.assertRaises(ZeroDivisionError):
            with ok():
                raise ZeroDivisionError

    def test_ok_context_manager_multiple_exceptions(self):
        with ok(ZeroDivisionError, TypeError):
            raise ZeroDivisionError
        with self.assertRaises(ZeroDivisionError):
            with ok():
                raise ZeroDivisionError
        with self.assertRaises(TypeError):
            with ok():
                raise TypeError

    def test_ok_context_manager_no_exceptions(self):
        with ok():
            pass
        with self.assertRaises(Exception):
            with ok():
                raise Exception

    def test_ok_context_manager_no_exceptions_nested(self):
        with ok():
            with ok():
                pass
        with self.assertRaises(Exception):
            with ok():
                with ok():
                    raise Exception

if __name__ == '__main__':
    unittest.main()