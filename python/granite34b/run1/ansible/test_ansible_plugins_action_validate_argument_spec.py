import unittest
from ansible.errors import AnsibleError
from ansible.plugins.action import ActionBase
from ansible.module_utils.six import iteritems, string_types
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator
from ansible.module_utils.errors import AnsibleValidationErrorMultiple
from ansible.utils.vars import combine_vars

class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        argument_spec = {
            'arg1': {'type': 'str'},
            'arg2': {'type': 'int'},
        }
        task_vars = {
            'arg1': 'value1',
            'arg2': 123,
        }
        expected_result = {
            'arg1': 'value1',
            'arg2': 123,
        }
        from ansible.runner.action_plugin import ActionModule
        result = action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(result, expected_result)
    def test_run(self):
        task_vars = {
            'arg1': 'value1',
            'arg2': 123,
        }
        argument_spec = {
            'arg1': {'type': 'str'},
            'arg2': {'type': 'int'},
        }
        provided_arguments = {
            'arg1': 'value1',
            'arg2': 123,
        }
        expected_result = {
            'changed': False,
            'msg': 'The arg spec validation passed',
        }
        from ansible.runner.action_plugin import ActionModule
        result = action_module.run(task_vars=task_vars, argument_spec=argument_spec, provided_arguments=provided_arguments)
        self.assertEqual(result, expected_result)
    def test_run_with_errors(self):
        task_vars = {
            'arg1': 'value1',
            'arg2': 123,
        }
        argument_spec = {
            'arg1': {'type': 'int'},
            'arg2': {'type': 'str'},
        }
        provided_arguments = {
            'arg1': 'value1',
            'arg2': 123,
        }
        expected_result = {
            'failed': True,
            'msg': 'Validation of arguments failed:\narg1: expected type <class \'int\'> but got <class \'str\'>\narg2: expected type <class \'str\'> but got <class \'int\'>',
            'argument_spec_data': argument_spec,
            'argument_errors': ['arg1: expected type <class \'int\'> but got <class \'str\'>', 'arg2: expected type <class \'str\'> but got <class \'int\'>'],
        }
        from ansible.runner.action_plugin import ActionModule
        result = action_module.run(task_vars=task_vars, argument_spec=argument_spec, provided_arguments=provided_arguments)
        self.assertEqual(result, expected_result)
if __name__ == '__main__':
    unittest.main()