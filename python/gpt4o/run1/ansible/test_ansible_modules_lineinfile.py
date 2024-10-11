import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.lineinfile import main, absent
from ansible.module_utils.basic import AnsibleModule


class TestLineInFileModule(unittest.TestCase):

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_main_present(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/tmp/testfile',
            'state': 'present',
            'regexp': None,
            'search_string': None,
            'line': 'test line',
            'insertafter': None,
            'insertbefore': None,
            'create': False,
            'backup': False,
            'backrefs': False,
            'firstmatch': False
        }
        main()
        mock_module.fail_json.assert_not_called()
        mock_module.warn.assert_not_called()

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_main_absent(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/tmp/testfile',
            'state': 'absent',
            'regexp': None,
            'search_string': None,
            'line': 'test line',
            'backup': False
        }
        main()
        mock_module.fail_json.assert_not_called()

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_main_fail_on_directory(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/tmp',
            'state': 'present',
            'regexp': None,
            'search_string': None,
            'line': 'test line',
            'insertafter': None,
            'insertbefore': None,
            'create': False,
            'backup': False,
            'backrefs': False,
            'firstmatch': False
        }
        with patch('os.path.isdir', return_value=True):
            main()
            mock_module.fail_json.assert_called_once_with(rc=256, msg='Path /tmp is a directory !')

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_main_warn_on_empty_regexp(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/tmp/testfile',
            'state': 'present',
            'regexp': '',
            'search_string': None,
            'line': 'test line',
            'insertafter': None,
            'insertbefore': None,
            'create': False,
            'backup': False,
            'backrefs': False,
            'firstmatch': False
        }
        main()
        mock_module.warn.assert_called_once_with('The regular expression is an empty string, which will match every line in the file. This may have unintended consequences, such as replacing the last line in the file rather than appending. If this is desired, use \'^\' to match every line in the file and avoid this warning.')

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_main_fail_on_missing_line(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/tmp/testfile',
            'state': 'present',
            'regexp': None,
            'search_string': None,
            'line': None,
            'insertafter': None,
            'insertbefore': None,
            'create': False,
            'backup': False,
            'backrefs': False,
            'firstmatch': False
        }
        main()
        mock_module.fail_json.assert_called_once_with(msg='line is required with state=present')

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_main_fail_on_missing_regexp_with_backrefs(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/tmp/testfile',
            'state': 'present',
            'regexp': None,
            'search_string': None,
            'line': 'test line',
            'insertafter': None,
            'insertbefore': None,
            'create': False,
            'backup': False,
            'backrefs': True,
            'firstmatch': False
        }
        main()
        mock_module.fail_json.assert_called_once_with(msg='regexp is required with backrefs=true')

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_main_fail_on_missing_params_with_absent(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'path': '/tmp/testfile',
            'state': 'absent',
            'regexp': None,
            'search_string': None,
            'line': None,
            'backup': False
        }
        main()
        mock_module.fail_json.assert_called_once_with(msg='one of line, search_string, or regexp is required with state=absent')

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_present(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        present(mock_module, '/tmp/testfile', None, None, 'test line', 'EOF', None, False, False, False, False)
        mock_module.fail_json.assert_not_called()

    @patch('ansible.modules.lineinfile.AnsibleModule')
    def test_absent(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        absent(mock_module, '/tmp/testfile', None, None, 'test line', False)
        mock_module.fail_json.assert_not_called()

if __name__ == '__main__':
    unittest.main()