import unittest
from unittest.mock import patch, mock_open, MagicMock
from ansible.modules.replace import main, AnsibleModule, to_text, to_bytes, format_exc
import os
import re


class TestReplaceModule(unittest.TestCase):

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_path_is_directory(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/directory',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'pattern',
            'replace': 'replacement'
        }
        mock_module.fail_json = MagicMock()

        with patch('os.path.isdir', return_value=True):
            main()
            mock_module.fail_json.assert_called_once_with(rc=256, msg='Path /some/directory is a directory !')

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_path_does_not_exist(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/non/existent/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'pattern',
            'replace': 'replacement'
        }
        mock_module.fail_json = MagicMock()

        with patch('os.path.isdir', return_value=False), patch('os.path.exists', return_value=False):
            main()
            mock_module.fail_json.assert_called_once_with(rc=257, msg='Path /non/existent/path does not exist !')

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_unable_to_read_file(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/file',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'pattern',
            'replace': 'replacement'
        }
        mock_module.fail_json = MagicMock()

        with patch('os.path.isdir', return_value=False), patch('os.path.exists', return_value=True), patch('builtins.open', mock_open(read_data='data')) as mock_file:
            mock_file.side_effect = IOError("Unable to read file")
            main()
            mock_module.fail_json.assert_called_once_with(msg='Unable to read the contents of /some/file: Unable to read file', exception=format_exc())

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_pattern_does_not_match(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/file',
            'encoding': 'utf-8',
            'after': 'after_pattern',
            'before': 'before_pattern',
            'regexp': 'pattern',
            'replace': 'replacement'
        }
        mock_module.exit_json = MagicMock()

        with patch('os.path.isdir', return_value=False), patch('os.path.exists', return_value=True), patch('builtins.open', mock_open(read_data='data')):
            main()
            mock_module.exit_json.assert_called_once_with(msg='Pattern for before/after params did not match the given file: after_pattern(?P<subsection>.*?)before_pattern', changed=False)

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_replacements_made(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/file',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'data',
            'replace': 'replacement',
            'backup': False
        }
        mock_module._diff = False
        mock_module.exit_json = MagicMock()

        with patch('os.path.isdir', return_value=False), patch('os.path.exists', return_value=True), patch('builtins.open', mock_open(read_data='data')):
            with patch('ansible.modules.replace.write_changes') as mock_write_changes:
                main()
                mock_write_changes.assert_called_once()
                mock_module.exit_json.assert_called_once_with(msg='1 replacements made', changed=True)

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_no_replacements_made(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/file',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'nomatch',
            'replace': 'replacement',
            'backup': False
        }
        mock_module._diff = False
        mock_module.exit_json = MagicMock()

        with patch('os.path.isdir', return_value=False), patch('os.path.exists', return_value=True), patch('builtins.open', mock_open(read_data='data')):
            main()
            mock_module.exit_json.assert_called_once_with(msg='', changed=False)

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_with_backup(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/file',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'data',
            'replace': 'replacement',
            'backup': True
        }
        mock_module._diff = False
        mock_module.exit_json = MagicMock()

        with patch('os.path.isdir', return_value=False), patch('os.path.exists', return_value=True), patch('builtins.open', mock_open(read_data='data')):
            with patch('ansible.modules.replace.write_changes') as mock_write_changes, patch('ansible.modules.replace.os.path.exists', return_value=True), patch('ansible.modules.replace.AnsibleModule.backup_local', return_value='/backup/file'):
                main()
                mock_write_changes.assert_called_once()
                mock_module.exit_json.assert_called_once_with(msg='1 replacements made', changed=True, backup_file='/backup/file')

class TestReplaceModule(unittest.TestCase):

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.to_text', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.to_bytes', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_path_is_directory(self, MockAnsibleModule, mock_to_bytes, mock_to_text, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = True
        mock_exists.return_value = True
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace',
            'backup': False
        }
        main()
        mock_module.fail_json.assert_called_once_with(rc=256, msg='Path /fake/path is a directory !')

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.to_text', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.to_bytes', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_path_does_not_exist(self, MockAnsibleModule, mock_to_bytes, mock_to_text, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = False
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace',
            'backup': False
        }
        main()
        mock_module.fail_json.assert_called_once_with(rc=257, msg='Path /fake/path does not exist !')

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.to_text', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.to_bytes', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_unable_to_read_file(self, MockAnsibleModule, mock_to_bytes, mock_to_text, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_open.side_effect = IOError("Unable to read file")
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace',
            'backup': False
        }
        main()
        mock_module.fail_json.assert_called_once_with(msg='Unable to read the contents of /fake/path: Unable to read file', exception=format_exc())

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.to_text', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.to_bytes', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_pattern_not_matched(self, MockAnsibleModule, mock_to_bytes, mock_to_text, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': 'after_pattern',
            'before': 'before_pattern',
            'regexp': 'test',
            'replace': 'replace',
            'backup': False
        }
        main()
        mock_module.exit_json.assert_called_once_with(msg='Pattern for before/after params did not match the given file: after_pattern(?P<subsection>.*?)before_pattern', changed=False)

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.to_text', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.to_bytes', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_replacements_made(self, MockAnsibleModule, mock_to_bytes, mock_to_text, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace',
            'backup': False
        }
        main()
        mock_module.exit_json.assert_called_once_with(msg='1 replacements made', changed=True)

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.to_text', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.to_bytes', side_effect=lambda x, **kwargs: x)
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_no_replacements_made(self, MockAnsibleModule, mock_to_bytes, mock_to_text, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'nomatch',
            'replace': 'replace',
            'backup': False
        }
        main()
        mock_module.exit_json.assert_called_once_with(msg='', changed=False)

if __name__ == '__main__':
    unittest.main()