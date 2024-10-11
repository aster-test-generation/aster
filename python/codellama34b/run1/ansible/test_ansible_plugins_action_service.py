import unittest
from ansible.plugins.action import service



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

    def test_run_with_module(self):
        instance = ActionModule()
        result = instance.run(module=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_module(self):
        instance = ActionModule()
        result = instance.run(tmp=None, module=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_module(self):
        instance = ActionModule()
        result = instance.run(task_vars=None, module=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_and_module(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module=None)
        self.assertEqual(result, None)

    def test_run_with_module_args(self):
        instance = ActionModule()
        result = instance.run(module_args=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_module_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, module_args=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_module_args(self):
        instance = ActionModule()
        result = instance.run(task_vars=None, module_args=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_and_module_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module_args=None)
        self.assertEqual(result, None)

    def test_run_with_module_and_module_args(self):
        instance = ActionModule()
        result = instance.run(module=None, module_args=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_module_and_module_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, module=None, module_args=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_module_and_module_args(self):
        instance = ActionModule()
        result = instance.run(task_vars=None, module=None, module_args=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_and_module_and_module_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module=None, module_args=None)
        self.assertEqual(result, None)

    def test_run_with_context(self):
        instance = ActionModule()
        result = instance.run(context=None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()