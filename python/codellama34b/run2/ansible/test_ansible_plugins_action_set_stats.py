import unittest
from ansible.plugins.action.yaml import ActionModule



class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test_run_with_tmp_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict())
        self.assertEqual(result, None)

    def test_run_with_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict()))
        self.assertEqual(result, None)

    def test_run_with_data(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(data=dict())))
        self.assertEqual(result, None)

    def test_run_with_per_host(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(per_host=None)))
        self.assertEqual(result, None)

    def test_run_with_aggregate(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(aggregate=None)))
        self.assertEqual(result, None)

    def test_run_with_data_and_per_host_and_aggregate(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(data=dict(), per_host=None, aggregate=None)))
        self.assertEqual(result, None)

    def test_run_with_data_and_per_host_and_aggregate_and_template(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(data=dict(), per_host=None, aggregate=None, template=None)))
        self.assertEqual(result, None)

    def test_run_with_data_and_per_host_and_aggregate_and_template_and_convert_bare(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(data=dict(), per_host=None, aggregate=None, template=None, convert_bare=None)))
        self.assertEqual(result, None)

    def test_run_with_data_and_per_host_and_aggregate_and_template_and_convert_bare_and_fail_on_undefined(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(data=dict(), per_host=None, aggregate=None, template=None, convert_bare=None, fail_on_undefined=None)))
        self.assertEqual(result, None)

    def test_run_with_data_and_per_host_and_aggregate_and_template_and_convert_bare_and_fail_on_undefined_and_changed(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(args=dict(data=dict(), per_host=None, aggregate=None, template=None, convert_bare=None, fail_on_undefined=None, changed=None)))
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()