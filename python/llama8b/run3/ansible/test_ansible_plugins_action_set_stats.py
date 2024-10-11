import unittest
from unittest.mock import patch
from ansible.module_utils.basic import *
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.module_utils.six import iteritems
from ansible.module_utils.vars import isidentifier
from ansible.plugins.action.set_stats import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule()

    def test_run(self):
        result = self.action_module.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_task_vars(self):
        task_vars = {'foo': 'bar'}
        result = self.action_module.run(tmp=None, task_vars=task_vars)
        self.assertEqual(result, {})

    def test_run_with_data(self):
        data = {'foo': 'bar'}
        result = self.action_module.run(tmp=None, task_vars=None, data=data)
        self.assertEqual(result, {})

    def test_run_with_per_host(self):
        result = self.action_module.run(tmp=None, task_vars=None, _task_args={'per_host': True})
        self.assertEqual(result, {})

    def test_run_with_aggregate(self):
        result = self.action_module.run(tmp=None, task_vars=None, _task_args={'aggregate': True})
        self.assertEqual(result, {})

    def test_run_with_invalid_data(self):
        data = 'not a dictionary'
        result = self.action_module.run(tmp=None, task_vars=None, data=data)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'data' option needs to be a dictionary/hash")

    def test_run_with_invalid_variable_name(self):
        data = {'foo': 'bar', ' invalid_name': 'baz'}
        result = self.action_module.run(tmp=None, task_vars=None, data=data)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], ("The variable name ' invalid_name' is not valid. Variables must start with a letter or underscore character, and contain only "
                                         "letters, numbers and underscores."))

    def test_run_with_template_failure(self):
        data = {'foo': 'bar', 'baz': '{{ unknown_variable }}'}
        result = self.action_module.run(tmp=None, task_vars=None, data=data)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'data' option needs to be a dictionary/hash")

    def test_get_valid_args(self):
        self.assertEqual(self.action_module._VALID_ARGS, frozenset(('aggregate', 'data', 'per_host')))

    def test_get_transfers_files(self):
        self.assertFalse(self.action_module.TRANSFERS_FILES)

    def test_str_method(self):
        self.assertEqual(str(self.action_module), 'ActionModule')

    def test_repr_method(self):
        self.assertEqual(repr(self.action_module), 'ActionModule()')

    def test_eq_method(self):
        other = ActionModule()
        self.assertEqual(self.action_module, other)

if __name__ == '__main__':
    unittest.main()