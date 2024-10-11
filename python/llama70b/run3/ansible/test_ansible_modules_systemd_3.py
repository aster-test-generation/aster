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

    def test__load_service_status(self):
        from module import SystemdModule
        result = instance._load_service_status('httpd')
        self.assertIsInstance(result, dict)

    def test__get_service_status(self):
        from module import SystemdModule
        result = instance._get_service_status('httpd')
        self.assertIsInstance(result, dict)

    def test__start_service(self):
        from module import SystemdModule
        result = instance._start_service('httpd')
        self.assertIsInstance(result, bool)

    def test__stop_service(self):
        from module import SystemdModule
        result = instance._stop_service('httpd')
        self.assertIsInstance(result, bool)

    def test__restart_service(self):
        from module import SystemdModule
        result = instance._restart_service('httpd')
        self.assertIsInstance(result, bool)

    def test__reload_service(self):
        from module import SystemdModule
        result = instance._reload_service('httpd')
        self.assertIsInstance(result, bool)

    def test__enable_service(self):
        from module import SystemdModule
        result = instance._enable_service('httpd')
        self.assertIsInstance(result, bool)

    def test__disable_service(self):
        from module import SystemdModule
        result = instance._disable_service('httpd')
        self.assertIsInstance(result, bool)

    def test__mask_service(self):
        from module import SystemdModule
        result = instance._mask_service('httpd')
        self.assertIsInstance(result, bool)

    def test__unmask_service(self):
        from module import SystemdModule
        result = instance._unmask_service('httpd')
        self.assertIsInstance(result, bool)

    def test__daemon_reload(self):
        from module import SystemdModule
        result = instance._daemon_reload()
        self.assertIsInstance(result, bool)

    def test__daemon_reexec(self):
        from module import SystemdModule
        result = instance._daemon_reexec()
        self.assertIsInstance(result, bool)

    def test___str__(self):
        from module import SystemdModule
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from module_name import SystemdModule
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_is_deactivating_service(self):
        result = is_deactivating_service({'ActiveState': 'deactivating'})
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()