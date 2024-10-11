import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_init(self):
        instance = SunOSNetwork()
        self.assertIsInstance(instance, SunOSNetwork)

    def test_get_interfaces_info(self):
        instance = SunOSNetwork()
        ifconfig_path = '/path/to/ifconfig'
        result = instance.get_interfaces_info(ifconfig_path)
        self.assertIsInstance(result, tuple)

    def test_parse_interface_line(self):
        instance = SunOSNetwork()
        words = ['device', 'flags', 'mtu', 'other']
        current_if = {}
        interfaces = {}
        result = instance.parse_interface_line(words, current_if, interfaces)
        self.assertIsInstance(result, dict)

    def test_parse_ether_line(self):
        instance = SunOSNetwork()
        words = ['ether', 'mac:address']
        current_if = {}
        ips = {}
        result = instance.parse_ether_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_options_line(self):
        instance = SunOSNetwork()
        words = ['options=', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_options_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_nd6_line(self):
        instance = SunOSNetwork()
        words = ['nd6', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_nd6_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_media_line(self):
        instance = SunOSNetwork()
        words = ['media:', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_media_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_status_line(self):
        instance = SunOSNetwork()
        words = ['status:', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_status_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_lladdr_line(self):
        instance = SunOSNetwork()
        words = ['lladdr', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_lladdr_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_inet_line(self):
        instance = SunOSNetwork()
        words = ['inet', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_inet_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_inet6_line(self):
        instance = SunOSNetwork()
        words = ['inet6', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_inet6_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_parse_unknown_line(self):
        instance = SunOSNetwork()
        words = ['unknown', 'flags']
        current_if = {}
        ips = {}
        result = instance.parse_unknown_line(words, current_if, ips)
        self.assertIsInstance(result, None)

    def test_get_options(self):
        instance = SunOSNetwork()
        flags = 'flags'
        result = instance.get_options(flags)
        self.assertIsInstance(result, list)

class TestSunOSNetworkCollector(unittest.TestCase):
    def test_init(self):
        instance = SunOSNetworkCollector()
        self.assertIsInstance(instance, SunOSNetworkCollector)

    def test_fact_class(self):
        instance = SunOSNetworkCollector()
        self.assertEqual(instance._fact_class, SunOSNetwork)

    def test_platform(self):
        instance = SunOSNetworkCollector()
        self.assertEqual(instance._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()