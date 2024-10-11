import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def test_init(self):
        instance = LinuxNetwork()
        self.assertIsInstance(instance, LinuxNetwork)

    def test_populate(self):
        instance = LinuxNetwork()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_default_interfaces(self):
        instance = LinuxNetwork()
        result = instance.get_default_interfaces()
        self.assertIsInstance(result, tuple)

    def test_get_interfaces_info(self):
        instance = LinuxNetwork()
        result = instance.get_interfaces_info()
        self.assertIsInstance(result, tuple)

    def test_get_ethtool_data(self):
        instance = LinuxNetwork()
        result = instance.get_ethtool_data()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()