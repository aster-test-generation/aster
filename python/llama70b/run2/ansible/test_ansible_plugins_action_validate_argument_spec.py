import unittest
from ansible.module_utils._text import to_native


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = validate_argument_spec.ActionModule()
        self.assertIsInstance(instance, validate_argument_spec.ActionBase)

    def test_get_args_from_task_vars(self):
        instance = validate_argument_spec.ActionModule()
        argument_spec = {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}
        task_vars = {'arg1': 'value1', 'arg2': 2}
        result = instance.get_args_from_task_vars(argument_spec, task_vars)
        self.assertEqual(result, {'arg1': 'value1', 'arg2': 2})

    def test_run(self):
        instance = validate_argument_spec.ActionModule()
        task_vars = {'arg1': 'value1', 'arg2': 2}
        instance._task = mock.Mock(args={'argument_spec': {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}, 'provided_arguments': {'arg1': 'value1', 'arg2': 2}})
        result = instance.run(task_vars=task_vars)
        self.assertIn('validate_args_context', result)
        self.assertIn('argument_spec_data', result)
        self.assertIn('argument_errors', result)

    def test_run_with_invalid_argument_spec(self):
        instance = validate_argument_spec.ActionModule()
        task_vars = {'arg1': 'value1', 'arg2': 2}
        instance._task = mock.Mock(args={'argument_spec': 'invalid', 'provided_arguments': {'arg1': 'value1', 'arg2': 2}})
        with self.assertRaises(AnsibleError):
            instance.run(task_vars=task_vars)

    def test_run_with_invalid_provided_arguments(self):
        instance = validate_argument_spec.ActionModule()
        task_vars = {'arg1': 'value1', 'arg2': 2}
        instance._task = mock.Mock(args={'argument_spec': {'arg1': {'type': 'str'}, 'arg2': {'type': 'int'}}, 'provided_arguments': 'invalid'})
        with self.assertRaises(AnsibleError):
            instance.run(task_vars=task_vars)

    def test__templar_template(self):
        instance = validate_argument_spec.ActionModule()
        args = {'arg1': '{{ variable }}', 'arg2': 2}
        instance._templar = mock.Mock(template=lambda x: {'arg1': 'templated_value', 'arg2': 2})
        result = instance._templar.template(args)
        self.assertEqual(result, {'arg1': 'templated_value', 'arg2': 2})

    def test_str_method(self):
        instance = validate_argument_spec.ActionModule()
        result = instance.__str__()
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        instance = validate_argument_spec.ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ActionModule()')

if __name__ == '__main__':
    unittest.main()