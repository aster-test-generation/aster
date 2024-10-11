import unittest
from ansible.plugins.become import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        become_module = BecomeModule()
        b_output = b"Password: "
        self.assertTrue(become_module.check_password_prompt(b_output))

    def test_build_become_command(self):
        become_module = BecomeModule()
        cmd = "ls -l"
        shell = "/bin/bash"
        expected_command = "/bin/su -c 'ls -l'"
        actual_command = become_module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

if __name__ == '__main__':
    unittest.main()