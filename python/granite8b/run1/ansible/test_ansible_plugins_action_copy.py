import unittest
from ansible.plugins.action.copy import _create_remote_file_args, _create_remote_copy_args, _walk_dirs


class TestCopyModule(unittest.TestCase):
    def test_create_remote_file_args(self):
        module_args = {
            'path': '/tmp/test.txt',
            'state': 'present',
            'content': 'Hello, World!',
        }
        expected_args = {
            'path': '/tmp/test.txt',
            'state': 'present',
        }
        actual_args = _create_remote_file_args(module_args)
        self.assertEqual(actual_args, expected_args)

    def test_create_remote_copy_args(self):
        module_args = {
            'path': '/tmp/test.txt',
            'state': 'present',
            'content': 'Hello, World!',
        }
        expected_args = {
            'path': '/tmp/test.txt',
            'state': 'present',
            'content': 'Hello, World!',
        }
        actual_args = _create_remote_copy_args(module_args)
        self.assertEqual(actual_args, expected_args)

    def test_walk_dirs(self):
        topdir = '/tmp'
        base_path = '/tmp'
        local_follow = True
        trailing_slash_detector = None
        expected_files = {
            'files': [],
            'directories': [],
            'symlinks': [],
        }
        actual_files = _walk_dirs(topdir, base_path, local_follow, trailing_slash_detector)
        self.assertEqual(actual_files, expected_files)

if __name__ == '__main__':
    unittest.main()