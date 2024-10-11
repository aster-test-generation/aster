import unittest
from ansible.modules.command import CommandModule


class TestCommandModule(unittest.TestCase):
    def test_command_module(self):
        module = CommandModule()
        result = module.run()
        self.assertEqual(result, "Command executed successfully")

    def test_private_method(self):
        module = CommandModule()
        result = module._private_method()
        self.assertEqual(result, "Private method executed successfully")

    def test_protected_method(self):
        module = CommandModule()
        result = module._CommandModule__protected_method()
        self.assertEqual(result, "Protected method executed successfully")

    def test_magic_method(self):
        module = CommandModule()
        result = module.__str__()
        self.assertEqual(result, "CommandModule")

if __name__ == '__main__':
    unittest.main()