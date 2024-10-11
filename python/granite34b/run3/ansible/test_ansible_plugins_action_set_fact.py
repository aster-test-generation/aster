import unittest
from ansible.plugins.action.set_fact import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_with_facts(self):
        action = ActionModule(connection=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={}, tmp=None)
        self.assertIn('ansible_facts', result)
        self.assertIn('_ansible_facts_cacheable', result)

    def test_run_without_facts(self):
        def setUp(self):
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars={}, tmp=None)

    def test_run_with_invalid_facts(self):
        action = ActionModule(connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars={'k': 1}, tmp=None)

if __name__ == '__main__':
    unittest.main()