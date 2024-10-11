import unittest
from unittest.mock import MagicMock
from ansible.modules.command import check_command


class TestCheckCommand(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()

    def test_check_command_with_list(self):
        commandline = ['chmod', '755', '/tmp/testfile']
        check_command(self.module, commandline)
        self.module.warn.assert_called_once_with(
            "Consider using the file module with mode rather than running 'chmod'.  "
            "If you need to use 'chmod' because the file module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        )

    def test_check_command_with_string(self):
        commandline = 'chmod 755 /tmp/testfile'
        check_command(self.module, commandline)
        self.module.warn.assert_called_once_with(
            "Consider using the file module with mode rather than running 'chmod'.  "
            "If you need to use 'chmod' because the file module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        )

    def test_check_command_with_become(self):
        commandline = 'sudo ls /root'
        check_command(self.module, commandline)
        self.module.warn.assert_called_once_with(
            "Consider using 'become', 'become_method', and 'become_user' rather than running sudo"
        )

    def test_check_command_with_command(self):
        commandline = 'curl http://example.com'
        check_command(self.module, commandline)
        self.module.warn.assert_called_once_with(
            "Consider using the get_url or uri module rather than running 'curl'.  "
            "If you need to use 'curl' because the get_url or uri module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message."
        )

    def test_check_command_with_no_warning(self):
        commandline = 'ls /tmp'
        check_command(self.module, commandline)
        self.module.warn.assert_not_called()

if __name__ == '__main__':
    unittest.main()