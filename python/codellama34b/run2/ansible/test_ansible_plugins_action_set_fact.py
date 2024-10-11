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

    def test_run_with_task_vars_as_dict(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict())
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_as_dict(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict())
        self.assertEqual(result, None)

    def test_run_with_task_vars_as_dict_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(cacheable=True))
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_as_dict_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(cacheable=True))
        self.assertEqual(result, None)

    def test_run_with_task_vars_as_dict_and_cacheable_as_false(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(cacheable=False))
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_as_dict_and_cacheable_as_false(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(cacheable=False))
        self.assertEqual(result, None)

    def test_run_with_task_vars_as_dict_and_cacheable_as_string(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(cacheable='True'))
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_as_dict_and_cacheable_as_string(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(cacheable='True'))
        self.assertEqual(result, None)

    def test_run_with_task_vars_as_dict_and_cacheable_as_string_and_false(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(cacheable='False'))
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_as_dict_and_cacheable_as_string_and_false(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=dict(cacheable='False'))
        self.assertEqual(result, None)

    def test_run_with_task_vars_as_dict_and_cacheable_as_string_and_yes(self):
        instance = ActionModule()
        result = instance.run(task_vars=dict(cacheable='Yes'))
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()