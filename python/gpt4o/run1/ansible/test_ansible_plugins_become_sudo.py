import unittest
from ansible.plugins.become.sudo import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def setUp(self):
        self.instance = BecomeModule()

    def test_build_become_command_no_cmd(self):
        result = self.instance.build_become_command('', '/bin/sh')
        self.assertEqual(result, '')

    def test_build_become_command_with_cmd(self):
        self.instance.set_option('become_exe', 'sudo')
        self.instance.set_option('become_flags', '-H')
        self.instance.set_option('become_user', 'root')
        self.instance.set_option('become_pass', 'password')
        result = self.instance.build_become_command('ls', 'SHELL_FAMILY')
        expected_prompt = '[sudo via ansible, key=%s] password:' % self.instance._id
        expected_command = 'sudo -H -p "%s" -u root ls' % expected_prompt
        self.assertIn(expected_command, result)

    def test_build_become_command_no_become_pass(self):
        self.instance.set_option('become_exe', 'sudo')
        self.instance.set_option('become_flags', '-H')
        self.instance.set_option('become_user', 'root')
        self.instance.set_option('become_pass', None)
        result = self.instance.build_become_command('ls', 'ECHO')
        expected_command = 'sudo -H -u root ls'
        self.assertIn(expected_command, result)

    def test_build_become_command_no_become_user(self):
        self.instance.set_option('become_exe', 'sudo')
        self.instance.set_option('become_flags', '-H')
        self.instance.set_option('become_user', None)
        self.instance.set_option('become_pass', 'password')
        result = self.instance.build_become_command('ls', 'ECHO')
        expected_prompt = '[sudo via ansible, key=%s] password:' % self.instance._id
        expected_command = 'sudo -H -p "%s" ls' % expected_prompt
        self.assertIn(expected_command, result)

    def test_build_become_command_no_flags(self):
        self.instance.set_option('become_exe', 'sudo')
        self.instance.set_option('become_flags', None)
        self.instance.set_option('become_user', 'root')
        self.instance.set_option('become_pass', 'password')
        result = self.instance.build_become_command('ls', 'SHELL_FAMILY')
        expected_prompt = '[sudo via ansible, key=%s] password:' % self.instance._id
        expected_command = 'sudo -p "%s" -u root ls' % expected_prompt
        self.assertIn(expected_command, result)

    def test_build_become_command_no_become_exe(self):
        self.instance.set_option('become_exe', None)
        self.instance.set_option('become_flags', '-H')
        self.instance.set_option('become_user', 'root')
        self.instance.set_option('become_pass', 'password')
        result = self.instance.build_become_command('ls', 'ECHO')
        expected_prompt = '[sudo via ansible, key=%s] password:' % self.instance._id
        expected_command = 'sudo -H -p "%s" -u root ls' % expected_prompt
        self.assertIn(expected_command, result)

    def test_build_become_command_no_options(self):
        result = self.instance.build_become_command('ls', 'ECHO')
        expected_command = 'sudo ls'
        self.assertIn(expected_command, result)

if __name__ == '__main__':
    unittest.main()