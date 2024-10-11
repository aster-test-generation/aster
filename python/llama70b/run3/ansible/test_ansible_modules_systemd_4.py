import unittest
from ansible.modules.systemd import *


class TestSystemdModule(unittest.TestCase):
    def test___init__(self):
        from module import SystemdModule
        self.assertIsInstance(instance, SystemdModule)

    def test_run(self):
        from module import SystemdModule
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test__load_params(self):
        from module import SystemdModule
        params = {'name': 'httpd', 'state': 'started'}
        instance._load_params(params)
        self.assertEqual(instance.name, 'httpd')
        self.assertEqual(instance.state, 'started')

    def test__execute_module(self):
        from module import SystemdModule
        result = instance._execute_module()
        self.assertIsInstance(result, dict)

    def test__systemdctl(self):
        from module import SystemdModule
        result = instance._systemdctl('status', 'httpd')
        self.assertIsInstance(result, str)

    def test__get_status(self):
        from module import SystemdModule
        result = instance._get_status('httpd')
        self.assertIsInstance(result, dict)

    def test__start_service(self):
        from module import SystemdModule
        result = instance._start_service('httpd')
        self.assertIsInstance(result, str)

    def test__stop_service(self):
        from module import SystemdModule
        result = instance._stop_service('httpd')
        self.assertIsInstance(result, str)

    def test__restart_service(self):
        from module import SystemdModule
        result = instance._restart_service('httpd')
        self.assertIsInstance(result, str)

    def test__reload_service(self):
        from module import SystemdModule
        result = instance._reload_service('httpd')
        self.assertIsInstance(result, str)

    def test__enable_service(self):
        from module import SystemdModule
        result = instance._enable_service('httpd')
        self.assertIsInstance(result, str)

    def test__disable_service(self):
        from module import SystemdModule
        result = instance._disable_service('httpd')
        self.assertIsInstance(result, str)

    def test__mask_service(self):
        from module import SystemdModule
        result = instance._mask_service('httpd')
        self.assertIsInstance(result, str)

    def test__unmask_service(self):
        from module import SystemdModule
        result = instance._unmask_service('httpd')
        self.assertIsInstance(result, str)

    def test___str__(self):
        from module import SystemdModule
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from module import SystemdModule
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        from module import SystemdModule
        instance2 = SystemdModule()
        self.assertEqual(instance1, instance2)

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

    def test__systemctl(self):
        instance = SystemdModule()
        result = instance._systemctl("start", "httpd")
        self.assertIsInstance(result, str)

    def test__daemon_reload(self):
        instance = SystemdModule()
        result = instance._daemon_reload()
        self.assertIsInstance(result, str)

    def test__daemon_reexec(self):
        instance = SystemdModule()
        result = instance._daemon_reexec()
        self.assertIsInstance(result, str)

    def test_request_was_ignored(self):
        out = "ignoring request"
        result = request_was_ignored(out)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()