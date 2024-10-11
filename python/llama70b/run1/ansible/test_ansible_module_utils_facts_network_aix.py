import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        instance = AIXNetwork()
        result = instance.get_default_interfaces('route_path')
        self.assertIsInstance(result, tuple)

    def test_get_interfaces_info(self):
        instance = AIXNetwork()
        result = instance.get_interfaces_info('ifconfig_path', '-a')
        self.assertIsInstance(result, tuple)

    def test_parse_interface_line(self):
        instance = AIXNetwork()
        words = ['device:', 'flags']
        result = instance.parse_interface_line(words)
        self.assertIsInstance(result, dict)

    def test_parse_options_line(self):
        instance = AIXNetwork()
        words = ['options=', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_options_line(words, current_if, ips)
        self.assertIn('options', current_if)

    def test_parse_nd6_line(self):
        instance = AIXNetwork()
        words = ['nd6', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_nd6_line(words, current_if, ips)
        self.assertIn('nd6', current_if)

    def test_parse_ether_line(self):
        instance = AIXNetwork()
        words = ['ether', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_ether_line(words, current_if, ips)
        self.assertIn('ether', current_if)

    def test_parse_media_line(self):
        instance = AIXNetwork()
        words = ['media:', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_media_line(words, current_if, ips)
        self.assertIn('media', current_if)

    def test_parse_status_line(self):
        instance = AIXNetwork()
        words = ['status:', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_status_line(words, current_if, ips)
        self.assertIn('status', current_if)

    def test_parse_lladdr_line(self):
        instance = AIXNetwork()
        words = ['lladdr', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_lladdr_line(words, current_if, ips)
        self.assertIn('lladdr', current_if)

    def test_parse_inet_line(self):
        instance = AIXNetwork()
        words = ['inet', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_inet_line(words, current_if, ips)
        self.assertIn('inet', current_if)

    def test_parse_inet6_line(self):
        instance = AIXNetwork()
        words = ['inet6', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_inet6_line(words, current_if, ips)
        self.assertIn('inet6', current_if)

    def test_parse_unknown_line(self):
        instance = AIXNetwork()
        words = ['unknown', 'foo']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_unknown_line(words, current_if, ips)
        self.assertIn('unknown', current_if)

    def test___init__(self):
        instance = AIXNetwork()
        self.assertIsInstance(instance, AIXNetwork)

    def test___str__(self):
        instance = AIXNetwork()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = AIXNetwork()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestAIXNetworkCollector(unittest.TestCase):
    def test___init__(self):
        instance = AIXNetworkCollector()
        self.assertIsInstance(instance, AIXNetworkCollector)

    def test___str__(self):
        instance = AIXNetworkCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = AIXNetworkCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()