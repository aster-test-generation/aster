import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollecto


class TestLinuxNetwork(unittest.TestCase):
    def test___init__(self):
        instance = LinuxNetwork()
        self.assertIsInstance(instance, LinuxNetwork)

    def test_get_ethtool_data(self):
        instance = LinuxNetwork()
        device = 'eth0'
        result = instance.get_ethtool_data(device)
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = LinuxNetwork()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = LinuxNetwork()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = LinuxNetwork()
        instance2 = LinuxNetwork()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()