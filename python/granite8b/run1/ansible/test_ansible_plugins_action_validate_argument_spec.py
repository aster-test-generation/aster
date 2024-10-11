import unittest
from ansible.plugins.action import validate_argument_spec as ActionModule


class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        task_vars = {'arg1': 'value1', 'arg2': 'value2'}
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        action_module = ActionModule()
        args = action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(args, {'arg1': 'value1', 'arg2': 2})

    def test_run(self):
        task_vars = {'arg1': 'value1', 'arg2': 'value2'}
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        provided_arguments = {'arg1': 'value1', 'arg2': '2'}
        action_module = ActionModule()
        result = action_module.run(task_vars=task_vars, argument_spec=argument_spec, provided_arguments=provided_arguments)
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['msg'], 'The arg spec validation passed')

if __name__ == '__main__':
    unittest.main()