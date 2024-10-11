import unittest
from ansible.plugins.become.su import *


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        b_output = b"Please enter your password: "
        self.assertTrue(BecomeModule.check_password_prompt(b_output, ''))

    def test_build_become_command(self):
        cmd = "ls -l"
        shell = "/bin/sh"
        exe = "su"
        flags = "-c"
        user = "root"
        success_cmd = f"{shell} -c {shlex_quote(cmd)}"
        expected_command = f"{exe} {flags} {user} -c {shlex_quote(success_cmd)}"
        self.assertEqual(BecomeModule.build_become_command(cmd, shell='bash'), expected_command)

if __name__ == '__main__':
    unittest.main()