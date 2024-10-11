import unittest
from ansible.modules.systemd import SystemdModule


class TestSystemdModule(unittest.TestCase):
    def test___init__(self):
        instance = SystemdModule()
        self.assertIsInstance(instance, SystemdModule)

    def test___str__(self):
        instance = SystemdModule()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = SystemdModule()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_run(self):
        instance = SystemdModule()
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test__load_params(self):
        instance = SystemdModule()
        result = instance._load_params()
        self.assertIsInstance(result, dict)

    def test__validate_params(self):
        instance = SystemdModule()
        result = instance._validate_params()
        self.assertIsNone(result)

    def test__systemdctl(self):
        instance = SystemdModule()
        result = instance._systemdctl('status', 'httpd')
        self.assertIsInstance(result, str)

    def test__systemdctl_with_scope(self):
        instance = SystemdModule()
        result = instance._systemdctl('status', 'httpd', scope='user')
        self.assertIsInstance(result, str)

    def test__daemon_reload(self):
        instance = SystemdModule()
        result = instance._daemon_reload()
        self.assertIsNone(result)

    def test__daemon_reexec(self):
        instance = SystemdModule()
        result = instance._daemon_reexec()
        self.assertIsNone(result)

    def test_request_was_ignored(self):
        out = 'ignoring request'
        result = request_was_ignored(out)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()