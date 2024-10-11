import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def setUp(self):
        self.linux_network = LinuxNetwork()
        self.linux_network.module = MagicMock()

    def test_init(self):
        self.assertIsInstance(self.linux_network, LinuxNetwork)

    @patch('ansible.module_utils.facts.network.linux.LinuxNetwork.get_default_interfaces')
    @patch('ansible.module_utils.facts.network.linux.LinuxNetwork.get_interfaces_info')
    def test_populate(self, mock_get_interfaces_info, mock_get_default_interfaces):
        self.linux_network.module.get_bin_path.return_value = '/sbin/ip'
        mock_get_default_interfaces.return_value = ({'interface': 'eth0'}, {'interface': 'eth1'})
        mock_get_interfaces_info.return_value = ({'eth0': {'device': 'eth0'}}, {'all_ipv4_addresses': ['192.168.1.1'], 'all_ipv6_addresses': ['fe80::1']})

        result = self.linux_network.populate()
        self.assertIn('interfaces', result)
        self.assertIn('default_ipv4', result)
        self.assertIn('default_ipv6', result)
        self.assertIn('all_ipv4_addresses', result)
        self.assertIn('all_ipv6_addresses', result)

    @patch('ansible.module_utils.facts.network.linux.LinuxNetwork.get_default_interfaces')
    @patch('ansible.module_utils.facts.network.linux.LinuxNetwork.get_interfaces_info')
    def test_populate_no_ip_path(self, mock_get_interfaces_info, mock_get_default_interfaces):
        self.linux_network.module.get_bin_path.return_value = None

        result = self.linux_network.populate()
        self.assertEqual(result, {})

    @patch('ansible.module_utils.facts.network.linux.LinuxNetwork.get_file_content')
    @patch('ansible.module_utils.facts.network.linux.glob.glob')
    @patch('ansible.module_utils.facts.network.linux.os.path.isdir')
    @patch('ansible.module_utils.facts.network.linux.os.path.exists')
    @patch('ansible.module_utils.facts.network.linux.os.path.basename')
    def test_get_interfaces_info(self, mock_basename, mock_exists, mock_isdir, mock_glob, mock_get_file_content):
        mock_glob.return_value = ['/sys/class/net/eth0']
        mock_isdir.return_value = True
        mock_exists.side_effect = lambda x: True
        mock_basename.side_effect = lambda x: 'eth0'
        mock_get_file_content.side_effect = lambda x, default='': '00:00:00:00:00:00' if 'address' in x else '1500' if 'mtu' in x else 'up' if 'operstate' in x else 'driver' if 'module' in x else '1' if 'stp_state' in x else 'bonding' if 'type' in x else '1000' if 'speed' in x else '256' if 'flags' in x else ''

        self.linux_network.module.get_bin_path.return_value = '/sbin/ip'
        self.linux_network.module.run_command.return_value = (0, 'inet 192.168.1.1/24 brd 192.168.1.255 scope global eth0\ninet6 fe80::1/64 scope link', '')

        interfaces, ips = self.linux_network.get_interfaces_info('/sbin/ip', {}, {})
        self.assertIn('eth0', interfaces)
        self.assertIn('ipv4', interfaces['eth0'])
        self.assertIn('ipv6', interfaces['eth0'])

    @patch('ansible.module_utils.facts.network.linux.socket.has_ipv6', False)
    @patch('ansible.module_utils.facts.network.linux.LinuxNetwork.get_file_content')
    @patch('ansible.module_utils.facts.network.linux.glob.glob')
    @patch('ansible.module_utils.facts.network.linux.os.path.isdir')
    @patch('ansible.module_utils.facts.network.linux.os.path.exists')
    @patch('ansible.module_utils.facts.network.linux.os.path.basename')
    def test_get_default_interfaces(self, mock_basename, mock_exists, mock_isdir, mock_glob, mock_get_file_content):
        mock_glob.return_value = ['/sys/class/net/eth0']
        mock_isdir.return_value = True
        mock_exists.side_effect = lambda x: True
        mock_basename.side_effect = lambda x: 'eth0'
        mock_get_file_content.side_effect = lambda x, default='': '00:00:00:00:00:00' if 'address' in x else '1500' if 'mtu' in x else 'up' if 'operstate' in x else 'driver' if 'module' in x else '1' if 'stp_state' in x else 'bonding' if 'type' in x else '1000' if 'speed' in x else '256' if 'flags' in x else ''

        self.linux_network.module.get_bin_path.return_value = '/sbin/ip'
        self.linux_network.module.run_command.return_value = (0, '8.8.8.8 dev eth0 src 192.168.1.1', '')

        default_ipv4, default_ipv6 = self.linux_network.get_default_interfaces('/sbin/ip')
        self.assertIn('interface', default_ipv4)
        self.assertEqual(default_ipv4['interface'], 'eth0')

if __name__ == '__main__':
    unittest.main()