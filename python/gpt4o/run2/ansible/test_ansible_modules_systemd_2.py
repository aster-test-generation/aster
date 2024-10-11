import unittest
from ansible.modules.systemd import is_running_service


class TestSystemdModule(unittest.TestCase):
    def test_is_running_service_active(self):
        service_status = {'ActiveState': 'active'}
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_activating(self):
        service_status = {'ActiveState': 'activating'}
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_inactive(self):
        service_status = {'ActiveState': 'inactive'}
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_failed(self):
        service_status = {'ActiveState': 'failed'}
        result = is_running_service(service_status)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()