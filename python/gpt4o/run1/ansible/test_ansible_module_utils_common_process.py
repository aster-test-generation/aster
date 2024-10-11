import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    @patch('ansible.module_utils.common.process.os.path.exists')
    @patch('ansible.module_utils.common.process.is_executable')
    def test_get_bin_path_found_in_opt_dirs(self, mock_is_executable, mock_path_exists):
        mock_path_exists.side_effect = lambda x: True
        mock_is_executable.return_value = True
        result = get_bin_path('test_executable', opt_dirs=['/opt/bin'])
        self.assertEqual(result, '/opt/bin/test_executable')

    @patch('ansible.module_utils.common.process.os.path.exists')
    @patch('ansible.module_utils.common.process.is_executable')
    def test_get_bin_path_found_in_sbin_paths(self, mock_is_executable, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x in ['/sbin/test_executable', '/sbin']
        mock_is_executable.return_value = True
        result = get_bin_path('test_executable')
        self.assertEqual(result, '/sbin/test_executable')

    @patch('ansible.module_utils.common.process.os.path.exists')
    @patch('ansible.module_utils.common.process.is_executable')
    def test_get_bin_path_found_in_path(self, mock_is_executable, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x in ['/usr/bin/test_executable', '/usr/bin']
        mock_is_executable.return_value = True
        with patch.dict('os.environ', {'PATH': '/usr/bin'}):
            result = get_bin_path('test_executable')
            self.assertEqual(result, '/usr/bin/test_executable')

    @patch('ansible.module_utils.common.process.os.path.exists')
    @patch('ansible.module_utils.common.process.is_executable')
    def test_get_bin_path_not_found(self, mock_is_executable, mock_path_exists):
        mock_path_exists.return_value = False
        mock_is_executable.return_value = False
        with self.assertRaises(ValueError) as context:
            get_bin_path('test_executable')
        self.assertIn('Failed to find required executable "test_executable"', str(context.exception))

if __name__ == '__main__':
    unittest.main()