import unittest
from ansible.plugins.action.gather_facts import *


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionBase)

    def test_get_module_args(self):
        instance = ActionModule()
        fact_module = 'fact_module'
        task_vars = {}
        result = instance._get_module_args(fact_module, task_vars)
        self.assertIsInstance(result, dict)

    def test_combine_task_result(self):
        instance = ActionModule()
        result = {}
        task_result = {}
        result = instance._combine_task_result(result, task_result)
        self.assertIsInstance(result, dict)

    def test_run(self):
        instance = ActionModule()
        tmp = None
        task_vars = {}
        result = instance.run(tmp, task_vars)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()