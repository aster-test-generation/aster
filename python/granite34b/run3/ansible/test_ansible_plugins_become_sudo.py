import unittest
from ansible.plugins.become.sudo import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command_with_cmd(self):
        become_module = BecomeModule()
        become_module.get_option = lambda option: {
            'become_exe': 'sudo',
            'become_flags': '-n',
            'become_pass': 'password',
            'become_user': 'user'
        }.get(option)
        cmd = 'command'
        shell = 'shell'
        expected_command = 'sudo -n -p "[sudo via ansible, key=] password:" -u user command'
        actual_command = become_module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

    def test_build_become_command_without_cmd(self):
        become_module = BecomeModule()
        become_module.get_option = lambda option: {
            'become_exe': 'sudo',
            'become_flags': '-n',
            'become_pass': 'password',
            'become_user': 'user'
        }.get(option)
        cmd = None
        shell = 'shell'
        expected_command = None
        actual_command = become_module.build_become_command(cmd, shell)
        self.assertEqual(actual_command, expected_command)

    def test_get_option(self):
        become_module = BecomeModule()
        become_module.get_option = lambda option: {
            'become_exe': 'sudo',
            'become_flags': '-n',
            'become_pass': 'password',
            'become_user': 'user'
        }.get(option)
        expected_option = 'sudo'
        actual_option = become_module.get_option('become_exe')
        self.assertEqual(actual_option, expected_option)

if __name__ == '__main__':
    unittest.main()