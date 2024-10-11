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
        self.module.get_bin_path.side_effect = ['/sbin/ifconfig', None]
        result = self.network.populate()
        self.assertEqual(result, {})

    @patch.object(GenericBsdIfconfigNetwork, 'get_default_interfaces')
    @patch.object(GenericBsdIfconfigNetwork, 'get_interfaces_info')
    @patch.object(GenericBsdIfconfigNetwork, 'detect_type_media')
    @patch.object(GenericBsdIfconfigNetwork, 'merge_default_interface')
    def test_populate_success(self, mock_merge_default, mock_detect_type, mock_get_interfaces, mock_get_default):
        self.module.get_bin_path.side_effect = ['/sbin/ifconfig', '/sbin/route']
        mock_get_default.return_value = ({'interface': 'em0'}, {'interface': 'em1'})
        mock_get_interfaces.return_value = ({'em0': {}, 'em1': {}}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        mock_detect_type.return_value = {'em0': {}, 'em1': {}}
        
        result = self.network.populate()
        self.assertIn('interfaces', result)
        self.assertIn('default_ipv4', result)
        self.assertIn('default_ipv6', result)

    def test_detect_type_media(self):
        interfaces = {'em0': {'media': 'Ethernet'}}
        result = self.network.detect_type_media(interfaces)
        self.assertEqual(result['em0']['type'], 'ether')

    @patch('socket.has_ipv6', False)
    def test_get_default_interfaces_no_ipv6(self):
        self.module.run_command.return_value = (0, 'interface: em0\ngateway: 192.168.1.1\n', '')
        result_v4, result_v6 = self.network.get_default_interfaces('/sbin/route')
        self.assertEqual(result_v4['interface'], 'em0')
        self.assertEqual(result_v6, {})

    def test_get_interfaces_info(self):
        self.module.run_command.return_value = (0, 'em0: flags=8843<UP,BROADCAST,RUNNING,SIMPLEX,MULTICAST> mtu 1500\n', '')
        result_interfaces, result_ips = self.network.get_interfaces_info('/sbin/ifconfig')
        self.assertIn('em0', result_interfaces)

    def test_parse_interface_line(self):
        words = ['em0:', 'flags=8843<UP,BROADCAST,RUNNING,SIMPLEX,MULTICAST>', 'mtu', '1500']
        result = self.network.parse_interface_line(words)
        self.assertEqual(result['device'], 'em0')

    def test_parse_options_line(self):
        current_if = {}
        self.network.parse_options_line(['options=3'], current_if, {})
        self.assertIn('options', current_if)

    def test_parse_nd6_line(self):
        current_if = {}
        self.network.parse_nd6_line(['nd6', 'options=3'], current_if, {})
        self.assertIn('options', current_if)

    def test_parse_ether_line(self):
        current_if = {}
        self.network.parse_ether_line(['ether', '00:11:22:33:44:55'], current_if, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_media_line(self):
        current_if = {}
        self.network.parse_media_line(['media:', 'Ethernet', 'autoselect'], current_if, {})
        self.assertEqual(current_if['media'], 'Ethernet')

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
        self.network.parse_inet_line(['inet', '192.168.1.1', 'netmask', '0xffffff00', 'broadcast', '192.168.1.255'], current_if, {'all_ipv4_addresses': []})
        self.assertEqual(current_if['ipv4'][0]['address'], '192.168.1.1')

    def test_parse_inet6_line(self):
        current_if = {'ipv6': []}
        self.network.parse_inet6_line(['inet6', 'fe80::1%em0', 'prefixlen', '64', 'scopeid', '0x1'], current_if, {'all_ipv6_addresses': []})
        self.assertEqual(current_if['ipv6'][0]['address'], 'fe80::1%em0')

    def test_parse_tunnel_line(self):
        current_if = {}
        self.network.parse_tunnel_line(['tunnel', '192.168.1.1'], current_if, {})
        self.assertEqual(current_if['type'], 'tunnel')

    def test_parse_unknown_line(self):
        current_if = {}
        self.network.parse_unknown_line(['unknown', 'line'], current_if, {})
        self.assertEqual(current_if, {})

    def test_get_options(self):
        result = self.network.get_options('flags=<UP,BROADCAST,RUNNING>')
        self.assertEqual(result, ['UP', 'BROADCAST', 'RUNNING'])

    def test_merge_default_interface(self):
        defaults = {'interface': 'em0'}
        interfaces = {'em0': {'ipv4': [{'address': '192.168.1.1'}], 'type': 'ether'}}
        self.network.merge_default_interface(defaults, interfaces, 'ipv4')
        self.assertEqual(defaults['address'], '192.168.1.1')

if __name__ == '__main__':
    unittest.main()