import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.action.copy import ActionModule
from ansible.errors import AnsibleError


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule()
        self.action_module._task = MagicMock()
        self.action_module._task.args = {}
        self.action_module._connection = MagicMock()
        self.action_module._connection._shell = MagicMock()
        self.action_module._connection._shell.path_has_trailing_slash = MagicMock(return_value=False)
        self.action_module._connection._shell.join_path = MagicMock(return_value='/joined/path')
        self.action_module._remote_expand_user = MagicMock(return_value='/expanded/user/path')
        self.action_module._copy_file = MagicMock(return_value={'changed': False})
        self.action_module._execute_module = MagicMock(return_value={'changed': False})
        self.action_module._ensure_invocation = MagicMock(return_value={})

    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run_no_task_vars(self):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination'}
        result = self.action_module._supports_async()
        self.assertIn('failed', result)

    def test_run_with_task_vars(self):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination'}
        result = self.action_module._supports_async(task_vars={'some_var': 'value'})
        self.assertIn('failed', result)

    def test_run_missing_src_and_content(self):
        self.action_module._task.args = {'dest': 'destination'}
        result = self.action_module._supports_async()
        self.assertEqual(result['msg'], 'src (or content) is required')

    def test_run_missing_dest(self):
        self.action_module._task.args = {'src': 'source'}
        result = self.action_module._supports_async()
        self.assertEqual(result['msg'], 'dest is required')

    def test_run_src_and_content_mutually_exclusive(self):
        self.action_module._task.args = {'src': 'source', 'content': 'content', 'dest': 'destination'}
        result = self.action_module._supports_async()
        self.assertEqual(result['msg'], 'src and content are mutually exclusive')

    def test_run_content_with_dir_as_dest(self):
        self.action_module._task.args = {'content': 'content', 'dest': 'destination/'}
        result = self.action_module._supports_async()
        self.assertEqual(result['msg'], 'can not use content with a dir as dest')

    @patch('ansible.plugins.action.copy.boolean', return_value=True)
    def test_run_remote_src(self, mock_boolean):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination', 'remote_src': True}
        result = self.action_module._supports_async()
        self.assertIn('changed', result)

    @patch('ansible.plugins.action.copy.boolean', return_value=False)
    def test_run_local_src(self, mock_boolean):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination'}
        with patch('os.path.isdir', return_value=False):
            result = self.action_module._supports_async()
            self.assertIn('changed', result)

    def test_run_content_tempfile(self):
        self.action_module._task.args = {'content': 'content', 'dest': 'destination'}
        with patch('ansible.plugins.action.copy.ActionModule.create_content_tempfile', return_value='/tmp/file'):
            result = self.action_module.run()
            self.assertIn('changed', result)

    def test_run_find_needle_exception(self):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination'}
        with patch('ansible.plugins.action.copy.ActionModule._find_needle', side_effect=AnsibleError('error')):
            result = self.action_module._supports_async()
            self.assertIn('failed', result)

    def test_run_copy_file(self):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination'}
        with patch('os.path.isdir', return_value=False):
            result = self.action_module._supports_async()
            self.assertIn('changed', result)

    def test_run_execute_module(self):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination'}
        with patch('os.path.isdir', return_value=True):
            result = self.action_module._supports_async()
            self.assertIn('changed', result)

    def test_run_remove_tmp_path(self):
        self.action_module._task.args = {'src': 'source', 'dest': 'destination'}
        with patch('os.path.isdir', return_value=False):
            result = self.action_module._supports_async()
            self.assertIn('changed', result)

if __name__ == '__main__':
    unittest.main()