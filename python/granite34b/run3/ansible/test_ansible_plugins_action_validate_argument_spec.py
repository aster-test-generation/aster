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
        argument_spec = {
            'arg1': {'type': 'str'},
            'arg2': {'type': 'int'},
        }
        task_vars = {
            'arg1': 'value1',
            'arg2': 123,
        }
        args = action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(args, {'arg1': 'value1', 'arg2': 123})

    def test_run(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {
            'arg1': 'value1',
            'arg2': 123,
        }
        result = action_module.run(task_vars=task_vars)
        self.assertEqual(result, {'changed': False, 'msg': 'The arg spec validation passed'})

if __name__ == '__main__':
    unittest.main()