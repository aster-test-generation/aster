import unittest
from ansible.modules.systemd import is_deactivating_service


class TestSystemdModule(unittest.TestCase):
    def test_is_deactivating_service_true(self):
        service_status = {'ActiveState': 'deactivating'}
        result = is_deactivating_service(service_status)
        self.assertTrue(result)

    def test_is_deactivating_service_false(self):
        service_status = {'ActiveState': 'active'}
        result = is_deactivating_service(service_status)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()