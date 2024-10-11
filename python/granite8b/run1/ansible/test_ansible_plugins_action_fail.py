import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule(None, None, None)
        result = action.run(None, None)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_msg(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'msg': 'Custom message'})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom message')

    def test_run_with_task_args(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'msg': 'Custom message'})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom message')

if __name__ == '__main__':
    unittest.main()