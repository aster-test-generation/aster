import unittest
from ansible.plugins.action.yaml import *


class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        instance = ActionModule()
        argument_spec_data = {}
        task_vars = {}
        result = instance.get_args_from_task_vars(argument_spec_data, task_vars)
        self.assertEqual(result, {})

    def test_run(self):
        instance = ActionModule()
        tmp = None
        task_vars = {}
        result = instance.run(tmp, task_vars)
        self.assertEqual(result['validate_args_context'], {})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'Validation of arguments failed:\n')
        self.assertEqual(result['argument_spec_data'], {})
        self.assertEqual(result['argument_errors'], [])


class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate(self):
        instance = ArgumentSpecValidator()
        argument_spec_data = {}
        provided_arguments = {}
        result = instance.validate(combine_vars(args_from_vars, provided_arguments))
        self.assertEqual(result.error_messages, [])


if __name__ == '__main__':
    unittest.main()