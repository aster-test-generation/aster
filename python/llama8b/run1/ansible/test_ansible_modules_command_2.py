import unittest
from ansible.modules.command import *


class TestCheckCommand(unittest.TestCase):
    def test_check_command(self):
        module = AnsibleModule()
        commandline = 'curl -o /tmp/file http://example.com'
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 0)

    def test_check_command_with_become(self):
        module = AnsibleModule()
        commandline = 'sudo curl -o /tmp/file http://example.com'
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 0)

    def test_check_command_with_arguments(self):
        module = AnsibleModule()
        commandline = 'curl -o /tmp/file http://example.com -H "Accept: application/json"'
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 0)

    def test_check_command_with_substitution(self):
        module = AnsibleModule()
        commandline = 'curl -o /tmp/file http://example.com'
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 1)

    def test_check_command_with_become_and_substitution(self):
        module = AnsibleModule()
        commandline = 'sudo curl -o /tmp/file http://example.com'
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 1)

    def test_check_command_with_multiple_commands(self):
        module = AnsibleModule()
        commandline = ['curl -o /tmp/file http://example.com', 'wget -o /tmp/file http://example.com']
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 0)

    def test_check_command_with_invalid_command(self):
        module = AnsibleModule()
        commandline = 'invalid_command'
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 1)

    def test_check_command_with_invalid_become(self):
        module = AnsibleModule()
        commandline = 'invalid_become_command'
        check_command(module, commandline)
        self.assertEqual(module.warn_calls, 1)

if __name__ == '__main__':
    unittest.main()