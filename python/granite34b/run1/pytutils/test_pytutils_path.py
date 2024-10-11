import os
import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        parent = "/path/to/parent"
        iterable = ["dir1", "dir2", "dir3"]
        expected = [
            "/path/to/parent/dir1",
            "/path/to/parent/dir2",
            "/path/to/parent/dir3",
        ]
        result = list(join_each(parent, iterable))
        self.assertEqual(result, expected)

    def test_join_each_with_empty_iterable(self):
        parent = "/path/to/parent"
        iterable = []
        expected = []
        result = list(join_each(parent, iterable))
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()