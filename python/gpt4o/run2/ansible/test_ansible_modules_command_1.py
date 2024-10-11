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
                executable=dict(type='str'),
                warn=dict(type='bool', default=True),
                stdin=dict(type='str'),
                strip_empty_ends=dict(type='bool', default=True),
                _uses_shell=dict(type='bool', default=False),
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
        self.assertEqual(result[1].strip(), 'hello')

    def test_command_execution_with_error(self):
        result = self.module.run_command('ls non_existent_file')
        self.assertNotEqual(result[0], 0)
        self.assertIn('No such file or directory', result[2])

    def test_command_execution_with_chdir(self):
        self.module.params['chdir'] = '/'
        result = self.module.run_command('pwd')
        self.assertEqual(result[0], 0)
        self.assertEqual(result[1].strip(), '/')

    def test_command_execution_with_creates(self):
        self.module.params['creates'] = '/tmp/testfile'
        result = self.module.run_command('touch /tmp/testfile')
        self.assertEqual(result[0], 0)
        self.assertTrue(os.path.exists('/tmp/testfile'))
        os.remove('/tmp/testfile')

    def test_command_execution_with_removes(self):
        open('/tmp/testfile', 'w').close()
        self.module.params['removes'] = '/tmp/testfile'
        result = self.module.run_command('rm /tmp/testfile')
        self.assertEqual(result[0], 0)
        self.assertFalse(os.path.exists('/tmp/testfile'))

    def test_command_execution_with_executable(self):
        self.module.params['executable'] = '/bin/bash'
        result = self.module.run_command('echo hello')
        self.assertEqual(result[0], 0)
        self.assertEqual(result[1].strip(), 'hello')

    def test_command_execution_with_stdin(self):
        self.module.params['stdin'] = 'hello'
        result = self.module.run_command('cat')
        self.assertEqual(result[0], 0)
        self.assertEqual(result[1].strip(), 'hello')

    def test_command_execution_with_strip_empty_ends(self):
        self.module.params['strip_empty_ends'] = False
        result = self.module.run_command('echo -e "hello\n\n"')
        self.assertEqual(result[0], 0)
        self.assertEqual(result[1], 'hello\n\n')

    def test_command_execution_with_uses_shell(self):
        self.module.params['_uses_shell'] = True
        result = self.module.run_command('echo $SHELL')
        self.assertEqual(result[0], 0)
        self.assertIn('/bin', result[1])

if __name__ == '__main__':
    unittest.main()