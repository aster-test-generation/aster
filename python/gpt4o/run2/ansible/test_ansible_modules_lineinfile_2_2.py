import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import present


class TestLineInFileModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False

    @patch('os.path.exists')
    @patch('os.makedirs')
    def test_present_create_file(self, mock_makedirs, mock_exists):
        mock_exists.side_effect = [False, True]
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', None, None, 'line', None, None, True, False, False, False)
        self.module.fail_json.assert_not_called()
        mock_makedirs.assert_called_once()

    @patch('os.path.exists')
    def test_present_no_create_file(self, mock_exists):
        mock_exists.return_value = False
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', None, None, 'line', None, None, False, False, False, False)
        self.module.fail_json.assert_called_once_with(rc=257, msg='Destination /fake/path does not exist !')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\n')
    def test_present_replace_line(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', 'line1', None, 'new_line', None, None, False, False, False, False)
        self.module.fail_json.assert_not_called()
        mock_open().write.assert_called_with(b'new_line\nline2\n')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\n')
    def test_present_add_line(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', None, None, 'new_line', 'EOF', None, False, False, False, False)
        self.module.fail_json.assert_not_called()
        mock_open().write.assert_called_with(b'line1\nline2\nnew_line\n')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\n')
    def test_present_insert_before(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', None, None, 'new_line', None, 'line2', False, False, False, False)
        self.module.fail_json.assert_not_called()
        mock_open().write.assert_called_with(b'line1\nnew_line\nline2\n')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\n')
    def test_present_insert_after(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', None, None, 'new_line', 'line1', None, False, False, False, False)
        self.module.fail_json.assert_not_called()
        mock_open().write.assert_called_with(b'line1\nnew_line\nline2\n')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\n')
    def test_present_no_change(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', None, None, 'line1', None, None, False, False, False, False)
        self.module.fail_json.assert_not_called()
        mock_open().write.assert_not_called()

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\n')
    def test_present_with_backrefs(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', 'line(\\d)', None, 'new_line\\1', None, None, False, False, True, False)
        self.module.fail_json.assert_not_called()
        mock_open().write.assert_called_with(b'new_line1\nline2\n')

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'line1\nline2\n')
    def test_present_with_search_string(self, mock_open, mock_exists):
        mock_exists.return_value = True
        self.module.fail_json = MagicMock()
        present(self.module, '/fake/path', None, 'line1', 'new_line', None, None, False, False, False, False)
        self.module.fail_json.assert_not_called()
        mock_open().write.assert_called_with(b'new_line\nline2\n')

if __name__ == '__main__':
    unittest.main()