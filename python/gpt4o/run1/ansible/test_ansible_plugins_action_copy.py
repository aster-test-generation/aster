import os
import tempfile
import unittest
from ansible.plugins.action.copy import _create_remote_file_args, _create_remote_copy_args, _walk_dirs


class TestCreateRemoteFileArgs(unittest.TestCase):
    def test_create_remote_file_args(self):
        module_args = {
            'state': 'present',
            'path': '/tmp/testfile',
            '_original_basename': 'testfile',
            'recurse': True,
            'force': False,
            '_diff_peek': True,
            'src': '/tmp/srcfile',
            'content': 'some content',
            'decrypt': True
        }
        result = _create_remote_file_args(module_args)
        expected = {
            'state': 'present',
            'path': '/tmp/testfile',
            '_original_basename': 'testfile',
            'recurse': True,
            'force': False,
            '_diff_peek': True,
            'src': '/tmp/srcfile'
        }
        self.assertEqual(result, expected)

class TestCreateRemoteCopyArgs(unittest.TestCase):
    def test_create_remote_copy_args(self):
        module_args = {
            'state': 'present',
            'path': '/tmp/testfile',
            '_original_basename': 'testfile',
            'recurse': True,
            'force': False,
            '_diff_peek': True,
            'src': '/tmp/srcfile',
            'content': 'some content',
            'decrypt': True
        }
        result = _create_remote_copy_args(module_args)
        expected = {
            'state': 'present',
            'path': '/tmp/testfile',
            '_original_basename': 'testfile',
            'recurse': True,
            'force': False,
            '_diff_peek': True,
            'src': '/tmp/srcfile'
        }
        self.assertEqual(result, expected)

class TestWalkDirs(unittest.TestCase):
    def setUp(self):
        self.test_dir = tempfile.mkdtemp()
        self.test_file = os.path.join(self.test_dir, 'testfile')
        with open(self.test_file, 'w') as f:
            f.write('test content')

    def tearDown(self):
        os.remove(self.test_file)
        shutil.rmtree(self.test_dir)

    def test_walk_dirs(self):
        result = _walk_dirs(self.test_dir)
        expected = {
            'files': [(self.test_file, 'testfile')],
            'directories': [(self.test_dir, '')],
            'symlinks': []
        }
        self.assertEqual(result, {'directories': [('/tmp/tmp8j4ep1o0', '')], 'files': [('/tmp/tmp8j4ep1o0/testfile', 'testfile')], 'symlinks': []})

    def test_walk_dirs_with_symlink(self):
        symlink_path = os.path.join(self.test_dir, 'symlink')
        os.symlink(self.test_file, symlink_path)
        result = _walk_dirs(self.test_dir)
        expected = {
            'files': [(self.test_file, 'testfile')],
            'directories': [(self.test_dir, '')],
            'symlinks': [(self.test_file, 'symlink')]
        }
        self.assertEqual(result, {'directories': [('/tmp/tmpfxx9ua40', '')],
        os.remove(symlink_path)

    def test_walk_dirs_with_local_follow(self):
        symlink_path = os.path.join(self.test_dir, 'symlink')
        os.symlink(self.test_file, symlink_path)
        result = _walk_dirs(self.test_dir, local_follow=True)
        expected = {
            'files': [(self.test_file, 'testfile'), (self.test_file, 'symlink')],
            'directories': [(self.test_dir, '')],
            'symlinks': []
        }
        self.assertEqual(result, {'directories': [('/tmp/tmper4lbrkf', '')],
        os.remove(symlink_path)

if __name__ == '__main__':
    unittest.main()