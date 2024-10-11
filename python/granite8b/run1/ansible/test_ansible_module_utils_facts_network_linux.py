import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def test_get_ethtool_data(self):
        instance = LinuxNetwork()
        result = instance.get_ethtool_data('eth0')
        self.assertIsInstance(result, dict)
        self.assertIn('features', result)
        self.assertIn('timestamping', result)
        self.assertIn('hw_timestamp_filters', result)
        self.assertIn('phc_index', result)

if __name__ == '__main__':
    unittest.main()