import unittest
from ansible.modules.command import CommandModule


class TestCommandModule(unittest.TestCase):
    def test_command_execution(self):
        module = CommandModule()
        result = module.run(cmd='ls -l')
        self.assertEqual(result['rc'], 0)
        self.assertIn('total', result['stdout'])

    def test_private_method(self):
        module = CommandModule()
        result = module._run_command('ls -l')
        self.assertEqual(result['rc'], 0)
        self.assertIn('total', result['stdout'])

    def test_protected_method(self):
        module = CommandModule()
        result = module._check_args('ls -l')
        self.assertEqual(result['rc'], 0)
        self.assertIn('total', result['stdout'])

    def test_magic_method(self):
        module = CommandModule()
        result = module.__str__()
        self.assertEqual(result, 'CommandModule')

if __name__ == '__main__':
    unittest.main()