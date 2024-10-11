import unittest
from ansible.plugins.action import validate_argument_spec as ActionModule


class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        argument_spec = {
            'arg1': {'type': 'str'},
            'arg2': {'type': 'int'},
        }
        task_vars = {
            'arg1': 'value1',
            'arg2': 10,
        }
        action = ActionModule()
        result = action.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(result, {'arg1': 'value1', 'arg2': 10})

    def test_validate_args_context(self):
        action = ActionModule()
        result = action.run(task_vars={'validate_args_context': {'key': 'value'}})
        self.assertEqual(result['validate_args_context'], {'key': 'value'})

    def test_validate_argument_spec(self):
        action = ActionModule()
        result = action.run(task_vars={'argument_spec': {'arg1': {'type': 'str'}}, 'provided_arguments': {'arg1': 'value1'}})
        self.assertEqual(result['msg'], 'The arg spec validation passed')
        result = action.run(task_vars={'argument_spec': {'arg1': {'type': 'int'}}, 'provided_arguments': {'arg1': 'value1'}})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'Validation of arguments failed:\narg1: value1 is of type <class \'str\'> but is expected to be of type <class \'int\'>')

if __name__ == '__main__':
    unittest.main()