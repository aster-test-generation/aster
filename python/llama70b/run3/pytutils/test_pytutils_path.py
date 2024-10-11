import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        parent = '/path/to/parent'
        iterable = ['file1', 'file2', 'file3']
        result = list(join_each(parent, iterable))
        expected = ['/path/to/parent/file1', '/path/to/parent/file2', '/path/to/parent/file3']
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()