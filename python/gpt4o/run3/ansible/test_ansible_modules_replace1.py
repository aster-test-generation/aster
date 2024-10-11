import unittest
from unittest.mock import patch, mock_open, MagicMock
from ansible.modules.replace import main, AnsibleModule, to_text, to_bytes, format_exc

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