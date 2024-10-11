import unittest
from ansible.plugins.action.debug import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_with_msg(self):
        task_vars = {}
        task_args = {'msg': 'Hello world!'}
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(tmp=None, task_vars=task_vars, task_args=task_args)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_var(self):
        task_vars = {'var': 'Hello world!'}
        task_args = {'var': 'var'}
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(tmp=None, task_vars=task_vars, task_args=task_args)
        self.assertEqual(result['var'], 'Hello world!')

    def test_run_with_verbosity(self):
        task_vars = {}
        task_args = {'verbosity': 1}
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(tmp=None, task_vars=task_vars, task_args=task_args)
        self.assertEqual(result['verbosity'], 1)

    def test_run_with_both_msg_and_var(self):
        task_vars = {}
        task_args = {'msg': 'Hello world!', 'var': 'var'}
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(tmp=None, task_vars=task_vars, task_args=task_args)
        self.assertTrue('failed' in result and result['failed'])
        self.assertTrue('msg' in result and result['msg'] == "'msg' and 'var' are incompatible options")

if __name__ == '__main__':
    unittest.main()