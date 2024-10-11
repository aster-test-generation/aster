import unittest
from ansible.module_utils.basic import AnsibleModul


class TestBecomeModule(unittest.TestCase):
    def test_check_password_prompt(self):
        instance = BecomeModule()
        b_output = b'Password ?'
        result = instance.check_password_prompt(b_output)
        self.assertTrue(result)

    def test_build_become_command(self):
        instance = BecomeModule()
        cmd = 'ls'
        shell = True
        result = instance.build_become_command(cmd, shell)
        self.assertEqual(result, 'su -c ls')

    def test_build_become_command_with_flags(self):
        instance = BecomeModule()
        cmd = 'ls'
        shell = True
        flags = '-f'
        result = instance.build_become_command(cmd, shell, flags=flags)
        self.assertEqual(result, 'su -f -c ls')

    def test_build_become_command_with_user(self):
        instance = BecomeModule()
        cmd = 'ls'
        shell = True
        user = 'root'
        result = instance.build_become_command(cmd, shell, user=user)
        self.assertEqual(result, 'su -c ls -u root')

    def test_build_become_command_with_all_options(self):
        instance = BecomeModule()
        cmd = 'ls'
        shell = True
        flags = '-f'
        user = 'root'
        result = instance.build_become_command(cmd, shell, flags=flags, user=user)
        self.assertEqual(result, 'su -f -c ls -u root')

    def test_check_password_prompt_with_non_matching_prompt(self):
        instance = BecomeModule()
        b_output = b'Hello ?'
        result = instance.check_password_prompt(b_output)
        self.assertFalse(result)

    def test_check_password_prompt_with_empty_output(self):
        instance = BecomeModule()
        b_output = b''
        result = instance.check_password_prompt(b_output)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()