import unittest
from unittest.mock import patch, MagicMock
import datetime
import os
import traceback
from ansible.modules.expect import pexpect
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.modules.expect import response_closure, main, HAS_PEXPECT, PEXPECT_IMP_ERR


class TestResponseClosure(unittest.TestCase):
    def test_response_closure_single_response(self):
        module = MagicMock()
        question = "question"
        responses = ["response"]
        wrapped = response_closure(module, question, responses)
        result = wrapped({"child_result_list": ["output"]})
        self.assertEqual(result, b'response\n')

    def test_response_closure_multiple_responses(self):
        module = MagicMock()
        question = "question"
        responses = ["response1", "response2"]
        wrapped = response_closure(module, question, responses)
        result1 = wrapped({"child_result_list": ["output"]})
        result2 = wrapped({"child_result_list": ["output"]})
        self.assertEqual(result1, b'response1\n')
        self.assertEqual(result2, b'response2\n')

    def test_response_closure_no_remaining_responses(self):
        module = MagicMock()
        module.fail_json = MagicMock()
        question = "question"
        responses = ["response"]
        wrapped = response_closure(module, question, responses)
        wrapped({"child_result_list": ["output"]})
        wrapped({"child_result_list": ["output"]})
        module.fail_json.assert_called_once_with(msg="No remaining responses for 'question', output was 'output'")

class TestMainFunction(unittest.TestCase):
    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.datetime.datetime')
    @patch('ansible.modules.expect.pexpect.run')
    @patch('ansible.modules.expect.AnsibleModule')
    def test_main_function(self, MockAnsibleModule, mock_pexpect_run, mock_datetime, mock_os_chdir, mock_os_path_exists):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'command': 'echo "Hello, World!"',
            'chdir': None,
            'creates': None,
            'removes': None,
            'responses': {},
            'timeout': 30,
            'echo': False
        }
        mock_datetime.now.side_effect = [datetime.datetime(2023, 1, 1, 0, 0, 0), datetime.datetime(2023, 1, 1, 0, 0, 1)]
        mock_pexpect_run.return_value = (b'Hello, World!\n', 0)
        main()
        mock_module.exit_json.assert_called_once_with(
            cmd='echo "Hello, World!"',
            stdout='Hello, World!',
            rc=0,
            start='2023-01-01 00:00:00',
            end='2023-01-01 00:00:01',
            delta='0:00:01',
            changed=True
        )

    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.datetime.datetime')
    @patch('ansible.modules.expect.pexpect.run')
    @patch('ansible.modules.expect.AnsibleModule')
    def test_main_function_no_command(self, MockAnsibleModule, mock_pexpect_run, mock_datetime, mock_os_chdir, mock_os_path_exists):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'command': '',
            'chdir': None,
            'creates': None,
            'removes': None,
            'responses': {},
            'timeout': 30,
            'echo': False
        }
        main()
        mock_module.fail_json.assert_called_once_with(rc=256, msg="no command given")

    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.datetime.datetime')
    @patch('ansible.modules.expect.pexpect.run')
    @patch('ansible.modules.expect.AnsibleModule')
    def test_main_function_creates_exists(self, MockAnsibleModule, mock_pexpect_run, mock_datetime, mock_os_chdir, mock_os_path_exists):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'command': 'echo "Hello, World!"',
            'chdir': None,
            'creates': '/path/to/file',
            'removes': None,
            'responses': {},
            'timeout': 30,
            'echo': False
        }
        mock_os_path_exists.return_value = True
        main()
        mock_module.exit_json.assert_called_once_with(
            cmd='echo "Hello, World!"',
            stdout='skipped, since /path/to/file exists',
            changed=False,
            rc=0
        )

    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.datetime.datetime')
    @patch('ansible.modules.expect.pexpect.run')
    @patch('ansible.modules.expect.AnsibleModule')
    def test_main_function_removes_not_exists(self, MockAnsibleModule, mock_pexpect_run, mock_datetime, mock_os_chdir, mock_os_path_exists):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'command': 'echo "Hello, World!"',
            'chdir': None,
            'creates': None,
            'removes': '/path/to/file',
            'responses': {},
            'timeout': 30,
            'echo': False
        }
        mock_os_path_exists.return_value = False
        main()
        mock_module.exit_json.assert_called_once_with(
            cmd='echo "Hello, World!"',
            stdout='skipped, since /path/to/file does not exist',
            changed=False,
            rc=0
        )

    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.datetime.datetime')
    @patch('ansible.modules.expect.pexpect.run')
    @patch('ansible.modules.expect.AnsibleModule')
    def test_main_function_pexpect_exception(self, MockAnsibleModule, mock_pexpect_run, mock_datetime, mock_os_chdir, mock_os_path_exists):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'command': 'echo "Hello, World!"',
            'chdir': None,
            'creates': None,
            'removes': None,
            'responses': {},
            'timeout': 30,
            'echo': False
        }
        mock_pexpect_run.side_effect = pexpect.ExceptionPexpect("pexpect error")
        main()
        mock_module.fail_json.assert_called_once_with(msg='pexpect error', exception=traceback.format_exc())

    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.datetime.datetime')
    @patch('ansible.modules.expect.pexpect.run')
    @patch('ansible.modules.expect.AnsibleModule')
    def test_main_function_non_zero_return_code(self, MockAnsibleModule, mock_pexpect_run, mock_datetime, mock_os_chdir, mock_os_path_exists):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'command': 'echo "Hello, World!"',
            'chdir': None,
            'creates': None,
            'removes': None,
            'responses': {},
            'timeout': 30,
            'echo': False
        }
        mock_datetime.now.side_effect = [datetime.datetime(2023, 1, 1, 0, 0, 0), datetime.datetime(2023, 1, 1, 0, 0, 1)]
        mock_pexpect_run.return_value = (b'Hello, World!\n', 1)
        main()
        mock_module.fail_json.assert_called_once_with(
            msg='non-zero return code',
            cmd='echo "Hello, World!"',
            stdout='Hello, World!',
            rc=1,
            start='2023-01-01 00:00:00',
            end='2023-01-01 00:00:01',
            delta='0:00:01',
            changed=True
        )

if __name__ == '__main__':
    unittest.main()