import unittest
from ansible.plugins.action.validate_argument_spec import ActionModule
from ansible.errors import AnsibleError
from ansible.module_utils.six import iteritems, string_types
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator
from ansible.module_utils.errors import AnsibleValidationErrorMultiple
from ansible.utils.vars import combine_vars


class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        task_vars = {'arg1': 'value1', 'arg2': 123}
        args = action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(args, {'arg1': 'value1', 'arg2': 123})

    def test_run_with_no_argument_spec(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {}
        with self.assertRaises(AnsibleError) as context:
            action_module.run(None, task_vars)
        self.assertEqual(str(context.exception), '"argument_spec" arg is required in args: {}')

    def test_run_with_invalid_argument_spec(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {}
        argument_spec = 'invalid'
        provided_arguments = {'arg1': 'value1', 'arg2': 123}
        with self.assertRaises(AnsibleError) as context:
            action_module.run(None, task_vars, argument_spec, provided_arguments)
        self.assertEqual(str(context.exception), 'Incorrect type for argument_spec, expected dict and got <class \'str\'>')

    def test_run_with_invalid_provided_arguments(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {}
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        provided_arguments = 'invalid'
        with self.assertRaises(AnsibleError) as context:
            action_module.run(None, task_vars, argument_spec, provided_arguments)
        self.assertEqual(str(context.exception), 'Incorrect type for provided_arguments, expected dict and got <class \'str\'>')

    def test_run_with_valid_arguments(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {}
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        provided_arguments = {'arg1': 'value1', 'arg2': 123}
        result = action_module.run(None, task_vars, argument_spec, provided_arguments)
        self.assertEqual(result, {'changed': False, 'msg': 'The arg spec validation passed'})

    def test_run_with_invalid_arguments(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {}
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        provided_arguments = {'arg1': 123, 'arg2': 'value2'}
        result = action_module.run(None, task_vars, argument_spec, provided_arguments)
        self.assertEqual(result, {'argument_errors': ['arg1 must be a string', 'arg2 must be an integer'], 'argument_spec_data': {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}, 'changed': False, 'failed': True, 'msg': 'Validation of arguments failed:\narg1 must be a string\narg2 must be an integer'})

if __name__ == '__main__':
    unittest.main()