import unittest
from ansible.modules.sysvinit import *


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        self.assertIsInstance(module, AnsibleModule)

    def test_main(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        result = main()
        self.assertIsInstance(result, dict)

    def test_fail_if_missing(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        fail_if_missing(module, True, 'test_service')
        self.assertTrue(True)  # no exception raised

    def test_get_sysv_script(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        script = get_sysv_script('test_service')
        self.assertIsInstance(script, str)

    def test_sysv_is_enabled(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        enabled = sysv_is_enabled('test_service')
        self.assertIsInstance(enabled, bool)

    def test_get_ps(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        ps = get_ps(module, 'test_pattern')
        self.assertIsInstance(ps, bool)

    def test_daemonize(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        daemonize(module, 'test_command')
        self.assertTrue(True)  # no exception raised

    def test_run_command(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        rc, out, err = module.run_command('test_command')
        self.assertIsInstance(rc, int)
        self.assertIsInstance(out, str)
        self.assertIsInstance(err, str)

    def test_exit_json(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        module.exit_json(**{'test_key': 'test_value'})
        self.assertTrue(True)  # no exception raised

    def test_private_method(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        result = module._AnsibleModule__private_method('test_arg')
        self.assertIsInstance(result, str)

    def test_protected_method(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        result = module._AnsibleModule__protected_method('test_arg')
        self.assertIsInstance(result, str)

    def test_magic_method_init(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        self.assertIsInstance(module, AnsibleModule)

    def test_magic_method_str(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        result = str(module)
        self.assertIsInstance(result, str)

    def test_magic_method_repr(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        result = repr(module)
        self.assertIsInstance(result, str)

    def test_magic_method_eq(self):
        module1 = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        module2 = AnsibleModule(argument_spec=dict(name=dict(required=True, type='str', aliases=['service'])))
        self.assertTrue(module1 == module2)

if __name__ == '__main__':
    unittest.main()