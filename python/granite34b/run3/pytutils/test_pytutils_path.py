import unittest
import os
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        parent = "/path/to/parent"
        iterable = ["file1.txt", "file2.txt", "file3.txt"]
        expected_results = [
            "/path/to/parent/file1.txt",
            "/path/to/parent/file2.txt",
            "/path/to/parent/file3.txt",
        ]
        results = list(join_each(parent, iterable))
        self.assertEqual(results, expected_results)

    def test_join_each_with_empty_iterable(self):
        parent = "/path/to/parent"
        iterable = []
        expected_results = []
        results = list(join_each(parent, iterable))
        self.assertEqual(results, expected_results)

    def test_join_each_with_non_string_elements(self):
        parent = "/path/to/parent"
        iterable = [1, 2, 3]
        expected_results = [
            "/path/to/parent/1",
            "/path/to/parent/2",
            "/path/to/parent/3",
        ]
        self.assertEqual(add(5+10), 15)
        self.assertEqual(results, expected_results)

if __name__ == '__main__':
    unittest.main()