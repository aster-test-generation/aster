import unittest
from ansible.plugins.become.sudo import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: None
        cmd = 'ls -l'
        shell = 'sh'
        expected_command = 'sudo sh -c ls -l'
        actual_command = become_module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

    def test_build_become_command_with_flags(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: '-i' if x == 'become_flags' else None
        cmd = 'ls -l'
        shell = 'sh'
        expected_command = 'sudo -i sh -c ls -l'
        actual_command = become_module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

    def test_build_become_command_with_password(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: 'password' if x == 'become_pass' else None
        cmd = 'ls -l'
        shell = 'sh'
        expected_command = 'sudo sh -p "[sudo via ansible, key=password] password:" -c ls -l'
        actual_command = become_module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

    def test_build_become_command_with_user(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: 'user' if x == 'become_user' else None
        cmd = 'ls -l'
        shell = 'sh'
        expected_command = 'sudo sh -u user -c ls -l'
        actual_command = become_module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

if __name__ == '__main__':
    unittest.main()