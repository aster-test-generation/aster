import unittest
from ansible.plugins.action.gather_facts import ActionModule


class TestGatherFacts(unittest.TestCase):
    def setUp(self):
        self.action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_get_module_args(self):
        fact_module = 'setup'
        task_vars = {'var1': 'value1', 'var2': 'value2'}
        expected_args = {'var1': 'value1', 'var2': 'value2'}
        result = self.action._get_module_args(fact_module, task_vars)
        self.assertEqual(result, expected_args)

    def test_combine_task_result(self):
        result = {'key1': 'value1', 'key2': 'value2'}
        task_result = {'key3': 'value3', 'key4': 'value4'}
        expected_result = {'key1': 'value1', 'key2': 'value2', 'key3': 'value3', 'key4': 'value4'}
        result = self.action._combine_task_result(result, task_result)
        self.assertEqual(result, expected_result)

    def test_run(self):
        task_vars = {'var1': 'value1', 'var2': 'value2'}
        expected_result = {'ansible_facts': {'_ansible_facts_gathered': True}, '_ansible_verbose_override': True}
        result = self.action.run(task_vars=task_vars)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()