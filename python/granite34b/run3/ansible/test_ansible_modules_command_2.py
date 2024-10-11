import unittest
from ansible.modules.command import check_command


class TestCommand(unittest.TestCase):
    def test_check_command_with_arguments(self):
        from unittest.mock import MagicMock
        commandline = ['command', 'arg1', 'arg2']
        check_command(module, commandline)
        module.warn.assert_called_once_with("Consider using the {mod} module with {subcmd} rather than running '{cmd}'.  " + disable_suffix)

    def test_check_command_with_commands(self):
        from unittest.mock import MagicMock
        commandline = ['command', 'arg1', 'arg2']
        check_command(module, commandline)
        module.warn.assert_called_once_with("Consider using the {mod} module rather than running '{cmd}'.  " + disable_suffix)

    def test_check_command_with_become(self):
        from unittest.mock import MagicMock
        commandline = ['command', 'arg1', 'arg2']
        check_command(module, commandline)
        module.warn.assert_called_once_with("Consider using 'become', 'become_method', and 'become_user' rather than running %s" % (command,))

if __name__ == '__main__':
    unittest.main()