import unittest
from ansible.modules.command import CommandModule


class TestCommandModule(unittest.TestCase):
    def test_check_command(self):
        module = CommandModule()
        commandline = ['ls', '-l']
        module.check_command(commandline)

if __name__ == '__main__':
    unittest.main()