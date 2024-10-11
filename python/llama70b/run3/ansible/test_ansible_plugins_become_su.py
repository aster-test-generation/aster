import unittest
from ansible.module_utils.become import BecomeModul


class TestBecomeModule(unittest.TestCase):
    def test_init(self):
        instance = BecomeModule()
        self.assertIsInstance(instance, BecomeModule)

    def test_name(self):
        instance = BecomeModule()
        self.assertEqual(instance.name, 'su')

    def test_fail(self):
        instance = BecomeModule()
        self.assertEqual(instance.fail, ('Authentication failure',))

    def test_SU_PROMPT_LOCALIZATIONS(self):
        instance = BecomeModule()
        self.assertEqual(instance.SU_PROMPT_LOCALIZATIONS, [
            'Password',
            '암호',
            'パスワード',
            'Adgangskode',
            'Contraseña',
            'Contrasenya',
            'Hasło',
            'Heslo',
            'Jelszó',
            'Lösenord',
            'Mật khẩu',
            'Mot de passe',
            'Parola',
            'Parool',
            'Pasahitza',
            'Passord',
            'Passwort',
            'Salasana',
            'Sandi',
            'Senha',
            'Wachtwoord',
            'ססמה',
            'Лозинка',
            'Парола',
            'Пароль',
            'गुप्तशब्द',
            'शब्दकूट',
            'సంకేతపదము',
            'හස්පදය',
            '密码',
            '密碼',
            '口令',
        ])

    def test_check_password_prompt(self):
        instance = BecomeModule()
        b_output = b'Password: '
        self.assertTrue(instance.check_password_prompt(b_output))

    def test_build_become_command(self):
        instance = BecomeModule()
        cmd = 'echo hello'
        shell = '/bin/bash'
        result = instance.build_become_command(cmd, shell)
        self.assertEqual(result, 'su -c echo hello')

    def test_build_success_command(self):
        instance = BecomeModule()
        cmd = 'echo hello'
        shell = '/bin/bash'
        result = instance._build_success_command(cmd, shell)
        self.assertEqual(result, 'echo hello')

    def test_get_option(self):
        instance = BecomeModule()
        result = instance.get_option('become_exe')
        self.assertIsNone(result)

    def test_str_method(self):
        instance = BecomeModule()
        result = instance.__str__()
        self.assertEqual(result, 'BecomeModule(name=su)')

    def test_repr_method(self):
        instance = BecomeModule()
        result = instance.__repr__()
        self.assertEqual(result, 'BecomeModule(name=su)')

    def test_eq_method(self):
        instance1 = BecomeModule()
        instance2 = BecomeModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()