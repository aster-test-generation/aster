import unittest
from pytutils.excs import ok


class TestOk(unittest.TestCase):
    def test_ok_context_manager(self):
        with self.assertRaises(ZeroDivisionError):
            with ok(Exception):
                raise Exception("Test Exception")

    def test_ok_with_multiple_exceptions(self):
        with self.assertRaises(Exception):
            with ok(Exception, ValueError):
                raise Exception("Test Exception")

    def test_ok_with_no_exceptions(self):
        with ok():
            pass

    def test_ok_with_no_exceptions_and_custom_message(self):
        with self.assertRaisesRegex(Exception, "Custom Message"):
            with ok(message="Custom Message"):
                raise Exception("Test Exception")

if __name__ == '__main__':
    unittest.main()