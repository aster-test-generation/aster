import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import present


class TestLineInFileModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False

    def test_present_create_file(self):
        self.module.fail_json = MagicMock()
        present(self.module, '/nonexistent/path', None, None, 'line', None, None, True, False, False, False)
        self.module.fail_json.assert_not_called()

    def test_present_no_create_file(self):
        self.module.fail_json = MagicMock()
        present(self.module, '/nonexistent/path', None, None, 'line', None, None, False, False, False, False)
        self.module.fail_json.assert_called_once_with(rc=257, msg='Destination /nonexistent/path does not exist !')

    def test_present_with_regexp(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', 'line1', None, 'new_line', None, None, False, False, False, False)
            mock_file.assert_called_with('/path/to/file', 'rb')

    def test_present_with_search_string(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', None, 'line1', 'new_line', None, None, False, False, False, False)
            mock_file.assert_called_with('/path/to/file', 'rb')

    def test_present_insert_after(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', None, None, 'new_line', 'line1', None, False, False, False, False)
            mock_file.assert_called_with('/path/to/file', 'rb')

    def test_present_insert_before(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', None, None, 'new_line', None, 'line2', False, False, False, False)
            mock_file.assert_called_with('/path/to/file', 'rb')

    def test_present_with_backrefs(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', 'line1', None, 'new_line', None, None, False, False, True, False)
            mock_file.assert_called_with('/path/to/file', 'rb')

    def test_present_with_firstmatch(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', 'line1', None, 'new_line', None, None, False, False, False, True)
            mock_file.assert_called_with('/path/to/file', 'rb')

    def test_present_with_backup(self):
        self.module.backup_local = MagicMock(return_value='/backup/path')
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', 'line1', None, 'new_line', None, None, False, True, False, False)
            mock_file.assert_called_with('/path/to/file', 'rb')
            self.module.backup_local.assert_called_once_with('/path/to/file')

    def test_present_check_mode(self):
        self.module.check_mode = True
        with patch('builtins.open', unittest.mock.mock_open(read_data="line1\nline2\n")) as mock_file:
            present(self.module, '/path/to/file', 'line1', None, 'new_line', None, None, False, False, False, False)
            mock_file.assert_called_with('/path/to/file', 'rb')
            self.module.exit_json.assert_called_once_with(changed=True, msg='line replaced', backup='', diff={'before': 'line1\nline2\n', 'after': 'new_line\nline2\n', 'before_header': '/path/to/file (content)', 'after_header': '/path/to/file (content)'})

if __name__ == '__main__':
    unittest.main()