import unittest
from ansible.module_utils.basic import *
from ansible.module_utils.six import string_types
from ansible.plugins.action.group_by import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertEqual(result, {})

    def test_run_with_key(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key'}))
        self.assertEqual(result, {})

    def test_run_without_key(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertEqual(result, {'failed': True, 'msg': 'the \'key\' param is required when using group_by'})

    def test_run_with_parents(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key', 'parents': 'all'}))
        self.assertEqual(result, {})

    def test_run_with_multiple_parents(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key', 'parents': ['all', 'test_group']}))
        self.assertEqual(result, {})

    def test_run_with_invalid_parents(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), _task=dict(args={'key': 'test_key', 'parents': 'invalid'}))
        self.assertEqual(result, {'failed': True, 'msg': 'Invalid value for parents'})

    def test_str_method(self):
        action = ActionModule()
        result = str(action)
        self.assertEqual(result, '<ActionModule object at 0x...>')

    def test_repr_method(self):
        action = ActionModule()
        result = repr(action)
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        action1 = ActionModule()
        action2 = ActionModule()
        self.assertEqual(action1, action2)

if __name__ == '__main__':
    unittest.main()