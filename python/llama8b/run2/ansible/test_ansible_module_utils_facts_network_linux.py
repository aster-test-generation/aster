import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollecto


class TestLinuxNetwork(unittest.TestCase):
    def test_init(self):
        instance = LinuxNetwork()
        self.assertEqual(instance.__class__, LinuxNetwork)

    def test_get_ethtool_data(self):
        instance = LinuxNetwork()
        device = 'eth0'
        data = instance.get_ethtool_data(device)
        self.assertIsInstance(data, dict)

    def test_get_ethtool_data_features(self):
        instance = LinuxNetwork()
        device = 'eth0'
        data = instance.get_ethtool_data(device)
        self.assertIn('features', data)

    def test_get_ethtool_data_timestamping(self):
        instance = LinuxNetwork()
        device = 'eth0'
        data = instance.get_ethtool_data(device)
        self.assertIn('timestamping', data)

    def test_get_ethtool_data_hw_timestamp_filters(self):
        instance = LinuxNetwork()
        device = 'eth0'
        data = instance.get_ethtool_data(device)
        self.assertIn('hw_timestamp_filters', data)

    def test_get_ethtool_data_phc_index(self):
        instance = LinuxNetwork()
        device = 'eth0'
        data = instance.get_ethtool_data(device)
        self.assertIn('phc_index', data)

    def test_get_ethtool_data_no_features(self):
        instance = LinuxNetwork()
        device = 'non_existent_device'
        data = instance.get_ethtool_data(device)
        self.assertNotIn('features', data)

    def test_get_ethtool_data_no_timestamping(self):
        instance = LinuxNetwork()
        device = 'non_existent_device'
        data = instance.get_ethtool_data(device)
        self.assertNotIn('timestamping', data)

    def test_get_ethtool_data_no_hw_timestamp_filters(self):
        instance = LinuxNetwork()
        device = 'non_existent_device'
        data = instance.get_ethtool_data(device)
        self.assertNotIn('hw_timestamp_filters', data)

    def test_get_ethtool_data_no_phc_index(self):
        instance = LinuxNetwork()
        device = 'non_existent_device'
        data = instance.get_ethtool_data(device)
        self.assertNotIn('phc_index', data)

if __name__ == '__main__':
    unittest.main()