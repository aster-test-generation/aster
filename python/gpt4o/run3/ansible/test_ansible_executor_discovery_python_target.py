import unittest
import os
import platform
import json
from unittest.mock import patch, mock_open
from ansible.executor.discovery.python_target import read_utf8_file, get_platform_info, main


class TestReadUtf8File(unittest.TestCase):
    @patch('os.access', return_value=True)
    @patch('io.open', new_callable=mock_open, read_data='file content')
    def test_read_utf8_file_success(self, mock_file, mock_access):
        result = read_utf8_file('dummy_path')
        self.assertEqual(result, 'file content')

    @patch('os.access', return_value=False)
    def test_read_utf8_file_no_access(self, mock_access):
        result = read_utf8_file('dummy_path')
        self.assertIsNone(result)

class TestGetPlatformInfo(unittest.TestCase):
    @patch('platform.dist', return_value=('dist_name', 'dist_version', 'dist_id'))
    @patch('ansible.executor.discovery.python_target.read_utf8_file', return_value='os-release content')
    def test_get_platform_info_with_dist(self, mock_read_utf8_file, mock_platform_dist):
        result = get_platform_info()
        self.assertEqual(result['platform_dist_result'], ('dist_name', 'dist_version', 'dist_id'))
        self.assertEqual(result['osrelease_content'], 'os-release content')

    @patch('platform.dist', side_effect=AttributeError)
    @patch('ansible.executor.discovery.python_target.read_utf8_file', side_effect=[None, 'os-release content'])
    def test_get_platform_info_without_dist(self, mock_read_utf8_file, mock_platform_dist):
        result = get_platform_info()
        self.assertEqual(result['platform_dist_result'], [])
        self.assertEqual(result['osrelease_content'], 'os-release content')

class TestMainFunction(unittest.TestCase):
    @patch('ansible.executor.discovery.python_target.get_platform_info', return_value={'key': 'value'})
    @patch('builtins.print')
    def test_main(self, mock_print, mock_get_platform_info):
        main()
        mock_print.assert_called_once_with(json.dumps({'key': 'value'}))

if __name__ == '__main__':
    unittest.main()