import unittest
from ansible.modules.sysvinit import *


class TestSysvinitModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                name=dict(type='str', required=True, aliases=['service']),
                state=dict(type='str', choices=['started', 'stopped', 'restarted', 'reloaded']),
                enabled=dict(type='bool'),
                sleep=dict(type='int', default=1),
                pattern=dict(type='str'),
                runlevels=dict(type='list', elements='str'),
                arguments=dict(type='str', aliases=['args']),
                daemonize=dict(type='bool', default=False)
            ),
            supports_check_mode=True
        )

    def test_documentation(self):
        self.assertIn('module: sysvinit', DOCUMENTATION)

    def test_examples(self):
        self.assertIn('- name: Make sure apache2 is started', EXAMPLES)

    def test_return(self):
        self.assertIn('results:', RETURN)

    def test_sysv_is_enabled(self):
        result = sysv_is_enabled('apache2')
        self.assertIsInstance(result, bool)

    def test_get_sysv_script(self):
        result = get_sysv_script('apache2')
        self.assertIsInstance(result, str)

    def test_sysv_exists(self):
        result = sysv_exists('apache2')
        self.assertIsInstance(result, bool)

    def test_fail_if_missing(self):
        with self.assertRaises(Exception):
            fail_if_missing('apache2')

    def test_get_ps(self):
        result = get_ps()
        self.assertIsInstance(result, str)

    def test_daemonize(self):
        result = daemonize('apache2')
        self.assertIsNone(result)

    def test_init(self):
        self.assertIsInstance(self.module, AnsibleModule)

    def test_str(self):
        result = str(self.module)
        self.assertIsInstance(result, str)

    def test_repr(self):
        result = repr(self.module)
        self.assertIsInstance(result, str)

    def test_eq(self):
        another_module = AnsibleModule(
            argument_spec=dict(
                name=dict(type='str', required=True, aliases=['service']),
                state=dict(type='str', choices=['started', 'stopped', 'restarted', 'reloaded']),
                enabled=dict(type='bool'),
                sleep=dict(type='int', default=1),
                pattern=dict(type='str'),
                runlevels=dict(type='list', elements='str'),
                arguments=dict(type='str', aliases=['args']),
                daemonize=dict(type='bool', default=False)
            ),
            supports_check_mode=True
        )
        self.assertEqual(self.module, another_module)

if __name__ == '__main__':
    unittest.main()