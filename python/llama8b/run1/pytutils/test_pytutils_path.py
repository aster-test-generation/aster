import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        result = list(join_each('/path', ['a', 'b', 'c']))
        expected = ['/path/a', '/path/b', '/path/c']
        self.assertEqual(result, expected)

    def test_join_each_empty_iterable(self):
        result = list(join_each('/path', []))
        self.assertEqual(result, [])

    def test_join_each_single_element_iterable(self):
        result = list(join_each('/path', ['a']))
        expected = ['/path/a']
        self.assertEqual(result, expected)

    def test_join_each_parent_empty(self):
        result = list(join_each('', ['a', 'b', 'c']))
        expected = ['a', 'b', 'c']
        self.assertEqual(result, expected)

    def test_join_each_parent_single_element(self):
        result = list(join_each('/path', ['a', 'b', 'c']))
        expected = ['/path/a', '/path/b', '/path/c']
        self.assertEqual(result, expected)

    def test_join_each_parent_with_trailing_slash(self):
        result = list(join_each('/path/', ['a', 'b', 'c']))
        expected = ['/path/a', '/path/b', '/path/c']
        self.assertEqual(result, expected)

    def test_join_each_parent_with_trailing_slash_and_empty_iterable(self):
        result = list(join_each('/path/', []))
        self.assertEqual(result, [])

    def test_join_each_parent_with_trailing_slash_and_single_element_iterable(self):
        result = list(join_each('/path/', ['a']))
        expected = ['/path/a']
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()