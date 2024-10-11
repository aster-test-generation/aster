import unittest
from ansible.module_utils.facts.network.sunos import SunOSNetwork, SunOSNetworkCollector


class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        network = SunOSNetwork(module=None)
        interfaces, ips = network.get_interfaces_info('ifconfig')
        self.assertEqual(interfaces, {'em0': {'device': 'em0', 'ipv4': [{'flags': ['UP', 'BROADCAST', 'SMART', 'RUNNING', 'SIMPLEX', 'MULTICAST'], 'mtu': '1500'}], 'ipv6': [], 'type': 'unknown'}, 'lo0': {'device': 'lo0', 'ipv4': [{'flags': ['UP', 'LOOPBACK', 'RUNNING'], 'mtu': '16384'}], 'ipv6': [], 'type': 'loopback'}})
        self.assertEqual(ips, {'all_ipv4_addresses': ['10.0.2.15'], 'all_ipv6_addresses': []})

    def test_parse_interface_line(self):
        network = SunOSNetwork(module=None)
        current_if = {'device': 'em0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        words = ['em0', 'UP', 'BROADCAST', 'SMART', 'RUNNING', 'SIMPLEX', 'MULTICAST', '1500']
        flags = network.get_options(words[1])
        v = 'ipv4'
        if 'IPv6' in flags:
            v = 'ipv6'
        if 'LOOPBACK' in flags:
            current_if['type'] = 'loopback'
        current_if[v].append({'flags': flags, 'mtu': words[7]})
        current_if['macaddress'] = 'unknown'
        expected_if = {'device': 'em0', 'ipv4': [{'flags': ['UP', 'BROADCAST', 'SMART', 'RUNNING', 'SIMPLEX', 'MULTICAST'], 'mtu': '1500'}], 'ipv6': [], 'type': 'unknown'}
        self.assertEqual(current_if['ipv4'][0]['flags'], expected_if['ipv4'][0]['flags'])

    def test_parse_ether_line(self):
        network = SunOSNetwork(module=None)
        current_if = {'device': 'em0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        words = ['ether', '00:50:56:ff:2a:b6']
        macaddress = ''
        for octet in words[1].split(':'):
            octet = ('0' + octet)[-2:None]
            macaddress += (octet + ':')
        current_if['macaddress'] = macaddress[0:-1]
        expected_if = {'device': 'em0', 'ipv4': [], 'ipv6': [], 'type': 'unknown', 'macaddress': '00:50:56:ff:2a:b6'}
        self.assertEqual(current_if, expected_if)

class TestSunOSNetworkCollector(unittest.TestCase):
    def test_get_network_data(self):
        collector = SunOSNetworkCollector()
        facts, _ = collector.get_network_data()
        self.assertEqual(facts, {'interfaces': {'em0': {'device': 'em0', 'ipv4': [{'flags': ['UP', 'BROADCAST', 'SMART', 'RUNNING', 'SIMPLEX', 'MULTICAST'], 'mtu': '1500'}], 'ipv6': [], 'type': 'unknown'}, 'lo0': {'device': 'lo0', 'ipv4': [{'flags': ['UP', 'LOOPBACK', 'RUNNING'], 'mtu': '16384'}], 'ipv6': [], 'type': 'loopback'}}, 'all_ipv4_addresses': ['10.0.2.15'], 'all_ipv6_addresses': []})

if __name__ == '__main__':
    unittest.main()