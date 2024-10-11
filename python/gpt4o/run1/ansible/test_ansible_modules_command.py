import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.command import main, AnsibleModule, to_native, to_bytes, to_text, is_iterable
import datetime
import os
import shlex
import glob


class TestCommandModule(unittest.TestCase):

    @patch('ansible.modules.command.AnsibleModule')
    def test_main_no_command_given(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': '',
            'argv': None,
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_once_with(
            changed=False, stdout='', stderr='', rc=256, cmd=None, start=None, end=None, delta=None, msg='no command given'
        )

    @patch('ansible.modules.command.AnsibleModule')
    def test_main_command_and_argv_given(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': 'echo hello',
            'argv': ['echo', 'hello'],
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_once_with(
            changed=False, stdout='', stderr='', rc=256, cmd=None, start=None, end=None, delta=None, msg='only command or argv can be given, not both'
        )

    @patch('ansible.modules.command.AnsibleModule')
    def test_main_check_mode(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': 'echo hello',
            'argv': None,
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        mock_module.check_mode = True
        main()
        mock_module.exit_json.assert_called_once_with(
            changed=True, stdout='', stderr='', rc=0, cmd=['echo', 'hello'], start=None, end=None, delta=None, msg='Command would have run if not in check mode', skipped=True
        )

    @patch('ansible.modules.command.AnsibleModule')
    @patch('os.chdir')
    def test_main_chdir(self, mock_chdir, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': 'echo hello',
            'argv': None,
            '_uses_shell': False,
            'chdir': '/tmp',
            'executable': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        main()
        mock_chdir.assert_called_once_with(b'/tmp')

    @patch('ansible.modules.command.AnsibleModule')
    @patch('os.chdir', side_effect=OSError('error'))
    def test_main_chdir_fail(self, mock_chdir, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': 'echo hello',
            'argv': None,
            '_uses_shell': False,
            'chdir': '/tmp',
            'executable': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        with self.assertRaises(SystemExit):
            main()
        mock_module.fail_json.assert_called_once_with(
            changed=False, stdout='', stderr='', rc=None, cmd=None, start=None, end=None, delta=None, msg='Unable to change directory before execution: error'
        )

    @patch('ansible.modules.command.AnsibleModule')
    @patch('glob.glob', return_value=True)
    def test_main_creates(self, mock_glob, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': 'echo hello',
            'argv': None,
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            'creates': '/tmp/file',
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        main()
        mock_module.exit_json.assert_called_once_with(
            changed=False, stdout='skipped, since /tmp/file exists', stderr='', rc=0, cmd=None, start=None, end=None, delta=None, msg="Did not run command since '/tmp/file' exists"
        )

    @patch('ansible.modules.command.AnsibleModule')
    @patch('glob.glob', return_value=False)
    def test_main_removes(self, mock_glob, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': 'echo hello',
            'argv': None,
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            'creates': None,
            'removes': '/tmp/file',
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        main()
        mock_module.exit_json.assert_called_once_with(
            changed=False, stdout='skipped, since /tmp/file does not exist', stderr='', rc=0, cmd=None, start=None, end=None, delta=None, msg="Did not run command since '/tmp/file' does not exist"
        )

    @patch('ansible.modules.command.AnsibleModule')
    @patch('datetime.datetime')
    @patch('ansible.modules.command.to_text')
    def test_main_run_command(self, mock_to_text, mock_datetime, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_raw_params': 'echo hello',
            'argv': None,
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        mock_module.run_command.return_value = (0, 'output', 'error')
        mock_datetime.now.side_effect = [datetime.datetime(2023, 1, 1, 0, 0, 0), datetime.datetime(2023, 1, 1, 0, 0, 1)]
        mock_to_text.side_effect = lambda x: str(x)
        main()
        mock_module.exit_json.assert_called_once_with(
            changed=True, stdout='output', stderr='error', rc=0, cmd=['echo', 'hello'], start='2023-01-01 00:00:00', end='2023-01-01 00:00:01', delta='0:00:01', msg=''
        )

if __name__ == '__main__':
    unittest.main()