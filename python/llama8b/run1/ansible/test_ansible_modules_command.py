import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native, to_bytes, to_text
from ansible.module_utils.common.collections import is_iterable


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = json.loads("{}"
        self.assertEqual(module.params['_uses_shell'], False)
        self.assertEqual(module.params['chdir'], None)
        self.assertEqual(module.params['executable'], None)
        self.assertEqual(module.params['_raw_params'], {})
        self.assertEqual(module.params['argv'], [])
        self.assertEqual(module.params['creates'], None)
        self.assertEqual(module.params['removes'], None)
        self.assertEqual(module.params['warn'], False)
        self.assertEqual(module.params['stdin'], None)
        self.assertEqual(module.params['stdin_add_newline'], True)
        self.assertEqual(module.params['strip_empty_ends'], True)

    def test_check_mode(self):
        module = json.loads(''
        self.assertEqual(module.check_mode, False)

    def test_run_command(self):
        module = json.loads(''
        r = {'changed': False, 'stdout': '', 'stderr': '', 'rc': None, 'cmd': None, 'start': None, 'end': None, 'delta': None, 'msg': ''}
        module.run_command(['command'], executable=None, use_unsafe_shell=False, encoding=None, data=None, binary_data=False)
        self.assertEqual(r['changed'], True)
        self.assertEqual(r['stdout'], '')
        self.assertEqual(r['stderr'], '')
        self.assertEqual(r['rc'], None)
        self.assertEqual(r['cmd'], ['command'])
        self.assertEqual(r['start'], None)
        self.assertEqual(r['end'], None)
        self.assertEqual(r['delta'], None)
        self.assertEqual(r['msg'], '')

    def test_warn(self):
        module = AnsibleModule(argument_spec=dict(_raw_params=dict(), _uses_shell=dict(type='bool', default=False), argv=dict(type='list', elements='str'), chdir=dict(type='path'), executable=dict(), creates=dict(type='path'), removes=dict(type='path'), warn=dict(type='bool', default=False, removed_in_version='2.14', removed_from_collection='ansible.builtin'), stdin=dict(required=False), stdin_add_newline=dict(type='bool', default=True), strip_empty_ends=dict(type='bool', default=True)), supports_check_mode=False
        module.warn("Warning message")
        self.assertEqual(module.fail_json, module.fail_json)

if __name__ == '__main__':
    unittest.main()