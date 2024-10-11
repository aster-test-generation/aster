import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector

class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        collector = SunOSNetworkCollector()
        network = SunOSNetwork(collector)
        ifconfig_path = '/sbin/ifconfig'
        interfaces, ips = network.get_interfaces_info(ifconfig_path)
        self.assertIsNotNone(interfaces)
        self.assertIsNotNone(ips)

    def test_parse_interface_line(self):
        network = SunOSNetwork(None)
        words = ['eth0', 'UP', 'BROADCAST', 'RUNNING', 'MTU:1500']
        current_if = network.parse_interface_line(words, {}, {})
        self.assertEqual(current_if['device'], 'eth0')
        self.assertEqual(current_if['type'], 'unknown')
        self.assertEqual(current_if['ipv4'], [{'flags': 'UP', 'mtu': '1500'}])

    def test_parse_ether_line(self):
        network = SunOSNetwork(None)
        words = ['ether', '00:11:22:33:44:55']
        current_if = network.parse_ether_line(words, {}, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_options_line(self):
        network = SunOSNetwork(None)
        words = ['options', 'inet 192.168.1.1']
        current_if = network.parse_options_line(words, {}, {})
        self.assertEqual(current_if['options'], 'inet 192.168.1.1')

    def test_parse_nd6_line(self):
        network = SunOSNetwork(None)
        words = ['nd6', 'default']
        current_if = network.parse_nd6_line(words, {}, {})
        self.assertEqual(current_if['nd6'], 'default')

    def test_parse_media_line(self):
        network = SunOSNetwork(None)
        words = ['media:', 'ethernet']
        current_if = network.parse_media_line(words, {}, {})
        self.assertEqual(current_if['media'], 'ethernet')

    def test_parse_status_line(self):
        network = SunOSNetwork(None)
        words = ['status:', 'UP']
        current_if = network.parse_status_line(words, {}, {})
        self.assertEqual(current_if['status'], 'UP')

    def test_parse_lladdr_line(self):
        network = SunOSNetwork(None)
        words = ['lladdr', '00:11:22:33:44:55']
        current_if = network.parse_lladdr_line(words, {}, {})
        self.assertEqual(current_if['lladdr'], '00:11:22:33:44:55')

    def test_parse_inet_line(self):
        network = SunOSNetwork(None)
        words = ['inet', '192.168.1.1']
        current_if = network.parse_inet_line(words, {}, {})
        self.assertEqual(current_if['inet'], '192.168.1.1')

    def test_parse_inet6_line(self):
        network = SunOSNetwork(None)
        words = ['inet6', '2001:0db8:85a3:0000:0000:8a2e:0370:7334']
        current_if = network.parse_inet6_line(words, {}, {})
        self.assertEqual(current_if['inet6'], '2001:0db8:85a3:0000:0000:8a2e:0370:7334')

    def test_parse_unknown_line(self):
        network = SunOSNetwork(None)
        words = ['unknown', 'line']
        current_if = network.parse_unknown_line(words, {}, {})
        self.assertEqual(current_if['unknown'], 'line')

    def test_parse_options_line_ipv6(self):
        network = SunOSNetwork(None)
        words = ['options', 'inet6 2001:0db8:85a3:0000:0000:8a2e:0370:7334']
        current_if = network.parse_options_line(words, {}, {})
        self.assertEqual(current_if['options'], 'inet6 2001:0db8:85a3:0000:0000:8a2e:0370:7334')

    def test_parse_nd6_line_ipv6(self):
        network = SunOSNetwork(None)
        words = ['nd6', 'default6']
        current_if = network.parse_nd6_line(words, {}, {})
        self.assertEqual(current_if['nd6'], 'default6')

    def test_parse_media_line_ipv6(self):
        network = SunOSNetwork(None)
        words = ['media:', 'ethernet6']
        current_if = network.parse_media_line(words, {}, {})
        self.assertEqual(current_if['media'], 'ethernet6')

if __name__ == '__main__':
    unittest.main()