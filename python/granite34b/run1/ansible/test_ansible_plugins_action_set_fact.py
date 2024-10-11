import unittest
from ansible.plugins.action.set_fact import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_with_facts(self):
        def setUp(self):
        task_vars = {}
        result = action.run(task_vars=task_vars)
        self.assertIn('ansible_facts', result)
        self.assertIn('_ansible_facts_cacheable', result)

    def test_run_without_facts(self):
        action = ActionModule(connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {}
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars=task_vars)

if __name__ == '__main__':
    unittest.main()