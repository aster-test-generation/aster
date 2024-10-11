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

        with patch('os.path.isdir', return_value=False):
            with patch('os.path.exists', return_value=False):
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

        with patch('os.path.isdir', return_value=False):
            with patch('os.path.exists', return_value=True):
                with patch('builtins.open', mock_open(read_data='data')) as mock_file:
                    mock_file.side_effect = IOError("Unable to read file")
                    main()
                    mock_module.fail_json.assert_called_once_with(
                        msg='Unable to read the contents of /some/file: Unable to read file',
                        exception=format_exc()
                    )

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_pattern_not_matched(self, MockAnsibleModule):
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

        with patch('os.path.isdir', return_value=False):
            with patch('os.path.exists', return_value=True):
                with patch('builtins.open', mock_open(read_data='data')):
                    main()
                    mock_module.exit_json.assert_called_once_with(
                        msg='Pattern for before/after params did not match the given file: after_pattern(?P<subsection>.*?)before_pattern',
                        changed=False
                    )

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_replacements_made(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/file',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'data',
            'replace': 'replacement'
        }
        mock_module.exit_json = MagicMock()

        with patch('os.path.isdir', return_value=False):
            with patch('os.path.exists', return_value=True):
                with patch('builtins.open', mock_open(read_data='data')):
                    with patch('ansible.modules.replace.write_changes') as mock_write_changes:
                        main()
                        mock_write_changes.assert_called_once()
                        mock_module.exit_json.assert_called_once_with(
                            msg='1 replacements made',
                            changed=True
                        )

    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_no_replacements_made(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/some/file',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'nonexistent',
            'replace': 'replacement'
        }
        mock_module.exit_json = MagicMock()

        with patch('os.path.isdir', return_value=False):
            with patch('os.path.exists', return_value=True):
                with patch('builtins.open', mock_open(read_data='data')):
                    main()
                    mock_module.exit_json.assert_called_once_with(
                        msg='',
                        changed=False
                    )

if __name__ == '__main__':
    unittest.main()