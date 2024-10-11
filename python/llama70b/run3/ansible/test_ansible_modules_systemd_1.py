import unittest
from ansible.modules.systemd import SystemdModule


class TestSystemdModule(unittest.TestCase):
    def test___init__(self):
        instance = SystemdModule()
        self.assertIsInstance(instance, SystemdModule)

    def test___str__(self):
        instance = SystemdModule()
        result = str(instance)
        self.assertEqual(result, "SystemdModule")

    def test___repr__(self):
        instance = SystemdModule()
        result = repr(instance)
        self.assertEqual(result, "SystemdModule()")

    def test_run(self):
        instance = SystemdModule()
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test__load_params(self):
        instance = SystemdModule()
        result = instance._load_params()
        self.assertIsInstance(result, dict)

    def test__get_service_status(self):
        instance = SystemdModule()
        result = instance._get_service_status("httpd")
        self.assertIsInstance(result, dict)

    def test__start_service(self):
        instance = SystemdModule()
        result = instance._start_service("httpd")
        self.assertIsInstance(result, bool)

    def test__stop_service(self):
        instance = SystemdModule()
        result = instance._stop_service("httpd")
        self.assertIsInstance(result, bool)

    def test__restart_service(self):
        instance = SystemdModule()
        result = instance._restart_service("httpd")
        self.assertIsInstance(result, bool)

    def test__reload_service(self):
        instance = SystemdModule()
        result = instance._reload_service("httpd")
        self.assertIsInstance(result, bool)

    def test__enable_service(self):
        instance = SystemdModule()
        result = instance._enable_service("httpd")
        self.assertIsInstance(result, bool)

    def test__disable_service(self):
        instance = SystemdModule()
        result = instance._disable_service("httpd")
        self.assertIsInstance(result, bool)

    def test__mask_service(self):
        instance = SystemdModule()
        result = instance._mask_service("httpd")
        self.assertIsInstance(result, bool)

    def test__unmask_service(self):
        instance = SystemdModule()
        result = instance._unmask_service("httpd")
        self.assertIsInstance(result, bool)

    def test__daemon_reload(self):
        instance = SystemdModule()
        result = instance._daemon_reload()
        self.assertIsInstance(result, bool)

    def test__daemon_reexec(self):
        instance = SystemdModule()
        result = instance._daemon_reexec()
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()