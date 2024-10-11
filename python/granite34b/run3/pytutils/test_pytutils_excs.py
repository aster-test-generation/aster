import unittest
from pytutils.excs import ok


class TestOkContextManager(unittest.TestCase):
    def test_ok_with_no_exception(self):
        with ok():
            pass

    def test_ok_with_specific_exception(self):
        with ok(ValueError):
            raise ValueError("Test exception")

    def test_ok_with_unspecified_exception(self):
        with self.assertRaises(ValueError):
            with ok():
                raise ValueError("Test exception")

if __name__ == '__main__':
    unittest.main()