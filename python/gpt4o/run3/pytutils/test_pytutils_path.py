import unittest
import os
from pytutils.path import join_each


class TestJoinEachFunction(unittest.TestCase):
    def test_join_each(self):
        parent = "/home/user"
        iterable = ["docs", "images", "videos"]
        result = list(join_each(parent, iterable))
        expected = [os.path.join(parent, "docs"), os.path.join(parent, "images"), os.path.join(parent, "videos")]
        self.assertEqual(result, expected)

    def test_join_each_empty_iterable(self):
        parent = "/home/user"
        iterable = []
        result = list(join_each(parent, iterable))
        expected = []
        self.assertEqual(result, expected)

    def test_join_each_single_element(self):
        parent = "/home/user"
        iterable = ["docs"]
        result = list(join_each(parent, iterable))
        expected = [os.path.join(parent, "docs")]
        self.assertEqual(result, expected)

    def test_join_each_with_subdirectories(self):
        parent = "/home/user"
        iterable = ["docs/reports", "images/photos", "videos/movies"]
        result = list(join_each(parent, iterable))
        expected = [os.path.join(parent, "docs/reports"), os.path.join(parent, "images/photos"), os.path.join(parent, "videos/movies")]
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()