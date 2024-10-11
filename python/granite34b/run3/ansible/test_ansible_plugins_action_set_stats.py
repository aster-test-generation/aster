import unittest
from ansible.plugins.action.set_stats import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run()
        self.assertEqual(result, {'changed': False, 'ansible_stats': {'data': {}, 'per_host': False, 'aggregate': True}})

    def test_private_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module._private_method()
        self.assertEqual(result, None)

    def test_protected_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module._protected_method()
        self.assertEqual(result, None)

    def test_magic_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.__magic_method()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()