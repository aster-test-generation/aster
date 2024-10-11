import unittest
from pytutils.excs import ok


class TestOk(unittest.TestCase):
    def test_ok_context_manager(self):
        with self.assertRaises(ZeroDivisionError):
            with ok(Exception):
                raise Exception("Test exception")

    def test_ok_function(self):
        self.assertIsNone(ok(Exception, Exception("Test exception")))

if __name__ == '__main__':
    unittest.main()