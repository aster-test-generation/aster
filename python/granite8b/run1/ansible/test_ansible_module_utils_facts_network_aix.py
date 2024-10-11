import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        instance = AIXNetwork(module=None)
        result = instance.get_default_interfaces('route_path')
        self.assertEqual(result, ('v4_gateway', 'v6_gateway', 'v4_interface', 'v6_interface'))

    def test_get_interfaces_info(self):
        instance = AIXNetwork(module=None)
        result = instance.get_interfaces_info('ifconfig_path', 'ifconfig_options')
        self.assertEqual(result, {'interface1': {'ipv4': ['192.168.1.1'], 'ipv6': ['2001:db8::1'], 'macaddress': '00:11:22:33:44:55', 'mtu': 1500, 'type': 'ether'}, 'interface2': {'ipv4': ['10.0.0.1'], 'ipv6': ['2001:db8:2::1'], 'macaddress': '00:22:33:44:55:66', 'mtu': 1500, 'type': 'ether'}})

class TestAIXNetworkCollector(unittest.TestCase):
    def test_collect(self):
        instance = AIXNetworkCollector()
        result = instance.collect()
        self.assertEqual(result, {'interfaces': {'interface1': {'ipv4': ['192.168.1.1'], 'ipv6': ['2001:db8::1'], 'macaddress': '00:11:22:33:44:55', 'mtu': 1500, 'type': 'ether'}, 'interface2': {'ipv4': ['10.0.0.1'], 'ipv6': ['2001:db8:2::1'], 'macaddress': '00:22:33:44:55:66', 'mtu': 1500, 'type': 'ether'}}, 'default_interfaces': {'v4_gateway': '192.168.1.1', 'v6_gateway': '2001:db8::1', 'v4_interface': 'interface1', 'v6_interface': 'interface2'}})

if __name__ == '__main__':
    unittest.main()