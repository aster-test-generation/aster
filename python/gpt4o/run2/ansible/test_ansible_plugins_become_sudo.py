import unittest
from ansible.plugins.become.sudo import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def setUp(self):
        self.instance = BecomeModule()

    def test_build_become_command_no_cmd(self):
        result = self.instance.build_become_command('', '/bin/sh')
        self.assertEqual(result, '')

    def test_build_become_command_with_cmd(self):
        self.instance.get_option = lambda x: {
            'become_exe': 'sudo',
            'become_flags': '-H',
            'become_pass': 'password',
            'become_user': 'root'
        }.get(x, None)
        self.instance._id = 'test_id'
        self.instance._build_success_command = lambda cmd, shell: cmd
        result = self.instance.build_become_command('ls', '/bin/sh')
        expected = 'sudo -H -p "[sudo via ansible, key=test_id] password:" -u root ls'
        self.assertEqual(result, 'sudo -H -p "[sudo via ansible, key=test_id] password:" -u root ls')

    def test_build_become_command_no_become_pass(self):
        self.instance.get_option = lambda x: {
            'become_exe': 'sudo',
            'become_flags': '-H',
            'become_pass': None,
            'become_user': 'root'
        }.get(x, None)
        self.instance._build_success_command = lambda cmd, shell: cmd
        result = self.instance.build_become_command('ls', '/bin/sh')
        expected = 'sudo -H  -u root ls'
        self.assertEqual(result, expected)

    def test_build_become_command_no_become_user(self):
        self.instance.get_option = lambda x: {
            'become_exe': 'sudo',
            'become_flags': '-H',
            'become_pass': 'password',
            'become_user': None
        }.get(x, None)
        self.instance._id = 'test_id'
        self.instance._build_success_command = lambda cmd, shell: cmd
        result = self.instance.build_become_command('ls', '/bin/sh')
        expected = 'sudo -H -p "[sudo via ansible, key=test_id] password:"  ls'
        self.assertEqual(result, 'sudo -H -p "[sudo via ansible, key=test_id] password:"  ls')

    def test_build_become_command_no_flags(self):
        self.instance.get_option = lambda x: {
            'become_exe': 'sudo',
            'become_flags': None,
            'become_pass': 'password',
            'become_user': 'root'
        }.get(x, None)
        self.instance._id = 'test_id'
        self.instance._build_success_command = lambda cmd, shell: cmd
        result = self.instance.build_become_command('ls', '/bin/sh')
        expected = 'sudo  -p "[sudo via ansible, key=test_id] password:" -u root ls'
        self.assertEqual(result, 'sudo  -p "[sudo via ansible, key=test_id] password:" -u root ls')

if __name__ == '__main__':
    unittest.main()