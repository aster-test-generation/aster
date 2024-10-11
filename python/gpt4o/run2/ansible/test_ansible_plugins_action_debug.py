import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.debug import ActionModule
from ansible.errors import AnsibleUndefinedVariable


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())
        self.action_module._task.args = {}

    def test_run_with_msg(self):
        self.action_module._task.args = {'msg': 'Hello'}
        result = self.action_module.run(async=False)
        self.assertEqual(result['msg'], 'Hello')

    def test_run_with_var(self):
        self.action_module._task.args = {'var': 'variable'}
        self.action_module._templar.template = MagicMock(return_value='templated_variable')
        result = self.action_module.run(async=False)
        self.assertEqual(result['variable'], 'templated_variable')

    def test_run_with_var_undefined(self):
        self.action_module._task.args = {'var': 'variable'}
        self.action_module._templar.template = MagicMock(side_effect=AnsibleUndefinedVariable)
        result = self.action_module.run(async=False)
        self.assertEqual(result['variable'], 'VARIABLE IS NOT DEFINED!')

    def test_run_with_var_list(self):
        self.action_module._task.args = {'var': ['item1', 'item2']}
        self.action_module._templar.template = MagicMock(return_value=['templated_item1', 'templated_item2'])
        result = self.action_module.run(async=False)
        self.assertEqual(result["<class 'list'>"], ['templated_item1', 'templated_item2'])

    def test_run_with_var_dict(self):
        self.action_module._task.args = {'var': {'key': 'value'}}
        self.action_module._templar.template = MagicMock(return_value={'key': 'templated_value'})
        result = self.action_module.run(async=False)
        self.assertEqual(result["<class 'dict'>"], {'key': 'templated_value'})

    def test_run_with_msg_and_var(self):
        self.action_module._task.args = {'msg': 'Hello', 'var': 'variable'}
        result = self.action_module.run()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "'msg' and 'var' are incompatible options")

    def test_run_with_verbosity_threshold_not_met(self):
        self.action_module._task.args = {'verbosity': 2}
        self.action_module._display.verbosity = 1
        result = self.action_module.run(async=False)
        self.assertTrue(result['skipped'])
        self.assertEqual(result['skipped_reason'], "Verbosity threshold not met.")

    def test_run_default_msg(self):
        result = self.action_module.run(async=False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_failed_false(self):
        result = self.action_module.run(async=False)
        self.assertFalse(result['failed'])

if __name__ == '__main__':
    unittest.main()