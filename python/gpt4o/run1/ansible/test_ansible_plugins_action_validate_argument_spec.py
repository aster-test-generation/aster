import unittest
from ansible.errors import AnsibleError
from ansible.plugins.action.validate_argument_spec import ActionModule
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator
from ansible.utils.vars import combine_vars


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_get_args_from_task_vars(self):
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        task_vars = {'arg1': 'value1', 'arg2': 2}
        self.action_module._templar = unittest.mock.MagicMock()
        self.action_module._templar.template = unittest.mock.Mock(return_value=task_vars)
        result = self.action_module.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(result, task_vars)

    def test_run_no_argument_spec(self):
        self.action_module._task = unittest.mock.Mock()
        self.action_module._task.args = {}
        with self.assertRaises(AnsibleError) as context:
            self.action_module.run()
        self.assertEqual(str(context.exception), '"argument_spec" arg is required in args: {}')

    def test_run_incorrect_argument_spec_type(self):
        self.action_module._task = unittest.mock.MagicMock()
        self.action_module._task.args = {'argument_spec': 'not_a_dict', 'provided_arguments': {}}
        with self.assertRaises(AnsibleError) as context:
            self.action_module.run()
        self.assertEqual(str(context.exception), 'Incorrect type for argument_spec, expected dict and got <class \'str\'>')

    def test_run_incorrect_provided_arguments_type(self):
        self.action_module._task = unittest.mock.MagicMock()
        self.action_module._task.args = {'argument_spec': {}, 'provided_arguments': 'not_a_dict'}
        with self.assertRaises(AnsibleError) as context:
            self.action_module.run()
        self.assertEqual(str(context.exception), 'Incorrect type for provided_arguments, expected dict and got <class \'str\'>')

    def test_run_validation_failed(self):
        self.action_module._task = unittest.mock.MagicMock()
        self.action_module._task.args = {'argument_spec': {}, 'provided_arguments': {}}
        self.action_module.get_args_from_task_vars = unittest.mock.Mock(return_value={})
        validator = unittest.mock.Mock()
        validator.validate = unittest.mock.Mock(return_value=unittest.mock.Mock(error_messages=['error1', 'error2']))
        ArgumentSpecValidator = unittest.mock.Mock(return_value=validator)
        result = self.action_module.run()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Validation of arguments failed:\nerror1\nerror2')
        self.assertEqual(result['argument_errors'], ['error1', 'error2'])

    def test_run_validation_passed(self):
        self.action_module._task = unittest.mock.MagicMock()
        self.action_module._task.args = {'argument_spec': {}, 'provided_arguments': {}}
        self.action_module.get_args_from_task_vars = unittest.mock.Mock(return_value={})
        validator = unittest.mock.Mock()
        validator.validate = unittest.mock.Mock(return_value=unittest.mock.Mock(error_messages=[]))
        ArgumentSpecValidator = unittest.mock.Mock(return_value=validator)
        result = self.action_module.run()
        self.assertFalse(result['failed'])
        self.assertEqual(result['msg'], 'The arg spec validation passed')

if __name__ == '__main__':
    unittest.main()