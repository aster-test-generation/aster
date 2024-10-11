import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.gather_facts import ActionModule
from ansible import constants as C


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.task = MagicMock()
        self.task.args = {}
        self.task.collections = []
        self.task.module_defaults = {}
        self.task._parent = MagicMock()
        self.task._parent._play = MagicMock()
        self.task._parent._play._action_groups = []
        self.connection = MagicMock()
        self.connection._load_name = 'network_cli'
        self.connection._shell = MagicMock()
        self.connection._shell.tmpdir = '/tmp'
        self.display = MagicMock()
        self.shared_loader_obj = MagicMock()
        self.shared_loader_obj.module_loader.find_plugin_with_context.return_value = MagicMock(resolved_fqcn='ansible.builtin.setup')
        self.module = ActionModule(task=self.task, connection=self.connection, play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=self.shared_loader_obj)

    def test_get_module_args(self):
        fact_module = 'ansible.builtin.setup'
        task_vars = {}
        self.task.args = {'gather_subset': 'all', 'gather_timeout': 10, 'filter': 'some_filter'}
        result = self.module._get_module_args(fact_module, task_vars)
        self.assertIsInstance(result, dict)

    def test_combine_task_result(self):
        result = {'ansible_facts': {}, 'warnings': [], 'deprecations': []}
        task_result = {'ansible_facts': {'fact1': 'value1'}, 'warnings': ['warning1'], 'deprecations': ['deprecation1']}
        combined_result = self.module._combine_task_result(result, task_result)
        self.assertIn('fact1', combined_result['ansible_facts'])

    @patch('ansible.plugins.action.gather_facts.boolean')
    @patch('ansible.plugins.action.gather_facts.C.config.get_config_value')
    def test_run(self, mock_get_config_value, mock_boolean):
        mock_get_config_value.side_effect = [['ansible.builtin.setup'], {'network_cli': 'ansible.builtin.setup'}]
        mock_boolean.return_value = True
        self.task.args = {'parallel': True}
        task_vars = {'ansible_facts_parallel': True}
        result = self.module.run(task_vars=task_vars)
        self.assertIn('ansible_facts', result)

    def test_private_methods(self):
        fact_module = 'ansible.builtin.setup'
        task_vars = {}
        self.task.args = {'gather_subset': 'all', 'gather_timeout': 10, 'filter': 'some_filter'}
        result = self.module._ActionModule__get_module_args(fact_module, task_vars)
        self.assertIsInstance(result, dict)

    def test_protected_methods(self):
        result = {'ansible_facts': {}, 'warnings': [], 'deprecations': []}
        task_result = {'ansible_facts': {'fact1': 'value1'}, 'warnings': ['warning1'], 'deprecations': ['deprecation1']}
        combined_result = self.module._combine_task_result(result, task_result)
        self.assertIn('fact1', combined_result['ansible_facts'])

if __name__ == '__main__':
    unittest.main()