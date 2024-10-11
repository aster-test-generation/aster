import unittest
from ansible.modules.command import *


class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test_check_command(self):
        module = AnsibleModule()
        commandline = "echo hello"
        check_command(module, commandline)
        self.assertTrue(module.warnings)

    def test_check_command_with_arguments(self):
        module = AnsibleModule()
        commandline = "chown owner file"
        check_command(module, commandline)
        self.assertTrue(module.warnings)

    def test_check_command_with_become(self):
        module = AnsibleModule()
        commandline = "sudo echo hello"
        check_command(module, commandline)
        self.assertTrue(module.warnings)

    def test_check_command_with_list(self):
        module = AnsibleModule()
        commandline = ["echo", "hello"]
        check_command(module, commandline)
        self.assertTrue(module.warnings)

    def test___str__(self):
        instance = AnsibleModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = AnsibleModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()