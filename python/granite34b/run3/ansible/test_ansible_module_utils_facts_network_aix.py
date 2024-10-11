import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        network = AIXNetwork(module='abc')
        interface = network.get_default_interfaces()
        self.assertIsInstance(interface, tuple)
        self.assertEqual(len(interface), 2)
        self.assertIsInstance(interface[0], dict)
        self.assertIsInstance(interface[1], dict)
        self.assertIn('v4', interface[0])
        self.assertIn('v6', interface[1])
        self.assertIn('gateway', interface[0]['v4'])
        self.assertIn('interface', interface[0]['v4'])
        self.assertIn('gateway', interface[1]['v6'])
        self.assertIn('interface', interface[1]['v6'])

    def test_get_interfaces_info(self):
        network = AIXNetwork(module=None)
        interfaces, ips = network.get_interfaces_info()
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)
        self.assertIn('all_ipv4_addresses', ips)
        self.assertIn('all_ipv6_addresses', ips)
        self.assertIsInstance(ips['all_ipv4_addresses'], list)
        self.assertIsInstance(ips['all_ipv6_addresses'], list)
        for interface_name, interface in interfaces.items():
            self.assertIsInstance(interface_name, str)
            self.assertIsInstance(interface, dict)
            self.assertIn('device', interface)
            self.assertIn('ipv4', interface)
            self.assertIn('ipv6', interface)
            self.assertIn('type', interface)
            self.assertIn('flags', interface)
            self.assertIn('macaddress', interface)
            self.assertIsInstance(interface['device'], str)
            self.assertIsInstance(interface['ipv4'], list)
            self.assertIsInstance(interface['ipv6'], list)
            self.assertIsInstance(interface['type'], str)
            self.assertIsInstance(interface['flags'], list)
            self.assertIsInstance(interface['macaddress'], str)
            for ip in interface['ipv4']:
                self.assertIsInstance(ip, dict)
                self.assertIn('address', ip)
                self.assertIn('netmask', ip)
                self.assertIn('network', ip)
                self.assertIsInstance(ip['address'], str)
                self.assertIsInstance(ip['netmask'], str)
                self.assertIsInstance(ip['network'], str)
            for ip in interface['ipv6']:
                self.assertIsInstance(ip, dict)
                self.assertIn('address', ip)
                self.assertIn('prefix', ip)
                self.assertIn('scope', ip)
                self.assertIsInstance(ip['address'], str)
                self.assertIsInstance(ip['prefix'], str)
                self.assertIsInstance(ip['scope'], str)

class TestAIXNetworkCollector(unittest.TestCase):
    def test_init(self):
        collector = AIXNetworkCollector()
        self.assertEqual(collector._fact_class, AIXNetwork)
        self.assertEqual(collector.platform, 'AIX')

if __name__ == '__main__':
    unittest.main()