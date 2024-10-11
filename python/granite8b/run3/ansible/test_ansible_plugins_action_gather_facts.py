import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_get_module_args(self):
        fact_module = 'test_module'
        task_vars = {'var1': 'value1', 'var2': 'value2'}
        action = ActionModule(None, None, None)
        mod_args = action._get_module_args(fact_module, task_vars)
        self.assertEqual(mod_args, {'var1': 'value1', 'var2': 'value2'})

    def test_combine_task_result(self):
        result = {'ansible_facts': {'fact1': 'value1'}}
        task_result = {'ansible_facts': {'fact2': 'value2'}, 'warnings': ['warning1'], 'deprecations': ['deprecation1']}
        action = ActionModule(None, None, None)
        combined_result = action._combine_task_result(result, task_result)
        self.assertEqual(combined_result, {'ansible_facts': {'fact1': 'value1', 'fact2': 'value2'}, 'warnings': ['warning1'], 'deprecations': ['deprecation1']})

    def test_run(self):
        action = ActionModule(None, None, None)
        result = action.run()
        self.assertEqual(result, {'ansible_facts': {'_ansible_facts_gathered': True}})

if __name__ == '__main__':
    unittest.main()