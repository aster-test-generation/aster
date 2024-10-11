import unittest
from pytutils.path import *


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        result = join_each("parent", ["p1", "p2"])
        self.assertEqual(result, ["parent/p1", "parent/p2"])

if __name__ == '__main__':
    unittest.main()