import unittest
from unittest.mock import patch
from ansible.module_utils.basic import *
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.module_utils.six import iteritems
from ansible.module_utils.vars import isidentifier
from ansible.plugins.action.set_stats import ActionModule


class TestActionModule(unittest.TestCase):
    @patch('ansible.module_utils.parsing.convert_bool.boolean')
    @patch('ansible.module_utils.vars.isidentifier')
    @patch('ansible.module_utils.six.iteritems')
    @patch('ansible.module_utils.template.template')
    def test_run(self, mock_template, mock_iteritems, mock_isidentifier, mock_boolean):
        action_module = ActionModule()
        task_vars = {'data': {'a': 1, 'b': 2}, 'per_host': True, 'aggregate': False}
        result = action_module.run(task_vars=task_vars)
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['ansible_stats'], {'data': {'a': 1, 'b': 2}, 'per_host': True, 'aggregate': False})

    @patch('ansible.module_utils.parsing.convert_bool.boolean')
    @patch('ansible.module_utils.vars.isidentifier')
    @patch('ansible.module_utils.six.iteritems')
    @patch('ansible.module_utils.template.template')
    def test_run_invalid_data(self, mock_template, mock_iteritems, mock_isidentifier, mock_boolean):
        action_module = ActionModule()
        task_vars = {'data': 'not a dictionary', 'per_host': True, 'aggregate': False}
        result = action_module.run(task_vars=task_vars)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "The 'data' option needs to be a dictionary/hash")

    @patch('ansible.module_utils.parsing.convert_bool.boolean')
    @patch('ansible.module_utils.vars.isidentifier')
    @patch('ansible.module_utils.six.iteritems')
    @patch('ansible.module_utils.template.template')
    def test_run_invalid_variable_name(self, mock_template, mock_iteritems, mock_isidentifier, mock_boolean):
        action_module = ActionModule()
        task_vars = {'data': {'a': 1, 'b': 2}, 'per_host': True, 'aggregate': False}
        result = action_module.run(task_vars=task_vars)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], ("The variable name 'a' is not valid. Variables must start with a letter or underscore character, and contain only "
                                         "letters, numbers and underscores."))

    def test_init(self):
        action_module = ActionModule()
        self.assertEqual(action_module.TRANSFERS_FILES, False)
        self.assertEqual(action_module._VALID_ARGS, frozenset(('aggregate', 'data', 'per_host')))

    def test_str(self):
        action_module = ActionModule()
        self.assertEqual(str(action_module), 'ActionModule')

    def test_repr(self):
        action_module = ActionModule()
        self.assertEqual(repr(action_module), 'ActionModule()')

    def test_eq(self):
        action_module1 = ActionModule()
        action_module2 = ActionModule()
        self.assertEqual(action_module1, action_module2)

if __name__ == '__main__':
    unittest.main()