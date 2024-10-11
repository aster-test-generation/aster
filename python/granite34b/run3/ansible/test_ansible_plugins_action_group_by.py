import unittest
from ansible.plugins.action.group_by import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_without_key(self):
        def setUp(self):
        result = action.run(task_vars={})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_with_key(self):
        def setUp(self):
        result = action.run(task_vars={}, key="group_name")
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "group_name")
        self.assertEqual(result['parent_groups'], ["all"])

    def test_run_with_parents(self):
        def setUp(self):
        result = action.run(task_vars={}, key="group_name", parents=["parent1", "parent2"])
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "group_name")
        self.assertEqual(result['parent_groups'], ["parent1", "parent2"])

    def test_run_with_parents_as_string(self):
        action = ActionModule(connection=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={}, key="group_name", parents="parent1")
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "group_name")
        self.assertEqual(result['parent_groups'], ["parent1"])

    def test_run_with_invalid_parents(self):
        def setUp(self):
        result = action.run(task_vars={}, key="group_name", parents=123)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'parents' param must be a list or a string")

if __name__ == '__main__':
    unittest.main()