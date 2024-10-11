import unittest
from ansible.plugins.become import BecomeModule


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

if __name__ == '__main__':
    unittest.main()