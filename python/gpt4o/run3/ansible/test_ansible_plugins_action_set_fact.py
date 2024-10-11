import unittest
from ansible.plugins.action.set_fact import ActionModule
from ansible.errors import AnsibleActionFail
from ansible.module_utils.six import iteritems, string_types
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.plugins.action import ActionBase
from ansible.utils.vars import isidentifier
import ansible.constants as C


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_run_with_valid_args(self):
        self.action_module._task = type('obj', (object,), {'args': {'key1': 'value1', 'cacheable': False}})
        self.action_module._templar = type('obj', (object,), {'template': lambda x: x})
        result = self.action_module.run(task_vars={'async_val': some_value})
        self.assertIn('ansible_facts', result)
        self.assertIn('key1', result['ansible_facts'])
        self.assertEqual(result['ansible_facts']['key1'], 'value1')
        self.assertIn('_ansible_facts_cacheable', result)
        self.assertFalse(result['_ansible_facts_cacheable'])

    def test_run_with_invalid_identifier(self):
        self.action_module._task = type('obj', (object,), {'args': {'1invalid': 'value1'}})
        self.action_module._templar = type('obj', (object,), {'template': lambda x: x})
        with self.assertRaises(AnsibleActionFail) as context:
            self.action_module.run(task_vars={'async_val': 'some_value'})
        self.assertIn("The variable name '1invalid' is not valid", str(context.exception))

    def test_run_with_no_args(self):
        self.action_module._task = type('obj', (object,), {'args': {}})
        with self.assertRaises(AnsibleActionFail) as context:
            self.action_module.run(task_vars={'async_val': 'some_value'})
        self.assertIn('No key/value pairs provided', str(context.exception))

    def test_run_with_boolean_conversion(self):
        self.action_module._task = type('obj', (object,), {'args': {'key1': 'true', 'cacheable': False}})
        self.action_module._templar = type('obj', (object,), {'template': lambda x: x})
        result = self.action_module.run(task_vars={'async_val': 'some_value'})
        self.assertIn('ansible_facts', result)
        self.assertIn('key1', result['ansible_facts'])
        self.assertTrue(result['ansible_facts']['key1'])

    def test_run_with_cacheable_true(self):
        self.action_module._task = type('obj', (object,), {'args': {'key1': 'value1', 'cacheable': True}})
        self.action_module._templar = type('obj', (object,), {'template': lambda x: x})
        result = self.action_module.run(task_vars={'async_val': 'some_value'})
        self.assertIn('ansible_facts', result)
        self.assertIn('key1', result['ansible_facts'])
        self.assertEqual(result['ansible_facts']['key1'], 'value1')
        self.assertIn('_ansible_facts_cacheable', result)
        self.assertTrue(result['_ansible_facts_cacheable'])

if __name__ == '__main__':
    unittest.main()