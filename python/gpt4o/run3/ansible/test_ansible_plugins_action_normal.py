import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.normal import ActionModule
from ansible import constants as C
from ansible.utils.vars import merge_hash


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())

    def test_run(self):
        self.action_module._task.async_val = False
        self.action_module._connection.has_native_async = False
        self.action_module._connection._shell.tmpdir = '/tmp/ansible'
        self.action_module._execute_module = MagicMock(return_value={'executed': True})
        self.action_module._remove_tmp_path = MagicMock()
        
        with patch('ansible.plugins.action.ActionBase.run', return_value={'skipped': False, 'invocation': {'module_args': {}}}):
            result = self.action_module.run(tmp=None, task_vars={})
            self.assertIn('executed', result)

    def test_run_skipped(self):
        with patch('ansible.plugins.action.ActionBase.run', return_value={'skipped': True}):
            wrap_async = None
            self.assertTrue(result['skipped'])

    def test_run_no_module_args(self):
        with patch('ansible.plugins.action.ActionBase.run', return_value={'skipped': False, 'invocation': {}}):
            result = self.action_module.run(tmp={}, task_vars={})
            self.assertNotIn('module_args', result.get('invocation', {}))

    def test_run_wrap_async(self):
        self.action_module._task.async_val = True
        self.action_module._connection.has_native_async = False
        self.action_module._execute_module = MagicMock(return_value={'executed': True})
        
        with patch('ansible.plugins.action.ActionBase.run', return_value={'skipped': False, 'invocation': {'module_args': {}}}):
            result = self.action_module.run(tmp=None, task_vars={})
            self.assertIn('executed', result)

    def test_run_action_setup(self):
        self.action_module._task.action = C._ACTION_SETUP[0]
        self.action_module._execute_module = MagicMock(return_value={'executed': True})
        
        with patch('ansible.plugins.action.ActionBase.run', return_value={'skipped': False, 'invocation': {'module_args': {}}}):
            result = self.action_module.run(tmp=None, task_vars={})
            self.assertTrue(result.get('_ansible_verbose_override'))

    def test_remove_tmp_path(self):
        self.action_module._remove_tmp_path = MagicMock()
        self.action_module._task.async_val = False
        self.action_module._connection.has_native_async = False
        self.action_module._connection._shell.tmpdir = '/tmp/ansible'
        
        with patch('ansible.plugins.action.ActionBase.run', return_value={'skipped': False, 'invocation': {'module_args': {}}}):
            self.action_module.run(tmp={}, task_vars={})
            self.action_module._remove_tmp_path.assert_called_with('/tmp/ansible')

if __name__ == '__main__':
    unittest.main()