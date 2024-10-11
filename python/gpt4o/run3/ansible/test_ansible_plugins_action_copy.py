import unittest
import os
from unittest.mock import patch, MagicMock
from ansible.plugins.action.copy import _create_remote_file_args, _create_remote_copy_args, _walk_dirs


class TestCreateRemoteFileArgs(unittest.TestCase):
    def test_create_remote_file_args(self):
        module_args = {
            'state': 'present',
            'path': '/tmp/test',
            'content': 'test content',
            'force': True
        }
        result = _create_remote_file_args(module_args)
        expected = {
            'state': 'present',
            'path': '/tmp/test',
            'force': True
        }
        self.assertEqual(result, expected)

class TestCreateRemoteCopyArgs(unittest.TestCase):
    def test_create_remote_copy_args(self):
        module_args = {
            'state': 'present',
            'path': '/tmp/test',
            'content': 'test content',
            'decrypt': False
        }
        result = _create_remote_copy_args(module_args)
        expected = {
            'state': 'present',
            'path': '/tmp/test'
        }
        self.assertEqual(result, expected)

class TestWalkDirs(unittest.TestCase):
    @patch('os.walk')
    @patch('os.path.islink')
    @patch('os.path.realpath')
    @patch('os.readlink')
    @patch('os.path.isfile')
    @patch('os.stat')
    def test_walk_dirs(self, mock_stat, mock_isfile, mock_readlink, mock_realpath, mock_islink, mock_walk):
        mock_walk.return_value = [
            ('/topdir', ['subdir'], ['file1', 'file2']),
            ('/topdir/subdir', [], ['file3'])
        ]
        mock_islink.side_effect = [False, False, False, False]
        mock_realpath.side_effect = lambda x: x
        mock_readlink.side_effect = lambda x: x
        mock_isfile.side_effect = lambda x: True
        mock_stat.return_value = MagicMock(st_dev=1, st_ino=1)

        result = list(_walk_dirs('/topdir'))
        expected = {
            'files': [
                ('/topdir/file1', 'file1'),
                ('/topdir/file2', 'file2'),
                ('/topdir/subdir/file3', 'subdir/file3')
            ],
            'directories': [
                ('/topdir/subdir', 'subdir')
            ],
            'symlinks': []
        }
        self.assertEqual(result, expected)

    @patch('os.path.islink')
    @patch('os.readlink')
    @patch('os.stat')
    def test_walk_dirs_symlink(self, mock_stat, mock_readlink, mock_islink):
        mock_islink.return_value = True
        mock_readlink.return_value = '/linked'
        mock_stat.return_value = MagicMock(st_dev=1, st_ino=1)

        result = _walk_dirs('/topdir')
        expected = {
            'files': [],
            'directories': [],
            'symlinks': ('/linked', 'topdir')
        }
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()