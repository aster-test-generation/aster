import unittest
from ansible.module_utils.basic import AnsibleModul
from ansible.plugins.become import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = True
        result = become_module.build_become_command(cmd, shell)
        self.assertEqual(result, 'sudo -p "[sudo via ansible, key=%s] password:" -u %s ls' % (become_module._id, become_module.get_option('become_user') or ''))

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
        option = 'become_flags'
        result = become_module.get_option(option)
        self.assertEqual(result, '')

    def test_get_option_default_missing(self):
        become_module = BecomeModule()
        option = 'non_existent_option_default'
        result = become_module.get_option(option)
        self.assertEqual(result, '')

    def test_get_option_default_value(self):
        become_module = BecomeModule()
        option = 'become_user'
        result = become_module.get_option(option)
        self.assertEqual(result, '')

    def test_get_option_default_value_missing(self):
        become_module = BecomeModule()
        option = 'non_existent_option_default_value'
        result = become_module.get_option(option)
        self.assertEqual(result, '')

    def test_build_success_command(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = True
        result = become_module._build_success_command(cmd, shell)
        self.assertEqual(result, 'ls')

    def test_build_success_command_shell(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = False
        result = become_module._build_success_command(cmd, shell)
        self.assertEqual(result, 'ls')

    def test_build_success_command_shell_missing(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = None
        result = become_module._build_success_command(cmd, shell)
        self.assertEqual(result, 'ls')

    def test_build_success_command_shell_default(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = ''
        result = become_module._build_success_command(cmd, shell)
        self.assertEqual(result, 'ls')

    def test_build_success_command_shell_default_missing(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = ''
        result = become_module._build_success_command(cmd, shell)
        self.assertEqual(result, 'ls')

    def test_build_success_command_shell_default_value(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = 'bash'
        result = become_module._build_success_command(cmd, shell)
        self.assertEqual(result, 'bash -c ls')

    def test_build_success_command_shell_default_value_missing(self):
        become_module = BecomeModule()
        cmd = 'ls'
        shell = 'bash'
        result = become_module._build_success_command(cmd, shell)
        self.assertEqual(result, 'bash -c ls')

if __name__ == '__main__':
    unittest.main()