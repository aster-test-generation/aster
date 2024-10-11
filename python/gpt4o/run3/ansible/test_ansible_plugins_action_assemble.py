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
    @patch('tempfile.mkstemp', return_value=(None, '/tmp/tempfile'))
    @patch('os.fdopen')
    def test_assemble_from_fragments(self, mock_fdopen, mock_mkstemp, mock_open, mock_isfile, mock_listdir):
        mock_listdir.return_value = ['fragment1', 'fragment2']
        mock_isfile.return_value = True
        mock_tmp = MagicMock()
        mock_fdopen.return_value = mock_tmp

        result = self.action_module._assemble_from_fragments('/fake/src_path')

        self.assertEqual(result, '/tmp/tempfile')

    @patch('ansible.plugins.action.assemble.ActionModule._assemble_from_fragments', return_value='/tmp/tempfile')
    @patch('ansible.plugins.action.assemble.ActionModule._find_needle', return_value='/fake/src_path')
    @patch('ansible.plugins.action.assemble.ActionModule._execute_module', return_value={'checksum': 'fake_checksum'})
    @patch('ansible.plugins.action.assemble.ActionModule._execute_remote_stat', return_value={'checksum': 'fake_checksum'})
    @patch('ansible.plugins.action.assemble.ActionModule._transfer_file', return_value='/remote/path')
    @patch('ansible.plugins.action.assemble.ActionModule._fixup_perms2')
    @patch('ansible.plugins.action.assemble.ActionModule._get_diff_data', return_value={'diff': 'fake_diff'})
    @patch('ansible.plugins.action.assemble.ActionModule._remove_tmp_path')
    def test_run(self, mock_remove_tmp_path, mock_get_diff_data, mock_fixup_perms2, mock_transfer_file, mock_execute_remote_stat, mock_execute_module, mock_find_needle, mock_assemble_from_fragments):
        self.action_module._task.args = {
            'src': '/fake/src_path',
            'dest': '/fake/dest_path',
            'remote_src': 'no'
        }
        self.action_module._play_context.diff = True

        result = self.action_module.run(async=False)

        self.assertIn('checksum', result)

    def test_run_missing_src_or_dest(self):
        self.action_module._task.args = {
            'src': None,
            'dest': None
        }

        with self.assertRaises(AnsibleActionFail):
            self.action_module.run()

    @patch('ansible.plugins.action.assemble.boolean', return_value=True)
    @patch('ansible.plugins.action.assemble.ActionModule._execute_module', side_effect=_AnsibleActionDone)
    def test_run_remote_src(self, mock_execute_module, mock_boolean):
        self.action_module._task.args = {
            'src': '/fake/src_path',
            'dest': '/fake/dest_path',
            'remote_src': 'yes'
        }

        with self.assertRaises(_AnsibleActionDone):
            self.action_module.run(async=False)

    @patch('ansible.plugins.action.assemble.ActionModule._find_needle', side_effect=AnsibleActionFail('needle not found'))
    def test_run_find_needle_fail(self, mock_find_needle):
        self.action_module._task.args = {
            'src': '/fake/src_path',
            'dest': '/fake/dest_path',
            'remote_src': 'no'
        }

        with self.assertRaises(AnsibleActionFail):
            self.action_module.run()

    @patch('os.path.isdir', return_value=False)
    def test_run_src_not_directory(self, mock_isdir):
        self.action_module._task.args = {
            'src': '/fake/src_path',
            'dest': '/fake/dest_path',
            'remote_src': 'no'
        }

        with self.assertRaises(AnsibleActionFail):
            self.action_module.run()

if __name__ == '__main__':
    unittest.main()