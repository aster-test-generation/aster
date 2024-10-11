import unittest
from ansible.plugins.action.service import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_method(self):
        def setUp(self):
        result = action_module.run()
        self.assertIsInstance(result, dict)

    def test_private_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module._private_method()
        self.assertIsInstance(result, dict)

    def test_protected_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module._protected_method()
        self.assertIsInstance(result, dict)

    def test_magic_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.__magic_method__()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()