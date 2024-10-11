import unittest
from ansible.module_utils.basic import AnsibleModul


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        become_module = BecomeModule()
        b_output = b"Password ?"
        self.assertTrue(become_module.check_password_prompt(b_output))

    def test_build_become_command(self):
        become_module = BecomeModule()
        cmd = "ls"
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, "su -c 'ls'")

    def test_build_become_command_empty_cmd(self):
        become_module = BecomeModule()
        cmd = ""
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, "")

    def test_build_become_command_no_shell(self):
        become_module = BecomeModule()
        cmd = "ls"
        shell = False
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, "su -c 'ls'")

    def test_build_become_command_no_user(self):
        become_module = BecomeModule()
        cmd = "ls"
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, "su -c 'ls'")

    def test_build_become_command_with_user(self):
        become_module = BecomeModule()
        cmd = "ls"
        shell = True
        result = become_module.build_become_command(cmd, shell, become_user="user")
        self.assertEqual(result, "su user -c 'ls'")

    def test_build_become_command_with_flags(self):
        become_module = BecomeModule()
        cmd = "ls"
        shell = True
        result = become_module.build_become_command(cmd, shell, become_flags="-f")
        self.assertEqual(result, "su -f -c 'ls'")

    def test_build_become_command_with_exe(self):
        become_module = BecomeModule()
        cmd = "ls"
        shell = True
        result = become_module.build_become_command(cmd, shell, become_exe="sudo")
        self.assertEqual(result, "sudo -c 'ls'")

if __name__ == '__main__':
    unittest.main()