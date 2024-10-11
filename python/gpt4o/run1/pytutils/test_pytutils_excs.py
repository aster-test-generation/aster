import unittest
from contextlib import contextmanager
from pytutils.excs import ok


class TestOkContextManager(unittest.TestCase):
    def test_ok_no_exception(self):
        try:
            with ok():
                pass  # No exception should be raised
        except Exception as e:
            self.fail(f"Unexpected exception raised: {e}")

    def test_ok_catch_specified_exception(self):
        try:
            with ok(ValueError):
                raise ValueError("This should be caught")
        except ValueError:
            self.fail("ValueError was not caught by ok context manager")

    def test_ok_raise_unexpected_exception(self):
        with self.assertRaises(TypeError):
            with ok(ValueError):
                raise TypeError("This should not be caught")

if __name__ == '__main__':
    unittest.main()