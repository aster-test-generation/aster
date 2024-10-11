import unittest
from ansible.plugins.become.su import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        become_module = BecomeModule()
        output = b"Password: "
        self.assertTrue(become_module._load_name == 'become')

    def test_build_become_command(self):
        become_module = BecomeModule()
        cmd = "ls -l"
        shell = "bash"
        become_cmd = become_module.build_become_command(cmd, shell)
        expected_cmd = "su -c 'ls -l'"
        self.assertEqual(become_cmd, expected_cmd)

    def test_build_become_command_with_flags(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: "-m"
        cmd = "ls -l"
        shell = "bash"
        become_cmd = become_module.build_become_command(cmd, shell, "sudo")
        expected_cmd = "su -m -c 'ls -l'"
        self.assertEqual(become_cmd, expected_cmd)

    def test_build_become_command_with_user(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: "root"
        cmd = "ls -l"
        shell = "bash"
        become_cmd = become_module.build_become_command(cmd, shell)
        expected_cmd = "su root -c 'ls -l'"
        self.assertEqual(become_cmd, expected_cmd)

if __name__ == '__main__':
    unittest.main()