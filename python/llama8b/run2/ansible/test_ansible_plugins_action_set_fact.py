import unittest
from unittest.mock import patch
from ansible.module_utils.basic import AnsibleModul


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertIn('ansible_facts', result)
        self.assertIn('_ansible_facts_cacheable', result)

    def test_run_with_args(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), args={'key1': 'value1', 'key2': 'value2'})
        self.assertIn('ansible_facts', result)
        self.assertIn('_ansible_facts_cacheable', result)
        self.assertIn('key1', result['ansible_facts'])
        self.assertIn('key2', result['ansible_facts'])

    def test_run_with_non_identifier_key(self):
        action = ActionModule()
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars=dict(), args={'!key': 'value'})

    def test_run_with_non_boolean_value(self):
        action = ActionModule()
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars=dict(), args={'key': 'not a boolean value'})

    def test_run_without_args(self):
        action = ActionModule()
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars=dict())

    @patch.object(ActionModule, '_templar')
    def test_template_key(self, templar):
        action = ActionModule()
        templar.template.return_value = 'templated_key'
        result = action.run(task_vars=dict(), args={'key': 'value'})
        self.assertIn('ansible_facts', result)
        self.assertIn('_ansible_facts_cacheable', result)
        self.assertIn('templated_key', result['ansible_facts'])

    def test_cacheable(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), args={'key': 'value'}, cacheable=True)
        self.assertTrue(result['_ansible_facts_cacheable'])

    def test_non_cacheable(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), args={'key': 'value'}, cacheable=False)
        self.assertFalse(result['_ansible_facts_cacheable'])

if __name__ == '__main__':
    unittest.main()