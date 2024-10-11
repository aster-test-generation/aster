import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        # Test the get_interfaces_info method
        network = SunOSNetwork(module)
        interfaces, ips = network.get_interfaces_info('ifconfig_path')
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)

    def test_parse_interface_line(self):
        # Test the parse_interface_line method
        network = SunOSNetwork(module)
        current_if = {'device': 'device_name', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        words = ['device_name', 'flags', 'mtu']
        flags = ['flag1', 'flag2']
        current_if = network.parse_interface_line(words, current_if, flags)
        self.assertEqual(current_if['device'], 'device_name')
        self.assertEqual(current_if['ipv4'], [])
        self.assertEqual(current_if['ipv6'], [])
        self.assertEqual(current_if['type'], 'unknown')
        self.assertEqual(current_if['flags'], flags)
        self.assertEqual(current_if['mtu'], 'mtu')

    def test_parse_ether_line(self):
        # Test the parse_ether_line method
        network = SunOSNetwork(module)
        current_if = {'device': 'device_name', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        words = ['ether', 'mac_address']
        current_if = network.parse_ether_line(words, current_if)
        self.assertEqual(current_if['device'], 'device_name')
        self.assertEqual(current_if['ipv4'], [])
        self.assertEqual(current_if['ipv6'], [])
        self.assertEqual(current_if['type'], 'unknown')
        self.assertEqual(current_if['macaddress'], 'mac_address')

class TestSunOSNetworkCollector(unittest.TestCase):
    def test_get_network_data(self):
        # Test the get_network_data method
        collector = SunOSNetworkCollector()
        facts, ansible_facts, module = collector.get_network_data()
        self.assertIsInstance(facts, dict)
        self.assertIsInstance(ansible_facts, dict)
        self.assertIsInstance(module, object)

if __name__ == '__main__':
    unittest.main()