import unittest
from ansible.plugins.become import BecomeBase
from ansible.plugins.become.sudo import BecomeModule



class TestBecomeModule(unittest.TestCase):
    def test_build_become_command(self):
        instance = BecomeModule()
        result = instance.build_become_command(cmd, shell)
        self.assertEqual(result, cmd)

    def test_get_option(self):
        instance = BecomeModule()
        result = instance.get_option('become_exe')
        self.assertEqual(result, instance.name)

    def test_prompt(self):
        instance = BecomeModule()
        result = instance.prompt
        self.assertEqual(result, '[sudo via ansible, key=%s] password:' % instance._id)

    def test_name(self):
        instance = BecomeModule()
        result = instance.name
        self.assertEqual(result, 'sudo')

    def test_fail(self):
        instance = BecomeModule()
        result = instance.fail
        self.assertEqual(result, ('Sorry, try again.',))

    def test_missing(self):
        instance = BecomeModule()
        result = instance.missing
        self.assertEqual(result, ('Sorry, a password is required to run sudo', 'sudo: a password is required'))

    def test_build_success_command(self):
        instance = BecomeModule()
        result = instance._build_success_command(cmd, shell)
        self.assertEqual(result, cmd)

    def test_get_flags(self):
        instance = BecomeModule()
        result = instance.get_flags()
        self.assertEqual(result, '')

    def test_get_prompt(self):
        instance = BecomeModule()
        result = instance.get_prompt()
        self.assertEqual(result, '[sudo via ansible, key=%s] password:' % instance._id)

    def test_get_user(self):
        instance = BecomeModule()
        result = instance.get_user()
        self.assertEqual(result, '')

    def test_get_pass(self):
        instance = BecomeModule()
        result = instance.get_pass()
        self.assertEqual(result, '')

    def test_get_exe(self):
        instance = BecomeModule()
        result = instance.get_exe()
        self.assertEqual(result, '')

    def test_check_success(self):
        instance = BecomeModule()
        result = instance.check_success(cmd, shell)
        self.assertEqual(result, True)

    def test_check_password_prompt(self):
        instance = BecomeModule()
        result = instance.check_password_prompt(cmd, shell)
        self.assertEqual(result, True)

    def test_check_missing(self):
        instance = BecomeModule()
        result = instance.check_missing(cmd, shell)
        self.assertEqual(result, True)

    def test_check_success_sudo(self):
        instance = BecomeModule()
        result = instance.check_success_sudo(cmd, shell)
        self.assertEqual(result, True)

    def test_check_success_su(self):
        instance = BecomeModule()
        result = instance.check_success_su(cmd, shell)
        self.assertEqual(result, True)

    def test_check_success_doas(self):
        instance = BecomeModule()
        result = instance.check_success_doas(cmd, shell)
        self.assertEqual(result, True)

    def test_check_success_pfexec(self):
        instance = BecomeModule()
        result = instance.check_success_pfexec(cmd, shell)
        self.assertEqual(result, True)

    def test_check_success_ksu(self):
        instance = BecomeModule()
        result = instance.check_success_ksu(cmd, shell)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()