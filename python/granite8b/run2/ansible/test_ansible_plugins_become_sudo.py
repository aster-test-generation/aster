from ansible.plugins.become.sudo import BecomeModule
import unittest
from ansible.plugins.become import BecomeBase


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command(self):
        become_module = BecomeModule()
        become_module.name = 'sudo'
        become_module.fail = ('Sorry, try again.',)
        become_module.missing = ('Sorry, a password is required to run sudo', 'sudo: a password is required')
        become_module.prompt = '[sudo via ansible, key=%s] password:' % become_module._id
        become_module.become_exe = 'sudo'
        become_module.become_flags = ''
        become_module.become_user = ''
        become_module.become_pass = ''
        cmd = 'echo "hello"'
        shell = '/bin/bash'
        result = become_module.build_become_command(cmd, shell)
        expected = 'sudo -p "[sudo via ansible, key=] password:" echo "hello"'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()