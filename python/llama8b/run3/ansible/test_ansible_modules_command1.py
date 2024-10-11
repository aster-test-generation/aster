import unittest
from ansible.modules.command import *

class TestCheckCommand(unittest.TestCase):
    def test_check_command(self):
        module = AnsibleModule()
        commandline = "curl"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

    def test_check_command_with_args(self):
        module = AnsibleModule()
        commandline = "curl -v"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 0)

    def test_check_command_with_become(self):
        module = AnsibleModule()
        commandline = "sudo curl"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

    def test_check_command_with_multiple_commands(self):
        module = AnsibleModule()
        commandline = ["curl", "wget"]
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 2)

    def test_check_command_with_single_command(self):
        module = AnsibleModule()
        commandline = "curl"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

if __name__ == '__main__':
    unittest.main()