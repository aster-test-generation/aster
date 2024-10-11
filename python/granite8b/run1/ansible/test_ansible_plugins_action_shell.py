import unittest
from ansible.plugins.action import shell


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test_uses_shell(self):
        action = ActionModule()
        action._task.args['_uses_shell'] = True
        result = action.run(tmp=None, task_vars=None)
        self.assertEqual(result['changed'], True)

    def test_no_uses_shell(self):
        action = ActionModule()
        action._task.args['_uses_shell'] = False
        result = action.run(tmp=None, task_vars=None)
        self.assertEqual(result['changed'], False)

    def test_command_action(self):
        action = ActionModule()
        action._task.args['_uses_shell'] = True
        command_action = action._shared_loader_obj.action_loader.get('ansible.legacy.command',
                                                                           task=action._task,
                                                                           connection=action._connection,
                                                                           play_context=action._play_context,
                                                                           loader=action._loader,
                                                                           templar=action._templar,
                                                                           shared_loader_obj=action._shared_loader_obj)
        result = command_action.run(task_vars=None)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()