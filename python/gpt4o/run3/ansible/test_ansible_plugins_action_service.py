import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.action.service import ActionModule
from ansible.errors import AnsibleAction, AnsibleActionFail


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.instance = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())

    def test_run(self):
        with patch.object(ActionModule, '_execute_module', return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}}):
            with patch.object(ActionModule, '_remove_tmp_path'):
                self.instance._task.args = {'use': 'auto'}
                self.instance._task.delegate_to = None
                self.instance._task.async_val = False
                self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
                result = self.instance.run()
                self.assertIn('ansible_facts', result)

    def test_run_with_exception(self):
        with patch.object(ActionModule, '_execute_module', side_effect=AnsibleAction(result={'failed': True})):
            with patch.object(ActionModule, '_remove_tmp_path'):
                self.instance._task.args = {'use': 'auto'}
                self.instance._task.delegate_to = None
                self.instance._task.async_val = False
                self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
                result = self.instance.run()
                self.assertTrue(result['failed'])

    def test_run_with_ansible_action_fail(self):
        with patch.object(ActionModule, '_execute_module', side_effect=AnsibleActionFail('Could not detect which service manager to use.')):
            with patch.object(ActionModule, '_remove_tmp_path'):
                self.instance._task.args = {'use': 'auto'}
                self.instance._task.delegate_to = None
                self.instance._task.async_val = False
                self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=False)
                result = self.instance.run()
                self.assertIn('msg', result)

    def test_run_with_auto_module(self):
        with patch.object(ActionModule, '_execute_module', return_value={'ansible_facts': {'ansible_service_mgr': 'auto'}}):
            with patch.object(ActionModule, '_remove_tmp_path'):
                self.instance._task.args = {'use': 'auto'}
                self.instance._task.delegate_to = None
                self.instance._task.async_val = False
                self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=False)
                result = self.instance.run()
                self.assertIn('msg', result['ansible_facts'])

    def test_run_with_builtin_module(self):
        with patch.object(ActionModule, '_execute_module', return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}}):
            with patch.object(ActionModule, '_remove_tmp_path'):
                self.instance._task.args = {'use': 'systemd'}
                self.instance._task.delegate_to = None
                self.instance._task.async_val = False
                self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
                result = self.instance.run()
                self.assertIn('ansible_facts', result)

    def test_run_with_unused_params(self):
        with patch.object(ActionModule, '_execute_module', return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}}):
            with patch.object(ActionModule, '_remove_tmp_path'):
                self.instance._task.args = {'use': 'systemd', 'pattern': 'test'}
                self.instance._task.delegate_to = None
                self.instance._task.async_val = False
                self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
                result = self.instance.run()
                self.assertNotIn('pattern', self.instance._task.args.keys())

if __name__ == '__main__':
    unittest.main()