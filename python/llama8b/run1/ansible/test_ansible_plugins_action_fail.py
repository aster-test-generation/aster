import unittest
from ansible.plugins.action_module import ActionModul
from ansible.plugins.action.fail import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_msg(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task_args={'msg': 'Custom message'})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom message')

    def test_init(self):
        action = ActionModule()
        self.assertEqual(action.__class__.__name__, 'ActionModule')

    def test_str(self):
        action = ActionModule()
        self.assertEqual(str(action), 'ActionModule')

    def test_repr(self):
        action = ActionModule()
        self.assertEqual(repr(action), 'ActionModule()')

    def test_eq(self):
        action1 = ActionModule()
        action2 = ActionModule()
        self.assertEqual(action1, action2)

if __name__ == '__main__':
    unittest.main()