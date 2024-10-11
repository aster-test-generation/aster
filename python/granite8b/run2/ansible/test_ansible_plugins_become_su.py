import unittest
from ansible.plugins.become import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        module = BecomeModule()
        b_output = b'Password: '
        self.assertTrue(module.check_password_prompt(b_output))

    def test_build_become_command(self):
        module = BecomeModule()
        cmd = 'ls'
        shell = '/bin/bash'
        expected_command = 'su -c "ls"'
        actual_command = module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

if __name__ == '__main__':
    unittest.main()