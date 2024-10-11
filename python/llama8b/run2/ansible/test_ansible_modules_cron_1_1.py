import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes, to_native
from ansible.module_utils.six.moves import shlex_quote
from ansible.module_utils import AnsibleModul


class TestCron(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        self.assertEqual(module.__init__(), None)

    def test_name(self):
        module = AnsibleModule()
        result = module._ANSIBLE_ARGS.get('name')
        self.assertEqual(result, None)

    def test_minute(self):
        module = AnsibleModule()
        result = module._ANSIBLE_ARGS.get('minute')
        self.assertEqual(result, None)

    def test_hour(self):
        module = AnsibleModule()
        result = module._ANSIBLE_ARGS.get('hour')
        self.assertEqual(result, None)

    def test_job(self):
        module = AnsibleModule()
        result = module._ANSIBLE_ARGS.get('job')
        self.assertEqual(result, None)

    def test_to_bytes(self):
        result = to_bytes('test')
        self.assertEqual(result, b'test')

    def test_to_native(self):
        result = to_native('test')
        self.assertEqual(result, 'test')

    def test_shlex_quote(self):
        result = shlex_quote('test')
        self.assertEqual(result, "'test'")

    def test_get_arg(self):
        module = AnsibleModule()
        result = module.get_arg('name')
        self.assertEqual(result, None)

    def test_get_arg_with_value(self):
        module = AnsibleModule()
        module._ANSIBLE_ARGS = {'name': 'test'}
        result = module.get_arg('name')
        self.assertEqual(result, 'test')

    def test_get_arg_with_default(self):
        module = AnsibleModule()
        module._ANSIBLE_ARGS = {'name': 'test'}
        result = module.get_arg('name', 'default')
        self.assertEqual(result, 'test')

    def test_get_arg_without_value(self):
        module = AnsibleModule()
        result = module.get_arg('name')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()