import unittest
from ansible.plugins.become.sudo import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command_no_cmd(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: None
        cmd = None
        shell = None
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, None)

    def test_build_become_command_with_cmd(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: None
        cmd = 'ls -l'
        shell = 'sh'
        result = become_module.build_become_command(cmd, shell)
        expected = 'sudo sh -c ls -l'
        self.assertEqual(result, expected)

    def test_build_become_command_with_become_exe(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: 'doas' if x == 'become_exe' else None
        cmd = 'ls -l'
        shell = 'sh'
        result = become_module.build_become_command(cmd, shell)
        expected = 'doas sh -c ls -l'
        self.assertEqual(result, expected)

    def test_build_become_command_with_become_flags(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: '-n -i' if x == 'become_flags' else None
        cmd = 'ls -l'
        shell = 'sh'
        result = become_module.build_become_command(cmd, shell)
        expected = 'sudo -n -i sh -c ls -l'
        self.assertEqual(result, expected)

    def test_build_become_command_with_become_pass(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: 'mypassword' if x == 'become_pass' else None
        become_module._id = 'mykey'
        cmd = 'ls -l'
        shell = 'sh'
        result = become_module.build_become_command(cmd, shell)
        expected = 'sudo -p "[sudo via ansible, key=mykey] password:" sh -c ls -l'
        self.assertEqual(result, expected)

    def test_build_become_command_with_become_user(self):
        become_module = BecomeModule()
        become_module.get_option = lambda x: 'myuser' if x == 'become_user' else None
        cmd = 'ls -l'
        shell = 'sh'
        result = become_module.build_become_command(cmd, shell)
        expected = 'sudo -u myuser sh -c ls -l'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()