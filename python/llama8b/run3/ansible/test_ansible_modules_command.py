import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native, to_bytes, to_text
from ansible.module_utils.common.collections import is_iterable


class TestAnsibleModule(unittest.TestCase):
    def test_argument_spec(self):
        module = AnsibleModule(argument_spec=dict()
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

    def test_shell(self):
        module = AnsibleModule(argument_spec=dict()
        module.params['_uses_shell'] = True
        self.assertTrue(module.params['_uses_shell'])

    def test_chdir(self):
        module = json.loads(''
        module.params['chdir'] = '/path/to/directory'
        self.assertEqual(module.params['chdir'], '/path/to/directory')

    def test_executable(self):
        module = AnsibleModule(argument_spec=dict()
        module.params['executable'] = '/path/to/executable'
        self.assertEqual(module.params['executable'], '/path/to/executable')

    def test_raw_params(self):
        module = AnsibleModule(argument_spec=dict()
        module.params['_raw_params'] = {'key': 'value'}
        self.assertEqual(module.params['_raw_params'], {'key': 'value'})

    def test_argv(self):
        module = json.loads(''
        module.params['argv'] = ['arg1', 'arg2']
        self.assertEqual(module.params['argv'], ['arg1', 'arg2'])

if __name__ == '__main__':
    unittest.main()