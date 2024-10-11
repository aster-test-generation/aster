import unittest
from ansible.plugins.become.yaml import *


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        instance = BecomeModule()
        b_output = b"Password"
        result = instance.check_password_prompt(b_output)
        self.assertTrue(result)

    def test_build_become_command(self):
        instance = BecomeModule()
        cmd = "cmd"
        shell = "shell"
        result = instance.build_become_command(cmd, shell)
        self.assertEqual(result, "su -c cmd")

if __name__ == '__main__':
    unittest.main()