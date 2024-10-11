import unittest
from ansible.module_utils.basic import *
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.module_utils.six import iteritems
from ansible.module_utils.vars import isidentifier
from ansible.constants import C
from ansible.errors import AnsibleActionFail
from ansible.plugins.action.set_fact import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(task_vars=dict())
        self.assertEqual(result, {})

    def test_run_with_args(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), args={'key1': 'value1', 'key2': 'value2'})
        self.assertEqual(result, {'ansible_facts': {'key1': 'value1', 'key2': 'value2'}, '_ansible_facts_cacheable': False})

    def test_run_with_cacheable(self):
        action = ActionModule()
        result = action.run(task_vars=dict(), args={'key1': 'value1', 'key2': 'value2'}, cacheable=True)
        self.assertEqual(result, {'ansible_facts': {'key1': 'value1', 'key2': 'value2'}, '_ansible_facts_cacheable': True})

    def test_run_with_invalid_key(self):
        action = ActionModule()
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars=dict(), args={'!@#': 'value1'})

    def test_run_with_no_args(self):
        action = ActionModule()
        with self.assertRaises(AnsibleActionFail):
            action.run(task_vars=dict())

    def test_str_method(self):
        action = ActionModule()
        result = str(action)
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        action = ActionModule()
        result = repr(action)
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        action1 = ActionModule()
        action2 = ActionModule()
        self.assertEqual(action1, action2)

    def test_init_method(self):
        action = ActionModule()
        self.assertEqual(action.TRANSFERS_FILES, False)

if __name__ == '__main__':
    unittest.main()