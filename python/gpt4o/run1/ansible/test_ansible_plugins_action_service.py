import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.action.service import ActionModule
from ansible.errors import AnsibleAction, AnsibleActionFail


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.instance = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())
        self.instance._task.args = {}
        self.instance._task.delegate_to = None
        self.instance._task.async_val = False
        self.instance._task._parent = MagicMock()
        self.instance._task._parent._play = MagicMock()
        self.instance._task._parent._play._action_groups = None

    def test_run_auto_module(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._execute_module = MagicMock(return_value={'ansible_facts': {'ansible_service_mgr': 'systemd'}})
        self.instance._remove_tmp_path = MagicMock()

        result = self.instance.run().get()

        self.assertIn('ansible_facts', result)

    def test_run_specific_module(self):
        self.instance._task.args = {'use': 'systemd'}
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._execute_module = MagicMock(return_value={})
        self.instance._remove_tmp_path = MagicMock()

        result = self.instance.run()

        self.assertEqual(result, {})

    def test_run_module_not_found(self):
        self.instance._task.args = {'use': 'nonexistent'}
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=False)
        self.instance._execute_module = MagicMock(return_value={})
        self.instance._remove_tmp_path = MagicMock()

        with self.assertRaises(AnsibleActionFail):
            self.instance.run()

    def test_run_with_exception(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._templar.template = MagicMock(side_effect=Exception('Template error'))
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=False)
        self.instance._execute_module = MagicMock(return_value={})
        self.instance._remove_tmp_path = MagicMock()

        result = self.instance.run_template()

        self.assertIn('failed', result)

    def test_run_with_ansible_action_exception(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._execute_module = MagicMock(side_effect=AnsibleAction(result={'failed': True}))
        self.instance._remove_tmp_path = MagicMock()

        result = self.instance.run().get()

        self.assertTrue(result['failed'])

    def test_run_cleanup(self):
        self.instance._task.args = {'use': 'auto'}
        self.instance._templar.template = MagicMock(return_value='systemd')
        self.instance._shared_loader_obj.module_loader.has_plugin = MagicMock(return_value=True)
        self.instance._execute_module = MagicMock(return_value={})
        self.instance._remove_tmp_path = MagicMock()

        self.instance.run().get()

        self.instance._remove_tmp_path.assert_called_once()

if __name__ == '__main__':
    unittest.main()