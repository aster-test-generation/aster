import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        result = list(join_each('/path', ['dir1', 'dir2', 'file1.txt']))
        self.assertEqual(result, ['/path/dir1', '/path/dir2', '/path/file1.txt'])

    def test_join_each_empty_iterable(self):
        result = list(join_each('/path', []))
        self.assertEqual(result, [])

    def test_join_each_single_element_iterable(self):
        result = list(join_each('/path', ['dir1']))
        self.assertEqual(result, ['/path/dir1'])

    def test_join_each_non_string_parent(self):
        with self.assertRaises(TypeError):
            list(join_each(123, ['dir1', 'dir2']))

    def test_join_each_non_string_element(self):
        with self.assertRaises(TypeError):
            list(join_each('/path', [123, 'dir2']))

if __name__ == '__main__':
    unittest.main()