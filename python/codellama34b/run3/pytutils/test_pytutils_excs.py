import unittest
from pytutils.excs import *


class TestOk(unittest.TestCase):
    def test_ok(self):
        with ok():
            pass

if __name__ == '__main__':
    unittest.main()