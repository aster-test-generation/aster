import unittest
import os
import tempfile
import re
from unittest.mock import patch, MagicMock
from ansible.plugins.action.assemble import ActionModule
from ansible.errors import AnsibleActionFail, _AnsibleActionDone


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())

    @patch('os.listdir')
    @patch('os.path.isfile')
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b'fragment_content')
    @patch('tempfile.mkstemp', return_value=(1, '/tmp/tempfile'))
    def test_assemble_from_fragments(self, mock_mkstemp, mock_open, mock_isfile, mock_listdir):
        mock_listdir.return_value = ['fragment1', 'fragment2']
        mock_isfile.return_value = True
        self.action_module._loader.get_real_file = MagicMock(return_value='/path/to/fragment')
        
        result = self.action_module._assemble_from_fragments('/src/path', delimiter=None, compiled_regexp=None, ignore_hidden=False, decrypt=True)
        
        self.assertEqual(result, '/tmp/tempfile')

    def test_run_missing_src_dest(self):
        self.action_module._task.args = {'src': None, 'dest': None}
        with self.assertRaises(AnsibleActionFail):
            self.action_module.run()

    @patch('ansible.plugins.action.assemble.boolean', return_value=True)
    @patch('ansible.plugins.action.assemble.ActionModule._execute_module')
    def test_run_remote_src(self, mock_execute_module, mock_boolean):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest', 'remote_src': 'yes'}
        with self.assertRaises(_AnsibleActionDone):
            self.action_module.run(async=False)
        mock_execute_module.assert_called_once()

    @patch('ansible.plugins.action.assemble.os.path.isdir', return_value=False)
    def test_run_src_not_directory(self, mock_isdir):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest'}
        with self.assertRaises(AnsibleActionFail):
            self.action_module.run()

    @patch('ansible.plugins.action.assemble.os.path.isdir', return_value=True)
    @patch('ansible.plugins.action.assemble.ActionModule._assemble_from_fragments', return_value='/path/to/assembled')
    @patch('ansible.plugins.action.assemble.checksum_s', return_value='checksum')
    @patch('ansible.plugins.action.assemble.ActionModule._remote_expand_user', return_value='/remote/dest')
    @patch('ansible.plugins.action.assemble.ActionModule._execute_remote_stat', return_value={'checksum': 'different_checksum'})
    @patch('ansible.plugins.action.assemble.ActionModule._transfer_file', return_value='/remote/tempfile')
    @patch('ansible.plugins.action.assemble.ActionModule._fixup_perms2')
    @patch('ansible.plugins.action.assemble.ActionModule._execute_module', return_value={'changed': True})
    def test_run_assemble_and_transfer(self, mock_execute_module, mock_fixup_perms2, mock_transfer_file, mock_execute_remote_stat, mock_remote_expand_user, mock_checksum_s, mock_assemble_from_fragments, mock_isdir):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest'}
        result = self.action_module.run(async=False)
        self.assertTrue(result['changed'])

    @patch('ansible.plugins.action.assemble.os.path.isdir', return_value=True)
    @patch('ansible.plugins.action.assemble.ActionModule._assemble_from_fragments', return_value='/path/to/assembled')
    @patch('ansible.plugins.action.assemble.checksum_s', return_value='checksum')
    @patch('ansible.plugins.action.assemble.ActionModule._remote_expand_user', return_value='/remote/dest')
    @patch('ansible.plugins.action.assemble.ActionModule._execute_remote_stat', return_value={'checksum': 'checksum'})
    @patch('ansible.plugins.action.assemble.ActionModule._execute_module', return_value={'changed': False})
    def test_run_no_transfer_needed(self, mock_execute_module, mock_execute_remote_stat, mock_remote_expand_user, mock_checksum_s, mock_assemble_from_fragments, mock_isdir):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest'}
        result = self.action_module.run(async=False)
        self.assertFalse(result['changed'])

if __name__ == '__main__':
    unittest.main()