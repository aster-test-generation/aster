import unittest
from ansible.plugins.action.copy import *


class TestCopy(unittest.TestCase):
    def test_create_remote_file_args(self):
        module_args = {}
        result = _create_remote_file_args(module_args)
        self.assertEqual(result, {})

    def test_create_remote_copy_args(self):
        module_args = {}
        result = _create_remote_copy_args(module_args)
        self.assertEqual(result, {})

    def test_walk_dirs(self):
        topdir = ''
        base_path = None
        local_follow = False
        trailing_slash_detector = None
        result = _walk_dirs(topdir, base_path, local_follow, trailing_slash_detector)
        self.assertEqual(result, {'files': [], 'directories': [], 'symlinks': []})


if __name__ == '__main__':
    unittest.main()