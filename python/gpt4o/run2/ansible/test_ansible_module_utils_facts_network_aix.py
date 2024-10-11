import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.network = AIXNetwork(self.module)

    def test_get_default_interfaces(self):
        self.module.get_bin_path.return_value = '/usr/bin/netstat'
        self.module.run_command.return_value = (0, 'default 192.168.1.1 UG 0 0 en0\n', '')
        v4, v6 = self.network.get_default_interfaces('/some/path')
        self.assertEqual(v4['gateway'], '192.168.1.1')
        self.assertEqual(v4['interface'], 'en0')
        self.assertEqual(v6, {})

    def test_get_interfaces_info(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/uname', '/usr/bin/ifconfig']
        self.module.run_command.side_effect = [
            (0, '0\n', ''),  # uname -W
            (0, 'en0: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500\n', '')  # ifconfig -a
        ]
        interfaces, ips = self.network.get_interfaces_info('/sbin/ifconfig')
        self.assertIn('en0', interfaces)
        self.assertEqual(interfaces['en0']['device'], 'en0')

    def test_parse_interface_line(self):
        words = ['en0:', 'flags=4163<UP,BROADCAST,RUNNING,MULTICAST>', 'mtu', '1500']
        result = self.network.parse_interface_line(words)
        self.assertEqual(result['device'], 'en0')
        self.assertEqual(result['macaddress'], 'unknown')

    def test_parse_options_line(self):
        current_if = {}
        ips = {}
        words = ['options=3']
        self.network.parse_options_line(words, current_if, ips)
        self.assertEqual(current_if, {'options': []})

    def test_parse_nd6_line(self):
        current_if = {}
        ips = {}
        words = ['nd6', 'options=3']
        self.network.parse_nd6_line(words, current_if, ips)
        self.assertEqual(current_if, {'options': []})

    def test_parse_ether_line(self):
        current_if = {}
        ips = {}
        words = ['ether', '00:11:22:33:44:55']
        self.network.parse_ether_line(words, current_if, ips)
        self.assertEqual(current_if, {'macaddress': '00:11:22:33:44:55', 'type': 'ether'})

    def test_parse_media_line(self):
        current_if = {}
        ips = {}
        words = ['media:', 'Ethernet', 'autoselect']
        self.network.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if, {'media': 'Ethernet', 'media_select': 'autoselect'})

    def test_parse_status_line(self):
        current_if = {}
        ips = {}
        words = ['status:', 'active']
        self.network.parse_status_line(words, current_if, ips)
        self.assertEqual(current_if, {'status': 'active'})

    def test_parse_lladdr_line(self):
        current_if = {}
        ips = {}
        words = ['lladdr', '00:11:22:33:44:55']
        self.network.parse_lladdr_line(words, current_if, ips)
        self.assertEqual(current_if, {'lladdr': '00:11:22:33:44:55'})

    def test_parse_inet_line(self):
        current_if = {}
        ips = {}
        words = ['inet', '192.168.1.1', 'netmask', '0xffffff00', 'broadcast', '192.168.1.255']
        self.network.parse_inet_line(words, current_if, all_ipv4_addresses)
        self.assertEqual(current_if, {})

    def test_parse_inet6_line(self):
        current_if = {}
        ips = {}
        words = ['inet6', 'fe80::1%lo0', 'prefixlen', '64', 'scopeid', '0x1']
        self.network.parse_inet6_line(words, current_if, ipv6)
        self.assertEqual(current_if, {})

    def test_parse_unknown_line(self):
        current_if = {}
        ips = {}
        words = ['unknown', 'line']
        self.network.parse_unknown_line(words, current_if, ips)
        self.assertEqual(current_if, {})

class TestAIXNetworkCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = AIXNetworkCollector()
        self.assertEqual(collector._fact_class, AIXNetwork)

    def test_platform(self):
        collector = AIXNetworkCollector()
        self.assertEqual(collector._platform, 'AIX')

if __name__ == '__main__':
    unittest.main()