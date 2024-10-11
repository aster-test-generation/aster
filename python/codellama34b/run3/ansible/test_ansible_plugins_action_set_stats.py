import unittest
from ansible.plugins.action.yaml import *



class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test_run_with_tmp(self):
        instance = ActionModule()
        result = instance.run(tmp=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars(self):
        instance = ActionModule()
        result = instance.run(task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_data(self):
        instance = ActionModule()
        result = instance.run(task_vars={'data': {}})
        self.assertEqual(result, None)

    def test_run_with_task_vars_per_host(self):
        instance = ActionModule()
        result = instance.run(task_vars={'per_host': None})
        self.assertEqual(result, None)

    def test_run_with_task_vars_aggregate(self):
        instance = ActionModule()
        result = instance.run(task_vars={'aggregate': None})
        self.assertEqual(result, None)

    def test_run_with_task_vars_data_per_host(self):
        instance = ActionModule()
        result = instance.run(task_vars={'data': {}, 'per_host': None})
        self.assertEqual(result, None)

    def test_run_with_task_vars_data_aggregate(self):
        instance = ActionModule()
        result = instance.run(task_vars={'data': {}, 'aggregate': None})
        self.assertEqual(result, None)

    def test_run_with_task_vars_per_host_aggregate(self):
        instance = ActionModule()
        result = instance.run(task_vars={'per_host': None, 'aggregate': None})
        self.assertEqual(result, None)

    def test_run_with_task_vars_data_per_host_aggregate(self):
        instance = ActionModule()
        result = instance.run(task_vars={'data': {}, 'per_host': None, 'aggregate': None})
        self.assertEqual(result, None)

    def test__templar_template(self):
        instance = ActionModule()
        result = instance._templar.template()
        self.assertEqual(result, None)

    def test__templar_template_with_convert_bare(self):
        instance = ActionModule()
        result = instance._templar.template(convert_bare=False)
        self.assertEqual(result, None)

    def test__templar_template_with_fail_on_undefined(self):
        instance = ActionModule()
        result = instance._templar.template(fail_on_undefined=True)
        self.assertEqual(result, None)

    def test__templar_template_with_convert_bare_and_fail_on_undefined(self):
        instance = ActionModule()
        result = instance._templar.template(convert_bare=False, fail_on_undefined=True)
        self.assertEqual(result, None)

    def test__task_args_get(self):
        instance = ActionModule()
        result = instance._task.args.get()
        self.assertEqual(result, None)

    def test__task_args_get_with_data(self):
        instance = ActionModule()
        result = instance._task.args.get('data')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()