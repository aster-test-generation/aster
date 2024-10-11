import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native, to_bytes, to_text
from ansible.module_utils.common.collections import is_iterable
from ansible.modules.command import command


class TestCommandModule(unittest.TestCase):
    def test_command_module_init(self):
        module = AnsibleModule()
        self.assertIsInstance(module, AnsibleModule)

    def test_command_module_run(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello\n')

    def test_command_module_run_with_stderr(self):
        module = AnsilleModule()
        result = module.run_command(['ls', 'nonexistent_file'])
        self.assertEqual(result['rc'], 1)
        self.assertEqual(result['stderr'], 'ls: nonexistent_file: No such file or directory\n')

    def test_command_module_run_with_stdout_lines(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello', 'world'])
        self.assertEqual(result['stdout_lines'], ['hello', 'world'])

    def test_command_module_run_with_stderr_lines(self):
        module = AnsibleModule()
        result = module.run_command(['ls', 'nonexistent_file'])
        self.assertEqual(result['stderr_lines'], ['ls: nonexistent_file: No such file or directory'])

    def test_command_module_run_with_args(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello', 'world'], args=['-n'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello world\n')

    def test_command_module_run_with_env(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello'], env={'FOO': 'bar'})
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello\n')

    def test_command_module_run_with_chdir(self):
        module = AnsibleModule()
        result = module.run_command(['ls'], chdir='/path/to/directory')
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], '...')

    def test_command_module_run_with_shell(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello'], shell=True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello\n')

    def test_command_module_run_with_shell_escape(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello'], shell=True, shell_escape=True)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello\n')

    def test_command_module_run_with_shell_escape_false(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'hello'], shell=True, shell_escape=False)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'hello\n')

if __name__ == '__main__':
    unittest.main()