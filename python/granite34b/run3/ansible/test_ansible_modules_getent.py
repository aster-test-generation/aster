import unittest
from ansible.module_utils.basic import AnsibleModule


class TestAnsibleModule(unittest.TestCase):
    def test_main(self):
        module = AnsibleModule(
            argument_spec=dict(
                database=dict(type='str', required=True),
                key=dict(type='str', no_log=False),
                service=dict(type='str'),
                split=dict(type='str'),
                fail_key=dict(type='bool', default=True),
            ),
            supports_check_mode=True,
        )
        self.assertIsInstance(module, AnsibleModule)

    def test_get_bin_path(self):
        module = AnsibleModule(
            argument_spec=dict(
                database=dict(type='str', required=True),
                key=dict(type='str', no_log=False),
                service=dict(type='str'),
                split=dict(type='str'),
                fail_key=dict(type='bool', default=True),
            ),
            supports_check_mode=True,
        )
        getent_bin = module.get_bin_path('getent', True)
        self.assertIsNotNone(getent_bin)

    def test_run_command(self):
        module = AnsibleModule(
            argument_spec=dict(
                database=dict(type='str', required=True),
                key=dict(type='str', no_log=False),
                service=dict(type='str'),
                split=dict(type='str'),
                fail_key=dict(type='bool', default=True),
            ),
            supports_check_mode=True,
        )
        rc, out, err = module.run_command(['ls', '-l'])
        self.assertEqual(rc, 0)
        self.assertIsNotNone(out)
        self.assertIsNotNone(err)

if __name__ == '__main__':
    unittest.main()