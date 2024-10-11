import unittest
from ansible.modules.command import *



class TestCommandModule(unittest.TestCase):
    def test_check_command(self):
        module = AnsibleModule()
        commandline = "ls"
        check_command(module, commandline)

    def test_check_command_list(self):
        module = AnsibleModule()
        commandline = ["ls", "-l"]
        check_command(module, commandline)

    def test_check_command_list_empty(self):
        module = AnsibleModule()
        commandline = []
        check_command(module, commandline)

    def test_check_command_list_none(self):
        module = AnsibleModule()
        commandline = None
        check_command(module, commandline)

    def test_check_command_list_invalid(self):
        module = AnsibleModule()
        commandline = ["ls", "-l", ""]
        check_command(module, commandline)

    def test_check_command_list_invalid_command(self):
        module = AnsibleModule()
        commandline = ["", "-l"]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_none(self):
        module = AnsibleModule()
        commandline = [None, "-l"]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_empty(self):
        module = AnsibleModule()
        commandline = ["", "-l"]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid(self):
        module = AnsibleModule()
        commandline = ["", "-l", ""]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none(self):
        module = AnsibleModule()
        commandline = [None, "-l", ""]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_empty(self):
        module = AnsibleModule()
        commandline = ["", "-l", ""]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none_empty(self):
        module = AnsibleModule()
        commandline = [None, "-l", ""]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none_empty_none(self):
        module = AnsibleModule()
        commandline = [None, "-l", "", None]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none_empty_none_empty(self):
        module = AnsibleModule()
        commandline = [None, "-l", "", None, ""]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none_empty_none_empty_none(self):
        module = AnsibleModule()
        commandline = [None, "-l", "", None, "", None]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none_empty_none_empty_none_empty(self):
        module = AnsibleModule()
        commandline = [None, "-l", "", None, "", None, ""]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none_empty_none_empty_none_empty_none(self):
        module = AnsibleModule()
        commandline = [None, "-l", "", None, "", None, "", None]
        check_command(module, commandline)

    def test_check_command_list_invalid_command_invalid_none_empty_none_empty_none_empty_none_empty(self):
        module = AnsibleModule()
        commandline = [None, "-l", "", None, "", None, "", None, ""]
        check_command(module, commandline)

if __name__ == '__main__':
    unittest.main()