import unittest
from ansible.plugins.action.set_fact import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        self.task_vars = {}

    def test_run_with_facts(self):
        self.task_vars['ansible_facts'] = {'key': 'value'}
        result = self.action.run(task_vars=self.task_vars)
        self.assertEqual(result['ansible_facts'], {'key': 'value'})

    def test_run_without_facts(self):
        with self.assertRaises(AnsibleActionFail) as context:
            self.action.run(task_vars=self.task_vars)
        self.assertTrue('No key/value pairs provided' in str(context.exception))

    def test_run_with_cacheable(self):
        self.task_vars['ansible_facts'] = {'key': 'value'}
        result = self.action.run(task_vars=self.task_vars, cacheable=True)
        self.assertTrue(result['_ansible_facts_cacheable'])

    def test_run_with_non_identifier_key(self):
        self.task_vars['ansible_facts'] = {'key$': 'value'}
        with self.assertRaises(AnsibleActionFail) as context:
            self.action.run(task_vars=self.task_vars)
        self.assertTrue("The variable name 'key$' is not valid" in str(context.exception))

    def test_run_with_invalid_value(self):
        self.task_vars['ansible_facts'] = {'key': object()}
        with self.assertRaises(AnsibleActionFail) as context:
            self.action.run(task_vars=self.task_vars)
        self.assertTrue('is not JSON serializable' in str(context.exception))

if __name__ == '__main__':
    unittest.main()