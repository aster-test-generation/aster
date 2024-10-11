import unittest
from ansible.plugins.action import shell


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule()
        result = action_module.run()
        self.assertEqual(result, None)

    def test_run_with_tmp(self):
        action_module = ActionModule()
        result = action_module.run(tmp='tmp')
        self.assertEqual(result, None)

    def test_run_with_task_vars(self):
        action_module = ActionModule()
        result = action_module.run(task_vars={'var': 'value'})
        self.assertEqual(result, None)

    def test_run_with_private_method(self):
        action_module = ActionModule()
        result = action_module._ActionModule__run()
        self.assertEqual(result, None)

    def test_run_with_protected_method(self):
        action_module = ActionModule()
        result = action_module._ActionModule__run()
        self.assertEqual(result, None)

    def test_run_with_magic_method(self):
        action_module = ActionModule()
        result = action_module.__init__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()