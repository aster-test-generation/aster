import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_method(self):
        action = ActionModule()
        result = action.run()
        self.assertEqual(result, None)

    def test_private_method(self):
        action = ActionModule()
        result = action._private_method()
        self.assertEqual(result, None)

    def test_protected_method(self):
        action = ActionModule()
        result = action.__protected_method()
        self.assertEqual(result, None)

    def test_magic_method(self):
        action = ActionModule()
        result = action.__str__()
        self.assertEqual(result, "ActionModule")

if __name__ == '__main__':
    unittest.main()