import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hpux_network = HPUXNetwork(self.module)

    def test_populate_no_netstat(self):
        self.module.get_bin_path.return_value = None
        result = self.hpux_network.populate()
        self.assertEqual(result, {})

    def test_populate_with_netstat(self):
        self.module.get_bin_path.return_value = '/usr/bin/netstat'
        self.hpux_network.get_default_interfaces = MagicMock(return_value={'default_interface': 'lan0', 'default_gateway': '192.168.1.1'})
        self.hpux_network.get_interfaces_info = MagicMock(return_value={'lan0': {'device': 'lan0', 'ipv4': {'network': '192.168.1.0', 'interface': 'lan0', 'address': '192.168.1.2'}}})
        result = self.hpux_network.populate()
        expected_result = {
            'default_interface': 'lan0',
            'default_gateway': '192.168.1.1',
            'interfaces': ['lan0'],
            'lan0': {'device': 'lan0', 'ipv4': {'network': '192.168.1.0', 'interface': 'lan0', 'address': '192.168.1.2'}}
        }
        self.assertEqual(result['interfaces'], list(expected_result['interfaces']))

    def test_get_default_interfaces(self):
        self.module.run_command.return_value = (0, "default 192.168.1.1 0.0.0.0 UG 0 0 lan0\n", "")
        result = self.hpux_network.get_default_interfaces()
        expected_result = {'default_interface': 'lan0', 'default_gateway': '192.168.1.1'}
        self.assertEqual(result, {'default_interface': 'lan0', 'default_gateway': '192.168.1.1'})

    def test_get_interfaces_info(self):
        self.module.run_command.return_value = (0, "lan0 1500 0 0 0 0 0 192.168.1.2\n", "")
        result = self.hpux_network.get_interfaces_info()
        expected_result = {'lan0': {'device': 'lan0', 'ipv4': {'network': '0', 'interface': 'lan0', 'address': '192.168.1.2'}}}
        self.assertEqual(result, {'lan0': {'device': 'lan0', 'ipv4': {'address': '192.168.1.2', 'interface': 'lan0', 'network': '0'}}})

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._fact_class, HPUXNetwork)

    def test_platform(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()