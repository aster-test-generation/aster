import unittest
from ansible.module_utils._text import to_native


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

    def test_TRANSFERS_FILES(self):
        instance = ActionModule()
        result = instance.TRANSFERS_FILES
        self.assertFalse(result)

    def test_VALID_ARGS(self):
        instance = ActionModule()
        result = instance._VALID_ARGS
        self.assertIsInstance(result, frozenset)

    def test_run_with_data(self):
        instance = ActionModule()
        task_vars = {'data': {'key': 'value'}}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('ansible_stats', result)

    def test_run_with_per_host(self):
        instance = ActionModule()
        task_vars = {'per_host': True}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('ansible_stats', result)

    def test_run_with_aggregate(self):
        instance = ActionModule()
        task_vars = {'aggregate': False}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('ansible_stats', result)

    def test_private_method__templar_template(self):
        instance = ActionModule()
        result = instance._ActionModule__templar.template('hello', convert_bare=False, fail_on_undefined=True)
        self.assertEqual(result, 'hello')

    def test_protected_method__task_args_get(self):
        instance = ActionModule()
        instance._task.args = {'data': {'key': 'value'}}
        result = instance._task.args.get('data')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()