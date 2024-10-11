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

    def test_is_running_service(self):
        service_status = {'ActiveState': 'active'}
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test__load_params(self):
        instance = SystemdModule()
        params = {'name': 'httpd', 'state': 'started'}
        instance._load_params(params)
        self.assertEqual(instance.name, 'httpd')
        self.assertEqual(instance.state, 'started')

    def test__get_service_status(self):
        instance = SystemdModule()
        result = instance._get_service_status('httpd')
        self.assertIsInstance(result, dict)

    def test__start_service(self):
        instance = SystemdModule()
        result = instance._start_service('httpd')
        self.assertIsInstance(result, dict)

    def test__stop_service(self):
        instance = SystemdModule()
        result = instance._stop_service('httpd')
        self.assertIsInstance(result, dict)

    def test__restart_service(self):
        instance = SystemdModule()
        result = instance._restart_service('httpd')
        self.assertIsInstance(result, dict)

    def test__reload_service(self):
        instance = SystemdModule()
        result = instance._reload_service('httpd')
        self.assertIsInstance(result, dict)

    def test__enable_service(self):
        instance = SystemdModule()
        result = instance._enable_service('httpd')
        self.assertIsInstance(result, dict)

    def test__disable_service(self):
        instance = SystemdModule()
        result = instance._disable_service('httpd')
        self.assertIsInstance(result, dict)

    def test__mask_service(self):
        instance = SystemdModule()
        result = instance._mask_service('httpd')
        self.assertIsInstance(result, dict)

    def test__unmask_service(self):
        instance = SystemdModule()
        result = instance._unmask_service('httpd')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()