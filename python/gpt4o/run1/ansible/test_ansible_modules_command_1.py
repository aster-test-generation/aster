import unittest
from ansible.modules.command import *


class TestCommandModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                _raw_params=dict(type='str', required=True),
                chdir=dict(type='path'),
                creates=dict(type='path'),
                removes=dict(type='path'),
                executable=dict(type='path'),
                warn=dict(type='bool', default=True),
                stdin=dict(type='str'),
                stdin_add_newline=dict(type='bool', default=True),
                strip_empty_ends=dict(type='bool', default=True),
                cmd=dict(type='list', elements='str'),
                argv=dict(type='list', elements='str'),
            ),
            supports_check_mode=True
        )

    def test_documentation(self):
        self.assertIn('module: command', DOCUMENTATION)

    def test_examples(self):
        self.assertIn('- name: Return motd to registered var', EXAMPLES)

    def test_return(self):
        self.assertIn('msg:', RETURN)

    def test_command_execution(self):
        result = self.module.run_command('echo hello')
        self.assertEqual(result[0], 0)
        self.assertIn('hello', result[1])

    def test_command_execution_with_error(self):
        result = self.module.run_command('ls non_existent_file')
        self.assertNotEqual(result[0], 0)
        self.assertIn('No such file or directory', result[2])

    def test_private_method(self):
        result = self.module._AnsibleModule__getattr('params')
        self.assertIsInstance(result, dict)

    def test_protected_method(self):
        result = self.module._check_mode()
        self.assertFalse(result)

    def test_str_method(self):
        result = self.module.__str__()
        self.assertIn('AnsibleModule', result)

    def test_repr_method(self):
        result = self.module.__repr__()
        self.assertIn('AnsibleModule', result)

if __name__ == '__main__':
    unittest.main()