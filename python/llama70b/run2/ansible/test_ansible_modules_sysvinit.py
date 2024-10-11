import unittest
from ansible.modules.sysvinit import AnsibleModule, main, sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule()
        self.assertIsInstance(module, AnsibleModule)

    def test_argument_spec(self):
        module = AnsibleModule()
        self.assertIsInstance(module.argument_spec, dict)

    def test_supports_check_mode(self):
        module = AnsibleModule()
        self.assertTrue(module.supports_check_mode)

    def test_required_one_of(self):
        module = AnsibleModule()
        self.assertIsInstance(module.required_one_of, list)

class TestMain(unittest.TestCase):
    def test_main(self):
        result = main()
        self.assertIsInstance(result, dict)

class TestSysvIsEnabled(unittest.TestCase):
    def test_sysv_is_enabled(self):
        result = sysv_is_enabled('service_name')
        self.assertIsInstance(result, bool)

class TestGetSysvScript(unittest.TestCase):
    def test_get_sysv_script(self):
        result = get_sysv_script('service_name')
        self.assertIsInstance(result, str)

class TestSysvExists(unittest.TestCase):
    def test_sysv_exists(self):
        result = sysv_exists('service_name')
        self.assertIsInstance(result, bool)

class TestFailIfMissing(unittest.TestCase):
    def test_fail_if_missing(self):
        module = AnsibleModule()
        with self.assertRaises(SystemExit):
            fail_if_missing(module, False, 'service_name')

class TestGetPs(unittest.TestCase):
    def test_get_ps(self):
        module = AnsibleModule()
        result = get_ps(module, 'pattern')
        self.assertIsInstance(result, bool)

class TestDaemonize(unittest.TestCase):
    def test_daemonize(self):
        module = AnsibleModule()
        result = daemonize(module, 'command')
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()