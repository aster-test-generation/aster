import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        result = list(join_each('/path', ['dir1', 'dir2', 'file1.txt']))
        expected = ['/path/dir1', '/path/dir2', '/path/file1.txt']
        self.assertEqual(result, expected)

    def test_join_each_empty_parent(self):
        result = list(join_each('', ['dir1', 'dir2', 'file1.txt']))
        expected = ['dir1', 'dir2', 'file1.txt']
        self.assertEqual(result, expected)

    def test_join_each_empty_iterable(self):
        result = list(join_each('/path', []))
        expected = []
        self.assertEqual(result, expected)

    def test_join_each_single_element(self):
        result = list(join_each('/path', ['file1.txt']))
        expected = ['/path/file1.txt']
        self.assertEqual(result, expected)

    def test_join_each_private_method(self):
        result = list(join_each('/path', ['dir1', 'dir2', 'file1.txt']))
        expected = ['/path/dir1', '/path/dir2', '/path/file1.txt']
        self.assertEqual(result, expected)

    def test_join_each_str_method(self):
        result = str(join_each('/path', ['dir1', 'dir2', 'file1.txt']))
        expected = "join_each('/path', ['dir1', 'dir2', 'file1.txt'])"
        self.assertEqual(result(), "join_each('/path', ['dir1', 'dir2', 'file1.txt'])"

    def test_join_each_repr_method(self):
        result = repr(join_each('/path', ['dir1', 'dir2', 'file1.txt']))
        expected = "join_each('/path', ['dir1', 'dir2', 'file1.txt'])"
        self.assertEqual(result(), "join_each('/path', ['dir1', 'dir2', 'file1.txt'])"

if __name__ == '__main__':
    unittest.main()