import unittest
from ansible.plugins.action.gather_facts import ActionModule


class TestGatherFacts(unittest.TestCase):
    def test_get_module_args(self):
        def setUp(self):
        task_vars = {}
        fact_module = 'example_module'
        mod_args = action._get_module_args(fact_module, task_vars)
        self.assertEqual(mod_args, {})

    def test_combine_task_result(self):
        def setUp(self):
        result = {'ansible_facts': {}, 'warnings': [], 'deprecations': []}
        task_result = {'ansible_facts': {'fact1': 'value1'}, 'warnings': ['warning1'], 'deprecations': ['deprecation1']}
        combined_result = action._combine_task_result(result, task_result)
        self.assertEqual(combined_result, {'ansible_facts': {'_ansible_facts_gathered': True, 'fact1': 'value1'}, 'warnings': ['warning1'], 'deprecations': ['deprecation1']})

    def test_run(self):
        action = ActionModule(connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = None
        task_vars = {}
        result = action.run(tmp, task_vars)
        self.assertEqual(result, {'ansible_facts': {'_ansible_facts_gathered': True}, '_ansible_verbose_override': True})

if __name__ == '__main__':
    unittest.main()