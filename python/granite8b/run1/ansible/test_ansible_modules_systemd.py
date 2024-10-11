import unittest
from ansible.modules.systemd import SystemdService


class TestSystemdService(unittest.TestCase):
    def test_method_one(self):
        instance = SystemdService()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()