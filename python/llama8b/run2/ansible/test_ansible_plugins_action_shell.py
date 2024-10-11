import unittest
from ansible.module_utils.basic import *
from ansible.plugins.action.shell import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule()
        result = action_module.run(task_vars=None)
        self.assertEqual(result, {})

    def test_get_command_action(self):
        action_module = ActionModule()
        command_action = action_module._shared_loader_obj.action_loader.get('ansible.legacy.command',
                                                                           task=action_module._task,
                                                                           connection=action_module._connection,
                                                                           play_context=action_module._play_context,
                                                                           loader=action_module._loader,
                                                                           templar=action_module._templar,
                                                                           shared_loader_obj=action_module._shared_loader_obj)
        self.assertIsNotNone(command_action)

    def test_set_uses_shell(self):
        action_module = ActionModule()
        action_module._task.args['_uses_shell'] = True
        self.assertTrue(action_module._task.args['_uses_shell'])

    def test_run_command_action(self):
        action_module = ActionModule()
        command_action = action_module._shared_loader_obj.action_loader.get('ansible.legacy.command',
                                                                           task=action_module._task,
                                                                           connection=action_module._connection,
                                                                           play_context=action_module._play_context,
                                                                           loader=action_module._loader,
                                                                           templar=action_module._templar,
                                                                           shared_loader_obj=action_module._shared_loader_obj)
        result = command_action.run(task_vars=None)
        self.assertEqual(result, {})

    def test_str_method(self):
        action_module = ActionModule()
        result = str(action_module)
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        action_module = ActionModule()
        result = repr(action_module)
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        action_module1 = ActionModule()
        action_module2 = ActionModule()
        self.assertEqual(action_module1, action_module2)

    def test_init_method(self):
        action_module = ActionModule()
        self.assertIsNotNone(action_module)

if __name__ == '__main__':
    unittest.main()