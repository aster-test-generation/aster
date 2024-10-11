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
                argv=dict(type='list', elements='str'),
            ),
            supports_check_mode=True
        )

    def test_command_execution(self):
        result = self.module.run_command('echo hello')
        self.assertEqual(result[0], 0)
        self.assertEqual(result[1], 'hello\n')
        self.assertEqual(result[2], '')

    def test_command_execution_with_error(self):
        result = self.module.run_command('ls non_existent_file')
        self.assertNotEqual(result[0], 0)
        self.assertIn('No such file or directory', result[2])

    def test_command_execution_with_chdir(self):
        self.module.params['chdir'] = '/'
        result = self.module.run_command('pwd')
        self.assertEqual(result[1].strip(), '/')

    def test_command_execution_with_creates(self):
        self.module.params['creates'] = '/tmp/non_existent_file'
        result = self.module.run_command('echo hello')
        self.assertEqual(result[0], 0)

    def test_command_execution_with_removes(self):
        self.module.params['removes'] = '/tmp/non_existent_file'
        result = self.module.run_command('echo hello')
        self.assertEqual(result[0], 0)

    def test_command_execution_with_executable(self):
        self.module.params['executable'] = '/bin/sh'
        result = self.module.run_command('echo hello')
        self.assertEqual(result[0], 0)
        self.assertEqual(result[1], 'hello\n')

    def test_command_execution_with_stdin(self):
        self.module.params['stdin'] = 'input data'
        result = self.module.run_command('cat')
        self.assertEqual(result[1], 'input data')

    def test_command_execution_with_argv(self):
        self.module.params['argv'] = ['echo', 'hello']
        result = self.module.run_command(None)
        self.assertEqual(result[1], 'hello\n')

    def test_command_execution_with_warn(self):
        self.module.params['warn'] = False
        result = self.module.run_command('echo hello')
        self.assertEqual(result[0], 0)

    def test_command_execution_with_strip_empty_ends(self):
        self.module.params['strip_empty_ends'] = False
        result = self.module.run_command('echo hello')
        self.assertEqual(result[1], 'hello\n')

    def test_command_execution_with_stdin_add_newline(self):
        self.module.params['stdin_add_newline'] = False
        self.module.params['stdin'] = 'input data'
        result = self.module.run_command('cat')
        self.assertEqual(result[1], 'input data')

if __name__ == '__main__':
    unittest.main()