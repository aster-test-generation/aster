import unittest
from ansible.module_utils.become.sudo import BecomeModul


class TestBecomeModule(unittest.TestCase):
    def test_init(self):
        instance = BecomeModule()
        self.assertIsInstance(instance, BecomeModule)

    def test_build_become_command(self):
        instance = BecomeModule()
        cmd = "echo hello"
        shell = "/bin/bash"
        result = instance.build_become_command(cmd, shell)
        self.assertIn("sudo", result)

    def test_get_option(self):
        instance = BecomeModule()
        result = instance.get_option('become_exe')
        self.assertIsNone(result)

    def test_build_success_command(self):
        instance = BecomeModule()
        cmd = "echo hello"
        shell = "/bin/bash"
        result = instance._build_success_command(cmd, shell)
        self.assertIn(cmd, result)

    def test_str_method(self):
        instance = BecomeModule()
        result = instance.__str__()
        self.assertEqual(result, "sudo")

    def test_repr_method(self):
        instance = BecomeModule()
        result = instance.__repr__()
        self.assertEqual(result, "BecomeModule(name='sudo')")

    def test_private_method__id(self):
        instance = BecomeModule()
        result = instance._BecomeModule__id
        self.assertIsNotNone(result)

    def test_private_method_prompt(self):
        instance = BecomeModule()
        instance.get_option('become_pass')  # set prompt
        result = instance.prompt
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()