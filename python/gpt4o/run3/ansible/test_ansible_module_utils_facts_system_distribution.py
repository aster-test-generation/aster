import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.system.distribution import get_uname


class TestGetUname(unittest.TestCase):
    @patch('ansible.module_utils.facts.system.distribution.get_uname')
    def test_get_uname_success(self, mock_get_uname):
        module = Mock()
        module.run_command.return_value = (0, 'Linux version', '')
        result = get_uname(module)
        self.assertEqual(result, 'Linux version')

    @patch('ansible.module_utils.facts.system.distribution.get_uname')
    def test_get_uname_failure(self, mock_get_uname):
        module = Mock()
        module.run_command.return_value = (1, '', 'error')
        result = get_uname(module)
        self.assertIsNone(result)

    @patch('ansible.module_utils.facts.system.distribution.get_uname')
    def test_get_uname_with_flags(self, mock_get_uname):
        module = Mock()
        module.run_command.return_value = (0, 'Linux version', '')
        result = get_uname(module, '-a')
        self.assertEqual(result, 'Linux version')

class TestFileExists(unittest.TestCase):
    @patch('os.path.exists')
    @patch('os.path.getsize')
    def test_file_exists_true(self, mock_getsize, mock_exists):
        mock_exists.return_value = True
        mock_getsize.return_value = 100
        result = _file_exists('/path/to/file')
        self.assertTrue(result)

    @patch('os.path.exists')
    def test_file_exists_false(self, mock_exists):
        mock_exists.return_value = False
        result = _file_exists('/path/to/file')
        self.assertFalse(result)

    @patch('os.path.exists')
    @patch('os.path.getsize')
    def test_file_exists_allow_empty(self, mock_getsize, mock_exists):
        mock_exists.return_value = True
        mock_getsize.return_value = 0
        result = _file_exists('/path/to/file', allow_empty=True)
        self.assertTrue(result)

    @patch('os.path.exists')
    @patch('os.path.getsize')
    def test_file_exists_not_allow_empty(self, mock_getsize, mock_exists):
        mock_exists.return_value = True
        mock_getsize.return_value = 0
        result = _file_exists('/path/to/file')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()