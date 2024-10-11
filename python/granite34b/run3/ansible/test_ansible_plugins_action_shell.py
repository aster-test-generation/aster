import unittest
from ansible.plugins.action.shell import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run()
        self.assertEqual(result, {})

    def test_run_with_tmp(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(tmp='tmp_value')
        self.assertEqual(result, {})

    def test_run_with_task_vars(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(task_vars='task_vars_value')
        self.assertEqual(result, {})

    def test_run_with_all_args(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(tmp='tmp_value', task_vars='task_vars_value')
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()