import unittest
from ansible.plugins.action.yaml import *


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_with_key(self):
        instance = ActionModule()
        result = instance.run(task_vars={'key': 'test_key'})
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'test_key')
        self.assertEqual(result['parent_groups'], ['all'])

    def test_run_with_parents(self):
        instance = ActionModule()
        result = instance.run(task_vars={'key': 'test_key', 'parents': 'test_parent'})
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'test_key')
        self.assertEqual(result['parent_groups'], ['test_parent'])

    def test_run_with_parents_list(self):
        instance = ActionModule()
        result = instance.run(task_vars={'key': 'test_key', 'parents': ['test_parent1', 'test_parent2']})
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'test_key')
        self.assertEqual(result['parent_groups'], ['test_parent1', 'test_parent2'])

if __name__ == '__main__':
    unittest.main()