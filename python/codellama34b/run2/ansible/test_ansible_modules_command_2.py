import unittest
from ansible.modules.command import *



class TestCommandModule(unittest.TestCase):
    def test_check_command(self):
        module = AnsibleModule()
        commandline = "ls -l"
        check_command(module, commandline)

    def test_check_command_list(self):
        module = AnsibleModule()
        commandline = ["ls", "-l"]
        check_command(module, commandline)

    def test_check_command_list_substitutions(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_2(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_3(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_4(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_5(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_6(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help", "--version"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_7(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help", "--version", "--usage"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_8(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help", "--version", "--usage", "--help"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_9(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help", "--version", "--usage", "--help", "--version"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_10(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help", "--version", "--usage", "--help", "--version", "--usage"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_11(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help", "--version", "--usage", "--help", "--version", "--usage", "--help"]
        check_command(module, commandline)

    def test_check_command_list_substitutions_12(self):
        module = AnsibleModule()
        commandline = ["rm", "-rf", "/", "--no-preserve-root", "--", "--help", "--version", "--usage", "--help", "--version", "--usage", "--help", "--version"]
        check_command(module, commandline)

if __name__ == '__main__':
    unittest.main()