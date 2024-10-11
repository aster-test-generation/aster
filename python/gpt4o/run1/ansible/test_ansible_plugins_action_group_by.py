import unittest
from ansible.plugins.action.group_by import ActionModule
from ansible.playbook.task import Task
from ansible.vars.manager import VariableManager
from ansible.inventory.manager import InventoryManager
from ansible.executor.task_queue_manager import TaskQueueManager
from ansible.executor.playbook_executor import PlaybookExecutor


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.task = Task()
        self.task.args = {}
        self.variable_manager = VariableManager()
        self.inventory = InventoryManager(loader)
        self.loader = None
        self.options = None
        self.passwords = None
        self.playbook_executor = PlaybookExecutor(
            playbooks=[],
            inventory=self.inventory,
            variable_manager=self.variable_manager,
            loader=self.loader,
            options=self.options,
            passwords=self.passwords
        )
        self.action_module = ActionModule(
            task=self.task,
            connection=None,
            play_context=None,
            loader=self.loader,
            templar=None,
            shared_loader_obj=None
        )

    def test_run_no_key(self):
        self.task.args = {}
        result = self.action_module.run()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_with_key(self):
        self.task.args = {'key': 'test_group'}
        result = self.action_module.run()
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test_group')
        self.assertEqual(result['parent_groups'], ['all'])

    def test_run_with_key_and_parents(self):
        self.task.args = {'key': 'test_group', 'parents': 'parent_group'}
        result = self.action_module.run()
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test_group')
        self.assertEqual(result['parent_groups'], ['parent_group'])

    def test_run_with_key_and_multiple_parents(self):
        self.task.args = {'key': 'test_group', 'parents': ['parent_group1', 'parent_group2']}
        result = self.action_module.run()
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test_group')
        self.assertEqual(result['parent_groups'], ['parent_group1', 'parent_group2'])

    def test_run_with_key_and_parents_with_spaces(self):
        self.task.args = {'key': 'test group', 'parents': ['parent group1', 'parent group2']}
        result = self.action_module.run()
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test-group')
        self.assertEqual(result['parent_groups'], ['parent-group1', 'parent-group2'])

if __name__ == '__main__':
    unittest.main()