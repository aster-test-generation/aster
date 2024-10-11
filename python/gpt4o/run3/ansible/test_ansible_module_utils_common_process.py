import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    @patch('os.path.exists')
    @patch('os.path.isdir')
    @patch('ansible.module_utils.common.file.is_executable')
    def test_get_bin_path_found_in_opt_dirs(self, mock_is_executable, mock_isdir, mock_exists):
        mock_exists.side_effect = lambda x: True
        mock_isdir.side_effect = lambda x: False
        mock_is_executable.side_effect = lambda x: True

        result = get_bin_path('test_executable', opt_dirs=['/opt/bin', '/usr/local/bin'])
        self.assertEqual(result, '/opt/bin/test_executable')

    @patch('os.path.exists')
    @patch('os.path.isdir')
    @patch('ansible.module_utils.common.file.is_executable')
    def test_get_bin_path_found_in_sbin_paths(self, mock_is_executable, mock_isdir, mock_exists):
        mock_exists.side_effect = lambda x: x in ['/sbin/test_executable']
        mock_isdir.side_effect = lambda x: False
        mock_is_executable.side_effect = lambda x: True

        result = get_bin_path('test_executable', required=False)
        self.assertEqual(result, '/sbin/test_executable')

    @patch('os.path.exists')
    @patch('os.path.isdir')
    @patch('ansible.module_utils.common.file.is_executable')
    def test_get_bin_path_found_in_path(self, mock_is_executable, mock_isdir, mock_exists):
        mock_exists.side_effect = lambda x: x in ['/usr/bin/test_executable']
        mock_isdir.side_effect = lambda x: False
        mock_is_executable.side_effect = lambda x: True

        with patch.dict('os.environ', {'PATH': '/usr/bin'}):
            result = get_bin_path('/usr/bin/test_executable')
            self.assertEqual(result, '/usr/bin/test_executable')

    @patch('os.path.exists')
    @patch('os.path.isdir')
    @patch('ansible.module_utils.common.file.is_executable')
    def test_get_bin_path_not_found(self, mock_is_executable, mock_isdir, mock_exists):
        mock_exists.side_effect = lambda x: False
        mock_isdir.side_effect = lambda x: False
        mock_is_executable.side_effect = lambda x: False

        with self.assertRaises(ValueError) as context:
            get_bin_path('test_executable')
        self.assertTrue(str(context.exception).startswith('Failed to find required executable "test_executable" in paths: '))

if __name__ == '__main__':
    unittest.main()