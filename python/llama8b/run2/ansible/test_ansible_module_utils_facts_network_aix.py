import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        network = AIXNetwork()
        v4, v6 = network.get_default_interfaces('path/to/route')
        self.assertIsInstance(v4, dict)
        self.assertIsInstance(v6, dict)

    def test_get_interfaces_info(self):
        network = AIXNetwork()
        interfaces, ips = network.get_interfaces_info('path/to/ifconfig', '-a')
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)

    def test_parse_interface_line(self):
        network = AIXNetwork()
        words = ['eth0:', 'UP', 'RUNNING', 'MULTICAST']
        current_if = network.parse_interface_line(words)
        self.assertIsInstance(current_if, dict)
        self.assertEqual(current_if['device'], 'eth0')
        self.assertEqual(current_if['flags'], 'UP, RUNNING, MULTICAST')

    def test_parse_options_line(self):
        network = AIXNetwork()
        words = ['options: ', 'metric 1']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_options_line(words, current_if, {})
        self.assertEqual(current_if['options'], 'metric 1')

    def test_parse_nd6_line(self):
        network = AIXNetwork()
        words = ['nd6: ', 'enabled']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_nd6_line(words, current_if, {})
        self.assertEqual(current_if['nd6'], 'enabled')

    def test_parse_ether_line(self):
        network = AIXNetwork()
        words = ['ether: ', '00:11:22:33:44:55']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_ether_line(words, current_if, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_media_line(self):
        network = AIXNetwork()
        words = ['media: ', 'Ethernet']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_media_line(words, current_if, {})
        self.assertEqual(current_if['type'], 'Ethernet')

    def test_parse_status_line(self):
        network = AIXNetwork()
        words = ['status: ', 'UP']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_status_line(words, current_if, {})
        self.assertEqual(current_if['status'], 'UP')

    def test_parse_lladdr_line(self):
        network = AIXNetwork()
        words = ['lladdr: ', '00:11:22:33:44:55']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_lladdr_line(words, current_if, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_inet_line(self):
        network = AIXNetwork()
        words = ['inet: ', '192.168.1.1']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_inet_line(words, current_if, {})
        self.assertEqual(current_if['ipv4'], ['192.168.1.1'])

    def test_parse_inet6_line(self):
        network = AIXNetwork()
        words = ['inet6: ', '2001:0db8:85a3:0000:0000:8a2e:0370:7334']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_inet6_line(words, current_if, {})
        self.assertEqual(current_if['ipv6'], ['2001:0db8:85a3:0000:0000:8a2e:0370:7334'])

    def test_parse_unknown_line(self):
        network = AIXNetwork()
        words = ['unknown: ', 'value']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING, MULTICAST'}
        network.parse_unknown_line(words, current_if, {})
        self.assertEqual(current_if['unknown'], 'value')

class TestAIXNetworkCollector(unittest.TestCase):
    def test_get_fact_class(self):
        collector = AIXNetworkCollector()
        self.assertEqual(collector._fact_class, AIXNetwork)

if __name__ == '__main__':
    unittest.main()