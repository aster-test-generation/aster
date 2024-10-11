import unittest
from ansible.module_utils.basic import *
from ansible.module_utils.six import iteritems, string_types
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator
from ansible.module_utils.errors import AnsibleValidationErrorMultiple
from ansible.module_utils.common import combine_vars
from ansible.plugins.action.validate_argument_spec import ActionModule


class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        action_module = ActionModule()
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        task_vars = {'arg1': 'value1', 'arg2': 2}
        result = action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(result, {'arg1': 'value1', 'arg2': 2})

    def test_run(self):
        action_module = ActionModule()
        task_vars = {'arg1': 'value1', 'arg2': 2}
        result = action_module.run(task_vars=task_vars)
        self.assertEqual(result, {'changed': False, 'msg': 'The arg spec validation passed'})

    def test_run_with_invalid_argument_spec(self):
        action_module = ActionModule()
        task_vars = {'arg1': 'value1', 'arg2': 2}
        result = action_module.run(task_vars=task_vars, argument_spec={'arg1': {'type': 'str'}})
        self.assertEqual(result, {'failed': True, 'msg': 'Validation of arguments failed:\nIncorrect type for provided_arguments, expected dict and got <class \'str\'>'})

    def test_run_with_invalid_provided_arguments(self):
        action_module = ActionModule()
        task_vars = {'arg1': 'value1', 'arg2': 2}
        result = action_module.run(task_vars=task_vars, provided_arguments='invalid')
        self.assertEqual(result, {'failed': True, 'msg': 'Validation of arguments failed:\nIncorrect type for provided_arguments, expected dict and got <class \'str\'>'})

    def test_run_with_invalid_task_vars(self):
        action_module = ActionModule()
        task_vars = 'invalid'
        result = action_module.run(task_vars=task_vars)
        self.assertEqual(result, {'failed': True, 'msg': 'Incorrect type for task_vars, expected dict and got <class \'str\'>'})

    def test_get_args_from_task_vars_with_templated_variables(self):
        action_module = ActionModule()
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        task_vars = {'arg1': 'value1', 'arg2': 2, 'templated_var': 'template_var'}
        result = action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(result, {'arg1': 'value1', 'arg2': 2})

    def test_run_with_validate_args_context(self):
        action_module = ActionModule()
        task_vars = {'arg1': 'value1', 'arg2': 2}
        result = action_module.run(task_vars=task_vars, validate_args_context={'key': 'value'})
        self.assertEqual(result, {'changed': False, 'msg': 'The arg spec validation passed', 'validate_args_context': {'key': 'value'}})

if __name__ == '__main__':
    unittest.main()