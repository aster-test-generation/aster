import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def test_populate(self):
        network = LinuxNetwork()
        result = network.populate()
        self.assertIsInstance(result, dict)

    def test_get_default_interfaces(self):
        network = LinuxNetwork()
        result = network.get_default_interfaces('ip')
        self.assertIsInstance(result, tuple)

    def test_get_interfaces_info(self):
        network = LinuxNetwork()
        result = network.get_interfaces_info('ip', {}, {})
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()