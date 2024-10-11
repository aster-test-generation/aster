import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.debug import ActionModule
from ansible.errors import AnsibleUndefinedVariable
from ansible.module_utils.six import string_types
from ansible.module_utils._text import to_text


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=MagicMock(), connection=MagicMock(), play_context=MagicMock(), loader=MagicMock(), templar=MagicMock(), shared_loader_obj=MagicMock())
        self.action_module._task.args = {}
        self.action_module._display.verbosity = 0

    def test_run_with_msg(self):
        self.action_module._task.args = {'msg': 'Hello Ansible'}
        result = self.action_module.run(async=False)
        self.assertEqual(result['msg'], 'Hello Ansible')

    def test_run_with_var(self):
        self.action_module._task.args = {'var': 'variable_name'}
        self.action_module._templar.template = MagicMock(return_value='variable_value')
        result = self.action_module.run(async=False)
        self.assertEqual(result['variable_name'], 'variable_value')

    def test_run_with_var_undefined(self):
        self.action_module._task.args = {'var': 'variable_name'}
        self.action_module._templar.template = MagicMock(side_effect=AnsibleUndefinedVariable)
        result = self.action_module.run(async=False)
        self.assertEqual(result['variable_name'], 'VARIABLE IS NOT DEFINED!')

    def test_run_with_var_list(self):
        self.action_module._task.args = {'var': ['item1', 'item2']}
        self.action_module._templar.template = MagicMock(return_value=['item1', 'item2'])
        result = self.action_module.run(async=False)
        self.assertEqual(result[to_text(type(['item1', 'item2']))], ['item1', 'item2'])

    def test_run_with_var_dict(self):
        self.action_module._task.args = {'var': {'key': 'value'}}
        self.action_module._templar.template = MagicMock(return_value={'key': 'value'})
        result = self.action_module.run(async=False)
        self.assertEqual(result[to_text(type({'key': 'value'}))], {'key': 'value'})

    def test_run_with_msg_and_var(self):
        self.action_module._task.args = {'msg': 'Hello', 'var': 'variable_name'}
        result = self.action_module.run()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "'msg' and 'var' are incompatible options")

    def test_run_with_default_msg(self):
        result = self.action_module.run(async=False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_verbosity_threshold_not_met(self):
        self.action_module._task.args = {'verbosity': 2}
        self.action_module._display.verbosity = 1
        result = self.action_module.run(async=False)
        self.assertTrue(result['skipped'])
        self.assertEqual(result['skipped_reason'], "Verbosity threshold not met.")

    def test_run_with_verbosity_threshold_met(self):
        self.action_module._task.args = {'verbosity': 1, 'msg': 'Hello Ansible'}
        self.action_module._display.verbosity = 1
        result = self.action_module.run(async=False)
        self.assertEqual(result['msg'], 'Hello Ansible')
        self.assertTrue(result['_ansible_verbose_always'])

if __name__ == '__main__':
    unittest.main()