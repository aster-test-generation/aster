import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        network = SunOSNetwork(module=None)
        interfaces, ips = network.get_interfaces_info('ifconfig')
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)

    def test_parse_interface_line(self):
        network = SunOSNetwork(module=None)
        words = ['em0', 'LINK0', 'MTU:1500', 'IPv4']
        current_if = {}
        interfaces = {}
        current_if = network.parse_interface_line(words, current_if, interfaces)
        self.assertIsInstance(current_if, dict)
        self.assertIn('device', current_if)
        self.assertIn('ipv4', current_if)
        self.assertIn('mtu', current_if['ipv4'][0])

    def test_parse_ether_line(self):
        network = SunOSNetwork(module=None)
        words = ['ether', '00:11:22:33:44:55']
        current_if = {}
        ips = {}
        network.parse_ether_line(words, current_if, ips)
        self.assertIsInstance(current_if, dict)
        self.assertIn('macaddress', current_if)
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

class TestSunOSNetworkCollector(unittest.TestCase):
    def test_init(self):
        collector = SunOSNetworkCollector()
        self.assertIsInstance(collector, NetworkCollector)
        self.assertEqual(collector._fact_class, SunOSNetwork)
        self.assertEqual(collector._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()