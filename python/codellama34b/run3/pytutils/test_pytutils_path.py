import unittest
from pytutils.path import *


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        result = join_each("parent", ["a", "b", "c"])
        self.assertEqual(result, list(join_each("parent")))

if __name__ == '__main__':
    unittest.main()