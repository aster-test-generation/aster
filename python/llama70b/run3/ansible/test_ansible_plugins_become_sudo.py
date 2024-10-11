import unittest
from ansible.module_utils.become.sudo import BecomeModul


class TestBecomeModule(unittest.TestCase):
    def test_init(self):
        instance = BecomeModule()
        self.assertIsInstance(instance, BecomeModule)

    def test_name(self):
        instance = BecomeModule()
        self.assertEqual(instance.name, 'sudo')

    def test_fail(self):
        instance = BecomeModule()
        self.assertEqual(instance.fail, ('Sorry, try again.',))

    def test_missing(self):
        instance = BecomeModule()
        self.assertEqual(instance.missing, ('Sorry, a password is required to run sudo', 'sudo: a password is required'))

    def test_build_become_command(self):
        instance = BecomeModule()
        cmd = 'echo hello'
        shell = '/bin/bash'
        result = instance.build_become_command(cmd, shell)
        self.assertIn('sudo', result)

    def test_get_option(self):
        instance = BecomeModule()
        instance.options = {'become_exe': 'sudo'}
        result = instance.get_option('become_exe')
        self.assertEqual(result, 'sudo')

    def test_build_success_command(self):
        instance = BecomeModule()
        cmd = 'echo hello'
        shell = '/bin/bash'
        result = instance._build_success_command(cmd, shell)
        self.assertIn(cmd, result)

    def test_str_method(self):
        instance = BecomeModule()
        result = instance.__str__()
        self.assertEqual(result, 'BecomeModule(name=sudo)')

    def test_repr_method(self):
        instance = BecomeModule()
        result = instance.__repr__()
        self.assertEqual(result, 'BecomeModule(name=sudo)')

    def test_eq_method(self):
        instance1 = BecomeModule()
        instance2 = BecomeModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()