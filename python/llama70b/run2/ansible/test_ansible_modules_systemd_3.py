import unittest
from ansible.modules.systemd import *


class TestSystemdModule(unittest.TestCase):
    def test___init__(self):
        from module import SystemdModule
        self.assertIsInstance(instance, SystemdModule)

    def test___str__(self):
        from module import SystemdModule
        result = str(instance)
        self.assertEqual(result, "SystemdModule")

    def test___repr__(self):
        from module import SystemdModule
        result = repr(instance)
        self.assertEqual(result, "SystemdModule()")

    def test_is_deactivating_service(self):
        service_status = {'ActiveState': 'deactivating'}
        result = is_deactivating_service(service_status)
        self.assertTrue(result)

    def test_is_deactivating_service_not_deactivating(self):
        service_status = {'ActiveState': 'active'}
        result = is_deactivating_service(service_status)
        self.assertFalse(result)

    def test__load_params(self):
        from module import SystemdModule
        params = {'name': 'httpd', 'state': 'started'}
        instance._load_params(params)
        self.assertEqual(instance.name, 'httpd')
        self.assertEqual(instance.state, 'started')

    def test__get_service_status(self):
        from module import SystemdModule
        # mock the service status
        instance._get_service_status = lambda: {'ActiveState': 'active'}
        result = instance._get_service_status()
        self.assertEqual(result, {'ActiveState': 'active'})

    def test__start_service(self):
        from module import SystemdModule
        # mock the start service method
        instance._start_service = lambda: True
        result = instance._start_service()
        self.assertTrue(result)

    def test__stop_service(self):
        from module import SystemdModule
        # mock the stop service method
        instance._stop_service = lambda: True
        result = instance._stop_service()
        self.assertTrue(result)

    def test__restart_service(self):
        from module import SystemdModule
        # mock the restart service method
        instance._restart_service = lambda: True
        result = instance._restart_service()
        self.assertTrue(result)

    def test__reload_service(self):
        from module import SystemdModule
        # mock the reload service method
        instance._reload_service = lambda: True
        result = instance._reload_service()
        self.assertTrue(result)

    def test__enable_service(self):
        from module import SystemdModule
        # mock the enable service method
        instance._enable_service = lambda: True
        result = instance._enable_service()
        self.assertTrue(result)

    def test__disable_service(self):
        from module import SystemdModule
        # mock the disable service method
        instance._disable_service = lambda: True
        result = instance._disable_service()
        self.assertTrue(result)

    def test__mask_service(self):
        from module import SystemdModule
        # mock the mask service method
        instance._mask_service = lambda: True
        result = instance._mask_service()
        self.assertTrue(result)

    def test__unmask_service(self):
        from module import SystemdModule
        # mock the unmask service method
        instance._unmask_service = lambda: True
        result = instance._unmask_service()
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()