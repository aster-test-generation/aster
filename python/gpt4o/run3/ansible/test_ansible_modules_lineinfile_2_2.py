import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import present
from unittest.mock import MagicMock, patch, mock_open


class TestLineInFileModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False
        self.module.fail_json = MagicMock()
        self.module.exit_json = MagicMock()
        self.module.backup_local = MagicMock(return_value='backup_path')

    def test_present_create_file(self):
        with patch('os.path.exists', return_value=False):
            present(self.module, 'testfile', None, None, 'line', None, None, True, False, False, False)
            self.module.fail_json.assert_not_called()
            self.module.exit_json.assert_called_once_with(changed=True, msg='line added', backup='', diff=[{'before': '', 'after': 'line\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_no_create_file(self):
        with patch('os.path.exists', return_value=False):
            present(self.module, 'testfile', None, None, 'line', None, None, False, False, False, False)
            self.module.fail_json.assert_called_once_with(rc=257, msg='Destination testfile does not exist !')

    def test_present_replace_line(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='old_line\n')):
            present(self.module, 'testfile', 'old_line', None, 'new_line', None, None, False, False, False, False)
            self.module.exit_json.assert_called_once_with(changed=True, msg='line replaced', backup='', diff=[{'before': 'old_line\n', 'after': 'new_line\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_add_line_eof(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='existing_line\n')):
            present(self.module, 'testfile', None, None, 'new_line', 'EOF', None, False, False, False, False)
            self.module.exit_json.assert_called_once_with(changed=True, msg='line added', backup='', diff=[{'before': 'existing_line\n', 'after': 'existing_line\nnew_line\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_add_line_bof(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='existing_line\n')):
            present(self.module, 'testfile', None, None, 'new_line', None, 'BOF', False, False, False, False)
            self.module.exit_json.assert_called_once_with(changed=True, msg='line added', backup='', diff=[{'before': 'existing_line\n', 'after': 'new_line\nexisting_line\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_no_change(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='line\n')):
            present(self.module, 'testfile', None, None, 'line', None, None, False, False, False, False)
            self.module.exit_json.assert_called_once_with(changed=False, msg='', backup='', diff=[{'before': 'line\n', 'after': 'line\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_with_backrefs(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='old_line\n')):
            present(self.module, 'testfile', 'old_(line)', None, 'new_\\1', None, None, False, False, True, False)
            self.module.exit_json.assert_called_once_with(changed=True, msg='line replaced', backup='', diff=[{'before': 'old_line\n', 'after': 'new_line\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_with_search_string(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='old_line\n')):
            present(self.module, 'testfile', None, 'old_line', 'new_line', None, None, False, False, False, False)
            self.module.exit_json.assert_called_once_with(changed=True, msg='line replaced', backup='', diff=[{'before': 'old_line\n', 'after': 'new_line\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_with_insertafter_regex(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='line1\nline2\n')):
            present(self.module, 'testfile', None, None, 'new_line', 'line1', None, False, False, False, False)
            self.module.exit_json.assert_called_once_with(changed=True, msg='line added', backup='', diff=[{'before': 'line1\nline2\n', 'after': 'line1\nnew_line\nline2\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    def test_present_with_insertbefore_regex(self):
        with patch('os.path.exists', return_value=True), patch('builtins.open', unittest.mock.mock_open(read_data='line1\nline2\n')):
            present(self.module, 'testfile', None, None, 'new_line', None, 'line2', False, False, False, False)
            self.module.exit_json.assert_called_once_with(changed=True, msg='line added', backup='', diff=[{'before': 'line1\nline2\n', 'after': 'line1\nnew_line\nline2\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

class TestLineInFileModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False
        self.module.fail_json = MagicMock()
        self.module.exit_json = MagicMock()
        self.module.backup_local = MagicMock(return_value='backup_path')

    @patch('os.path.exists')
    @patch('os.makedirs')
    def test_present_create_file(self, mock_makedirs, mock_exists):
        mock_exists.side_effect = [False, False]
        present(self.module, 'test.txt', None, None, 'line', None, None, True, False, False, False)
        self.module.fail_json.assert_not_called()
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('os.makedirs')
    def test_present_create_file_fail(self, mock_makedirs, mock_exists):
        mock_exists.side_effect = [False, False]
        mock_makedirs.side_effect = Exception('Error creating directory')
        present(self.module, 'test.txt', None, None, 'line', None, None, True, False, False, False)
        self.module.fail_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_replace_line(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', 'existing line', None, 'new line', None, None, False, False, False, False)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_add_line(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', None, None, 'new line', 'EOF', None, False, False, False, False)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_insert_before(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', None, None, 'new line', None, 'existing line', False, False, False, False)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_insert_after(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', None, None, 'new line', 'existing line', None, False, False, False, False)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_no_change(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', 'existing line', None, 'existing line', None, None, False, False, False, False)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_with_backrefs(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', '(existing) (line)', None, r'\1 new \2', None, None, False, False, True, False)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_with_search_string(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', None, 'existing', 'new line', None, None, False, False, False, False)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_with_firstmatch(self, mock_open, mock_exists):
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', 'existing line', None, 'new line', None, None, False, False, False, True)
        self.module.exit_json.assert_called_once()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data='existing line\n')
    def test_present_with_diff(self, mock_open, mock_exists):
        self.module._diff = True
        mock_exists.side_effect = [True]
        present(self.module, 'test.txt', 'existing line', None, 'new line', None, None, False, False, False, False)
        self.module.exit_json.assert_called_once()

if __name__ == '__main__':
    unittest.main()