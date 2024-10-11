import unittest
from ansible.plugins.action.copy import ActionBase, _create_remote_file_args, _create_remote_copy_args, _walk_dirs


class TestActionBase(unittest.TestCase):
    def test_init(self):
        instance = ActionBase()
        self.assertEqual(instance._supports_check_mode, True)

    def test_run(self):
        instance = ActionBase()
        result = instance.run({}, {})
        self.assertEqual(result, {})

    def test_supports_check_mode(self):
        instance = ActionBase()
        self.assertEqual(instance._supports_check_mode, True)

    def test_supports_async(self):
        instance = ActionBase()
        self.assertEqual(instance._supports_async, False)

    def test_supports_check_mode_async(self):
        instance = ActionBase()
        self.assertEqual(instance._supports_check_mode_async, False)

    def test_action_module(self):
        instance = ActionBase()
        result = instance.action_module({}, {})
        self.assertEqual(result, {})

    def test_action_module_async(self):
        instance = ActionBase()
        result = instance.action_module_async({}, {})
        self.assertEqual(result, {})

class TestCreateRemoteFileArgs(unittest.TestCase):
    def test_create_remote_file_args(self):
        module_args = {'path': '/path/to/file', 'state': 'present'}
        result = _create_remote_file_args(module_args)
        self.assertEqual(result, {'path': '/path/to/file', 'state': 'present'})

    def test_create_remote_file_args_with_recurse(self):
        module_args = {'path': '/path/to/file', 'state': 'present', 'recurse': True}
        result = _create_remote_file_args(module_args)
        self.assertEqual(result, {'path': '/path/to/file', 'state': 'present', 'recurse': True})

class TestCreateRemoteCopyArgs(unittest.TestCase):
    def test_create_remote_copy_args(self):
        module_args = {'path': '/path/to/file', 'state': 'present'}
        result = _create_remote_copy_args(module_args)
        self.assertEqual(result, {'path': '/path/to/file', 'state': 'present'})

    def test_create_remote_copy_args_without_content(self):
        module_args = {'path': '/path/to/file', 'state': 'present', 'content': None}
        result = _create_remote_copy_args(module_args)
        self.assertEqual(result, {'path': '/path/to/file', 'state': 'present'})

class TestWalkDirs(unittest.TestCase):
    def test_walk_dirs(self):
        topdir = '/path/to/topdir'
        base_path = '/path/to/base_path'
        local_follow = False
        trailing_slash_detector = None
        result = _walk_dirs(topdir, base_path, local_follow, trailing_slash_detector)
        self.assertEqual(result, {'files': [], 'directories': [], 'symlinks': []})

    def test_walk_dirs_with_recurse(self):
        topdir = '/path/to/topdir'
        base_path = '/path/to/base_path'
        local_follow = True
        trailing_slash_detector = None
        result = _walk_dirs(topdir, base_path, local_follow, trailing_slash_detector)
        self.assertEqual(result, {'files': [], 'directories': [], 'symlinks': []})

if __name__ == '__main__':
    unittest.main()