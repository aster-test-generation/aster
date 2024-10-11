import unittest
from ansible.plugins.action.fail import ActionModule
from ansible.playbook.task import Task
from ansible.vars.manager import VariableManager
from ansible.inventory.manager import InventoryManager
from ansible.parsing.dataloader import DataLoader
from ansible.executor.task_queue_manager import TaskQueueManager


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.loader = DataLoader()
        self.inventory = InventoryManager(loader=self.loader, sources='localhost,')
        self.variable_manager = VariableManager(loader=self.loader, inventory=self.inventory)
        self.task = Task()
        self.task.args = {}
        self.action_module = ActionModule(task=self.task, connection=None, play_context=None, loader=self.loader, templar=None, shared_loader_obj=None)

    def test_run_no_args(self):
        result = self.action_module.run(check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_msg_arg(self):
        self.task.args = {'msg': 'Custom failure message'}
        result = self.action_module.run(check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom failure message')

    def test_run_with_task_vars(self):
        task_vars = {'some_var': 'some_value'}
        result = self.action_module.run(task_vars=task_vars, check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_tmp(self):
        result = self.action_module.run(tmp='/tmp', check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_tmp_and_task_vars(self):
        task_vars = {'some_var': 'some_value'}
        result = self.action_module.run(tmp='/tmp', task_vars=task_vars, check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

if __name__ == '__main__':
    unittest.main()