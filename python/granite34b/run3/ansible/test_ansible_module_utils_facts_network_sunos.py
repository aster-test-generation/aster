import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        network = SunOSNetwork(module=None)
        interfaces, ips = network.get_interfaces_info('/path/to/ifconfig')
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)
        self.assertIn('all_ipv4_addresses', ips)
        self.assertIn('all_ipv6_addresses', ips)

    def test_parse_interface_line(self):
        network = SunOSNetwork(module=None)
        words = ['eth0:', 'options=1203<RXCSUM,TXCSUM,VLAN_MTU,VLAN_HWTAGGING,VLAN_HW FILTERING,TSO4,TSO6>', 'mtu:1500']
        current_if = {}
        interfaces = {}
        current_if = network.parse_interface_line(words, current_if, interfaces)
        self.assertIsInstance(current_if, dict)
        self.assertIn('device', current_if)
        self.assertEqual(current_if['device'], 'eth0')
        self.assertIn('ipv4', current_if)
        self.assertEqual(current_if['ipv4'], [{'flags': ['RXCSUM', 'TXCSUM', 'VLAN_MTU', 'VLAN_HWTAGGING', 'VLAN_HWFILTERING', 'TSO4', 'TSO6'], 'mtu': '1500'}])

    def test_parse_ether_line(self):
        network = SunOSNetwork(module=None)
        words = ['ether', '00:11:22:33:44:55']
        current_if = {}
        ips = {}
        current_if = network.parse_ether_line(words, current_if, ips)
        self.assertIsInstance(current_if, dict)
        self.assertIn('macaddress', current_if)
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

class TestSunOSNetworkCollector(unittest.TestCase):
    def test_init(self):
        collector = SunOSNetworkCollector()
        self.assertEqual(collector._platform, 'SunOS')
        self.assertIsInstance(collector.fact_class, SunOSNetwork)

if __name__ == '__main__':
    unittest.main()