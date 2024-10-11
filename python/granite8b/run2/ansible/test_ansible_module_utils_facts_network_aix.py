import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        instance = AIXNetwork(module)
        result = instance.get_default_interfaces('route_path')
        self.assertEqual(result, ('gateway', 'interface'))

    def test_get_interfaces_info(self):
        instance = AIXNetwork(module)
        result = instance.get_interfaces_info('ifconfig_path', 'ifconfig_options')
        self.assertEqual(result, {'interfaces': {'interface': {'ipv4': [], 'ipv6': [], 'type': 'unknown'}}, 'ips': {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}})

    def test_parse_interface_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_interface_line(['device', 'flags'])
        self.assertEqual(result, {'device': 'device', 'ipv4': [], 'ipv6': [], 'type': 'unknown', 'flags': 'flags', 'macaddress': 'unknown'})

class TestAIXNetworkCollector(unittest.TestCase):
    def test_get_network_data(self):
        instance = AIXNetworkCollector()
        result = instance.get_network_data()
        self.assertEqual(result, {'interfaces': {'interface': {'ipv4': [], 'ipv6': [], 'type': 'unknown'}}, 'ips': {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}})

if __name__ == '__main__':
    unittest.main()