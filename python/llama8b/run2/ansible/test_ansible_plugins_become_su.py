import unittest
from ansible.module_utils.basic import AnsibleModul


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        instance = BecomeModule()
        b_output = b"Password ?"
        result = instance.check_password_prompt(b_output)
        self.assertTrue(result)

    def test_build_become_command(self):
        instance = BecomeModule()
        cmd = "ls"
        shell = True
        result = instance.build_become_command(cmd, shell)
        self.assertEqual(result, "su -c 'ls'")

    def test_build_become_command_no_cmd(self):
        instance = BecomeModule()
        cmd = None
        shell = True
        result = instance.build_become_command(cmd, shell)
        self.assertEqual(result, "")

    def test_build_become_command_no_shell(self):
        instance = BecomeModule()
        cmd = "ls"
        shell = False
        result = instance.build_become_command(cmd, shell)
        self.assertEqual(result, "su -c 'ls'")

    def test_build_become_command_all_options(self):
        instance = BecomeModule()
        cmd = "ls"
        shell = True
        exe = "sudo"
        flags = "-E"
        user = "root"
        result = instance.build_become_command(cmd, shell, exe, flags, user)
        self.assertEqual(result, "sudo -E -c 'ls' -u root")

if __name__ == '__main__':
    unittest.main()