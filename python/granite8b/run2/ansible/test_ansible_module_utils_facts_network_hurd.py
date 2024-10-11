import os
import unittest
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        network_facts = {}
        fsysopts_path = '/path/to/fsysopts'
        socket_path = '/path/to/socket'
        network = HurdPfinetNetwork(module=None)
        result = network.assign_network_facts(network_facts, fsysopts_path, socket_path)
        expected = {
            'interfaces': [],
            'interface1': {
                'active': True,
                'device': 'interface1',
                'ipv4': {},
                'ipv6': [],
            },
            'interface2': {
                'active': True,
                'device': 'interface2',
                'ipv4': {},
                'ipv6': [],
            },
        }
        self.assertEqual(result, expected)

    def test_populate(self):
        network_facts = {}
        fsysopts_path = '/path/to/fsysopts'
        socket_path = '/path/to/socket'
        network = HurdPfinetNetwork(module=None)
        result = network.populate(network_facts, fsysopts_path, socket_path, None)
        expected = {
            'interfaces': [],
            'interface1': {
                'active': True,
                'device': 'interface1',
                'ipv4': {
                    'address': '192.168.1.1',
                    'netmask': '255.255.255.0',
                },
                'ipv6': [],
            },
            'interface2': {
                'active': True,
                'device': 'interface2',
                'ipv4': {
                    'address': '2001:0db8:85a3:0000:0000:8a2e:0370:7334',
                    'netmask': '64',
                },
                'ipv6': [],
            },
        }
        self.assertEqual(result, expected)

class TestHurdNetworkCollector(unittest.TestCase):
    def test_populate(self):
        network_facts = {}
        collector = HurdNetworkCollector()
        result = collector.populate(network_facts)
        expected = {
            'interfaces': [],
            'interface1': {
                'active': True,
                'device': 'interface1',
                'ipv4': {
                    'address': '192.168.1.1',
                    'netmask': '255.255.255.0',
                },
                'ipv6': [],
            },
            'interface2': {
                'active': True,
                'device': 'interface2',
                'ipv4': {
                    'address': '2001:0db8:85a3:0000:0000:8a2e:0370:7334',
                    'netmask': '64',
                },
                'ipv6': [],
            },
        }
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()