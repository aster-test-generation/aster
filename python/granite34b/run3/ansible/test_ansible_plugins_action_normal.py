import unittest
from ansible.plugins.action.normal import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run()
        self.assertEqual(result, {})

    def test_run_method_with_task_vars(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {}
        result = action_module.run(task_vars=task_vars)
        self.assertEqual(result, {})

    def test_run_method_with_tmp(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = "tmp_path"
        result = action_module.run(tmp=tmp)
        self.assertEqual(result, {})

    def test_run_method_with_tmp_and_task_vars(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = "tmp_path"
        task_vars = {}
        result = action_module.run(tmp=tmp, task_vars=task_vars)
        self.assertEqual(result, {})

    def test_run_method_with_all_parameters(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = "tmp_path"
        task_vars = {}
        result = action_module.run(tmp=tmp, task_vars=task_vars)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()