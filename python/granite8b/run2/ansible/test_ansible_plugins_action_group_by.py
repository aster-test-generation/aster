import unittest
from ansible.plugins.action import group_by


class TestActionModule(unittest.TestCase):
    def test_run(self):
        result = ActionModule().run(task_vars={'key': 'test'})
        self.assertEqual(result['add_group'], 'test')
        self.assertEqual(result['parent_groups'], ['all'])

    def test_run_with_parents(self):
        result = ActionModule().run(task_vars={'key': 'test', 'parents': ['parent1', 'parent2']})
        self.assertEqual(result['add_group'], 'test')
        self.assertEqual(result['parent_groups'], ['parent1', 'parent2'])

    def test_run_without_key(self):
        result = ActionModule().run(task_vars={})
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

if __name__ == '__main__':
    unittest.main()