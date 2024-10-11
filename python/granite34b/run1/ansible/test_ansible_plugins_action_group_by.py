import unittest
from ansible.plugins.action.group_by import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_without_key(self):
        action = ActionModule(connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_with_key(self):
        def setUp(self):
        result = action.run(task_vars={}, key="test_key")
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "test_key".replace(" ", "-"))
        self.assertEqual(result['parent_groups'], ["all"])

    def test_run_with_parents(self):
        action = ActionModule(connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={}, key="test_key", parents="test_parent")
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "test_key".replace(" ", "-"))
        self.assertEqual(result['parent_groups'], ["test_parent".replace(" ", "-"), "all"])

    def test_run_with_parents_list(self):
        def setUp(self):
        result = action.run(task_vars={}, key="test_key", parents=["test_parent1", "test_parent2"])
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], "test_key".replace(" ", "-"))
        self.assertEqual(result['parent_groups'], ["test_parent1".replace(" ", "-"), "test_parent2".replace(" ", "-"), "all"])

if __name__ == '__main__':
    unittest.main()