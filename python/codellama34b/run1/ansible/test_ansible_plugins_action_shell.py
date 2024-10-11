import unittest
from ansible.plugins.action import ActionModule



class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test_run_with_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars(self):
        instance = ActionModule()
        result = instance.run(task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_tmp(self):
        instance = ActionModule()
        result = instance.run(tmp=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp_and_connection(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, connection=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp_and_connection_and_play_context(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, connection=None, play_context=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp_and_connection_and_play_context_and_loader(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, connection=None, play_context=None, loader=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp_and_connection_and_play_context_and_loader_and_templar(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, connection=None, play_context=None, loader=None, templar=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp_and_connection_and_play_context_and_loader_and_templar_and_shared_loader_obj(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp_and_connection_and_play_context_and_loader_and_templar_and_shared_loader_obj_and_task(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None, task=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_tmp_and_connection_and_play_context_and_loader_and_templar_and_shared_loader_obj_and_task_and_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None, task=None, args=None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()