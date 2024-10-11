import unittest
from ansible.module_utils.basic import *
from ansible.plugins.action.fail import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_msg(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=ActionModule()._task)
        action._task.args = {'msg': 'Custom message'}
        result = action.run(task_vars=dict(), _task=ActionModule()._task)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom message')

    def test_init(self):
        action = ActionModule()
        self.assertEqual(action.TRANSFERS_FILES, False)
        self.assertEqual(action._VALID_ARGS, frozenset(('msg',)))

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