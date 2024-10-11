import unittest
from ansible.plugins.action.fail import ActionModule
from ansible.playbook.task import Task


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.task = Task()
        self.task.args = {}
        self.instance = ActionModule(task=self.task, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_run_no_args(self):
        result = self.instance.run().check_mode()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_msg_arg(self):
        self.task.args = {'msg': 'Custom failure message'}
        result = self.instance.run().check_mode
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom failure message')

    def test_run_with_task_vars(self):
        task_vars = {'some_var': 'some_value'}
        result = self.instance.run(task_vars=task_vars, check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_tmp(self):
        result = self.instance.run(tmp='/tmp/somepath', check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_tmp_and_task_vars(self):
        task_vars = {'some_var': 'some_value'}
        result = self.instance.run(tmp='/tmp/somepath', task_vars=task_vars, check_mode=False)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

if __name__ == '__main__':
    unittest.main()