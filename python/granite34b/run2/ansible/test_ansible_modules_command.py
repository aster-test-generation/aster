import unittest
from ansible.modules.command import main


class TestCommandModule(unittest.TestCase):
    def test_main_with_args(self):
        args = "echo hello"
        main()

    def test_main_with_argv(self):
        argv = ["echo", "hello"]
        main()

    def test_main_with_shell(self):
        shell = True
        main()

    def test_main_with_chdir(self):
        chdir = "/path/to/directory"
        main(chdir=chdir)

    def test_main_with_executable(self):
        executable = "/path/to/executable"
        main(executable=executable)

    def test_main_with_creates(self):
        creates = "/path/to/file"
        main(create=create)

    def test_main_with_removes(self):
        removes = "/path/to/file"
        main(remove=removes)

    def test_main_with_warn(self):
        warn = True
        main()

    def test_main_with_stdin(self):
        stdin = "input data"
        main()

    def test_main_with_stdin_add_newline(self):
        stdin_add_newline = False
        main(stdin_add_newline=False)

    def test_main_with_strip_empty_ends(self):
        strip_empty_ends = False
        main(strip_empty_ends=not strip_empty_ends)

if __name__ == '__main__':
    unittest.main()