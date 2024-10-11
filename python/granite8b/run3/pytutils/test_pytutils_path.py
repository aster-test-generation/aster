import unittest
from pytutils.path import join_each


class TestJoinEach(unittest.TestCase):
    def test_join_each(self):
        parent = '/home/user'
        iterable = ['dir1', 'dir2', 'dir3']
        expected_results = ['/home/user/dir1', '/home/user/dir2', '/home/user/dir3']
        results = list(join_each(parent, iterable))
        self.assertEqual(results, expected_results)

    def test_private_method(self):
        instance = join_each('/home/user', ['dir1', 'dir2', 'dir3'])
        result = instance._join_each('/home/user', ['dir1', 'dir2', 'dir3'])
        self.assertEqual(result, expected_results)

    def test_protected_method(self):
        instance = join_each('/home/user', ['dir1', 'dir2', 'dir3'])
        result = instance._TestJoinEach__join_each('/home/user', ['dir1', 'dir2', 'dir3'])
        self.assertEqual(result, expected_results)

    def test_magic_methods(self):
        instance = join_each('/home/user', ['dir1', 'dir2', 'dir3'])
        self.assertEqual(str(instance), "/home/user/dir1/dir2/dir3")
        self.assertEqual(repr(instance), "join_each('/home/user', ['dir1', 'dir2', 'dir3'])")
        self.assertEqual(instance.__eq__(join_each('/home/user', ['dir1', 'dir2', 'dir3'])), True)

if __name__ == '__main__':
    unittest.main()