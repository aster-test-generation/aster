import unittest
from ansible.modules.systemd import *



class TestSystemd(unittest.TestCase):
    def test_is_running_service(self):
        service_status = {
            'ActiveState': 'activating',
        }
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_2(self):
        service_status = {
            'ActiveState': 'active',
        }
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_3(self):
        service_status = {
            'ActiveState': 'inactive',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_4(self):
        service_status = {
            'ActiveState': 'failed',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_5(self):
        service_status = {
            'ActiveState': 'unknown',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_6(self):
        service_status = {
            'ActiveState': 'other',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_7(self):
        service_status = {
            'ActiveState': 'activating',
        }
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_8(self):
        service_status = {
            'ActiveState': 'active',
        }
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_9(self):
        service_status = {
            'ActiveState': 'inactive',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_10(self):
        service_status = {
            'ActiveState': 'failed',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_11(self):
        service_status = {
            'ActiveState': 'unknown',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_12(self):
        service_status = {
            'ActiveState': 'other',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_13(self):
        service_status = {
            'ActiveState': 'activating',
        }
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_14(self):
        service_status = {
            'ActiveState': 'active',
        }
        result = is_running_service(service_status)
        self.assertTrue(result)

    def test_is_running_service_15(self):
        service_status = {
            'ActiveState': 'inactive',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

    def test_is_running_service_16(self):
        service_status = {
            'ActiveState': 'failed',
        }
        result = is_running_service(service_status)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()