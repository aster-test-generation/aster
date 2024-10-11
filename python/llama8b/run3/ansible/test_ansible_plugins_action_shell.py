import unittest
from ansible.module_utils.basic import *
from ansible.plugins.action.shell import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule()
        result = action_module.run(task_vars={})
        self.assertEqual(result, {})

    def test_init(self):
        action_module = ActionModule()
        self.assertEqual(action_module.__class__, ActionModule)

    def test_str(self):
        action_module = ActionModule()
        result = str(action_module)
        self.assertEqual(result, "ActionModule")

    def test_repr(self):
        action_module = ActionModule()
        result = repr(action_module)
        self.assertEqual(result, "ActionModule()")

    def test_eq(self):
        action_module1 = ActionModule()
        action_module2 = ActionModule()
        self.assertEqual(action_module1, action_module2)

    def test_private_method(self):
        action_module = ActionModule()
        with self.assertRaises(AttributeError):
            action_module.__private_method()

    def test_protected_method(self):
        action_module = ActionModule()
        with self.assertRaises(AttributeError):
            action_module._ActionModule__protected_method()

if __name__ == '__main__':
    unittest.main()