import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector

class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        collector = SunOSNetworkCollector()
        network = SunOSNetwork(collector)
        ifconfig_path = '/usr/sbin/ifconfig'
        interfaces, ips = network.get_interfaces_info(ifconfig_path)
        self.assertEqual(len(interfaces), 1)
        self.assertEqual(len(interfaces['lo']['ipv4']), 1)
        self.assertEqual(len(interfaces['lo']['ipv6']), 1)

    def test_parse_interface_line(self):
        network = SunOSNetwork(None)
        device = 'lo'
        flags = ['LOOPBACK']
        v = 'ipv4'
        current_if = network.parse_interface_line(['lo', flags[0], 'MTU:1500'], device, {}, v)
        self.assertEqual(current_if['device'], device)
        self.assertEqual(current_if['type'], 'loopback')
        self.assertEqual(current_if['ipv4'][0]['flags'], flags)
        self.assertEqual(current_if['ipv4'][0]['mtu'], 'MTU:1500')

    def test_parse_ether_line(self):
        network = SunOSNetwork(None)
        macaddress = '00:11:22:33:44:55'
        current_if = network.parse_ether_line(['ether', macaddress], {}, {})
        self.assertEqual(current_if['macaddress'], macaddress)

    def test_parse_options_line(self):
        network = SunOSNetwork(None)
        options = 'options=foo'
        current_if = network.parse_options_line([options], {}, {})
        self.assertEqual(current_if['options'], options)

    def test_parse_nd6_line(self):
        network = SunOSNetwork(None)
        nd6 = 'nd6'
        current_if = network.parse_nd6_line([nd6], {}, {})
        self.assertEqual(current_if['nd6'], nd6)

    def test_parse_media_line(self):
        network = SunOSNetwork(None)
        media = 'media:'
        current_if = network.parse_media_line([media], {}, {})
        self.assertEqual(current_if['media'], media)

    def test_parse_status_line(self):
        network = SunOSNetwork(None)
        status = 'status:'
        current_if = network.parse_status_line([status], {}, {})
        self.assertEqual(current_if['status'], status)

    def test_parse_lladdr_line(self):
        network = SunOSNetwork(None)
        lladdr = 'lladdr'
        current_if = network.parse_lladdr_line([lladdr], {}, {})
        self.assertEqual(current_if['lladdr'], lladdr)

    def test_parse_inet_line(self):
        network = SunOSNetwork(None)
        inet = 'inet'
        current_if = network.parse_inet_line([inet], {}, {})
        self.assertEqual(current_if['inet'], inet)

    def test_parse_inet6_line(self):
        network = SunOSNetwork(None)
        inet6 = 'inet6'
        current_if = network.parse_inet6_line([inet6], {}, {})
        self.assertEqual(current_if['inet6'], inet6)

    def test_parse_unknown_line(self):
        network = SunOSNetwork(None)
        unknown = 'unknown'
        current_if = network.parse_unknown_line([unknown], {}, {})
        self.assertEqual(current_if['unknown'], unknown)

    def test_parse_options_line_private(self):
        network = SunOSNetwork(None)
        options = 'options=foo'
        result = network._parse_options_line([options], {}, {})
        self.assertEqual(result, {'options': options})

    def test_parse_nd6_line_private(self):
        network = SunOSNetwork(None)
        nd6 = 'nd6'
        result = network._parse_nd6_line([nd6], {}, {})
        self.assertEqual(result, {'nd6': nd6})

    def test_parse_media_line_private(self):
        network = SunOSNetwork(None)
        media = 'media:'
        result = network._parse_media_line([media], {}, {})
        self.assertEqual(result, {'media': media})

    def test_parse_status_line_private(self):
        network = SunOSNetwork(None)
        status = 'status:'
        result = network._parse_status_line([status], {}, {})
        self.assertEqual(result, {'status': status})

    def test_parse_lladdr_line_private(self):
        network = SunOSNetwork(None)
        lladdr = 'lladdr'
        result = network._parse_lladdr_line([lladdr], {}, {})
        self.assertEqual(result, {'lladdr': lladdr})

    def test_parse_inet_line_private(self):
        network = SunOSNetwork(None)
        inet = 'inet'
        result = network._parse_inet_line([inet], {}, {})
        self.assertEqual(result, {'inet': inet})

if __name__ == '__main__':
    unittest.main()