import unittest
from ansible.modules.yum_repository import *



class TestYumRepository(unittest.TestCase):
    def test_main(self):
        from yum_repository import YumRepository
        result = instance.main()
        self.assertEqual(result, None)

    def test_run_command(self):
        from yum_repository import YumRepository
        result = instance.run_command()
        self.assertEqual(result, None)

    def test_run_command_with_args(self):
        from yum_repository import YumRepository
        result = instance.run_command_with_args()
        self.assertEqual(result, None)

    def test_run_command_with_kwargs(self):
        from yum_repository import YumRepository
        result = instance.run_command_with_kwargs()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs(self):
        instance = YumRepository
        result = instance.run_command_with_args_and_kwargs()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs_and_env(self):
        from yum_repository import YumRepository
        result = instance.run_command_with_args_and_kwargs_and_env()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs_and_env_and_stdin(self):
        instance = YumRepository
        result = instance.run_command_with_args_and_kwargs_and_env_and_stdin()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout(self):
        from yum_repository import YumRepository
        result = instance.run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr(self):
        from yum_repository import YumRepository
        result = instance.run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr_and_shell(self):
        from yum_repository import YumRepository
        result = instance.run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr_and_shell()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr_and_shell_and_cwd(self):
        instance = YumRepository
        result = instance.run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr_and_shell_and_cwd()
        self.assertEqual(result, None)

    def test_run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr_and_shell_and_cwd_and_encoding(self):
        from yum_repository import YumRepository
        result = instance.run_command_with_args_and_kwargs_and_env_and_stdin_and_stdout_and_stderr_and_shell_and_cwd_and_encoding()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()