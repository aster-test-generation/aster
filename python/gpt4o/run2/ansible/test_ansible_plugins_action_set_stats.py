import unittest
from ansible.plugins.action.set_stats import ActionModule
from ansible.module_utils.six import iteritems
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.utils.vars import isidentifier
from ansible.playbook.task import Task
from ansible.template import Templar
from ansible.executor.task_queue_manager import TaskQueueManager


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.task = Task()
        self.templar = Templar(loader=None)
        self.task_vars = {}
        self.action_module = ActionModule(task=self.task, connection=None, play_context=None, loader=None, templar=self.templar, shared_loader_obj=None)

    def test_run_with_no_args(self):
        self.task.args = {}
        result = self.action_module.run(task_vars=self.task_vars, check_mode=False)
        self.assertFalse(result['changed'])
        self.assertEqual(result['ansible_stats'], {'data': {}, 'per_host': False, 'aggregate': True})

    def test_run_with_invalid_data_type(self):
        self.task.args = {'data': 'invalid_data'}
        result = self.action_module.run(task_vars=self.task_vars, check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "The 'data' option needs to be a dictionary/hash")

    def test_run_with_valid_data(self):
        self.task.args = {'data': {'valid_key': 'valid_value'}}
        result = self.action_module.run(task_vars=self.task_vars, check_mode=False)
        self.assertFalse(result['changed'])
        self.assertEqual(result['ansible_stats']['data'], {'valid_key': 'valid_value'})

    def test_run_with_invalid_variable_name(self):
        self.task.args = {'data': {'1invalid_key': 'value'}}
        result = self.action_module.run(task_vars=self.task_vars, check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "The variable name '1invalid_key' is not valid. Variables must start with a letter or underscore character, and contain only letters, numbers and underscores.")

    def test_run_with_per_host_and_aggregate(self):
        self.task.args = {'data': {'key': 'value'}, 'per_host': True, 'aggregate': False}
        result = self.action_module.run(task_vars=self.task_vars, check_mode=False)
        self.assertFalse(result['changed'])
        self.assertEqual(result['ansible_stats']['per_host'], True)
        self.assertEqual(result['ansible_stats']['aggregate'], False)

    def test_run_with_templated_values(self):
        self.task.args = {'data': {'key': '{{ 1 + 1 }}'}}
        result = self.action_module.run(task_vars=self.task_vars, check_mode=False)
        self.assertFalse(result['changed'])
        self.assertEqual(result['ansible_stats']['data'], {'key': '2'})

if __name__ == '__main__':
    unittest.main()