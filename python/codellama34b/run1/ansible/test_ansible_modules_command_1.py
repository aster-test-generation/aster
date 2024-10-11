import unittest
from ansible.modules.command import *



class TestCommandModule(unittest.TestCase):
    def test_command_module(self):
        instance = Command()
        result = instance.run_command()
        self.assertEqual(result, 0)

    def test_command_module_run_command(self):
        instance = command_module.CommandModule()
        result = instance.run_command()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args(self):
        instance = command_module.CommandModule()
        result = instance.run_command_args()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_command(self):
        instance = command_module.CommandModule()
        result = instance.run_command_args_command()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_creates(self):
        instance = Command()
        result = instance.run_command_args_creates()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_executable(self):
        from CommandModule import CommandModule
        result = instance.run_command_args_executable()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_removes(self):
        instance = Command()
        result = instance.run_command_args_removes()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_chdir(self):
        instance = command_module.CommandModule()
        result = instance.run_command_args_chdir()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_stdin(self):
        instance = Command()
        result = instance.run_command_args_stdin()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_stdin_add_newline(self):
        instance = Command()
        result = instance.run_command_args_stdin_add_newline()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_strip_empty_ends(self):
        instance = CommandModule()
        result = instance.run_command_args_strip_empty_ends()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_warn(self):
        instance = CommandModule()
        result = instance.run_command_args_warn()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_argv(self):
        instance = Command()
        result = instance.run_command_args_argv()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_environ_update(self):
        instance = Command()
        result = instance.run_command_args_environ_update()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_cwd(self):
        instance = CommandModule()
        result = instance.run_command_args_cwd()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_executable_search_paths(self):
        instance = CommandModule()
        result = instance.run_command_args_executable_search_paths()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_removes_retries(self):
        instance = Command()
        result = instance.run_command_args_removes_retries()
        self.assertEqual(result, 0)

    def test_command_module_run_command_args_retries(self):
        instance = CommandModule()
        result = instance.run_command_args_retries()
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()