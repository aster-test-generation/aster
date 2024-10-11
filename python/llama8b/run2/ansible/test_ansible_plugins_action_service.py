import unittest
from ansible.module_utils.basic import *
from ansible.plugins.action.service import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_supports_check_mode(self):
        action = ActionModule()
        self.assertTrue(action._supports_check_mode)

    def test_supports_async(self):
        action = ActionModule()
        self.assertTrue(action._supports_async)

    def test_execute_module(self):
        action = ActionModule()
        result = action._execute_module(module_name='ansible.legacy.setup', module_args=dict(gather_subset='!all', filter='ansible_service_mgr'), task_vars=None)
        self.assertEqual(result, {})

    def test_get_action_args_with_defaults(self):
        action = ActionModule()
        result = action.get_action_args_with_defaults('ansible.legacy.service', dict(), dict(), None, None)
        self.assertEqual(result, {})

    def test_find_plugin_with_context(self):
        action = ActionModule()
        result = action._shared_loader_obj.module_loader.find_plugin_with_context('ansible.legacy.service', collection_list=None)
        self.assertEqual(result, None)

    def test_remove_tmp_path(self):
        action = ActionModule()
        action._remove_tmp_path('/path/to/tmpdir')
        self.assertTrue(True)

    def test_str_method(self):
        action = ActionModule()
        result = str(action)
        self.assertEqual(result, '<ActionModule>')

    def test_repr_method(self):
        action = ActionModule()
        result = repr(action)
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        action1 = ActionModule()
        action2 = ActionModule()
        self.assertTrue(action1 == action2)

    def test_private_method(self):
        action = ActionModule()
        result = action.__private_method()
        self.assertEqual(result, None)

    def test_protected_method(self):
        action = ActionModule()
        result = action._ActionModule__protected_method()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()