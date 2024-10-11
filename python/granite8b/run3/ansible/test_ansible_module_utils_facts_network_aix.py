import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        instance = AIXNetwork(module=None)
        result = instance.get_default_interfaces('route_path')
        self.assertEqual(result, ('gateway', 'interface'))

    def test_get_interfaces_info(self):
        instance = AIXNetwork(module=None)
        result = instance.get_interfaces_info('ifconfig_path', 'ifconfig_options')
        self.assertEqual(result, ('interfaces', 'ips'))

    def test_parse_interface_line(self):
        instance = AIXNetwork(module=None)
        result = instance.parse_interface_line(['device', 'flags'])
        self.assertEqual(result, {'device': 'device', 'flags': 'flags', 'ipv4': [], 'ipv6': [], 'macaddress': 'unknown', 'mtu': 1500, 'type': 'unknown'})

class TestAIXNetworkCollector(unittest.TestCase):
    def test_get_network_data(self):
        instance = AIXNetworkCollector()
        result = instance.get_network_data()
        self.assertEqual(result, ('interfaces', 'ips'))

if __name__ == '__main__':
    unittest.main()