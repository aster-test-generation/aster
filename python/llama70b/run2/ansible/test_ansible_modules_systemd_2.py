import unittest
from ansible.modules.systemd import SystemdModule, is_running_service


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

    def test_run_command(self):
        instance = SystemdModule()
        result = instance.run_command("systemctl", "status", "httpd")
        self.assertIsInstance(result, dict)

    def test__load_service_status(self):
        instance = SystemdModule()
        result = instance._load_service_status("httpd")
        self.assertIsInstance(result, dict)

    def test__get_service_status(self):
        instance = SystemdModule()
        result = instance._get_service_status("httpd")
        self.assertIsInstance(result, dict)

    def test__is_running(self):
        instance = SystemdModule()
        result = instance._is_running("httpd")
        self.assertIsInstance(result, bool)

    def test__is_enabled(self):
        instance = SystemdModule()
        result = instance._is_enabled("httpd")
        self.assertIsInstance(result, bool)

    def test__mask_service(self):
        instance = SystemdModule()
        result = instance._mask_service("httpd")
        self.assertIsInstance(result, bool)

    def test__unmask_service(self):
        instance = SystemdModule()
        result = instance._unmask_service("httpd")
        self.assertIsInstance(result, bool)

    def test__reload_daemon(self):
        instance = SystemdModule()
        result = instance._reload_daemon()
        self.assertIsInstance(result, bool)

    def test__reexecute_daemon(self):
        instance = SystemdModule()
        result = instance._reexecute_daemon()
        self.assertIsInstance(result, bool)

    def test_is_running_service(self):
        service_status = {"ActiveState": "active"}
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_inactive(self):
        service_status = {"ActiveState": "inactive"}
        result = is_running_service(service_status)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()