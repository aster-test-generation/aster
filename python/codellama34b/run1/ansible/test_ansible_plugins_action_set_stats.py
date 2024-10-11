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

    def test_run_with_task_vars_not_none(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict())
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_not_none(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict())
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_data(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(data=dict()))
        self.assertEqual(result, None)

    def test_run_with_tmp_task_vars_and_data(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(data=dict()))
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_data_and_per_host(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(data=dict(), per_host=None))
        self.assertEqual(result, None)

    def test_run_with_tmp_task_vars_and_data_and_per_host(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(data=dict(), per_host=None))
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_data_and_per_host_and_aggregate(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(data=dict(), per_host=None, aggregate=None))
        self.assertEqual(result, None)

    def test_run_with_tmp_task_vars_and_data_and_per_host_and_aggregate(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(data=dict(), per_host=None, aggregate=None))
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_data_and_per_host_and_aggregate_and_k(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(data=dict(k=None), per_host=None, aggregate=None))
        self.assertEqual(result, None)

    def test_run_with_tmp_task_vars_and_data_and_per_host_and_aggregate_and_k(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(data=dict(k=None), per_host=None, aggregate=None))
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_data_and_per_host_and_aggregate_and_k_and_v(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(data=dict(k=None), per_host=None, aggregate=None))
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()