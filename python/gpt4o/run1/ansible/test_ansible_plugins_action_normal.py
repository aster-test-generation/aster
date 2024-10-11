import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.normal import ActionModule
from ansible.plugins.action import ActionBase
from ansible import constants as C
from ansible.utils.vars import merge_hash


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.instance = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())

    @patch('ansible.plugins.action.ActionBase.run')
    @patch('ansible.utils.vars.merge_hash')
    def test_run(self, mock_merge_hash, mock_super_run):
        mock_super_run.return_value = {'skipped': False, 'invocation': {'module_args': {}}}
        self.instance._task.async_val = False
        self.instance._connection.has_native_async = False
        self.instance._connection._shell.tmpdir = '/tmp/ansible'

        result = self.instance.run(tmp={}, task_vars={})

        self.assertTrue(self.instance._supports_check_mode)
        self.assertTrue(self.instance._supports_async)
        self.assertIn('_ansible_verbose_override', result)
        self.assertEqual(result['_ansible_verbose_override'], True)
        mock_merge_hash.assert_called_once()
        self.instance._connection._shell.tmpdir = '/tmp/ansible'

    @patch('ansible.plugins.action.ActionBase.run')
    def test_run_skipped(self, mock_super_run):
        mock_super_run.return_value = {'skipped': True}
        self.instance._task.async_val = False
        self.instance._connection.has_native_async = False

        wrap_async = None

        self.assertTrue(result['skipped'])

    @patch('ansible.plugins.action.ActionBase.run')
    def test_run_no_invocation(self, mock_super_run):
        mock_super_run.return_value = {'skipped': False}
        self.instance._task.async_val = False
        self.instance._connection.has_native_async = False

        result = self.instance.run(tmp={}, task_vars={})

        self.assertNotIn('module_args', result.get('invocation', {}))

    @patch('ansible.plugins.action.ActionBase.run')
    @patch('ansible.utils.vars.merge_hash')
    def test_run_wrap_async(self, mock_merge_hash, mock_super_run):
        mock_super_run.return_value = {'skipped': False, 'invocation': {'module_args': {}}}
        self.instance._task.async_val = True
        self.instance._connection.has_native_async = False
        self.instance._connection._shell.tmpdir = '/tmp/ansible'

        result = self.instance.run(tmp={}, task_vars={})

        self.assertTrue(self.instance._task.async_val)
        self.assertFalse(self.instance._connection.has_native_async)
        mock_merge_hash.assert_called_once()

    @patch('ansible.plugins.action.ActionBase.run')
    @patch('ansible.utils.vars.merge_hash')
    def test_run_remove_tmp_path(self, mock_merge_hash, mock_super_run):
        mock_super_run.return_value = {'skipped': False, 'invocation': {'module_args': {}}}
        self.instance._task.async_val = False
        self.instance._connection.has_native_async = False
        self.instance._connection._shell.tmpdir = '/tmp/ansible'

        with patch.object(self.instance, '_remove_tmp_path') as mock_remove_tmp_path:
            self.instance.run(tmp={}, task_vars={})
            mock_remove_tmp_path.assert_called_once_with('/tmp/ansible')

if __name__ == '__main__':
    unittest.main()