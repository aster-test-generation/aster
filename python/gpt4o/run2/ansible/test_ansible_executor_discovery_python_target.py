import unittest
from unittest.mock import patch, mock_open
import os
import platform
import json
from ansible.executor.discovery.python_target import read_utf8_file, get_platform_info, main


class TestReadUtf8File(unittest.TestCase):
    @patch('ansible.executor.discovery.python_target.os.access', return_value=True)
    @patch('ansible.executor.discovery.python_target.io.open', new_callable=mock_open, read_data='file content')
    def test_read_utf8_file_success(self, mock_file, mock_access):
        result = read_utf8_file('dummy_path')
        self.assertEqual(result, 'file content')

    @patch('ansible.executor.discovery.python_target.os.access', return_value=False)
    def test_read_utf8_file_no_access(self, mock_access):
        result = read_utf8_file('dummy_path')
        self.assertIsNone(result)

class TestGetPlatformInfo(unittest.TestCase):
    @patch('ansible.executor.discovery.python_target.read_utf8_file', return_value='os-release content')
    @patch('ansible.executor.discovery.python_target.platform.dist', return_value=('dist_name', 'version', 'id'))
    def test_get_platform_info_with_dist(self, mock_dist, mock_read_utf8_file):
        result = get_platform_info()
        self.assertEqual(result['platform_dist_result'], ('dist_name', 'version', 'id'))
        self.assertEqual(result['osrelease_content'], 'os-release content')

    @patch('ansible.executor.discovery.python_target.read_utf8_file', side_effect=[None, 'os-release content'])
    @patch('ansible.executor.discovery.python_target.platform.dist', return_value=('dist_name', 'version', 'id'))
    def test_get_platform_info_fallback_os_release(self, mock_dist, mock_read_utf8_file):
        result = get_platform_info()
        self.assertEqual(result['platform_dist_result'], ('dist_name', 'version', 'id'))
        self.assertEqual(result['osrelease_content'], 'os-release content')

    @patch('ansible.executor.discovery.python_target.read_utf8_file', return_value=None)
    @patch('ansible.executor.discovery.python_target.platform.dist', return_value=('dist_name', 'version', 'id'))
    def test_get_platform_info_no_os_release(self, mock_dist, mock_read_utf8_file):
        result = get_platform_info()
        self.assertEqual(result['platform_dist_result'], ('dist_name', 'version', 'id'))
        self.assertIsNone(result['osrelease_content'])

class TestMainFunction(unittest.TestCase):
    @patch('ansible.executor.discovery.python_target.get_platform_info', return_value={'key': 'value'})
    @patch('builtins.print')
    def test_main(self, mock_print, mock_get_platform_info):
        main()
        mock_print.assert_called_once_with(json.dumps({'key': 'value'}))

if __name__ == '__main__':
    unittest.main()