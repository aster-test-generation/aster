import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        network = AIXNetwork()
        v4, v6 = network.get_default_interfaces('path')
        self.assertEqual(v4, {})
        self.assertEqual(v6, {})

    def test_get_interfaces_info(self):
        network = AIXNetwork()
        interfaces, ips = network.get_interfaces_info('path', 'options')
        self.assertEqual(interfaces, {})
        self.assertEqual(ips, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})

    def test_parse_interface_line(self):
        network = AIXNetwork()
        words = ['eth0', 'UP', 'RUNNING']
        current_if = network.parse_interface_line(words)
        self.assertEqual(current_if['device'], 'eth0')
        self.assertEqual(current_if['flags'], 'UP, RUNNING')

    def test_parse_options_line(self):
        network = AIXNetwork()
        words = ['options=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_options_line(words, current_if, {})
        self.assertEqual(current_if['options'], 'foo')

    def test_parse_nd6_line(self):
        network = AIXNetwork()
        words = ['nd6=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_nd6_line(words, current_if, {})
        self.assertEqual(current_if['nd6'], 'foo')

    def test_parse_ether_line(self):
        network = AIXNetwork()
        words = ['ether=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_ether_line(words, current_if, {})
        self.assertEqual(current_if['ether'], 'foo')

    def test_parse_media_line(self):
        network = AIXNetwork()
        words = ['media=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_media_line(words, current_if, {})
        self.assertEqual(current_if['media'], 'foo')

    def test_parse_status_line(self):
        network = AIXNetwork()
        words = ['status=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_status_line(words, current_if, {})
        self.assertEqual(current_if['status'], 'foo')

    def test_parse_lladdr_line(self):
        network = AIXNetwork()
        words = ['lladdr=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_lladdr_line(words, current_if, {})
        self.assertEqual(current_if['lladdr'], 'foo')

    def test_parse_inet_line(self):
        network = AIXNetwork()
        words = ['inet=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_inet_line(words, current_if, {})
        self.assertEqual(current_if['inet'], 'foo')

    def test_parse_inet6_line(self):
        network = AIXNetwork()
        words = ['inet6=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_inet6_line(words, current_if, {})
        self.assertEqual(current_if['inet6'], 'foo')

    def test_parse_unknown_line(self):
        network = AIXNetwork()
        words = ['unknown=foo']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_unknown_line(words, current_if, {})
        self.assertEqual(current_if['unknown'], 'foo')

    def test_get_options(self):
        network = AIXNetwork()
        options = network.get_options('UP, RUNNING')
        self.assertEqual(options, 'UP, RUNNING')

    def test_parse_ether_line_with_macaddress(self):
        network = AIXNetwork()
        words = ['ether=00:11:22:33:44:55']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_ether_line(words, current_if, {})
        self.assertEqual(current_if['macaddress'], '00:11:22:33:44:55')

    def test_parse_media_line_with_media(self):
        network = AIXNetwork()
        words = ['media=1000Base-TX']
        current_if = {'device': 'eth0', 'flags': 'UP, RUNNING'}
        network.parse_media_line(words, current_if, {})
        self.assertEqual(current_if['media'], '1000Base-TX')

if __name__ == '__main__':
    unittest.main()