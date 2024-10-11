import unittest
from ansible.plugins.become import BecomePlugi
from ansible.plugins.become import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, 'sudo -p "[sudo via ansible, key=%s] password:" -u %s ls' % (become_module._id, become_module.get_option('become_user') or ''))

    def test_build_become_command_no_user(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, 'sudo -p "[sudo via ansible, key=%s] password:" ls' % become_module._id)

    def test_build_become_command_no_flags(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, 'sudo -p "[sudo via ansible, key=%s] password:" ls' % become_module._id)

    def test_build_become_command_with_flags(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, 'sudo -p "[sudo via ansible, key=%s] password:" -n ls' % become_module._id)

    def test_get_option(self):
        become_module = BecomeModule()
        option = 'become_exe'
        result = become_module.get_option(option)
        self.assertEqual(result, 'sudo')

    def test_get_option_missing(self):
        become_module = BecomeModule()
        option = 'non_existent_option'
        result = become_module.get_option(option)
        self.assertIsNone(result)

    def test_get_option_default(self):
        become_module = BecomeModule()
        option = 'become_user'
        result = become_module.get_option(option)
        self.assertIsNone(result)

    def test_get_option_default_value(self):
        become_module = BecomeModule()
        option = 'become_user'
        become_module.set_option(option, 'user')
        result = become_module.get_option(option)
        self.assertEqual(result, 'user')

if __name__ == '__main__':
    unittest.main()