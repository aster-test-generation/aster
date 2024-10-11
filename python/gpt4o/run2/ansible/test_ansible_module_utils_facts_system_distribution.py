import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.system.distribution import get_uname, DistributionFactCollector


class TestGetUname(unittest.TestCase):
    @patch('ansible.module_utils.facts.system.distribution.os')
    def test_get_uname_success(self, mock_os):
        module = Mock()
        module.run_command.return_value = (0, 'Linux version', '')
        result = get_uname(module)
        self.assertEqual(result, 'Linux version')

    @patch('ansible.module_utils.facts.system.distribution.os')
    def test_get_uname_failure(self, mock_os):
        module = Mock()
        module.run_command.return_value = (1, '', 'error')
        result = get_uname(module)
        self.assertIsNone(result)

    @patch('ansible.module_utils.facts.system.distribution.os')
    def test_get_uname_with_flags(self, mock_os):
        module = Mock()
        module.run_command.return_value = (0, 'Linux version', '')
        result = get_uname(module, '-r')
        self.assertEqual(result, 'Linux version')

class TestFileExists(unittest.TestCase):
    @patch('ansible.module_utils.facts.system.distribution.os.path')
    def test_file_exists_path_does_not_exist(self, mock_path):
        mock_path.exists.return_value = False
        result = _file_exists('/fake/path')
        self.assertFalse(result)

    @patch('ansible.module_utils.facts.system.distribution.os.path')
    def test_file_exists_path_exists_allow_empty(self, mock_path):
        mock_path.exists.return_value = True
        result = _file_exists('/fake/path', allow_empty=True)
        self.assertTrue(result)

    @patch('ansible.module_utils.facts.system.distribution.os.path')
    def test_file_exists_path_exists_not_empty(self, mock_path):
        mock_path.exists.return_value = True
        mock_path.getsize.return_value = 10
        result = _file_exists('/fake/path')
        self.assertTrue(result)

    @patch('ansible.module_utils.facts.system.distribution.os.path')
    def test_file_exists_path_exists_empty(self, mock_path):
        mock_path.exists.return_value = True
        mock_path.getsize.return_value = 0
        result = _file_exists('/fake/path')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()