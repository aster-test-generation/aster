import unittest
from ansible.modules.command import *



class TestCommandModule(unittest.TestCase):
    def test_command_module(self):
        instance = Command()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_command_module_main(self):
        instance = CommandModule()
        result = instance.main()
        self.assertEqual(result, None)

    def test_command_module_run_command(self):
        instance = Command()
        result = instance.run_command()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_environment(self):
        instance = CommandModule()
        result = instance.run_command_with_environment()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir(self):
        instance = CommandModule()
        result = instance.run_command_with_chdir()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment(self):
        instance = Command()
        result = instance.run_command_with_chdir_and_environment()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment_and_executable(self):
        instance = Command()
        result = instance.run_command_with_chdir_and_environment_and_executable()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment_and_executable_and_creates(self):
        instance = Command()
        result = instance.run_command_with_chdir_and_environment_and_executable_and_creates()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment_and_executable_and_removes(self):
        instance = CommandModule()
        result = instance.run_command_with_chdir_and_environment_and_executable_and_removes()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment_and_executable_and_creates_and_removes(self):
        instance = CommandModule()
        result = instance.run_command_with_chdir_and_environment_and_executable_and_creates_and_removes()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment_and_executable_and_creates_and_removes_and_stdin(self):
        instance = Command()
        result = instance.run_command_with_chdir_and_environment_and_executable_and_creates_and_removes_and_stdin()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment_and_executable_and_creates_and_removes_and_stdin_and_warn(self):
        instance = command_module.CommandModule()
        result = instance.run_command_with_chdir_and_environment_and_executable_and_creates_and_removes_and_stdin_and_warn()
        self.assertEqual(result, None)

    def test_command_module_run_command_with_chdir_and_environment_and_executable_and_creates_and_removes_and_stdin_and_warn_and_strip_empty_ends(self):
        instance = CommandModule()
        result = instance.run_command_with_chdir_and_environment_and_executable_and_creates_and_removes_and_stdin_and_warn_and_strip_empty_ends()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()