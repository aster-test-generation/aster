import unittest
from pytutils.path import *


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        result = list(join_each("parent", ["a", "b", "c"]))
        self.assertEqual(result, ["parent/a", "parent/b", "parent/c"])

if __name__ == '__main__':
    unittest.main()