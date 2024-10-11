import unittest
from ansible.plugins.action import validate_argument_spec as ActionModule


class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        task_vars = {'arg1': 'value1', 'arg2': 'value2'}
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        action = ActionModule()
        args = action.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(args, {'arg1': 'value1', 'arg2': 2})

    def test_run(self):
        task_vars = {'arg1': 'value1', 'arg2': 'value2'}
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        action = ActionModule()
        result = action.run(tmp=None, task_vars=task_vars)
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], 'The arg spec validation passed')
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['argument_spec_data'], argument_spec)
        self.assertEqual(result['argument_errors'], [])

if __name__ == '__main__':
    unittest.main()