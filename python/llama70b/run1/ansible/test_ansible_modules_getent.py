import unittest
from ansible.modules.getent import main, AnsibleModule


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule({})
        self.assertIsInstance(module, AnsibleModule)

    def test_argument_spec(self):
        module = AnsibleModule({})
        self.assertIn('database', module.argument_spec)
        self.assertIn('key', module.argument_spec)
        self.assertIn('service', module.argument_spec)
        self.assertIn('split', module.argument_spec)
        self.assertIn('fail_key', module.argument_spec)

    def test_get_bin_path(self):
        module = AnsibleModule({})
        self.assertIsNotNone(module.get_bin_path('getent', True))

    def test_run_command(self):
        module = AnsibleModule({})
        cmd = ['getent', 'passwd']
        rc, out, err = module.run_command(cmd)
        self.assertEqual(rc, 0)

    def test_fail_json(self):
        module = AnsibleModule({})
        module.fail_json(msg='Test error', exception='Test exception')
        self.assertRaises(SystemExit)

class TestMain(unittest.TestCase):
    def test_main(self):
        main()

    def test_main_with_database(self):
        module = AnsibleModule({'database': 'passwd'})
        main()
        self.assertIn('getent_passwd', module.result['ansible_facts'])

    def test_main_with_key(self):
        module = AnsibleModule({'database': 'passwd', 'key': 'root'})
        main()
        self.assertIn('getent_passwd', module.result['ansible_facts'])
        self.assertIn('root', module.result['ansible_facts']['getent_passwd'])

    def test_main_with_service(self):
        module = AnsibleModule({'database': 'services', 'service': 'http'})
        main()
        self.assertIn('getent_services', module.result['ansible_facts'])

    def test_main_with_split(self):
        module = AnsibleModule({'database': 'group', 'split': ':'})
        main()
        self.assertIn('getent_group', module.result['ansible_facts'])

    def test_main_with_fail_key(self):
        module = AnsibleModule({'database': 'shadow', 'key': 'www-data', 'fail_key': False})
        main()
        self.assertIn('getent_shadow', module.result['ansible_facts'])
        self.assertIsNone(module.result['ansible_facts']['getent_shadow']['www-data'])

if __name__ == '__main__':
    unittest.main()