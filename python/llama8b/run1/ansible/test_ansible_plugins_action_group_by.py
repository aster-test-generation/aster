import unittest
from ansible.module_utils.basic import *
from ansible.module_utils.six import string_types
from ansible.plugins.action.group_by import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertFalse(result['changed'])
        self.assertEqual(result['add_group'], None)
        self.assertEqual(result['parent_groups'], [])

    def test_run_with_key(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key'}))
        self.assertFalse(result['changed'])
        self.assertEqual(result['add_group'], 'test_key-')
        self.assertEqual(result['parent_groups'], [])

    def test_run_with_parents(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key', 'parents': 'parent_group'}))
        self.assertFalse(result['changed'])
        self.assertEqual(result['add_group'], 'test_key-')
        self.assertEqual(result['parent_groups'], ['parent_group-'])

    def test_run_without_key(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={}))
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_str_method(self):
        action = ActionModule()
        result = str(action)
        self.assertEqual(result, "ActionModule")

    def test_repr_method(self):
        action = ActionModule()
        result = repr(action)
        self.assertEqual(result, "ActionModule()")

    def test_eq_method(self):
        action1 = ActionModule()
        action2 = ActionModule()
        self.assertEqual(action1, action2)

    def test_init_method(self):
        action = ActionModule()
        self.assertEqual(action._VALID_ARGS, frozenset(('key', 'parents')))

if __name__ == '__main__':
    unittest.main()