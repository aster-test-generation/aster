import unittest
import tempfile
import os
import re
from unittest.mock import patch, MagicMock
from ansible.plugins.action.assemble import ActionModule
from ansible.errors import AnsibleActionFail, _AnsibleActionDone


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())

    def test_assemble_from_fragments(self):
        src_path = tempfile.mkdtemp()
        fragment_path = os.path.join(src_path, 'fragment.txt')
        with open(fragment_path, 'w') as f:
            f.write('content')
        
        result = self.action_module._assemble_from_fragments(src_path)
        with open(result, 'r') as f:
            content = f.read()
        
        self.assertEqual(content, '')
        os.remove(fragment_path)
        os.rmdir(src_path)
        os.remove(result)

    def test_run_missing_src_dest(self):
        self.action_module._task.args = {}
        with self.assertRaises(AnsibleActionFail) as context:
            self.action_module.run()
        self.assertEqual(str(context.exception), "async is not supported for this task.")

    @patch('ansible.plugins.action.assemble.boolean', return_value=True)
    @patch('ansible.plugins.action.assemble.ActionModule._execute_module')
    def test_run_remote_src(self, mock_execute_module, mock_boolean):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest', 'remote_src': 'yes'}
        with self.assertRaises(_AnsibleActionDone):
            self.action_module.run(async=False)
        mock_execute_module.assert_called_once()

    @patch('ansible.plugins.action.assemble.os.path.isdir', return_value=False)
    def test_run_src_not_directory(self, mock_isdir):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest', 'remote_src': 'no'}
        with self.assertRaises(AnsibleActionFail) as context:
            self.action_module.run()
        self.assertEqual(str(context.exception), "async is not supported for this task.")

    @patch('ansible.plugins.action.assemble.os.path.isdir', return_value=True)
    @patch('ansible.plugins.action.assemble.ActionModule._assemble_from_fragments', return_value='path')
    @patch('ansible.plugins.action.assemble.checksum_s', return_value='checksum')
    @patch('ansible.plugins.action.assemble.ActionModule._remote_expand_user', return_value='dest')
    @patch('ansible.plugins.action.assemble.ActionModule._execute_remote_stat', return_value={'checksum': 'different_checksum'})
    @patch('ansible.plugins.action.assemble.ActionModule._transfer_file', return_value='xfered')
    @patch('ansible.plugins.action.assemble.ActionModule._fixup_perms2')
    @patch('ansible.plugins.action.assemble.ActionModule._execute_module', return_value={'changed': True})
    def test_run_local_src(self, mock_execute_module, mock_fixup_perms2, mock_transfer_file, mock_execute_remote_stat, mock_remote_expand_user, mock_checksum_s, mock_assemble_from_fragments, mock_isdir):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest', 'remote_src': 'no'}
        result = self.action_module.run(async=False)
        self.assertTrue(result['changed'])

    @patch('ansible.plugins.action.assemble.ActionModule._remove_tmp_path')
    def test_run_finally(self, mock_remove_tmp_path):
        self.action_module._task.args = {'src': 'src', 'dest': 'dest', 'remote_src': 'no'}
        with patch('ansible.plugins.action.assemble.os.path.isdir', return_value=True), \
             patch('ansible.plugins.action.assemble.ActionModule._assemble_from_fragments', return_value='path'), \
             patch('ansible.plugins.action.assemble.checksum_s', return_value='checksum'), \
             patch('ansible.plugins.action.assemble.ActionModule._remote_expand_user', return_value='dest'), \
             patch('ansible.plugins.action.assemble.ActionModule._execute_remote_stat', return_value={'checksum': 'checksum'}), \
             patch('ansible.plugins.action.assemble.ActionModule._execute_module', return_value={'changed': False}):
            self.action_module.run(async=False)
        mock_remove_tmp_path.assert_called_once()

if __name__ == '__main__':
    unittest.main()