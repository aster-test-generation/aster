import unittest
from ansible.plugins.action import group_by


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'key': 'test_key', 'parents': ['test_parent']})
        self.assertEqual(result['add_group'], 'test_key')
        self.assertEqual(result['parent_groups'], ['test_parent'])

    def test_run_missing_key(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_private_method(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'key': 'test_key'})
        self.assertEqual(result['add_group'], 'test_key')

    def test_run_protected_method(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'key': 'test_key'})
        self.assertEqual(result['add_group'], 'test_key')

    def test_run_magic_method(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'key': 'test_key'})
        self.assertEqual(result['add_group'], 'test_key')

if __name__ == '__main__':
    unittest.main()