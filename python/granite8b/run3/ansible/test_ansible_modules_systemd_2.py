import unittest
from ansible.modules.systemd import ServiceModule


class TestServiceModule(unittest.TestCase):
    def test_is_running_service_active(self):
        service_status = {'ActiveState': 'active'}
        self.assertTrue(is_running_service(service_status))

if __name__ == '__main__':
    unittest.main()