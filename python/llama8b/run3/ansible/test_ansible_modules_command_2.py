import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native, to_bytes, to_text
from ansible.module_utils.common.collections import is_iterable
from ansible.modules import comman
from ansible.modules.command import *


class TestCommand(unittest.TestCase):
    def test_check_command(self):
        module = AnsibleModule()
        commandline = "curl"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

    def test_check_command_with_list(self):
        module = AnsibleModule()
        commandline = ["curl"]
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

    def test_check_command_with_become(self):
        module = AnsibleModule()
        commandline = "sudo"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

    def test_check_command_with_arguments(self):
        module = AnsibleModule()
        commandline = "chown owner"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

    def test_check_command_with_commands(self):
        module = AnsibleModule()
        commandline = "curl get_url"
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)

    def test_check_command_with_substitutions(self):
        module = AnsibleModule()
        commandline = "curl get_url"
        substitutions = {'mod': 'file', 'cmd': 'curl'}
        module.warn = unittest.mock.Mock()
        check_command(module, commandline)
        self.assertEqual(module.warn.call_count, 1)
        self.assertEqual(module.warn.call_args[0][0], "Consider using the file module with get_url rather than running 'curl'.  If you need to use '{cmd}' because the {mod} module is insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in the defaults section of ansible.cfg to get rid of this message.")

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