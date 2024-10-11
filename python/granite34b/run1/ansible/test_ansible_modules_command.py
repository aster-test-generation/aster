import unittest
from ansible.modules.command import main


class TestCommandModule(unittest.TestCase):
    def test_main_with_args(self):
        args = ['command', 'arg1', 'arg2']
        main()

    def test_main_with_argv(self):
        argv = ['arg1', 'arg2']
        main()

    def test_main_with_args_and_argv(self):
        args = ['command', 'arg1', 'arg2']
        argv = ['arg1', 'arg2']
        main(args, argv)

    def test_main_with_args_and_shell(self):
        args = ['command', 'arg1', 'arg2']
        main(args)

    def test_main_with_args_and_executable(self):
        args = ['command', 'arg1', 'arg2']
        main(args)

    def test_main_with_args_and_creates(self):
        args = ['command', 'arg1', 'arg2']
        main(args, creates=None)

    def test_main_with_args_and_removes(self):
        args = ['command', 'arg1', 'arg2']
        main(args, remove='file.txt')

    def test_main_with_args_and_warn(self):
        args = ['command', 'arg1', 'arg2']
        main(args)

    def test_main_with_args_and_stdin(self):
        args = ['command', 'arg1', 'arg2']
        main(args)

    def test_main_with_args_and_stdin_add_newline(self):
        args = ['command', 'arg1', 'arg2']
        main(args, stdin='input\n', stdin_add_newline=True)

    def test_main_with_args_and_strip_empty_ends(self):
        args = ['command', 'arg1', 'arg2']
        main(args)

if __name__ == '__main__':
    unittest.main()