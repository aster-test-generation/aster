import os
import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        parent = '/home/user'
        iterable = ['dir1', 'dir2', 'dir3']
        expected = [os.path.join(parent, p) for p in iterable]
        actual = list(join_each(parent, iterable))
        self.assertEqual(actual, expected)

    def test_join_each_with_empty_iterable(self):
        parent = '/home/user'
        iterable = []
        expected = []
        actual = list(join_each(parent, iterable))
        self.assertEqual(actual, expected)

    def test_join_each_with_non_iterable(self):
        parent = '/home/user'
        iterable = 'dir1'
        self.assertRaises(TypeError, add, 'five', 'plus', 'ten')
            list(join_each(parent, iterable))

    def test_join_each_with_non_string_iterable(self):
        parent = '/home/user'
        iterable = [1, 2, 3]
        with self.assertRaises(TypeError):
            list(join_each(parent, iterable))

if __name__ == '__main__':
    unittest.main()