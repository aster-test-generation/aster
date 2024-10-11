import unittest
from ansible.modules.command import main


class TestCommandModule(unittest.TestCase):
    def test_command_execution(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(type='str', required=False, default=''), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=True)
        r = main(module)
        self.assertEqual(r['rc'], 0)
        self.assertEqual(r['changed'], True)
        self.assertEqual(r['msg'], '')
        self.assertEqual(r['start'], None)
        self.assertEqual(r['end'], None)
        self.assertEqual(r['delta'], None)
        self.assertEqual(r['stdout'], '')
        self.assertEqual(r['stderr'], '')
        self.assertEqual(r['cmd'], None)
        self.assertEqual(r['stdout_lines'], [])
        self.assertEqual(r['stderr_lines'], [])

    def test_command_execution_with_stdin(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(type='str', required=False, default=''), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=True)
        module.params['stdin'] = 'Hello, World!'
        r = main(module)
        self.assertEqual(r['rc'], 0)
        self.assertEqual(r['changed'], True)
        self.assertEqual(r['msg'], '')
        self.assertEqual(r['start'], None)
        self.assertEqual(r['end'], None)
        self.assertEqual(r['delta'], None)
        self.assertEqual(r['stdout'], 'Hello, World!')
        self.assertEqual(r['stderr'], '')
        self.assertEqual(r['cmd'], None)
        self.assertEqual(r['stdout_lines'], ['Hello, World!'])
        self.assertEqual(r['stderr_lines'], [])

    def test_command_execution_with_stdin_add_newline(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(type='str', required=False, default=''), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=True)
        module.params['stdin'] = 'Hello, World!'
        module.params['stdin_add_newline'] = False
        r = main(module)
        self.assertEqual(r['rc'], 0)
        self.assertEqual(r['changed'], True)
        self.assertEqual(r['msg'], '')
        self.assertEqual(r['start'], None)
        self.assertEqual(r['end'], None)
        self.assertEqual(r['delta'], None)
        self.assertEqual(r['stdout'], 'Hello, World!')
        self.assertEqual(r['stderr'], '')
        self.assertEqual(r['cmd'], None)
        self.assertEqual(r['stdout_lines'], ['Hello, World!'])
        self.assertEqual(r['stderr_lines'], [])

if __name__ == '__main__':
    unittest.main()