import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.command import main, AnsibleModule, is_iterable, to_native, to_bytes, to_text
import datetime
import os
import shlex
import glob


class TestCommandModule(unittest.TestCase):

    @patch('ansible.modules.command.AnsibleModule')
    def test_main_no_command_given(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            '_raw_params': '',
            'argv': None,
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
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            '_raw_params': 'echo hello',
            'argv': ['echo', 'hello'],
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
    def test_main_change_directory_failure(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_uses_shell': False,
            'chdir': '/non/existent/path',
            'executable': None,
            '_raw_params': 'echo hello',
            'argv': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        with patch('os.chdir', side_effect=OSError('No such file or directory')):
            with self.assertRaises(SystemExit):
                main()
        mock_module.fail_json.assert_called_once_with(
            changed=False, stdout='', stderr='', rc=None, cmd=None, start=None, end=None, delta=None, msg='Unable to change directory before execution: No such file or directory'
        )

    @patch('ansible.modules.command.AnsibleModule')
    def test_main_check_mode(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            '_raw_params': 'echo hello',
            'argv': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        mock_module.check_mode = True
        with self.assertRaises(SystemExit):
            main()
        mock_module.exit_json.assert_called_once_with(
            changed=True, stdout='', stderr='', rc=0, cmd=['echo', 'hello'], start=None, end=None, delta=None, msg='Command would have run if not in check mode', skipped=True
        )

    @patch('ansible.modules.command.AnsibleModule')
    def test_main_command_execution(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            '_raw_params': 'echo hello',
            'argv': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        mock_module.run_command.return_value = (0, 'hello\n', '')
        with patch('datetime.datetime') as mock_datetime:
            mock_datetime.now.side_effect = [datetime.datetime(2023, 1, 1, 12, 0, 0), datetime.datetime(2023, 1, 1, 12, 0, 1)]
            with self.assertRaises(SystemExit):
                main()
        mock_module.exit_json.assert_called_once_with(
            changed=True, stdout='hello', stderr='', rc=0, cmd=['echo', 'hello'], start='2023-01-01 12:00:00', end='2023-01-01 12:00:01', delta='0:00:01', msg=''
        )

    @patch('ansible.modules.command.AnsibleModule')
    def test_main_command_execution_failure(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            '_uses_shell': False,
            'chdir': None,
            'executable': None,
            '_raw_params': 'false',
            'argv': None,
            'creates': None,
            'removes': None,
            'warn': False,
            'stdin': None,
            'stdin_add_newline': True,
            'strip_empty_ends': True
        }
        mock_module.run_command.return_value = (1, '', 'error')
        with patch('datetime.datetime') as mock_datetime:
            mock_datetime.now.side_effect = [datetime.datetime(2023, 1, 1, 12, 0, 0), datetime.datetime(2023, 1, 1, 12, 0, 1)]
            with self.assertRaises(SystemExit):
                main()
        mock_module.fail_json.assert_called_once_with(
            changed=True, stdout='', stderr='error', rc=1, cmd=['false'], start='2023-01-01 12:00:00', end='2023-01-01 12:00:01', delta='0:00:01', msg='non-zero return code'
        )

if __name__ == '__main__':
    unittest.main()