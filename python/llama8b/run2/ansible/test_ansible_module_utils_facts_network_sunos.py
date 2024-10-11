import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        network = SunOSNetwork()
        ifconfig_path = '/sbin/ifconfig'
        interfaces, ips = network.get_interfaces_info(ifconfig_path)
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)

    def test_parse_interface_line(self):
        network = SunOSNetwork()
        words = ['eth0', 'UP', 'BROADCAST', 'RUNNING', 'MTU:1500']
        current_if = network.parse_interface_line(words, {}, {})
        self.assertEqual(current_if['device'], 'eth0')
        self.assertEqual(current_if['type'], 'unknown')

    def test_parse_ether_line(self):
        network = SunOSNetwork()
        words = ['ether', '00:11:22:33:44:55']
        macaddress = network.parse_ether_line(words, {}, {})
        self.assertEqual(macaddress, '00:11:22:33:44:55')

    def test_parse_options_line(self):
        network = SunOSNetwork()
        words = ['options', 'inet 192.168.1.1']
        ips = network.parse_options_line(words, {}, {})
        self.assertEqual(ips['all_ipv4_addresses'], ['192.168.1.1'])

    def test_parse_nd6_line(self):
        network = SunOSNetwork()
        words = ['nd6', 'default']
        ips = network.parse_nd6_line(words, {}, {})
        self.assertEqual(ips['all_ipv6_addresses'], ['default'])

    def test_parse_media_line(self):
        network = SunOSNetwork()
        words = ['media:', 'ethernet']
        current_if = network.parse_media_line(words, {}, {})
        self.assertEqual(current_if['media'], 'ethernet')

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
        words = ['inet', '192.168.1.1']
        current_if = network.parse_inet_line(words, {}, {})
        self.assertEqual(current_if['ipv4'][0]['address'], '192.168.1.1')

    def test_parse_inet6_line(self):
        network = SunOSNetwork()
        words = ['inet6', '2001:0db8:85a3:0000:0000:8a2e:0370:7334']
        current_if = network.parse_inet6_line(words, {}, {})
        self.assertEqual(current_if['ipv6'][0]['address'], '2001:0db8:85a3:0000:0000:8a2e:0370:7334')

    def test_parse_unknown_line(self):
        network = SunOSNetwork()
        words = ['unknown', 'line']
        current_if = network.parse_unknown_line(words, {}, {})
        self.assertEqual(current_if['type'], 'unknown')

    def test_parse_options_line_ipv6(self):
        network = SunOSNetwork()
        words = ['options', 'inet6 2001:0db8:85a3:0000:0000:8a2e:0370:7334']
        ips = network.parse_options_line(words, {}, {})
        self.assertEqual(ips['all_ipv6_addresses'], ['2001:0db8:85a3:0000:0000:8a2e:0370:7334'])

    def test_parse_nd6_line_ipv6(self):
        network = SunOSNetwork()
        words = ['nd6', 'default', 'prefix', '2001:0db8:85a3:0000:0000:8a2e:0370:7334']
        ips = network.parse_nd6_line(words, {}, {})
        self.assertEqual(ips['all_ipv6_addresses'], ['2001:0db8:85a3:0000:0000:8a2e:0370:7334'])

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