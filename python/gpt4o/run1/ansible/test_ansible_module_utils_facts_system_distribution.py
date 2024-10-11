import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.system.distribution import get_uname


class TestGetUname(unittest.TestCase):
    def test_get_uname_success(self):
        module = Mock()
        module.run_command = Mock(return_value=(0, 'Linux version 5.4.0', ''))
        result = get_uname(module)
        self.assertEqual(result, 'Linux version 5.4.0')

    def test_get_uname_failure(self):
        module = Mock()
        module.run_command = Mock(return_value=(1, '', 'error'))
        result = get_uname(module)
        self.assertIsNone(result)

    def test_get_uname_with_flags(self):
        module = Mock()
        module.run_command = Mock(return_value=(0, 'Linux version 5.4.0', ''))
        result = get_uname(module, flags='-r')
        self.assertEqual(result, 'Linux version 5.4.0')

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
        result = _file_exists('/path/to/file', allow_empty=True)
        self.assertTrue(result)

    @patch('os.path.exists')
    @patch('os.path.getsize')
    def test_file_exists_empty_file(self, mock_getsize, mock_exists):
        mock_exists.return_value = True
        mock_getsize.return_value = 0
        result = _file_exists('/path/to/file')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()