import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import absent

class TestLineInFileModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False
        self.module.exit_json = MagicMock()
        self.module.fail_json = MagicMock()
        self.module.backup_local = MagicMock(return_value='backup_path')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\nline3\n')
    def test_absent_file_not_present(self, mock_open, mock_exists):
        mock_exists.return_value = False
        absent(self.module, 'test_path', None, None, 'line', False)
        self.module.exit_json.assert_called_once_with(changed=False, msg='file not present')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\nline3\n')
    def test_absent_no_match(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module._diff = True
        absent(self.module, 'test_path', 'nomatch', None, 'line', False)
        self.module.exit_json.assert_called_once_with(changed=False, found=0, msg='', backup='', diff=[{'before': 'line1\nline2\nline3\n', 'after': 'line1\nline2\nline3\n', 'before_header': 'test_path (content)', 'after_header': 'test_path (content)'}, {'before_header': 'test_path (file attributes)', 'after_header': 'test_path (file attributes)'}])

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\nline3\n')
    def test_absent_with_match(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module._diff = True
        absent(self.module, 'test_path', 'line2', None, 'line', True)
        self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='backup_path', diff=[{'before': 'line1\nline2\nline3\n', 'after': 'line1\nline3\n', 'before_header': 'test_path (content)', 'after_header': 'test_path (content)'}, {'before_header': 'test_path (file attributes)', 'after_header': 'test_path (file attributes)'}])

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\nline3\n')
    def test_absent_with_search_string(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module._diff = True
        absent(self.module, 'test_path', None, 'line2', 'line', False)
        self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='', diff=[{'before': 'line1\nline2\nline3\n', 'after': 'line1\nline3\n', 'before_header': 'test_path (content)', 'after_header': 'test_path (content)'}, {'before_header': 'test_path (file attributes)', 'after_header': 'test_path (file attributes)'}])

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\nline3\n')
    def test_absent_with_line_match(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module._diff = True
        absent(self.module, 'test_path', None, None, 'line2', False)
        self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='', diff=[{'before': 'line1\nline2\nline3\n', 'after': 'line1\nline3\n', 'before_header': 'test_path (content)', 'after_header': 'test_path (content)'}, {'before_header': 'test_path (file attributes)', 'after_header': 'test_path (file attributes)'}])

if __name__ == '__main__':
    unittest.main()