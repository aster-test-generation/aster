import unittest
from ansible.module_utils.basic import


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertEqual(result['changed'], False)

    def test_run_with_key(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key'}))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'test_key-')

    def test_run_with_parents(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key', 'parents': 'test_parent'}))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['parent_groups'], ['test_parent-'])

    def test_run_without_key(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={}))
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_init(self):
        action = ActionModule()
        self.assertEqual(action._VALID_ARGS, frozenset(('key', 'parents')))

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