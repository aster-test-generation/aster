import unittest
from ansible.module_utils.basic import *
from ansible.plugins.action.shell import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_init(self):
        action_module = ActionModule()
        self.assertEqual(action_module.__init__(self), None)

    def test_str(self):
        action_module = ActionModule()
        result = action_module.__str__()
        self.assertEqual(result, "<ActionModule object at 0x...>")

    def test_repr(self):
        action_module = ActionModule()
        result = action_module.__repr__()
        self.assertEqual(result, "<ActionModule object at 0x...>")

    def test_eq(self):
        action_module1 = ActionModule()
        action_module2 = ActionModule()
        self.assertEqual(action_module1, action_module2)

    def test_private_method(self):
        action_module = ActionModule()
        result = action_module._ActionModule__private_method()
        self.assertEqual(result, None)

    def test_protected_method(self):
        action_module = ActionModule()
        result = action_module._ActionModule__protected_method()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()