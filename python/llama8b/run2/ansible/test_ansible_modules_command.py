import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native, to_bytes, to_text
from ansible.module_utils.common.collections import is_iterable
from ansible.module_utils.basic import


class TestCommand(unittest.TestCase):
    def test_main(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False, removed_in_version='2.14', removed_from_collection='ansible.builtin'), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=True)
        result = main(module)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['rc'], None)
        self.assertEqual(result['cmd'], None)
        self.assertEqual(result['start'], None)
        self.assertEqual(result['end'], None)
        self.assertEqual(result['delta'], None)
        self.assertEqual(result['msg'], '')

    def test_main_with_shell(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False, removed_in_version='2.14', removed_from_collection='ansible.builtin'), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=True)
        module.params['_uses_shell'] = True
        result = main(module)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['rc'], None)
        self.assertEqual(result['cmd'], None)
        self.assertEqual(result['start'], None)
        self.assertEqual(result['end'], None)
        self.assertEqual(result['delta'], None)
        self.assertEqual(result['msg'], '')

    def test_main_with_argv(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False, removed_in_version='2.14', removed_from_collection='ansible.builtin'), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=True)
        module.params['argv'] = ['echo', 'hello']
        result = main(module)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['rc'], None)
        self.assertEqual(result['cmd'], ['echo', 'hello'])
        self.assertEqual(result['start'], None)
        self.assertEqual(result['end'], None)
        self.assertEqual(result['delta'], None)
        self.assertEqual(result['msg'], '')

    def test_main_with_chdir(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False, removed_in_version='2.14', removed_from_collection='ansible.builtin'), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=True)
        module.params['chdir'] = '/path/to/directory'
        result = main(module)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['stdout'], '')
        self.assertEqual(result['stderr'], '')
        self.assertEqual(result['rc'], None)
        self.assertEqual(result['cmd'], None)
        self.assertEqual(result['start'], None)
        self.assertEqual(result['end'], None)
        self.assertEqual(result['delta'], None)
        self.assertEqual(result['msg'], '')

if __name__ == '__main__':
    unittest.main()