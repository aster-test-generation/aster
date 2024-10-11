import unittest
from ansible.modules.command import *


class TestCommandModule(unittest.TestCase):
    def test_command_module(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello\n')
        self.assertEqual(result['stderr'], '')

    def test_command_module_with_stderr(self):
        module = AnsibleModule()
        result = module.run_command(['ls', 'non_existent_file'])
        self.assertEqual(result['rc'], 1)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], 'ls: non_existent_file: No such file or directory\n')

    def test_command_module_with_stdout_and_stderr(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], '')

    def test_command_module_with_args(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello', 'world'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello world\n')
        self.assertEqual(result['stderr'], '')

    def test_command_module_with_private_method(self):
        module = AnsibleModule()
        result = module._AnsibleModule__parse_args(['echo', 'hello'])
        self.assertEqual(result, {'cmd': ['echo', 'hello']})

    def test_command_module_with_protected_method(self):
        module = AnsibleModule()
        result = module._AnsibleModule__get_stdin()
        self.assertEqual(result, '')

    def test_command_module_with_magic_method(self):
        module = AnsibleModule()
        result = str(module)
        self.assertEqual(result, 'AnsibleModule')

    def test_command_module_with_magic_method_repr(self):
        module = AnsibleModule()
        result = repr(module)
        self.assertEqual(result, 'AnsibleModule()')

if __name__ == '__main__':
    unittest.main()