import unittest
from ansible.plugins.action.fail import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_method_with_msg_argument(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run(msg='Custom failure message')
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom failure message')

    def test_private_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module._private_method()
        self.assertEqual(result, 'Failed as requested from task')

    def test_protected_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module._protected_method()
        self.assertEqual(result, 'Failed as requested from task')

    def test_magic_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.__magic_method()
        self.assertEqual(result, 'Failed as requested from task')

if __name__ == '__main__':
    unittest.main()