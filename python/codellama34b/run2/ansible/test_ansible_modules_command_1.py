import unittest
from ansible.modules.command import *



class TestCommandModule(unittest.TestCase):
    def test_command_module(self):
        instance = Command()
        result = instance.run_command(["echo", "hello"])
        self.assertEqual(result, 0)

    def test_command_module_with_args(self):
        instance = command_module.CommandModule()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True})
        self.assertEqual(result, 0)

    def test_command_module_with_kwargs(self):
        instance = Command()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"})
        self.assertEqual(result, 0)

    def test_command_module_with_stdin(self):
        instance = Command()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello")
        self.assertEqual(result, 0)

    def test_command_module_with_chdir(self):
        instance = Command()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello", "/tmp")
        self.assertEqual(result, 0)

    def test_command_module_with_executable(self):
        instance = CommandModule()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello", "/tmp", "/bin/bash")
        self.assertEqual(result, 0)

    def test_command_module_with_removes(self):
        instance = CommandModule()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello", "/tmp", "/bin/bash", "/tmp/test.txt")
        self.assertEqual(result, 0)

    def test_command_module_with_creates(self):
        instance = Command()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello", "/tmp", "/bin/bash", "/tmp/test.txt", "/tmp/test2.txt")
        self.assertEqual(result, 0)

    def test_command_module_with_stdin_add_newline(self):
        instance = command_module.CommandModule()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello", "/tmp", "/bin/bash", "/tmp/test.txt", "/tmp/test2.txt", True)
        self.assertEqual(result, 0)

    def test_command_module_with_warn(self):
        instance = command_module.CommandModule()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello", "/tmp", "/bin/bash", "/tmp/test.txt", "/tmp/test2.txt", True, True)
        self.assertEqual(result, 0)

    def test_command_module_with_strip_empty_ends(self):
        instance = command_module.CommandModule()
        result = instance.run_command(["echo", "hello"], {"_uses_shell": True}, {"_raw_params": "hello"}, "hello", "/tmp", "/bin/bash", "/tmp/test.txt", "/tmp/test2.txt", True, True, True)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()