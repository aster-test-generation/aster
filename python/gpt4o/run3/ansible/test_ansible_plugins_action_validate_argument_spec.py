import unittest
from ansible.errors import AnsibleError
from ansible.plugins.action.validate_argument_spec import ActionModule
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator
from ansible.utils.vars import combine_vars


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_get_args_from_task_vars(self):
        argument_spec = {'arg1': {}, 'arg2': {}}
        task_vars = {'arg1': 'value1', 'arg2': 'value2'}
        self.action_module._templar = type('templar', (object,), {'template': lambda self, x: x})()
        result = self.action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(result, {'arg1': 'value1', 'arg2': 'value2'})

    def test_run_with_missing_argument_spec(self):
        self.action_module._task = type('task', (object,), {'args': {}})()
        with self.assertRaises(AnsibleError) as context:
            self.action_module.async_run()
        self.assertEqual(str(context.exception), '"argument_spec" arg is required in args: {}')

    def test_run_with_incorrect_argument_spec_type(self):
        self.action_module._task = type('task', (object,), {'args': {'argument_spec': 'not_a_dict'}})()
        with self.assertRaises(AnsibleError) as context:
            self.action_module.async_run()
        self.assertEqual(str(context.exception), 'Incorrect type for argument_spec, expected dict and got <class \'str\'>')

    def test_run_with_incorrect_provided_arguments_type(self):
        self.action_module._task = type('task', (object,), {'args': {'argument_spec': {}, 'provided_arguments': 'not_a_dict'}})()
        with self.assertRaises(AnsibleError) as context:
            self.action_module.async_run()
        self.assertEqual(str(context.exception), 'Incorrect type for provided_arguments, expected dict and got <class \'str\'>')

    def test_run_with_validation_errors(self):
        self.action_module._task = type('task', (object,), {'args': {'argument_spec': {}, 'provided_arguments': {}}})()
        self.action_module.get_args_from_task_vars = lambda x, y: {}
        ArgumentSpecValidator.validate = lambda self, x: type('validation_result', (object,), {'error_messages': ['error1', 'error2']})()
        result = self.action_module.async_val()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Validation of arguments failed:\nerror1\nerror2')
        self.assertEqual(result['argument_errors'], ['error1', 'error2'])

    def test_run_with_successful_validation(self):
        self.action_module._task = type('task', (object,), {'args': {'argument_spec': {}, 'provided_arguments': {}}})()
        self.action_module.get_args_from_task_vars = lambda x, y: {}
        ArgumentSpecValidator.validate = lambda self, x: type('validation_result', (object,), {'error_messages': []})()
        result = self.action_module.async_val()
        self.assertFalse(result['failed'])
        self.assertEqual(result['msg'], 'The arg spec validation passed')

if __name__ == '__main__':
    unittest.main()