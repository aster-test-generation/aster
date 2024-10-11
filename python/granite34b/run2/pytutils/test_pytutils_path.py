import os
import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        parent = "/path/to/parent"
        iterable = ["file1.txt", "file2.txt"]
        expected = [os.path.join(parent, p) for p in iterable]
        actual = list(join_each(parent, iterable))
        self.assertEqual(actual, expected)

    def test_join_each_empty(self):
        parent = "/path/to/parent"
        iterable = []
        expected = []
        actual = list(join_each(parent, iterable))
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()