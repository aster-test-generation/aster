import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork


class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.network = GenericBsdIfconfigNetwork(self.module)

    def test_populate_no_ifconfig(self):
        self.module.get_bin_path.side_effect = [None, None]
        result = self.network.populate()
        self.assertEqual(result, {})

    def test_populate_no_route(self):
        self.module.get_bin_path.side_effect = ['ifconfig_path', None]
        result = self.network.populate()
        self.assertEqual(result, {})

    @patch.object(GenericBsdIfconfigNetwork, 'get_default_interfaces')
    @patch.object(GenericBsdIfconfigNetwork, 'get_interfaces_info')
    @patch.object(GenericBsdIfconfigNetwork, 'detect_type_media')
    @patch.object(GenericBsdIfconfigNetwork, 'merge_default_interface')
    def test_populate(self, mock_merge_default_interface, mock_detect_type_media, mock_get_interfaces_info, mock_get_default_interfaces):
        self.module.get_bin_path.side_effect = ['ifconfig_path', 'route_path']
        mock_get_default_interfaces.return_value = ({'interface': 'eth0'}, {'interface': 'eth1'})
        mock_get_interfaces_info.return_value = ({'eth0': {}, 'eth1': {}}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        mock_detect_type_media.return_value = {'eth0': {}, 'eth1': {}}
        
        result = self.network.populate()
        self.assertIn('interfaces', result)
        self.assertIn('default_ipv4', result)
        self.assertIn('default_ipv6', result)

    def test_detect_type_media(self):
        interfaces = {'eth0': {'media': 'Ethernet'}}
        result = self.network.detect_type_media(interfaces)
        self.assertEqual(result['eth0']['type'], 'ether')

    @patch('socket.has_ipv6', False)
    def test_get_default_interfaces_no_ipv6(self):
        self.module.run_command.return_value = (0, 'interface: eth0\ngateway: 192.168.1.1\n', '')
        result = self.network.get_default_interfaces('route_path')
        self.assertEqual(result[0]['interface'], 'eth0')
        self.assertEqual(result[0]['gateway'], '192.168.1.1')
        self.assertEqual(result[1], {})

    def test_get_interfaces_info(self):
        self.module.run_command.return_value = (0, 'eth0: flags=...\ninet 192.168.1.2 netmask 255.255.255.0\n', '')
        result = self.network.get_interfaces_info('ifconfig_path')
        self.assertIn('ine', result[0])
        self.assertIn('192.168.1.2', result[1]['all_ipv4_addresses'])

    def test_parse_interface_line(self):
        words = ['eth0:', 'flags=...', 'metric', '10', 'mtu', '1500']
        result = self.network.parse_interface_line(words)
        self.assertEqual(result['device'], 'eth0')
        self.assertEqual(result['metric'], '10')
        self.assertEqual(result['mtu'], '1500')

    def test_parse_options_line(self):
        current_if = {}
        self.network.parse_options_line(['options=<UP,BROADCAST>'], current_if, {})
        self.assertIn('UP', current_if['options'])

    def test_parse_nd6_line(self):
        current_if = {}
        self.network.parse_nd6_line(['nd6', 'options=<PERFORMNUD>'], current_if, {})
        self.assertIn('PERFORMNUD', current_if['options'])

    def test_parse_ether_line(self):
        current_if = {}
        self.network.parse_ether_line(['ether', '00:11:22:33:44:55'], current_if, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_media_line(self):
        current_if = {}
        self.network.parse_media_line(['media:', 'Ethernet', 'autoselect'], current_if, {})
        self.assertEqual(current_if['media'], 'Ethernet')
        self.assertEqual(current_if['media_select'], 'autoselect')

    def test_parse_status_line(self):
        current_if = {}
        self.network.parse_status_line(['status:', 'active'], current_if, {})
        self.assertEqual(current_if['status'], 'active')

    def test_parse_lladdr_line(self):
        current_if = {}
        self.network.parse_lladdr_line(['lladdr', '00:11:22:33:44:55'], current_if, {})
        self.assertEqual(current_if['lladdr'], '00:11:22:33:44:55')

    def test_parse_inet_line(self):
        current_if = {'ipv4': []}
        self.network.parse_inet_line(['inet', '192.168.1.2', 'netmask', '0xffffff00', 'broadcast', '192.168.1.255'], current_if, {'all_ipv4_addresses': []})
        self.assertEqual(current_if['ipv4'][0]['address'], '192.168.1.2')

    def test_parse_inet6_line(self):
        current_if = {'ipv6': []}
        self.network.parse_inet6_line(['inet6', 'fe80::1', 'prefixlen', '64', 'scopeid', '0x20'], current_if, {'all_ipv6_addresses': []})
        self.assertEqual(current_if['ipv6'][0]['address'], 'fe80::1')

    def test_parse_tunnel_line(self):
        current_if = {}
        self.network.parse_tunnel_line(['tunnel', 'source', 'destination'], current_if, {})
        self.assertEqual(current_if['type'], 'tunnel')

    def test_parse_unknown_line(self):
        current_if = {}
        self.network.parse_unknown_line(['unknown', 'line'], current_if, {})
        self.assertEqual(current_if, {})

    def test_get_options(self):
        result = self.network.get_options('<UP,BROADCAST>')
        self.assertIn('UP', result)
        self.assertIn('BROADCAST', result)

    def test_merge_default_interface(self):
        defaults = {'interface': 'eth0'}
        interfaces = {'eth0': {'ipv4': [{'address': '192.168.1.2'}], 'type': 'ether'}}
        self.network.merge_default_interface(defaults, interfaces, 'ipv4')
        self.assertEqual(defaults['address'], '192.168.1.2')
        self.assertEqual(defaults['type'], 'ether')

if __name__ == '__main__':
    unittest.main()