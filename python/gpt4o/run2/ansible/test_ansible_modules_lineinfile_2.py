import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import absent


class TestLineInFileModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False
        self.module.backup_local = MagicMock(return_value='backup_path')
        self.module.exit_json = MagicMock()
        self.module.fail_json = MagicMock()

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('ansible.modules.lineinfile.os.path.exists', return_value=True)
    @patch('ansible.modules.lineinfile.open', create=True)
    def test_absent_no_change(self, mock_open, mock_exists, mock_to_native, mock_to_bytes):
        mock_open.return_value.__enter__.return_value.readlines.return_value = [b'line1\n', b'line2\n']
        absent(self.module, 'testfile', None, 'line3', 'line3', False)
        self.module.exit_json.assert_called_once_with(changed=False, found=0, msg='', backup='', diff=[{'before': 'line1\nline2\n', 'after': 'line1\nline2\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('ansible.modules.lineinfile.os.path.exists', return_value=True)
    @patch('ansible.modules.lineinfile.open', create=True)
    def test_absent_with_change(self, mock_open, mock_exists, mock_to_native, mock_to_bytes):
        mock_open.return_value.__enter__.return_value.readlines.return_value = [b'line1\n', b'line2\n']
        absent(self.module, 'testfile', None, 'line2', 'line2', False)
        self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='', diff=[{'before': 'line1\nline2\n', 'after': 'line1\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('ansible.modules.lineinfile.os.path.exists', return_value=False)
    def test_absent_file_not_present(self, mock_exists, mock_to_native, mock_to_bytes):
        absent(self.module, 'testfile', None, 'line2', 'line2', False)
        self.module.exit_json.assert_called_once_with(changed=False, msg='file not present')

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('ansible.modules.lineinfile.os.path.exists', return_value=True)
    @patch('ansible.modules.lineinfile.open', create=True)
    def test_absent_with_regexp(self, mock_open, mock_exists, mock_to_native, mock_to_bytes):
        mock_open.return_value.__enter__.return_value.readlines.return_value = [b'line1\n', b'line2\n']
        absent(self.module, 'testfile', 'line2', None, 'line2', False)
        self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='', diff=[{'before': 'line1\nline2\n', 'after': 'line1\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('ansible.modules.lineinfile.os.path.exists', return_value=True)
    @patch('ansible.modules.lineinfile.open', create=True)
    def test_absent_with_backup(self, mock_open, mock_exists, mock_to_native, mock_to_bytes):
        mock_open.return_value.__enter__.return_value.readlines.return_value = [b'line1\n', b'line2\n']
        absent(self.module, 'testfile', None, 'line2', 'line2', True)
        self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='backup_path', diff=[{'before': 'line1\nline2\n', 'after': 'line1\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

class TestLineInFileModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False
        self.module.backup_local = MagicMock(return_value='backup_path')
        self.module.exit_json = MagicMock()
        self.module.fail_json = MagicMock()

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, **kwargs: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x, **kwargs: x.decode())
    def test_absent_file_not_present(self, mock_to_native, mock_to_bytes):
        self.module.params = {
            'path': 'testfile',
            'regexp': None,
            'search_string': None,
            'line': 'testline',
            'backup': False
        }
        with patch('os.path.exists', return_value=False):
            absent(self.module, 'testfile', None, None, 'testline', False)
            self.module.exit_json.assert_called_once_with(changed=False, msg='file not present')

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, **kwargs: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x, **kwargs: x.decode())
    def test_absent_no_match(self, mock_to_native, mock_to_bytes):
        self.module.params = {
            'path': 'testfile',
            'regexp': None,
            'search_string': None,
            'line': 'testline',
            'backup': False
        }
        with patch('os.path.exists', return_value=True), \
             patch('builtins.open', unittest.mock.mock_open(read_data='line1\nline2\n')):
            absent(self.module, 'testfile', None, None, 'testline', False)
            self.module.exit_json.assert_called_once_with(changed=False, found=0, msg='', backup='', diff=[{'before': 'line1\nline2\n', 'after': 'line1\nline2\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, **kwargs: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x, **kwargs: x.decode())
    def test_absent_with_match(self, mock_to_native, mock_to_bytes):
        self.module.params = {
            'path': 'testfile',
            'regexp': None,
            'search_string': None,
            'line': 'line2',
            'backup': True
        }
        with patch('os.path.exists', return_value=True), \
             patch('builtins.open', unittest.mock.mock_open(read_data='line1\nline2\n')):
            absent(self.module, 'testfile', None, None, 'line2', True)
            self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='backup_path', diff=[{'before': 'line1\nline2\n', 'after': 'line1\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, **kwargs: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x, **kwargs: x.decode())
    def test_absent_with_regexp_match(self, mock_to_native, mock_to_bytes):
        self.module.params = {
            'path': 'testfile',
            'regexp': 'line2',
            'search_string': None,
            'line': 'line2',
            'backup': True
        }
        with patch('os.path.exists', return_value=True), \
             patch('builtins.open', unittest.mock.mock_open(read_data='line1\nline2\n')):
            absent(self.module, 'testfile', 'line2', None, 'line2', True)
            self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='backup_path', diff=[{'before': 'line1\nline2\n', 'after': 'line1\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, **kwargs: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x, **kwargs: x.decode())
    def test_absent_with_search_string_match(self, mock_to_native, mock_to_bytes):
        self.module.params = {
            'path': 'testfile',
            'regexp': None,
            'search_string': 'line2',
            'line': 'line2',
            'backup': True
        }
        with patch('os.path.exists', return_value=True), \
             patch('builtins.open', unittest.mock.mock_open(read_data='line1\nline2\n')):
            absent(self.module, 'testfile', None, 'line2', 'line2', True)
            self.module.exit_json.assert_called_once_with(changed=True, found=1, msg='1 line(s) removed', backup='backup_path', diff=[{'before': 'line1\nline2\n', 'after': 'line1\n', 'before_header': 'testfile (content)', 'after_header': 'testfile (content)'}, {'before_header': 'testfile (file attributes)', 'after_header': 'testfile (file attributes)'}])

if __name__ == '__main__':
    unittest.main()