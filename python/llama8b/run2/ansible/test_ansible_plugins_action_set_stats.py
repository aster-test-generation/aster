import unittest
from unittest.mock import patch
from ansible.module_utils.basic import *
from ansible.module_utils.six import iteritems
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.utils.vars import isidentifier
from ansible.plugins.action.set_stats import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_task_vars(self):
        action_module = ActionModule()
        task_vars = {'foo': 'bar'}
        result = action_module.run(tmp=None, task_vars=task_vars)
        self.assertEqual(result, {})

    def test_run_with_data(self):
        action_module = ActionModule()
        data = {'foo': 'bar'}
        result = action_module.run(tmp=None, task_vars=None, data=data)
        self.assertEqual(result, {})

    def test_run_with_per_host(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None, _task_args={'per_host': True})
        self.assertEqual(result, {})

    def test_run_with_aggregate(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None, _task_args={'aggregate': True})
        self.assertEqual(result, {})

    def test_run_with_invalid_data(self):
        action_module = ActionModule()
        data = 'not a dictionary'
        result = action_module.run(tmp=None, task_vars=None, data=data)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'data' option needs to be a dictionary/hash")

    def test_run_with_non_identifier_variable_name(self):
        action_module = ActionModule()
        data = {'foo-bar': 'bar'}
        result = action_module.run(tmp=None, task_vars=None, data=data)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], ("The variable name 'foo-bar' is not valid. Variables must start with a letter or underscore character, and contain only "
                                         "letters, numbers and underscores."))

    def test_run_with_non_boolean_per_host(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None, _task_args={'per_host': 'not a boolean'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'per_host' option needs to be a boolean")

    def test_run_with_non_boolean_aggregate(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None, _task_args={'aggregate': 'not a boolean'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'aggregate' option needs to be a boolean")

    @patch.object(ActionModule, '_templar')
    def test_run_with_templar(self, mock_templar):
        action_module = ActionModule()
        data = {'foo': 'bar'}
        result = action_module.run(tmp=None, task_vars=None, data=data)
        mock_templar.template.assert_called_once_with(data, convert_bare=False, fail_on_undefined=True)

    @patch.object(ActionModule, '_task')
    def test_run_with_task(self, mock_task):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None)
        mock_task.assert_called_once()

    @patch.object(ActionModule, '_task_args')
    def test_run_with_task_args(self, mock_task_args):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None)
        mock_task_args.assert_called_once()

    def test_str_method(self):
        action_module = ActionModule()
        result = str(action_module)
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        action_module = ActionModule()
        result = repr(action_module)
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        action_module1 = ActionModule()
        action_module2 = ActionModule()
        self.assertEqual(action_module1, action_module2)

if __name__ == '__main__':
    unittest.main()