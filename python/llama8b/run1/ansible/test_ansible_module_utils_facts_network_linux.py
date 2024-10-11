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
        self.assertIn('features', data)
        self.assertIn('timestamping', data)
        self.assertIn('hw_timestamp_filters', data)
        self.assertIn('phc_index', data)

    def test_get_ethtool_data_no_ethtool(self):
        instance = LinuxNetwork()
        device = 'eth0'
        data = instance.get_ethtool_data(device)
        self.assertIsNone(data)

    def test_get_ethtool_data_invalid_device(self):
        instance = LinuxNetwork()
        device = 'invalid_device'
        data = instance.get_ethtool_data(device)
        self.assertIsNone(data)

    def test_get_ethtool_data_invalid_ethtool(self):
        instance = LinuxNetwork()
        device = 'eth0'
        instance.module.get_bin_path = lambda x: None
        data = instance.get_ethtool_data(device)
        self.assertIsNone(data)

    def test_get_ethtool_data_invalid_output(self):
        instance = LinuxNetwork()
        device = 'eth0'
        instance.module.run_command = lambda x, y, z: (1, '', 'error')
        data = instance.get_ethtool_data(device)
        self.assertIsNone(data)

    def test_str_method(self):
        instance = LinuxNetwork()
        result = str(instance)
        self.assertEqual(result, 'LinuxNetwork')

    def test_repr_method(self):
        instance = LinuxNetwork()
        result = repr(instance)
        self.assertEqual(result, 'LinuxNetwork()')

if __name__ == '__main__':
    unittest.main()