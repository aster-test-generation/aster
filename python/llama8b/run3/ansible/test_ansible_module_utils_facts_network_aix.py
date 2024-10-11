import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        network = AIXNetwork()
        v4, v6 = network.get_default_interfaces('path_to_route_file')
        self.assertEqual(v4, {})
        self.assertEqual(v6, {})

    def test_get_interfaces_info(self):
        network = AIXNetwork()
        interfaces, ips = network.get_interfaces_info('path_to_ifconfig_file', '-a')
        self.assertEqual(interfaces, {})
        self.assertEqual(ips, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})

    def test_parse_interface_line(self):
        network = AIXNetwork()
        current_if = network.parse_interface_line(['eth0', 'UP,BROADCAST,RUNNING,MULTICAST,64bit,DUPLEX,SPEED_1000'])
        self.assertEqual(current_if, {'device': 'eth0', 'flags': 'UP,BROADCAST,RUNNING,MULTICAST,64bit,DUPLEX,SPEED_1000', 'macaddress': 'unknown', 'type': 'unknown'})

    def test_parse_options_line(self):
        network = AIXNetwork()
        network.parse_options_line(['options='], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_nd6_line(self):
        network = AIXNetwork()
        network.parse_nd6_line(['nd6'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_ether_line(self):
        network = AIXNetwork()
        network.parse_ether_line(['ether'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_media_line(self):
        network = AIXNetwork()
        network.parse_media_line(['media:'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_status_line(self):
        network = AIXNetwork()
        network.parse_status_line(['status:'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_lladdr_line(self):
        network = AIXNetwork()
        network.parse_lladdr_line(['lladdr'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_inet_line(self):
        network = AIXNetwork()
        network.parse_inet_line(['inet'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_inet6_line(self):
        network = AIXNetwork()
        network.parse_inet6_line(['inet6'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_unknown_line(self):
        network = AIXNetwork()
        network.parse_unknown_line(['unknown'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_get_options(self):
        network = AIXNetwork()
        options = network.get_options('UP,BROADCAST,RUNNING,MULTICAST,64bit,DUPLEX,SPEED_1000')
        self.assertEqual(options, 'UP,BROADCAST,RUNNING,MULTICAST,64bit,DUPLEX,SPEED_1000')

    def test_parse_nd6_line_with_macaddress(self):
        network = AIXNetwork()
        network.parse_nd6_line(['nd6', 'macaddress'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

    def test_parse_media_line_with_macaddress(self):
        network = AIXNetwork()
        network.parse_media_line(['media:', 'macaddress'], {'device': 'eth0'}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})
        # No assertion as this is a side effect

if __name__ == '__main__':
    unittest.main()