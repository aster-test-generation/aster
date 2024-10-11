import unittest
from ansible.modules.command import *


class TestCommandModule(unittest.TestCase):
    def test_check_command(self):
        module = AnsibleModule(argument_spec={})
        commandline = "ls"
        check_command(module, commandline)

if __name__ == '__main__':
    unittest.main()