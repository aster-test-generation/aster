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
        self.assertEqual(module.params['database'], 'passwd')
        self.assertEqual(module.params['key'], 'root')
        self.assertEqual(module.params['service'], None)
        self.assertEqual(module.params['split'], None)
        self.assertEqual(module.params['fail_key'], True)

if __name__ == '__main__':
    unittest.main()