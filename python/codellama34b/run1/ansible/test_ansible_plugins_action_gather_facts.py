import unittest
from ansible.plugins.action.gather_facts import *


class TestActionModule(unittest.TestCase):
    def test_get_module_args(self):
        instance = ActionModule()
        result = instance._get_module_args(fact_module, task_vars)
        self.assertEqual(result, mod_args)

    def test_combine_task_result(self):
        instance = ActionModule()
        result = instance._combine_task_result(result, task_result)
        self.assertEqual(result, filtered_res)

    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp, task_vars)
        self.assertEqual(result, result)

if __name__ == '__main__':
    unittest.main()