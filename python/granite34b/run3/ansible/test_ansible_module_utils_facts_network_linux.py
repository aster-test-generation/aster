import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def test_get_ethtool_data(self):
        network = LinuxNetwork()
        device = 'eth0'
        data = network.get_ethtool_data(device)
        self.assertIsInstance(data, dict)
        self.assertIn('features', data)
        self.assertIn('timestamping', data)
        self.assertIn('hw_timestamp_filters', data)
        self.assertIn('phc_index', data)

if __name__ == '__main__':
    unittest.main()