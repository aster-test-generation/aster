import unittest
from ansible.module_utils.facts.network.aix import *


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        instance = AIXNetwork(module)
        result = instance.get_default_interfaces(route_path)
        self.assertEqual(result, interface['v4'], interface['v6'])

    def test_get_interfaces_info(self):
        instance = AIXNetwork(module)
        result = instance.get_interfaces_info(ifconfig_path, ifconfig_options='-a')
        self.assertEqual(result, interfaces, ips)

    def test_parse_interface_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_interface_line(words)
        self.assertEqual(result, current_if)

    def test_parse_options_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_options_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_nd6_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_nd6_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_ether_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_ether_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_media_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_status_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_status_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_lladdr_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_lladdr_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_inet_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_inet_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_inet6_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_inet6_line(words, current_if, ips)
        self.assertEqual(result, None)

    def test_parse_unknown_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_unknown_line(words, current_if, ips)
        self.assertEqual(result, None)

class TestAIXNetworkCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = AIXNetworkCollector()
        result = instance._fact_class
        self.assertEqual(result, AIXNetwork)

    def test_platform(self):
        instance = AIXNetworkCollector()
        result = instance._platform
        self.assertEqual(result, 'AIX')

if __name__ == '__main__':
    unittest.main()