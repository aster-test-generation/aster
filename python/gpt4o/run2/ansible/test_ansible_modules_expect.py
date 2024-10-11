import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.expect import *


class TestResponseClosure(unittest.TestCase):
    def test_response_closure(self):
        module = MagicMock()
        question = "test_question"
        responses = ["response1", "response2"]
        closure = response_closure(module, question, responses)
        
        info = {'child_result_list': ['output1']}
        self.assertEqual(closure(info), b'response1\n')
        self.assertEqual(closure(info), b'response2\n')
        with self.assertRaises(ModuleNotFoundError):
            closure(info)

class TestMainFunction(unittest.TestCase):
    @patch('ansible.modules.expect.AnsibleModule')
    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.pexpect.run')
    def test_main_function(self, mock_run, mock_chdir, mock_exists, mock_module):
        mock_module_instance = MagicMock()
        mock_module.return_value = mock_module_instance
        mock_module_instance.params = {
            'command': 'echo "Hello World"',
            'chdir': None,
            'creates': None,
            'removes': None,
            'responses': {'(?i)password': 'MySekretPa$$word'},
            'timeout': 30,
            'echo': False
        }
        mock_exists.return_value = False
        mock_run.return_value = (b'Hello World\n', 0)
        
        main()
        
        mock_module_instance.exit_json.assert_called_once_with(
            cmd='echo "Hello World"',
            stdout='Hello World',
            rc=0,
            start=mock.ANY,
            end=mock.ANY,
            delta=mock.ANY,
            changed=True
        )

    @patch('ansible.modules.expect.AnsibleModule')
    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.pexpect.run')
    def test_main_function_with_creates(self, mock_run, mock_chdir, mock_exists, mock_module):
        mock_module_instance = MagicMock()
        mock_module.return_value = mock_module_instance
        mock_module_instance.params = {
            'command': 'echo "Hello World"',
            'chdir': None,
            'creates': '/path/to/file',
            'removes': None,
            'responses': {'(?i)password': 'MySekretPa$$word'},
            'timeout': 30,
            'echo': False
        }
        mock_exists.side_effect = [True, False]
        
        main()
        
        mock_module_instance.exit_json.assert_called_once_with(
            cmd='echo "Hello World"',
            stdout='skipped, since /path/to/file exists',
            changed=False,
            rc=0
        )

    @patch('ansible.modules.expect.AnsibleModule')
    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.pexpect.run')
    def test_main_function_with_removes(self, mock_run, mock_chdir, mock_exists, mock_module):
        mock_module_instance = MagicMock()
        mock_module.return_value = mock_module_instance
        mock_module_instance.params = {
            'command': 'echo "Hello World"',
            'chdir': None,
            'creates': None,
            'removes': '/path/to/file',
            'responses': {'(?i)password': 'MySekretPa$$word'},
            'timeout': 30,
            'echo': False
        }
        mock_exists.side_effect = [False, True]
        
        main()
        
        mock_module_instance.exit_json.assert_called_once_with(
            cmd='echo "Hello World"',
            stdout='skipped, since /path/to/file does not exist',
            changed=False,
            rc=0
        )

    @patch('ansible.modules.expect.AnsibleModule')
    @patch('ansible.modules.expect.os.path.exists')
    @patch('ansible.modules.expect.os.chdir')
    @patch('ansible.modules.expect.pexpect.run')
    def test_main_function_with_fail_json(self, mock_run, mock_chdir, mock_exists, mock_module):
        mock_module_instance = MagicMock()
        mock_module.return_value = mock_module_instance
        mock_module_instance.params = {
            'command': '',
            'chdir': None,
            'creates': None,
            'removes': None,
            'responses': {'(?i)password': 'MySekretPa$$word'},
            'timeout': 30,
            'echo': False
        }
        
        main()
        
        mock_module_instance.fail_json.assert_called_once_with(rc=256, msg="no command given")

if __name__ == '__main__':
    unittest.main()