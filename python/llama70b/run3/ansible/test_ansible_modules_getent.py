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
        rc, out, err = module.run_command(['getent', 'passwd'])
        self.assertEqual(rc, 0)

    def test_fail_json(self):
        module = AnsibleModule({})
        module.fail_json(msg='Test error', exception='Test exception')
        self.assertRaises(SystemExit)

class TestMain(unittest.TestCase):
    def test_main(self):
        main()
        # This test is a bit tricky, as main() doesn't return anything
        # We can only test that it doesn't raise any exceptions

    def test_main_with_database(self):
        module = AnsibleModule({'database': 'passwd'})
        main()
        self.assertIn('getent_passwd', module.facts)

    def test_main_with_key(self):
        module = AnsibleModule({'database': 'passwd', 'key': 'root'})
        main()
        self.assertIn('getent_passwd', module.facts)

    def test_main_with_service(self):
        module = AnsibleModule({'database': 'passwd', 'service': 'test'})
        main()
        self.assertIn('getent_passwd', module.facts)

    def test_main_with_split(self):
        module = AnsibleModule({'database': 'passwd', 'split': ':'})
        main()
        self.assertIn('getent_passwd', module.facts)

    def test_main_with_fail_key(self):
        module = AnsibleModule({'database': 'passwd', 'key': 'nonexistent', 'fail_key': False})
        main()
        self.assertIn('getent_passwd', module.facts)

if __name__ == '__main__':
    unittest.main()