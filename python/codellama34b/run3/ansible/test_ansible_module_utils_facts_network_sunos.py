import unittest
from ansible.module_utils.facts.network.sunos import *



class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        instance = SunOSNetwork(module)
        result = instance.get_interfaces_info()
        self.assertEqual(result, None)

    def test_parse_interface_line(self):
        instance = SunOSNetwork(module)
        words = ['test', 'test', 'test', 'test']
        current_if = {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        interfaces = {'test': {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}}
        result = instance.parse_interface_line(words, current_if, interfaces)
        self.assertEqual(result, {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'})

    def test_parse_ether_line(self):
        instance = SunOSNetwork(module)
        words = ['test', 'test', 'test', 'test']
        current_if = {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        result = instance.parse_ether_line(words, current_if, ips)
        self.assertEqual(result, {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'})

    def test_parse_options_line(self):
        instance = SunOSNetwork(module)
        words = ['test', 'test', 'test', 'test']
        current_if = {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        result = instance.parse_options_line(words, current_if, ips)
        self.assertEqual(result, {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'})

    def test_parse_nd6_line(self):
        instance = SunOSNetwork(module)
        words = ['test', 'test', 'test', 'test']
        current_if = {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        result = instance.parse_nd6_line(words, current_if, ips)
        self.assertEqual(result, {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'})

    def test_parse_media_line(self):
        instance = SunOSNetwork(module)
        words = ['test', 'test', 'test', 'test']
        current_if = {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'})

    def test_parse_status_line(self):
        instance = SunOSNetwork(module)
        words = ['test', 'test', 'test', 'test']
        current_if = {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        result = instance.parse_status_line(words, current_if, ips)
        self.assertEqual(result, {'device': 'test', 'ipv4': [], 'ipv6': [], 'type': 'unknown'})

if __name__ == '__main__':
    unittest.main()