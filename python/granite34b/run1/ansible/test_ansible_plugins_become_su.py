import unittest
from ansible.plugins.become.su import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        become_module = BecomeModule()
        b_output = b"Password: "
        self.assertTrue(become_module._load_name)

    def test_build_become_command(self):
        become_module = BecomeModule()
        cmd = "ls -l"
        shell = "bash"
        become_command = become_module._load_name(cmd, shell)
        expected_command = "su  -c ls -l"
        self.assertEqual(become_command, expected_command)

    def test_private_method(self):
        become_module = BecomeModule()
        result = become_module._BecomeModule__private_method()
        self.assertEqual(result, "private method result")

if __name__ == '__main__':
    unittest.main()