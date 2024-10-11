import unittest
from unittest.mock import patch, mock_open, MagicMock
from ansible.modules.replace import main, AnsibleModule, to_text, to_bytes, format_exc


class TestReplaceModule(unittest.TestCase):

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_path_is_directory(self, mock_module, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = True
        mock_exists.return_value = True
        mock_module.return_value.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace'
        }
        mock_module.return_value.fail_json = MagicMock()
        main()
        mock_module.return_value.fail_json.assert_called_once_with(rc=256, msg='Path /fake/path is a directory !')

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_path_does_not_exist(self, mock_module, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = False
        mock_module.return_value.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace'
        }
        mock_module.return_value.fail_json = MagicMock()
        main()
        mock_module.return_value.fail_json.assert_called_once_with(rc=257, msg='Path /fake/path does not exist !')

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_unable_to_read_file(self, mock_module, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_open.side_effect = IOError("Unable to read file")
        mock_module.return_value.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace'
        }
        mock_module.return_value.fail_json = MagicMock()
        main()
        mock_module.return_value.fail_json.assert_called_once_with(
            msg='Unable to read the contents of /fake/path: Unable to read file',
            exception=format_exc()
        )

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_pattern_does_not_match(self, mock_module, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_module.return_value.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': 'after',
            'before': 'before',
            'regexp': 'test',
            'replace': 'replace'
        }
        mock_module.return_value.exit_json = MagicMock()
        main()
        mock_module.return_value.exit_json.assert_called_once_with(
            msg='Pattern for before/after params did not match the given file: after(?P<subsection>.*?)before',
            changed=False
        )

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_replacements_made(self, mock_module, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_module.return_value.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'test',
            'replace': 'replace'
        }
        mock_module.return_value._diff = False
        mock_module.return_value.exit_json = MagicMock()
        main()
        mock_module.return_value.exit_json.assert_called_once_with(
            msg='1 replacements made',
            changed=True
        )

    @patch('ansible.modules.replace.os.path.isdir')
    @patch('ansible.modules.replace.os.path.exists')
    @patch('ansible.modules.replace.open', new_callable=mock_open, read_data="test content")
    @patch('ansible.modules.replace.AnsibleModule')
    def test_main_no_replacements_made(self, mock_module, mock_open, mock_exists, mock_isdir):
        mock_isdir.return_value = False
        mock_exists.return_value = True
        mock_module.return_value.params = {
            'path': '/fake/path',
            'encoding': 'utf-8',
            'after': None,
            'before': None,
            'regexp': 'nomatch',
            'replace': 'replace'
        }
        mock_module.return_value.exit_json = MagicMock()
        main()
        mock_module.return_value.exit_json.assert_called_once_with(
            msg='',
            changed=False
        )

if __name__ == '__main__':
    unittest.main()