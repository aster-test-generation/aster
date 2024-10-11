import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native, to_bytes, to_text
from ansible.module_utils.common.collections import is_iterable
from ansible.modules.command import *




class TestCommandModule(unittest.TestCase):
    def test_command_module(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], '')

    def test_command_module_with_stderr(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l', 'non_existent_file'])
        self.assertEqual(result['rc'], 1)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], 'ls: non_existent_file: No such file or directory\n')

    def test_command_module_with_stdout(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'Hello, World!'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Hello, World!\n')
        self.assertEqual(result['stderr'], '')

    def test_command_module_with_stdout_and_stderr(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l', 'non_existent_file'])
        self.assertEqual(result['rc'], 1)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], 'ls: non_existent_file: No such file or directory\n')

    def test_command_module_with_args(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l', '-d', '/path/to/directory'])
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], '')

    def test_command_module_with_start(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l'])
        self.assertIsInstance(result['start'], str)

    def test_command_module_with_end(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l'])
        self.assertIsInstance(result['end'], str)

    def test_command_module_with_delta(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l'])
        self.assertIsInstance(result['delta'], str)

    def test_command_module_with_stdout_lines(self):
        module = AnsibleModule()
        result = module.run_command(['echo', 'Hello, World!'])
        self.assertIsInstance(result['stdout_lines'], list)

    def test_command_module_with_stderr_lines(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l', 'non_existent_file'])
        self.assertIsInstance(result['stderr_lines'], list)

    def test_command_module_with_cmd(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l'])
        self.assertIsInstance(result['cmd'], list)

    def test_command_module_with_rc(self):
        module = AnsibleModule()
        result = module.run_command(['ls', '-l'])
        self.assertIsInstance(result['rc'], int)

if __name__ == '__main__':
    unittest.main()