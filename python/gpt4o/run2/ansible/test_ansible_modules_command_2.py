import unittest
from unittest.mock import MagicMock
from ansible.modules.command import check_command


class TestCheckCommand(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()

    def test_check_command_with_arguments(self):
        commandline = ['chown', 'user', 'file']
        check_command(self.module, commandline)
        self.module.warn.assert_called_with(
            "Consider using the file module with owner rather than running 'chown'.  "
            "If you need to use 'chown' because the file module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        )

    def test_check_command_with_commands(self):
        commandline = ['curl', 'http://example.com']
        check_command(self.module, commandline)
        self.module.warn.assert_called_with(
            "Consider using the get_url or uri module rather than running 'curl'.  "
            "If you need to use 'curl' because the get_url or uri module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        )

    def test_check_command_with_become(self):
        commandline = ['sudo', 'ls']
        check_command(self.module, commandline)
        self.module.warn.assert_called_with(
            "Consider using 'become', 'become_method', and 'become_user' rather than running sudo"
        )

    def test_check_command_with_no_warnings(self):
        commandline = ['ls', '-l']
        check_command(self.module, commandline)
        self.module.warn.assert_not_called()

    def test_check_command_with_string_commandline(self):
        commandline = 'chown user file'
        check_command(self.module, commandline)
        self.module.warn.assert_called_with(
            "Consider using the file module with owner rather than running 'chown'.  "
            "If you need to use 'chown' because the file module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        )

if __name__ == '__main__':
    unittest.main()