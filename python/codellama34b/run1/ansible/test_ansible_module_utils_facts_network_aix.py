import unittest
from ansible.module_utils.facts.network.aix import *


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        instance = AIXNetwork(module)
        result = instance.get_default_interfaces('route_path')
        self.assertEqual(result, ())

    def test_get_interfaces_info(self):
        instance = AIXNetwork(module)
        result = instance.get_interfaces_info('ifconfig_path', 'ifconfig_options')
        self.assertEqual(result, ())

    def test_parse_interface_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_interface_line('words')
        self.assertEqual(result, {'device': 'words[0][0:-1]', 'ipv4': [], 'ipv6': [], 'type': 'unknown'})

    def test_parse_options_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_options_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_nd6_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_nd6_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_ether_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_ether_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_media_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_media_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_status_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_status_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_lladdr_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_lladdr_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_inet_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_inet_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_inet6_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_inet6_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_parse_unknown_line(self):
        instance = AIXNetwork(module)
        result = instance.parse_unknown_line('words', 'current_if', 'ips')
        self.assertEqual(result, None)

    def test_get_options(self):
        instance = AIXNetwork(module)
        result = instance.get_options('words')
        self.assertEqual(result, [])

class TestAIXNetworkCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = AIXNetworkCollector()
        result = instance.get_fact_class()
        self.assertEqual(result, AIXNetwork)

    def test_get_platform(self):
        instance = AIXNetworkCollector()
        result = instance.get_platform()
        self.assertEqual(result, 'AIX')

if __name__ == '__main__':
    unittest.main()