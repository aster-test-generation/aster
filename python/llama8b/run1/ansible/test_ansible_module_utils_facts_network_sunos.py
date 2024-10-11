import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        network = SunOSNetwork()
        ifconfig_path = '/usr/sbin/ifconfig'
        interfaces, ips = network.get_interfaces_info(ifconfig_path)
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)

    def test_parse_interface_line(self):
        network = SunOSNetwork()
        words = ['eth0', 'UP', 'BROADCAST', 'RUNNING', 'MULTICAST', 'MTU:1500', 'Metric:1']
        current_if = network.parse_interface_line(words, {}, {})
        self.assertEqual(current_if['device'], 'eth0')
        self.assertEqual(current_if['type'], 'unknown')

    def test_parse_ether_line(self):
        network = SunOSNetwork()
        words = ['ether', '00:11:22:33:44:55']
        current_if = network.parse_ether_line(words, {}, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_options_line(self):
        network = SunOSNetwork()
        words = ['options', 'IPV6']
        current_if = network.parse_options_line(words, {}, {})
        self.assertIn('IPv6', current_if['flags'])

    def test_parse_nd6_line(self):
        network = SunOSNetwork()
        words = ['nd6', 'state', 'default']
        current_if = network.parse_nd6_line(words, {}, {})
        self.assertEqual(current_if['state'], 'default')

    def test_parse_media_line(self):
        network = SunOSNetwork()
        words = ['media:', 'Ethernet', '10GbE']
        current_if = network.parse_media_line(words, {}, {})
        self.assertEqual(current_if['media'], 'Ethernet 10GbE')

    def test_parse_status_line(self):
        network = SunOSNetwork()
        words = ['status:', 'UP']
        current_if = network.parse_status_line(words, {}, {})
        self.assertEqual(current_if['status'], 'UP')

    def test_parse_lladdr_line(self):
        network = SunOSNetwork()
        words = ['lladdr', '00:11:22:33:44:55']
        current_if = network.parse_lladdr_line(words, {}, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_inet_line(self):
        network = SunOSNetwork()
        words = ['inet', '192.0.2.1']
        current_if = network.parse_inet_line(words, {}, {})
        self.assertEqual(current_if['ip'], '192.0.2.1')

    def test_parse_inet6_line(self):
        network = SunOSNetwork()
        words = ['inet6', '2001:0db8:85a3:0000:0000:8a2e:0370:7334']
        current_if = network.parse_inet6_line(words, {}, {})
        self.assertEqual(current_if['ip'], '2001:0db8:85a3:0000:0000:8a2e:0370:7334')

    def test_parse_unknown_line(self):
        network = SunOSNetwork()
        words = ['unknown', 'line']
        current_if = network.parse_unknown_line(words, {}, {})
        self.assertEqual(current_if['type'], 'unknown')

    def test_parse_interface_line_private(self):
        network = SunOSNetwork()
        words = ['eth0', 'UP', 'BROADCAST', 'RUNNING', 'MULTICAST', 'MTU:1500', 'Metric:1']
        current_if = network._parse_interface_line(words, {}, {})
        self.assertEqual(current_if['device'], 'eth0')
        self.assertEqual(current_if['type'], 'unknown')

    def test_get_options_private(self):
        network = SunOSNetwork()
        options = network._get_options(['options', 'IPV6'])
        self.assertIn('IPv6', options)

    def test__str__(self):
        network = SunOSNetwork()
        self.assertEqual(str(network), 'SunOSNetwork')

    def test__repr__(self):
        network = SunOSNetwork()
        self.assertEqual(repr(network), 'SunOSNetwork()')

class TestSunOSNetworkCollector(unittest.TestCase):
    def test__init__(self):
        collector = SunOSNetworkCollector()
        self.assertIsInstance(collector._fact_class, SunOSNetwork)
        self.assertEqual(collector._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()