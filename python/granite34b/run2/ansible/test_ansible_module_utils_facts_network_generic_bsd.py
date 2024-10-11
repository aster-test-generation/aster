import unittest
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork


class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def test_populate(self):
        network = GenericBsdIfconfigNetwork(module=None)
        network_facts = network.populate()
        self.assertIsInstance(network_facts, dict)

    def test_detect_type_media(self):
        network = GenericBsdIfconfigNetwork(module=None)
        interfaces = {
            'eth0': {'media': ' ether'},
            'lo0': {'media': ' loopback'}
        }
        network.detect_type_media(interfaces)
        self.assertEqual(interfaces['eth0']['type'], 'ether')
        self.assertEqual(interfaces['lo0']['type'], 'loopback')

    def test_get_default_interfaces(self):
        network = GenericBsdIfconfigNetwork(module=None)
        route_path = '/sbin/route'
        default_ipv4, default_ipv6 = network.get_default_interfaces(route_path)
        self.assertIsInstance(default_ipv4, dict)
        self.assertIsInstance(default_ipv6, dict)

    def test_get_interfaces_info(self):
        network = GenericBsdIfconfigNetwork(module=None)
        ifconfig_path = '/sbin/ifconfig'
        interfaces, ips = network.get_interfaces_info(ifconfig_path)
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)
        self.assertIn('all_ipv4_addresses', ips)
        self.assertIn('all_ipv6_addresses', ips)

    def test_parse_interface_line(self):
        network = GenericBsdIfconfigNetwork(module=None)
        words = ['eth0:', 'options=1203<RXCSUM,TXCSUM,VLAN_MTU,VLAN_HWTAGGING,VLAN_HWCSUM>']
        current_if = network.parse_interface_line(words)
        self.assertEqual(current_if['device'], 'eth0')
        self.assertEqual(current_if['flags'], ['RXCSUM', 'TXCSUM', 'VLAN_MTU', 'VLAN_HWTAGGING', 'VLAN_HWCSUM'])

    def test_parse_options_line(self):
        network = GenericBsdIfconfigNetwork(module=None)
        words = ['options=1203<RXCSUM,TXCSUM,VLAN_MTU,VLAN_HWTAGGING,VLAN_HWCSUM>']
        current_if = {}
        network.parse_options_line(words, current_if)
        self.assertEqual(current_if['options'], ['RXCSUM', 'TXCSUM', 'VLAN_MTU', 'VLAN_HWTAGGING', 'VLAN_HWCSUM'])

    def test_parse_nd6_line(self):
        network = GenericBsdIfconfigNetwork(module=None)
        words = ['nd6 options=1<PERFORMNUD>']
        current_if = {}
        network.parse_nd6_line(words, current_if)
        self.assertEqual(current_if['options'], ['PERFORMNUD'])

    def test_parse_ether_line(self):
        network = GenericBsdIfconfigNetwork(module=None)
        words = ['ether', '00:11:22:33:44:55']
        current_if = {}
        network.parse_ether_line(words, current_if)
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_media_line(self):
        network = GenericBsdIfconfigNetwork(module=None)
        words = ['media:', 'autoselect', '100baseT/UTP']
        current_if = {}
        network.parse_media_line(words, current_if)
        self.assertEqual(current_if['media'], 'autoselect')
        self.assertEqual(current_if['media_select'], '100baseT/UTP')

    def test_parse_status_line(self):
        network = GenericBsdIfconfigNetwork(module=None)
        words = ['status:', 'active']
        current_if = {}
        network.parse_status_line(words, current_if)
        self.assertEqual(current_if['status'], 'active')

if __name__ == '__main__':
    unittest.main()