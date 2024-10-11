import unittest
from ansible.modules.sysvinit import AnsibleModule, sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test___str__(self):
        instance = AnsibleModule()
        result = instance.__str__()
        self.assertEqual(result, "AnsibleModule")

    def test___repr__(self):
        instance = AnsibleModule()
        result = instance.__repr__()
        self.assertEqual(result, "AnsibleModule()")

    def test_run_command(self):
        instance = AnsibleModule()
        result = instance.run_command(["echo", "hello"])
        self.assertEqual(result, (0, "hello\n", ""))

    def test_sysv_is_enabled(self):
        result = sysv_is_enabled("apache2")
        self.assertIsInstance(result, bool)

    def test_get_sysv_script(self):
        result = get_sysv_script("apache2")
        self.assertIsInstance(result, str)

    def test_sysv_exists(self):
        result = sysv_exists("apache2")
        self.assertIsInstance(result, bool)

    def test_fail_if_missing(self):
        with self.assertRaises(SystemExit):
            fail_if_missing("apache2")

    def test_get_ps(self):
        result = get_ps("apache2")
        self.assertIsInstance(result, str)

    def test_daemonize(self):
        result = daemonize("apache2")
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()