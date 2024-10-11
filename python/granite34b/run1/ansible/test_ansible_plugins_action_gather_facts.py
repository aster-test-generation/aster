import unittest
from ansible.plugins.action.gather_facts import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_get_module_args(self):
        fact_module = 'example_module'
        task_vars = {'example_var': 'example_value'}
        expected_args = {'example_var': 'example_value'}
        actual_args = self.action_module._get_module_args(fact_module, task_vars)
        self.assertEqual(actual_args, expected_args)

    def test_combine_task_result(self):
        result = {'ansible_facts': {'fact1': 'value1'}, 'warnings': ['warning1'], 'deprecations': ['deprecation1']}
        task_result = {'ansible_facts': {'fact2': 'value2'}, 'warnings': ['warning2'], 'deprecations': ['deprecation2']}
        expected_result = {'ansible_facts': {'fact1': 'value1', 'fact2': 'value2'}, 'warnings': ['warning1', 'warning2'], 'deprecations': ['deprecation1', 'deprecation2']}
        actual_result = self.action_module._combine_task_result(result, task_result)
        self.assertEqual(actual_result, expected_result)

    def test_run(self):
        task_vars = {'example_var': 'example_value'}
        expected_result = {'ansible_facts': {'_ansible_facts_gathered': True}, '_ansible_verbose_override': True}
        actual_result = self.action_module.run(task_vars=task_vars)
        self.assertEqual(actual_result, expected_result)

if __name__ == '__main__':
    unittest.main()