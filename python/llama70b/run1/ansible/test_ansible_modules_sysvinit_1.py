import unittest
from ansible.modules.sysvinit import AnsibleModule, sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleModule(argument_spec=dict())
        self.assertIsInstance(instance, AnsibleModule)

    def test___str__(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_run(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.run()
        self.assertIsNone(result)

class TestSysVInitFunctions(unittest.TestCase):
    def test_sysv_is_enabled(self):
        result = sysv_is_enabled('service_name')
        self.assertIsInstance(result, bool)

    def test_get_sysv_script(self):
        result = get_sysv_script('service_name')
        self.assertIsInstance(result, str)

    def test_sysv_exists(self):
        result = sysv_exists('service_name')
        self.assertIsInstance(result, bool)

    def test_fail_if_missing(self):
        result = fail_if_missing('service_name')
        self.assertIsNone(result)

    def test_get_ps(self):
        result = get_ps('service_name')
        self.assertIsInstance(result, str)

    def test_daemonize(self):
        result = daemonize('service_name')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()