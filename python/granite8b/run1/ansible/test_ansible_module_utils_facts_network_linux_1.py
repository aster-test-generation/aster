import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def setUp(self):
        self.linux_network = LinuxNetwork()

    def test_populate(self):
        collected_facts = {}
        network_facts = self.linux_network.populate(collected_facts)
        self.assertEqual(network_facts, {})

    def test_get_default_interfaces(self):
        ip_path = '/path/to/ip'
        default_ipv4, default_ipv6 = self.linux_network.get_default_interfaces(ip_path)
        self.assertEqual(default_ipv4, {})
        self.assertEqual(default_ipv6, {})

    def test_get_interfaces_info(self):
        ip_path = '/path/to/ip'
        default_ipv4, default_ipv6 = self.linux_network.get_default_interfaces(ip_path)
        interfaces, ips = self.linux_network.get_interfaces_info(ip_path, default_ipv4, default_ipv6)
        self.assertEqual(interfaces, {})
        self.assertEqual(ips, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})

    def test_get_ethtool_data(self):
        device = 'eth0'
        ethtool_data = self.linux_network.get_ethtool_data(device)
        self.assertEqual(ethtool_data, {})

if __name__ == '__main__':
    unittest.main()