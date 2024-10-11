import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.action.service import ActionModule
from ansible.errors import AnsibleAction, AnsibleActionFail


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.instance = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())

    def test_run_auto_module(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._task.delegate_to = None
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._execute_module = MagicMock(return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}})
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._shared_loader_obj.module_loader.find_plugin_with_context = MagicMock(return_value=MagicMock(resolved_fqcn='ansible.legacy.systemd'))
        self.instance._task.module_defaults = {}
        self.instance._task._parent._play._action_groups = []

        result = self.instance.run(check_mode=False, async=False)
        self.assertIn('ansible_facts', result)

    def test_run_specific_module(self):
        self.instance._task.args = {'use': 'systemd'}
        self.instance._task.delegate_to = None
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._execute_module = MagicMock(return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}})
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._shared_loader_obj.module_loader.find_plugin_with_context = MagicMock(return_value=MagicMock(resolved_fqcn='ansible.legacy.systemd'))
        self.instance._task.module_defaults = {}
        self.instance._task._parent._play._action_groups = []

        result = self.instance.run(check_mode=False, async=False)
        self.assertIn('ansible_facts', result)

    def test_run_module_not_found(self):
        self.instance._task.args = {'use': 'nonexistent'}
        self.instance._task.delegate_to = None
        self.instance._templar.template = MagicMock(return_value='nonexistent')
        self.instance._execute_module = MagicMock(return_value={'ansible_facts': {'ansible_service_mgr': 'nonexistent'}})
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=False)
        self.instance._shared_loader_obj.module_loader.find_plugin_with_context = MagicMock(return_value=MagicMock(resolved_fqcn='ansible.legacy.nonexistent'))
        self.instance._task.module_defaults = {}
        self.instance._task._parent._play._action_groups = []

        with self.assertRaises(AnsibleActionFail):
            self.instance.run()

    def test_run_with_exception(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._task.delegate_to = None
        self.instance._templar.template = MagicMock(side_effect=Exception('Template error'))
        self.instance._execute_module = MagicMock(return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}})
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._shared_loader_obj.module_loader.find_plugin_with_context = MagicMock(return_value=MagicMock(resolved_fqcn='ansible.legacy.systemd'))
        self.instance._task.module_defaults = {}
        self.instance._task._parent._play._action_groups = []

        result = self.instance.run(check_mode=False)
        self.assertIn('ansible_facts', result)

    def test_run_with_ansible_action_exception(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._task.delegate_to = None
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._execute_module = MagicMock(side_effect=AnsibleAction(result={'failed': True}))
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._shared_loader_obj.module_loader.find_plugin_with_context = MagicMock(return_value=MagicMock(resolved_fqcn='ansible.legacy.systemd'))
        self.instance._task.module_defaults = {}
        self.instance._task._parent._play._action_groups = []

        with self.assertRaises(ansible.errors.AnsibleActionFail):
        self.assertTrue(result['failed'])

    def test_run_with_async(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._task.delegate_to = None
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._execute_module = MagicMock(return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}})
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._shared_loader_obj.module_loader.find_plugin_with_context = MagicMock(return_value=MagicMock(resolved_fqcn='ansible.legacy.systemd'))
        self.instance._task.module_defaults = {}
        self.instance._task._parent._play._action_groups = []
        self.instance._task.async_val = True

        result = self.instance.run(check_mode=False)
        self.assertIn('ansible_facts', result)

    def test_run_with_remove_tmp_path(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._task.delegate_to = None
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._execute_module = MagicMock(return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}})
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._shared_loader_obj.module_loader.find_plugin_with_context = MagicMock(return_value=MagicMock(resolved_fqcn='ansible.legacy.systemd'))
        self.instance._task.module_defaults = {}
        self.instance._task._parent._play._action_groups = []
        self.instance._task.async_val = False
        self.instance._connection._shell.tmpdir = '/tmp/ansible'

        with patch.object(self.instance, '_remove_tmp_path') as mock_remove_tmp_path:
            result = self.instance.run()[0]
            mock_remove_tmp_path.assert_called_once_with('/tmp/ansible')
            self.assertIn('ansible_facts', result)

if __name__ == '__main__':
    unittest.main()