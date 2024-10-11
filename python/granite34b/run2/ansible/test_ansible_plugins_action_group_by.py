import unittest
from ansible.plugins.action.group_by import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_without_key(self):
        action = ActionModule(connection=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_with_key(self):
        action = ActionModule(connection=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={}, key="test")
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "test")
        self.assertEqual(result['parent_groups'], ["all"])

    def test_run_with_parents(self):
        def setUp(self):
        result = action.run(task_vars={}, key="test", parents=["parent1", "parent2"])
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "test")
        self.assertEqual(result['parent_groups'], ["parent1", "parent2"])

    def test_run_with_parents_as_string(self):
        def setUp(self):
        result = action.run(task_vars={}, key="test", parents="parent1")
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "test")
        self.assertEqual(result['parent_groups'], ["parent1"])

if __name__ == '__main__':
    unittest.main()