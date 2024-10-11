import unittest
from contextlib import contextmanager
from pytutils.excs import ok


class TestOkContextManager(unittest.TestCase):
    def test_ok_no_exception(self):
        with ok():
            result = 1 + 1
        self.assertEqual(result, 2)

    def test_ok_catch_specified_exception(self):
        with ok(ValueError):
            raise ValueError("This is a ValueError")
        self.assertTrue(True)  # If no exception is raised, the test passes

    def test_ok_raise_unexpected_exception(self):
        with self.assertRaises(TypeError):
            with ok(ValueError):
                raise TypeError("This is a TypeError")

if __name__ == '__main__':
    unittest.main()