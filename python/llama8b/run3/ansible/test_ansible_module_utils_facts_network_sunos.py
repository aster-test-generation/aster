import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        collector = SunOSNetworkCollector()
        interfaces, ips = collector.get_interfaces_info('ifconfig')
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)

    def test_parse_interface_line(self):
        network = SunOSNetwork()
        current_if = network.parse_interface_line(['lo0', 'flags=inet', 'inet 127.0.0.1 netmask 0xffffffff', 'mtu 16384'], {}, {})
        self.assertEqual(current_if['device'], 'lo0')
        self.assertEqual(current_if['type'], 'unknown')
        self.assertEqual(current_if['ipv4'][0]['flags'], 'inet')
        self.assertEqual(current_if['ipv4'][0]['mtu'], '16384')

    def test_parse_ether_line(self):
        network = SunOSNetwork()
        current_if = network.parse_ether_line(['ether', '00:11:22:33:44:55'], {}, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_options_line(self):
        network = SunOSNetwork()
        current_if = network.parse_options_line(['options', 'inet=127.0.0.1'], {}, {})
        self.assertEqual(current_if['options'], 'inet=127.0.0.1')

    def test_parse_nd6_line(self):
        network = SunOSNetwork()
        current_if = network.parse_nd6_line(['nd6', 'default'], {}, {})
        self.assertEqual(current_if['nd6'], 'default')

    def test_parse_media_line(self):
        network = SunOSNetwork()
        current_if = network.parse_media_line(['media', 'ethernet'], {}, {})
        self.assertEqual(current_if['media'], 'ethernet')

    def test_parse_status_line(self):
        network = SunOSNetwork()
        current_if = network.parse_status_line(['status', 'up'], {}, {})
        self.assertEqual(current_if['status'], 'up')

    def test_parse_lladdr_line(self):
        network = SunOSNetwork()
        current_if = network.parse_lladdr_line(['lladdr', '00:11:22:33:44:55'], {}, {})
        self.assertEqual(current_if['lladdr'], '00:11:22:33:44:55')

    def test_parse_inet_line(self):
        network = SunOSNetwork()
        current_if = network.parse_inet_line(['inet', '127.0.0.1'], {}, {})
        self.assertEqual(current_if['inet'], '127.0.0.1')

    def test_parse_inet6_line(self):
        network = SunOSNetwork()
        current_if = network.parse_inet6_line(['inet6', '2001:0db8:85a3:0000:0000:8a2e:0370:7334'], {}, {})
        self.assertEqual(current_if['inet6'], '2001:0db8:85a3:0000:0000:8a2e:0370:7334')

    def test_parse_unknown_line(self):
        network = SunOSNetwork()
        current_if = network.parse_unknown_line(['unknown', 'flag'], {}, {})
        self.assertEqual(current_if['unknown'], 'flag')

    def test__str__(self):
        network = SunOSNetwork()
        self.assertEqual(str(network), 'SunOSNetwork')

    def test__repr__(self):
        network = SunOSNetwork()
        self.assertEqual(repr(network), 'SunOSNetwork()')

if __name__ == '__main__':
    unittest.main()