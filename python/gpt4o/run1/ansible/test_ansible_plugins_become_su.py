import unittest
from ansible.plugins.become.su import BecomeModule
from ansible.module_utils._text import to_bytes
from unittest.mock import patch, MagicMock


class TestBecomeModule(unittest.TestCase):
    def setUp(self):
        self.instance = BecomeModule()

    def test_check_password_prompt(self):
        b_output = to_bytes("Password: ")
        result = self.instance._load_name(b_output)
        self.assertTrue(result)

    def test_check_password_prompt_no_match(self):
        b_output = to_bytes("No match here")
        result = self.instance._load_name(b_output)
        self.assertFalse(result)

    @patch('ansible.plugins.become.su.BecomeModule.get_option')
    def test_build_become_command(self, mock_get_option):
        mock_get_option.side_effect = lambda x: {
            'become_exe': 'su',
            'become_flags': '-l',
            'become_user': 'root',
            'prompt_l10n': None
        }.get(x, None)
        cmd = 'whoami'
        shell = '/bin/sh'
        result = self.instance.build_become_command(cmd, shell.SHELL_FAMILY)
        expected_cmd = "su -l root -c 'whoami'"
        self.assertEqual(result, expected_cmd)

    @patch('ansible.plugins.become.su.BecomeModule.get_option')
    def test_build_become_command_no_cmd(self, mock_get_option):
        mock_get_option.side_effect = lambda x: {
            'become_exe': 'su',
            'become_flags': '-l',
            'become_user': 'root',
            'prompt_l10n': None
        }.get(x, None)
        cmd = ''
        shell = '/bin/sh'
        result = self.instance.build_become_command(cmd, shell)
        self.assertEqual(result, '')

    def test_protected_method(self):
        result = self.instance._build_success_command('whoami', '/bin/sh')
        self.assertIn('whoami', result)

    def test_magic_methods(self):
        self.assertEqual(self.instance.name, 'su')
        self.assertEqual(self.instance.fail, ('Authentication failure',))

if __name__ == '__main__':
    unittest.main()